package com.labimo;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;
import java.util.Map.Entry;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;

import com.labimo.portlet.tincan.model.Oauth2Token;
import com.labimo.portlet.tincan.service.Oauth2TokenLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

public class Util {
	private static final long ExpiredTime = 60 * 60 * 1000L;

	public static String getUuid() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();

	}

	public static Oauth2Token addOauth2Token(String clientId, String userId)
			throws SystemException {
		String token = Util.getUuid();
		Oauth2Token oauth2Token = Oauth2TokenLocalServiceUtil
				.createOauth2Token(0);
		// oauth2Token.setCode(code);
		oauth2Token.setToken(token);
		// oauth2Token.setRefreshToken(refreshToken);
		oauth2Token.setExpiredIn(new Date().getTime() + ExpiredTime);
		oauth2Token.setLiferayUserId(Long.valueOf(userId));
		oauth2Token.setClientId(clientId);
		oauth2Token = Oauth2TokenLocalServiceUtil.addOauth2Token(oauth2Token);

		return oauth2Token;
	}

	public static String addCode(String redirect_uri, String client_id,
			String response_type, String userId,
			HttpSession session) throws JSONException {
		String code = Util.getUuid();
		JSONObject json = new JSONObject();
		json.put("redirect_uri", redirect_uri);
		json.put("client_id", client_id);
		json.put("response_type", response_type);
		json.put("code", code);
		json.put("userId", userId);
		json.put("time", new Date().getTime());

		ServletContext context = session.getServletContext();
		HashMap<String, JSONObject> map = (HashMap<String, JSONObject>) context
				.getAttribute("oauth2Info");
		if (map == null) {
			map = new HashMap<String, JSONObject>();
		}

		try {
			int size = map.size();
			System.out
					.println("========================map size ==============================="
							+ size);
			if (size > 100) {
				long currentTime = new Date().getTime();
				for (Entry<String, JSONObject> entry : map.entrySet()) {
					if (size < 20) {
						break;
					}
					JSONObject oauth2Info = entry.getValue();
					long time = oauth2Info.getLong("time");
					if (currentTime - time > 120) {
						map.remove(entry.getKey());
					}

				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}

		map.put(code, json);
		context.setAttribute("oauth2Info", map);

		return code;
	}
}

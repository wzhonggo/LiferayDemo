package com.labimo;

/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

import com.labimo.portlet.tincan.model.Oauth2Token;
import com.labimo.portlet.tincan.service.Oauth2ClientLocalServiceUtil;
import com.labimo.portlet.tincan.service.Oauth2TokenLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.ProtectedServletRequest;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstancePool;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.AutoLogin;
import com.liferay.portal.security.pwd.PasswordEncryptorUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.servlet.filters.BasePortalFilter;
import com.liferay.portal.util.Portal;
import com.liferay.portal.util.PortalInstances;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.util.PropsValues;
import com.liferay.portal.util.WebKeys;
import com.liferay.portlet.login.util.LoginUtil;

import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;


public class Oauth2Filter extends BasePortalFilter {
	private static final String  DefaultUrl = "urn:ietf:wg:oauth:2.0:oob";
	private static final String  Token = "token";
	private static final String  Code = "code";
	private static final long ExpiredTime = 60 * 60 * 1000L;
	private static final String OauthDefaultPage ="http://127.0.0.1:8080/web/smartbuilder/oauth2_default_page";

	public static void registerAutoLogin(AutoLogin autoLogin) {
		_autoLogins.add(autoLogin);
	}

	public static void unregisterAutoLogin(AutoLogin autoLogin) {
		_autoLogins.remove(autoLogin);
	}

	public Oauth2Filter() {
		for (String autoLoginClassName : PropsValues.AUTO_LOGIN_HOOKS) {
			AutoLogin autoLogin = (AutoLogin) InstancePool
					.get(autoLoginClassName);

			_autoLogins.add(autoLogin);
		}
	}

	protected String getLoginRemoteUser(HttpServletRequest request,
			HttpServletResponse response, HttpSession session,
			String[] credentials) throws Exception {

		if ((credentials == null) || (credentials.length != 3)) {
			return null;
		}

		String jUsername = credentials[0];
		String jPassword = credentials[1];
		boolean encPassword = GetterUtil.getBoolean(credentials[2]);

		if (Validator.isNull(jUsername) || Validator.isNull(jPassword)) {
			return null;
		}

		long userId = GetterUtil.getLong(jUsername);

		if (userId <= 0) {
			return null;
		}

		User user = UserLocalServiceUtil.fetchUserById(userId);

		if ((user == null) || user.isLockout()) {
			return null;
		}

		if (PropsValues.SESSION_ENABLE_PHISHING_PROTECTION) {
			session = LoginUtil.renewSession(request, session);
		}

		session.setAttribute("j_username", jUsername);

		// Not having access to the unencrypted password will not allow you to
		// connect to external resources that require it (mail server)

		if (encPassword) {
			session.setAttribute("j_password", jPassword);
		} else {
			session.setAttribute("j_password",
					PasswordEncryptorUtil.encrypt(jPassword));

			if (PropsValues.SESSION_STORE_PASSWORD) {
				session.setAttribute(WebKeys.USER_PASSWORD, jPassword);
			}
		}

		session.setAttribute("j_remoteuser", jUsername);

		if (PropsValues.PORTAL_JAAS_ENABLE) {
			String redirect = PortalUtil.getPathMain().concat(
					"/portal/protected");

			if (PropsValues.AUTH_FORWARD_BY_LAST_PATH) {
				String autoLoginRedirect = (String) request
						.getAttribute(AutoLogin.AUTO_LOGIN_REDIRECT_AND_CONTINUE);

				redirect = redirect.concat("?redirect=");

				if (Validator.isNotNull(autoLoginRedirect)) {
					redirect = redirect.concat(autoLoginRedirect);
				} else {
					redirect = redirect.concat(PortalUtil
							.getCurrentCompleteURL(request));
				}
			}

			response.sendRedirect(redirect);
		}

		return jUsername;
	}
	
	
	
	@Override
	protected void processFilter(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws Exception {
		System.out
				.println("========================Oauth2FilterDemo=====+++++++++++++++++++++++++++==========================");

		ByteStreamHttpServletResponseWrapper responseWrapper = new ByteStreamHttpServletResponseWrapper(response);
		Oauth2HttpServletRequestWrapper requestWrapper = new Oauth2HttpServletRequestWrapper(request);
		HttpSession session = request.getSession();

		String redirect_uri = (String) session.getAttribute("redirect_uri");
	    String client_id =(String) session.getAttribute("client_id");
	    String response_type = (String)session.getAttribute("response_type");
	    String state =  (String)session.getAttribute("state");
	     
			System.out
			.println("========================redirect_uri==============================="
					+ redirect_uri);
	
			System.out
			.println("========================client_id==============================="
					+ client_id);
	
			System.out
			.println("========================response_type==============================="
					+ response_type);
	
	
		String jUserName = (String) session.getAttribute("j_username");

		System.out
				.println("========================session id==============================="
						+ session.getId());

		System.out
				.println("========================jUserName==============================="
						+ jUserName);

	
	

		if (redirect_uri != null && !"".equals("redirect_uri")
				&& jUserName != null && !"".equals(jUserName)) {
			if(DefaultUrl.equals(redirect_uri)){
				redirect_uri = OauthDefaultPage;
			}
			
			if(Token.equals(response_type)){
				Oauth2Token oauth2Token =Util.addOauth2Token(client_id, jUserName);
				redirect_uri = redirect_uri + "#access_token=" + oauth2Token.getToken() +"&expires_in=" + oauth2Token.getExpiredIn()+"&state="+state;
			}else{
				 String code =Util.addCode(redirect_uri, client_id,
							response_type, jUserName, session);			 
				 redirect_uri = redirect_uri + "?code="+code;
				
			}
			
			 response.sendRedirect(redirect_uri);
			return;
		}
		


		processFilter(Oauth2Filter.class, requestWrapper, responseWrapper, filterChain);

		HttpSession session2 = request.getSession();
		String userId = (String) session2.getAttribute("j_username");
//		System.out
//				.println("===============  =========session2 id==============================="
//						+ session2.getId());
//		System.out
//				.println("========================remoteUser2==============================="
//						+ remoteUser2);
		System.out
				.println("========================jUserName2==============================="
						+ userId);
//		System.out
//				.println("========================Oauth2FilterDemo  end=============================");
//
		System.out
				.println("========================responseWrapper.isCommitted()============================="
						+ responseWrapper.isCommitted() + "+++++++++++++" +  response.isCommitted());


			if (redirect_uri != null && !"".equals("redirect_uri")
					&& userId != null && !"".equals(userId)) {
				if(DefaultUrl.equals(redirect_uri)){
					redirect_uri = OauthDefaultPage;
				}
				
				if(Token.equals(response_type)){
					Oauth2Token oauth2Token =Util.addOauth2Token(client_id, userId);
					redirect_uri = redirect_uri + "#access_token=" + oauth2Token.getToken() +"&expires_in=" + oauth2Token.getExpiredIn()+"&state="+state;
				}else{
					 String code =Util.addCode(redirect_uri, client_id,
								response_type, jUserName, session);			 
					 redirect_uri = redirect_uri + "?code="+code;
					
				}
				
				 response.sendRedirect(redirect_uri);
				 

//				Oauth2ClientLocalServiceUtil.getOauth2Client("12");
//			
//			if(DefaultUrl.equals(redirect_uri)){
//				response.sendRedirect("");
//			}else{
//				 String code =Util.addCode(redirect_uri, client_id,
//							response_type, jUserName2, session);				 
//
//				 redirect_uri = redirect_uri + "?code="+code;
//				 
//				 System.out
//					.println("========================redirect_uri==============================="
//							+ redirect_uri);
//				response.sendRedirect(redirect_uri);
//			}
			
			
		

		} else {			
			byte[] b =responseWrapper.getOldBytes();
			ServletOutputStream out2 = response.getOutputStream();
			out2.write(b);
		}

	}



	private void setOauth2Info(HttpSession session, String code,
			JSONObject json) {
		ServletContext context = session.getServletContext();
	     HashMap<String , JSONObject> map = ( HashMap<String , JSONObject>)context.getAttribute("oauth2Info");
		 if(map == null){
			 map = new  HashMap<String , JSONObject>();
		 }
		 
		 try {
			 int size = map.size();
			 System.out
				.println("========================map size ==============================="
						+ size);
			 if(size>100){
				 long currentTime = new Date().getTime();
				for(Entry<String, JSONObject> entry : map.entrySet()){
					if(size<20){
						break;
					}
					JSONObject oauth2Info = entry.getValue();					
					long time =  oauth2Info.getLong("time");
					if(currentTime - time > 120){
						map.remove(entry.getKey());
					}
					
				}
			 }
		 } catch (JSONException e) {
				e.printStackTrace();
		}
		 
		 
		 map.put(code, json);
		 context.setAttribute("oauth2Info", map);
		
	
	}

	private static final String _PATH_CHAT_LATEST = "/-/chat/latest";

	private static Log _log = LogFactoryUtil.getLog(Oauth2Filter.class);

	private static List<AutoLogin> _autoLogins = new CopyOnWriteArrayList<AutoLogin>();

}
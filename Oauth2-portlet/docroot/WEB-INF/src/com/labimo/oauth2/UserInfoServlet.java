package com.labimo.oauth2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.oltu.oauth2.as.issuer.MD5Generator;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuer;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuerImpl;
import org.apache.oltu.oauth2.as.request.OAuthAuthzRequest;
import org.apache.oltu.oauth2.as.response.OAuthASResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.OAuth.ContentType;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.OAuthResponse;
import org.apache.oltu.oauth2.common.message.types.ResponseType;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;
import org.apache.oltu.oauth2.rs.request.OAuthAccessResourceRequest;
import org.apache.oltu.oauth2.rs.response.OAuthRSResponse;

import com.google.gson.Gson;
import com.labimo.portlet.tincan.model.Oauth2Client;
import com.labimo.portlet.tincan.model.Oauth2Token;
import com.labimo.portlet.tincan.service.Oauth2ClientLocalServiceUtil;
import com.labimo.portlet.tincan.service.Oauth2TokenLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

public class UserInfoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String loginURI = "/web/guest/welcome";
	private static final String URI = "urn:ietf:wg:oauth:2.0:oob";

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out
				.println("+++++++++++++++++++++++doGet+++++++++++++++++++++++++++++");
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String token = ParamUtil.getString(request, "token");
//		String authorization = request.getHeader("Authorization");
		try {
			OAuthAccessResourceRequest oauthAccessResourceRequest = new OAuthAccessResourceRequest(request);
			token = oauthAccessResourceRequest.getAccessToken();
			System.out.println("token =" + token);
		} catch (OAuthSystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (OAuthProblemException e1) {
	           OAuthResponse oauthResponse = null;
			try {
				oauthResponse = OAuthRSResponse
				            .errorResponse(HttpServletResponse.SC_UNAUTHORIZED)
				            .setRealm("Album Example")
				            .buildHeaderMessage();
				  response.addHeader(OAuth.HeaderType.WWW_AUTHENTICATE, oauthResponse.getHeader(OAuth.HeaderType.WWW_AUTHENTICATE));
				  response.setStatus(oauthResponse.getResponseStatus());

					PrintWriter pw = response.getWriter();
					System.out
							.println("================================================");
					System.out.println(oauthResponse.getBody());
					pw.print(oauthResponse.getBody());
					pw.flush();
					pw.close();
			} catch (OAuthSystemException e) {
				e.printStackTrace();
			}
	 
	     
		}
		
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
				Oauth2Token.class).add(
				PropertyFactoryUtil.forName("token").eq(token));
		List<Oauth2Token> tokenList;
		try {
			tokenList = Oauth2TokenLocalServiceUtil.dynamicQuery(dynamicQuery);
			if (tokenList != null && tokenList.size() == 1) {
				Oauth2Token oauth2Token = tokenList.get(0);
				long cuurentTime = new Date().getTime();
				if(oauth2Token.getExpiredIn() > cuurentTime){
					long userId = oauth2Token.getLiferayUserId();
					User user = UserLocalServiceUtil.getUser(userId);
					Gson gson = new Gson();

					response.setStatus(200);
					response.setContentType(ContentType.JSON);

					PrintWriter pw = response.getWriter();
					pw.print(gson.toJson(user));
					pw.flush();
					pw.close();
				}
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}

package com.labimo.oauth2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;

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
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.OAuthResponse;
import org.apache.oltu.oauth2.common.message.types.ResponseType;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;

import com.google.gson.Gson;
import com.labimo.portlet.tincan.model.Oauth2Client;
import com.labimo.portlet.tincan.model.Oauth2Token;
import com.labimo.portlet.tincan.service.Oauth2ClientLocalServiceUtil;
import com.labimo.portlet.tincan.service.Oauth2TokenLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;

public class AuthorizeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String loginURI = "/web/guest/welcome";
	private static final String  URI="urn:ietf:wg:oauth:2.0:oob";

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out
				.println("===================oauth  authorize===========AuthorizeServlet==============");

		//
		//
		System.out.println("session id = " + request.getSession().getId());

		String redirect_uri = request.getParameter(OAuth.OAUTH_REDIRECT_URI);
		String client_id = request.getParameter(OAuth.OAUTH_CLIENT_ID);
		String response_type = request.getParameter(OAuth.OAUTH_RESPONSE_TYPE);
		
		
		
		

		System.out
				.println("========================redirect_uri==============================="
						+ redirect_uri);

		System.out
				.println("========================client_id==============================="
						+ client_id);

		System.out
				.println("========================response_type==============================="
						+ response_type);

		if(validateClient(redirect_uri, client_id)){
			request.getSession().setAttribute(OAuth.OAUTH_REDIRECT_URI,
					redirect_uri);
			request.getSession().setAttribute(OAuth.OAUTH_CLIENT_ID, client_id);
			request.getSession().setAttribute(OAuth.OAUTH_RESPONSE_TYPE,
					response_type);

			response.sendRedirect(loginURI);
		}else{
			 OAuthResponse r = null;
			 String error = "error";	
			 try {
				r = OAuthResponse
						    .errorResponse(400).
						    setError(error)
						    .buildJSONMessage();
				  response.setStatus(r.getResponseStatus());
					 
					        PrintWriter pw = response.getWriter();
					        pw.print(r.getBody());
					        pw.flush();
					        pw.close();
			} catch (OAuthSystemException e) {
				e.printStackTrace();
			}
			
		}
			
		
//		if(URI.equals(redirect_uri)){
//			OAuthIssuer oauthIssuerImpl = new OAuthIssuerImpl(new MD5Generator());
//			
//			   String accessToken = oauthIssuerImpl.accessToken();
//	           String refreshToken = oauthIssuerImpl.refreshToken();
//	           
//	        	   Oauth2Token oauth2Token = Oauth2TokenLocalServiceUtil.createOauth2Token(10);
//
//		           oauth2Token.setToken(accessToken);
//		           oauth2Token.setRefreshToken(refreshToken);
//		           oauth2Token.setExpiredIn(new Date().getTime() + 60*60*1000L);
//		           oauth2Token.setLiferayUserId(Long.valueOf(userId));	
//		           oauth2Token.setClientId(Long.valueOf(clientId));
//		           Oauth2TokenLocalServiceUtil.addOauth2Token(oauth2Token);
//		}
		
		
		
		

		System.out
				.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
	
	private boolean validateClient(String redirect_uri, String client_id) {
		  boolean flag = false;
		  try {
			  
			  
			  if(Validator.isNotNull(redirect_uri) &&Validator.isNotNull(client_id)){
				  Oauth2Client oauth2Client = Oauth2ClientLocalServiceUtil.getOauth2Client(client_id);
	        		 
					if(redirect_uri.equals(oauth2Client.getRedirectUrl() ) ){
							 flag = true; 
					
					}
      		  
      	   }
		
		
		  } catch (Exception e) {
			  flag = false;
		  }
	        
	        flag = true;
			return flag;
		
	}

}

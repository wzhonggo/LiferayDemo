package com.labimo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.WeakHashMap;

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
import org.apache.oltu.oauth2.as.request.OAuthTokenRequest;
import org.apache.oltu.oauth2.as.response.OAuthASResponse;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.OAuthResponse;





import com.google.gson.Gson;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;


public class TokenServlet extends HttpServlet  {
	
	 private static final long serialVersionUID = 1L;
	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		OAuthTokenRequest oauthRequest = null;
		 
		OAuthIssuer oauthIssuerImpl = new OAuthIssuerImpl(new MD5Generator());
		 
		    try {
		           oauthRequest = new OAuthTokenRequest(request);
		        
//		           validateClient(oauthRequest);
		 
		           String authzCode = oauthRequest.getCode();
		 
		           // some code
		 
		           String accessToken = oauthIssuerImpl.accessToken();
		           String refreshToken = oauthIssuerImpl.refreshToken();
		           
		           
		           ServletContext context =    request.getSession().getServletContext();
		
		           
		           HashMap map = (HashMap) context.getAttribute("oauth2Info");
		           if(map !=null ){
		        	   Object oauth2Info=  map.get(authzCode);
		        	   System.out.println(oauth2Info.toString());
		        	   if(oauth2Info!=null){
		               	   Gson gson = new Gson();
			        	   Oauth2Info info  = gson.fromJson(oauth2Info.toString(), Oauth2Info.class);
			        	   System.out.println(info.getClient_id()+ "++++++++++++++++++++++++" +info.getUserId());
		        	   }
		        	   
		        	   map.remove(authzCode);
		 
		        	
		           }
		 
		           // some code
		 
		 
		            OAuthResponse r = OAuthASResponse
		                .tokenResponse(HttpServletResponse.SC_OK)
		                .setAccessToken(accessToken)
		                .setExpiresIn("3600")
		                .setRefreshToken(refreshToken)
		                .buildJSONMessage();
		 
		        response.setStatus(r.getResponseStatus());
		        
		        PrintWriter pw = response.getWriter();
		        System.out.println("================================================");
		        System.out.println(r.getBody());
		        pw.print(r.getBody());
		        pw.flush();
		        pw.close();
		       
		 
		         //if something goes wrong
		    } catch(OAuthProblemException ex) {
		 
//		        OAuthResponse r = null;
//				try {
//					r = OAuthResponse
//					    .errorResponse(401)
//					    .error(ex)
//					    .buildJSONMessage();
//				} catch (OAuthSystemException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		 
//		        response.setStatus(r.getResponseStatus());
//		 
//		        PrintWriter pw = response.getWriter();
//		        pw.print(r.getBody());
//		        pw.flush();
//		        pw.close();
//		 
//		        response.sendError(401);
		    	ex.printStackTrace();
		    } catch (OAuthSystemException e) {
				e.printStackTrace();
			}
	}




}

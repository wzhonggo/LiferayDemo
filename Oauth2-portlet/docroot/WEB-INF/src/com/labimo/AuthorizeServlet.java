package com.labimo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.oltu.oauth2.as.issuer.MD5Generator;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuerImpl;
import org.apache.oltu.oauth2.as.request.OAuthAuthzRequest;
import org.apache.oltu.oauth2.as.response.OAuthASResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.OAuthResponse;
import org.apache.oltu.oauth2.common.message.types.ResponseType;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;

public class AuthorizeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String loginURI = "/web/guest/welcome";

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

		request.getSession().setAttribute(OAuth.OAUTH_REDIRECT_URI,
				redirect_uri);
		request.getSession().setAttribute(OAuth.OAUTH_CLIENT_ID, client_id);
		request.getSession().setAttribute(OAuth.OAUTH_RESPONSE_TYPE,
				response_type);

		response.sendRedirect(loginURI);

		System.out
				.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}

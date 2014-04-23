package com.labimo;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;

import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;

public class Oauth2HttpServletRequestWrapper extends HttpServletRequestWrapper{

	public Oauth2HttpServletRequestWrapper(HttpServletRequest request) {
		super(request);
	}

	@Override
	public String getParameter(String name) {
		
		System.out.println("=======================getParameter(String name)=========++++++++++++++++++++++=========" + name + " = " +super.getParameter(name));
		if("doActionAfterLogin".equals(name) || "redirect".equals(name)){
			HttpServletRequest request = (HttpServletRequest) getRequest();
			HttpSession session = request.getSession();
			
			String redirect_uri = (String)session.getAttribute("redirect_uri");
			System.out.println(redirect_uri);
			
			if(redirect_uri!=null && !"".equals(redirect_uri)){
				if("doActionAfterLogin".equals(name)){
					return "true";
				}else{
					return "";
				}
			}
		}
		
		return super.getParameter(name);
				
	}

//	@Override
//	public ServletRequest getRequest() {
//		System.out.println("=======================getRequest===================");
//		return this;
//	}

	

	public ServletRequest getOriginalRequest() {
		return super.getRequest();
	}
	

	
	

	
	
}
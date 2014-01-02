package com.test;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.PortletURL;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Demo1
 */
public class Demo1 extends MVCPortlet {

	public void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("Deme1 doView ");
		PortletURL actionUrl = response.createActionURL();
		PortletURL resetRenderUrl = response.createRenderURL();

		System.out.println("actionUrl =" + actionUrl);
		System.out.println("resetRenderUrl = " + resetRenderUrl);

//		PortletSession session = request.getPortletSession();
//		session.setAttribute("TEST_falg", "abc",
//				PortletSession.APPLICATION_SCOPE);

		super.doView(request, response);
	}
	
	
	@ProcessAction(name = "setParam")
	public void setParam(ActionRequest request, ActionResponse response)
			throws PortletException, IOException {
		System.out.println("Deme1 setParam");

		String param = request.getParameter("param");		
		PortletSession session = request.getPortletSession();
		session.setAttribute("TEST_falg", param,
				PortletSession.APPLICATION_SCOPE);

	}
}

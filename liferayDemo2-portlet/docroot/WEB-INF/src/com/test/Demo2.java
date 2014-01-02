package com.test;

import java.io.IOException;
import java.util.Map.Entry;

import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Demo2
 */
public class Demo2 extends MVCPortlet {
 
	public void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Deme2 doView ");
		PortletURL actionUrl = response.createActionURL();
		PortletURL resetRenderUrl = response.createRenderURL();

		System.out.println("actionUrl =" + actionUrl);
		System.out.println("resetRenderUrl = " + resetRenderUrl);


	    PortletSession ps = request.getPortletSession();
		System.out.println("set seesion attribute");
	    ps.setAttribute("falg2", "abc",
				PortletSession.APPLICATION_SCOPE);
	    ps.setAttribute("falg3", "abc",
				PortletSession.PORTLET_SCOPE);
	    for(Entry entry : ps.getAttributeMap().entrySet()){
	    	System.out.println((String)entry.getKey() + (String)entry.getValue());
	    }
	    String falg = (String)ps.getAttribute("TEST_falg",PortletSession.APPLICATION_SCOPE);
	    System.out.println("falg = " + falg);
		request.setAttribute("falg", falg);

	    
		super.doView(request, response);
	}
}

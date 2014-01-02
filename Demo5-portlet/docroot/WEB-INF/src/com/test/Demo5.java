package com.test;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Demo5
 */
public class Demo5 extends MVCPortlet {
 
	public void doEdit(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("******** Demo5  doEdit ********");
	}
}

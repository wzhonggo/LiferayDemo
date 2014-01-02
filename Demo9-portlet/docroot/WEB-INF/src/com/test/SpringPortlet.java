package com.test;


import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.PortletDisplay;
import com.liferay.portal.theme.ThemeDisplay;


@Controller
@RequestMapping(value = "VIEW")
public class SpringPortlet {
	
	@RenderMapping
	public String view(Model model,RenderRequest request, RenderResponse response){
		
		
		ThemeDisplay themeDisplay= (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		PortletDisplay portletDisplay= themeDisplay.getPortletDisplay();	
		String portletId= portletDisplay.getId();
		String instanceId= portletDisplay.getInstanceId();
		System.out.println("portletId =" +portletId);
		System.out.println("instanceId =" +instanceId);
		
		model.addAttribute("username", "wzhonggo");
		return "view";
	}
	
	@RenderMapping(params = "action=edit")
	public String edit(Model model){
		model.addAttribute("action", "action=edit");
		return "edit";
	}
}

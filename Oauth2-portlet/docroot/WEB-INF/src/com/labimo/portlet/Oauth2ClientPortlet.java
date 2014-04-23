package com.labimo.portlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.labimo.portlet.tincan.model.Oauth2Client;
import com.labimo.portlet.tincan.model.impl.Oauth2ClientImpl;
import com.labimo.portlet.tincan.service.Oauth2ClientLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Oauth2Client
 */
public class Oauth2ClientPortlet extends MVCPortlet {
	
	
 
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {

		String page = (String) renderRequest.getAttribute("page");
		System.out.println(" page  =" +  page);
		if(Validator.isNotNull(page)){
			include(page, renderRequest, renderResponse);
		}else{
			User user;
			try {
				user = PortalUtil.getUser(renderRequest);
				if(user!=null){
					DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Oauth2Client.class).add(
							PropertyFactoryUtil.forName("liferayUserId").eq(user.getUserId()));
				List<Oauth2Client> clientList = Oauth2ClientLocalServiceUtil.dynamicQuery(dynamicQuery);
				renderRequest.setAttribute("clientList", clientList);
					
				}
				
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		
			super.doView(renderRequest, renderResponse);
		}
		
	}


	@ProcessAction(name = "addClientPage")
	public void addClientPage(ActionRequest actionRequest,
			ActionResponse actionRresponse) {
		
		try {
			System.out.println("+++++++++++++++addClientPage++++++++++++++++++++");
//			include("/html/oauth2client/addClientPage.jsp", actionRequest, actionRresponse);		
			actionRequest.setAttribute("page", "/html/oauth2client/addClientPage.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			SessionMessages.add(actionRequest, "error");
		}  
	}
	
	
	@ProcessAction(name = "addClient")
	public void addClient(ActionRequest actionRequest,
			ActionResponse actionRresponse) {
		
		try {
			User user = PortalUtil.getUser(actionRequest);
			if(user !=null){
				String name = ParamUtil.getString(actionRequest, "name");
				String description = ParamUtil.getString(actionRequest, "description");
				String url = ParamUtil.getString(actionRequest, "url");
				String redirectUrl = ParamUtil.getString(actionRequest, "redirectUrl");
				
				Oauth2Client oauth2Client = new Oauth2ClientImpl();
				oauth2Client.setLiferayUserId(user.getUserId());
				oauth2Client.setId(PortletUtil.getUuid());
				oauth2Client.setSecret(PortletUtil.getUuid());
				oauth2Client.setName(name);
				oauth2Client.setDescription(description);
				oauth2Client.setUrl(url);
				oauth2Client.setRedirectUrl(redirectUrl);
				Oauth2ClientLocalServiceUtil.addOauth2Client(oauth2Client);
			}
		
	
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}
}

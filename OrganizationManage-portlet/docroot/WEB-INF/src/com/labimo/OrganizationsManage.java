package com.labimo;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletSession;
import javax.portlet.PortletURL;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Organization;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserGroupRole;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.UserGroupLocalServiceUtil;
import com.liferay.portal.service.UserGroupRoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class OrganizationsManage
 */
public class OrganizationsManage extends MVCPortlet {
 
	public void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
//		PortletURL actionUrl = response.createActionURL();
//		PortletURL resetRenderUrl = response.createRenderURL();
//
//		System.out.println("actionUrl =" + actionUrl);
//		System.out.println("resetRenderUrl = " + resetRenderUrl);

//		PortletSession session = request.getPortletSession();
//		session.setAttribute("TEST_falg", "abc",
//				PortletSession.APPLICATION_SCOPE);
		PortletPreferences  portletPreferences = request.getPreferences();
		
		String action = (String) request.getAttribute("action");
		System.out.println("action =" + action);
//		long organizationId=33801;
		long organizationId = Long.valueOf(portletPreferences.getValue("organizationId", "0")) ;
		System.out.println("organizationId =" + organizationId);
		if(action!=null){
			
//			HttpServletRequest httpServletRequest =  PortalUtil.getHttpServletRequest(request);
//			String email = httpServletRequest.getParameter("email");
//			email = "%go%";
//			int start=0;
//			int end=20;
//			DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(User.class)
//					.add(PropertyFactoryUtil.forName("emailAddress").like(email))
//					.addOrder(OrderFactoryUtil.asc("screenName"));
//			
//			List<User> userList = null;
//			try {
//				userList = UserLocalServiceUtil.dynamicQuery(dynamicQuery, start, end);
//			} catch (SystemException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("============================================");
//			for(User user : userList){
//				System.out.println(user.getScreenName() + user.getEmailAddress());
//			}
//			request.setAttribute("userList", userList);
			include("/html/organizationsmanage/assignUsers.jsp", request, response);
		}else{
			
			if(organizationId!=0){
				try {
					User user = PortalUtil.getUser(request);
					Organization currentOrganization = OrganizationLocalServiceUtil.getOrganization(organizationId);
					List<Organization> organizationList = OrganizationLocalServiceUtil.getSuborganizations(user.getCompanyId(), organizationId);
//					OrganizationLocalServiceUtil.getSuborganizations(organizations)
					List<User> userList = UserLocalServiceUtil.getOrganizationUsers(organizationId);
					request.setAttribute("currentOrganization", currentOrganization);
					request.setAttribute("organizationList", organizationList);
					request.setAttribute("userList", userList);
//					User user2 = userList.get(0);
//					
//					user.getU
//					
//					UserGroupLocalServiceUtil.getUserUserGroups(userId)
//					System.out.println("=============");
//					OrgGroupRoleUtil.f
//					UserGroupRoleLocalServiceUtil.get
//					System.out.println(user2.getFirstName());
//					List<Role> userRoles = user2.getRoles();
//					for(Role role : userRoles){
//						System.out.println(role.getName() + " ========== "  +role.getType());
//					}
					

//					List<UserGroupRole> userGroupRoleList = UserGroupRoleLocalServiceUtil.getUserGroupRoles(user2.getUserId()); 
//					for(UserGroupRole userGroupRole : userGroupRoleList){
//						System.out.println(userGroupRole.getRole().getName() + " ========== "  +userGroupRole.getRole().getType());
//					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			super.doView(request, response);
		}	
	}
	
	
	

	
	
	
	@ProcessAction(name = "assignUsers")
	public void assignUsers(ActionRequest request, ActionResponse response)
			throws PortletException, IOException {
		System.out.println("+++++++++++++++++++++++++++++++");
		
		
//		long organizationId=33801;
		try {
			PortletPreferences  portletPreferences = request.getPreferences();
			long organizationId = Long.valueOf(portletPreferences.getValue("organizationId", "0")) ;
			User user = PortalUtil.getUser(request);
//			Organization currentOrganization = OrganizationLocalServiceUtil.getOrganization(organizationId);
//			List<Organization> organizationList = OrganizationLocalServiceUtil.getSuborganizations(user.getCompanyId(), organizationId);
//			OrganizationLocalServiceUtil.getSuborganizations(organizations)
			List<User> userList = UserLocalServiceUtil.getOrganizationUsers(organizationId);
//			request.setAttribute("currentOrganization", currentOrganization);
//			request.setAttribute("organizationList", organizationList);
			request.setAttribute("userList", userList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("action", "assignUsers");
	}
	
	
	@ProcessAction(name = "search")
	public void search(ActionRequest request, ActionResponse response)
			throws PortletException, IOException {
		
		System.out.println("+++++++++++++++++++++++++++++++");
		try {
//			long organizationId=;
			PortletPreferences  portletPreferences = request.getPreferences();
			long organizationId = Long.valueOf(portletPreferences.getValue("organizationId", "0")) ;
			long[] organizationUserIds =UserLocalServiceUtil.getOrganizationUserIds(organizationId);
			request.setAttribute("organizationUserIds", organizationUserIds);
			
			
			HttpServletRequest httpServletRequest =  PortalUtil.getHttpServletRequest(request);
			String screenName = httpServletRequest.getParameter("screenName");
			screenName = "%"+ screenName +"%";
			int start=0;
			int end=20;
			DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(User.class)
					.add(PropertyFactoryUtil.forName("screenName").like(screenName))
					.addOrder(OrderFactoryUtil.asc("screenName"));
			
			List<User> userList =  UserLocalServiceUtil.dynamicQuery(dynamicQuery, start, end);
		
			for(User user : userList){
				System.out.println(user.getScreenName() + user.getEmailAddress());
			}
			request.setAttribute("userList", userList);
			
			
			request.setAttribute("action", "search");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	/*@ProcessAction(name = "search2")
	public void search2(ActionRequest request, ActionResponse response)
			throws PortletException, IOException {
		
		System.out.println("++++++++++++search2++++++++++++++++++");
		try {
			HttpServletRequest httpServletRequest =  PortalUtil.getHttpServletRequest(request);
			String screenName = httpServletRequest.getParameter("screenName");
			System.out.println("++++screenName++++++++++++++++++++++++++" + screenName);
			screenName = "go";
			int start=0;
			int end=20;
			DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(User.class)
					.add(PropertyFactoryUtil.forName("screenName").like(screenName))
					.addOrder(OrderFactoryUtil.asc("screenName"));
			
			List<User> userList =  UserLocalServiceUtil.dynamicQuery(dynamicQuery, start, end);
		
			for(User user : userList){
				System.out.println(user.getScreenName() + user.getEmailAddress());
			}
			request.setAttribute("userList", userList);
			
			
			request.setAttribute("filename", "assignUsers");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}*/
	
	@ProcessAction(name = "updateAssociation")
	public void updateAssociation(ActionRequest request, ActionResponse response)
			throws PortletException, IOException {
		System.out.println("updateAssociation");
		
//		long organizationId;
//		OrganizationLocalServiceUtil.addUserOrganization(userId, organizationId)
//		OrganizationLocalServiceUtil.setUserOrganizations(userId, organizationIds)
//		OrganizationLocalServiceUtil.deleteUserOrganization(userId, organizationId)
		
		
	

			long[] addUserIds = StringUtil.split(
				ParamUtil.getString(request, "addUserIds"), 0L);
			long[] removeUserIds = StringUtil.split(
				ParamUtil.getString(request, "removeUserIds"), 0L);
			
			long[] userIds = ParamUtil.getLongValues(request, "userIds");
			for(long id : userIds){
				System.out.println("id = " + id); 
			}
			
			for(long id : addUserIds){
				System.out.println("addUserIds = " + id); 
			}
			
			for(long id : removeUserIds){
				System.out.println("removeUserIds = " + id); 
			}
			
			System.out.println("id = " + ParamUtil.getString(request, "addUserIds")); 
			System.out.println("id = " + ParamUtil.getString(request, "removeUserIds")); 


			try {
				PortletPreferences  portletPreferences = request.getPreferences();
				long organizationId = Long.valueOf(portletPreferences.getValue("organizationId", "0")) ;
				
				UserServiceUtil.addOrganizationUsers(organizationId, addUserIds);
				UserServiceUtil.unsetOrganizationUsers(organizationId, removeUserIds);

//				UserLocalServiceUtil.addOrganizationUsers(organizationId, addUserIds);
//				UserLocalServiceUtil.unsetOrganizationUsers(organizationId, addUserIds);
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
//			request.setAttribute("action", "updateAssociation");
	}
	

	
	public void doEdit(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("********   doEdit ********");
		try {			
			List<Organization> organizations = OrganizationLocalServiceUtil.getOrganizations(QueryUtil.ALL_POS, QueryUtil.ALL_POS);					
			request.setAttribute("organizations", organizations);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		super.doEdit(request, response );
	}
	
	
	@ProcessAction(name = "savaOrginaztion")
	public void savaOrginaztion(ActionRequest request, ActionResponse response) {

		try {

			HttpServletRequest httpServletRequest = PortalUtil
					.getHttpServletRequest(request);
			String organizationId = httpServletRequest.getParameter("organizationId");

			System.out.println("organizationId =" + organizationId);
			if (!Validator.isBlank(organizationId)
					&& !Validator.isBlank(organizationId)) {
				PortletPreferences portletPreferences = request
						.getPreferences();
				portletPreferences.setValue("organizationId", organizationId);
				portletPreferences.store();
				SessionMessages.add(request, "success");
			} else {
				SessionMessages.add(request, "error");
			}

		} catch (Exception e) {
			e.printStackTrace();
			SessionMessages.add(request, "error");
		}

	}
}

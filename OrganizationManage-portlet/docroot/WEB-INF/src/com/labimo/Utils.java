package com.labimo;

import java.util.List;

import com.liferay.portal.model.User;
import com.liferay.portal.model.UserGroupRole;
import com.liferay.portal.service.UserGroupRoleLocalServiceUtil;

public class Utils {
 
	
	
	public static String getOrgRoleNames(long userId){
		String orgRoleNames="";
		List<UserGroupRole> userGroupRoleList;
		try {
			userGroupRoleList = UserGroupRoleLocalServiceUtil.getUserGroupRoles(userId);
			for(UserGroupRole userGroupRole : userGroupRoleList){
//				System.out.println(userGroupRole.getRole().getName() + " ========== "  +userGroupRole.getRole().getType());
				if(userGroupRole.getRole().getType()==3){
					orgRoleNames += userGroupRole.getRole().getName()+",";
				}
			}
			
			if(orgRoleNames.length() > 1){
				orgRoleNames = orgRoleNames.substring(0, orgRoleNames.length()-1);
			}
			
//			System.out.println( "orgRoleNames========== " + orgRoleNames);
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return orgRoleNames;
	}
	
	public static boolean isExist(long[] organizationUserIds, long userId){
		for(long id : organizationUserIds){
			if(id == userId){
				return true;
			}
		}
		return false;
	}
}

package com.test;

import java.util.Map;

import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;

public class FriendlierFriendlyURLMapper extends DefaultFriendlyURLMapper {

        
        @Override
    	public String buildPath(LiferayPortletURL liferayPortletURL) {
        	return  "/Demo6/download";
        }
        
        
        @Override
    	public void populateParams(
    		String friendlyURLPath, Map<String, String[]> parameterMap,
    		Map<String, Object> requestContext) {
    			
		}
}
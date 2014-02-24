package com.labimo.portlet;

import com.labimo.model.License;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.social.model.BaseSocialActivityInterpreter;
import com.liferay.portlet.social.model.SocialActivity;
import com.liferay.portlet.social.model.SocialActivityFeedEntry;
public class LicenseActivityInterpreter  extends BaseSocialActivityInterpreter{
	private static final String[] _CLASS_NAMES = {License.class.getName()};
	
	@Override
	public String[] getClassNames() {
		return _CLASS_NAMES;
	}

	protected SocialActivityFeedEntry doInterpret(
			SocialActivity activity, ThemeDisplay themeDisplay)
		throws Exception {

		// parse activity

		String link = "";
		
		
		String body = "";
		String title =activity.getExtraDataValue("title");

		return new SocialActivityFeedEntry(link, title, body);
	}
	
	
	@Override
	protected boolean hasPermissions(
			PermissionChecker permissionChecker, SocialActivity activity,
			String actionId, ServiceContext serviceContext)
		throws Exception {

		return true;
	}
}

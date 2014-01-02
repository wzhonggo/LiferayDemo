package com.test;

import java.util.Map;

import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.PortletConstants;

public class FriendlyURLMapper extends DefaultFriendlyURLMapper {

	@Override
	protected String getPortletId(Map<String, String> routeParameters) {
		if (!isPortletInstanceable()) {
			return getPortletId();
		}

		String portletId = routeParameters.remove("p_p_id");

		if (Validator.isNotNull(portletId)) {
			return portletId;
		}

		String instanceId = routeParameters.remove("instanceId");

//		if (Validator.isNull(instanceId)) {
//			if (_log.isErrorEnabled()) {
//				_log.error(
//					"Either p_p_id or instanceId must be provided for an " +
//						"instanceable portlet");
//			}
//
//			return null;
//		}

		return PortletConstants.assemblePortletId(getPortletId(), instanceId);
	}
	

}

/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.labimo.portlet.tincan.service.messaging;

import com.labimo.portlet.tincan.service.ClpSerializer;
import com.labimo.portlet.tincan.service.LiferayTincanManifestActLocalServiceUtil;
import com.labimo.portlet.tincan.service.LiferayUserLocalServiceUtil;
import com.labimo.portlet.tincan.service.Oauth2ClientLocalServiceUtil;
import com.labimo.portlet.tincan.service.Oauth2EndpointLocalServiceUtil;
import com.labimo.portlet.tincan.service.Oauth2TokenLocalServiceUtil;
import com.labimo.portlet.tincan.service.TincanActivityStateLocalServiceUtil;
import com.labimo.portlet.tincan.service.TincanAgentLocalServiceUtil;
import com.labimo.portlet.tincan.service.TincanAgentProfileLocalServiceUtil;
import com.labimo.portlet.tincan.service.TincanAttachmentLocalServiceUtil;
import com.labimo.portlet.tincan.service.TincanStatementAttachmentLocalServiceUtil;
import com.labimo.portlet.tincan.service.TincanStatementContextLocalServiceUtil;
import com.labimo.portlet.tincan.service.TincanStatementLocalServiceUtil;
import com.labimo.portlet.tincan.service.TincanStatementResultLocalServiceUtil;
import com.labimo.portlet.tincan.service.TincanSubStatementLocalServiceUtil;
import com.labimo.portlet.tincan.service.TincanVerbLocalServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author wzgong
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			LiferayTincanManifestActLocalServiceUtil.clearService();

			LiferayUserLocalServiceUtil.clearService();

			Oauth2ClientLocalServiceUtil.clearService();

			Oauth2EndpointLocalServiceUtil.clearService();

			Oauth2TokenLocalServiceUtil.clearService();

			TincanActivityStateLocalServiceUtil.clearService();

			TincanAgentLocalServiceUtil.clearService();

			TincanAgentProfileLocalServiceUtil.clearService();

			TincanAttachmentLocalServiceUtil.clearService();

			TincanStatementLocalServiceUtil.clearService();

			TincanStatementAttachmentLocalServiceUtil.clearService();

			TincanStatementContextLocalServiceUtil.clearService();

			TincanStatementResultLocalServiceUtil.clearService();

			TincanSubStatementLocalServiceUtil.clearService();

			TincanVerbLocalServiceUtil.clearService();
		}
	}
}
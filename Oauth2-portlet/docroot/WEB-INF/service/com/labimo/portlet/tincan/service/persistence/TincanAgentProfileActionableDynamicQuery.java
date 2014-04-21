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

package com.labimo.portlet.tincan.service.persistence;

import com.labimo.portlet.tincan.model.TincanAgentProfile;
import com.labimo.portlet.tincan.service.TincanAgentProfileLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author wzgong
 * @generated
 */
public abstract class TincanAgentProfileActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public TincanAgentProfileActionableDynamicQuery() throws SystemException {
		setBaseLocalService(TincanAgentProfileLocalServiceUtil.getService());
		setClass(TincanAgentProfile.class);

		setClassLoader(com.labimo.portlet.tincan.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("id");
	}
}
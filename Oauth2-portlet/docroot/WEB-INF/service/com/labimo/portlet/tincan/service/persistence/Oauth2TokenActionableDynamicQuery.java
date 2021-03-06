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

import com.labimo.portlet.tincan.model.Oauth2Token;
import com.labimo.portlet.tincan.service.Oauth2TokenLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author wzgong
 * @generated
 */
public abstract class Oauth2TokenActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public Oauth2TokenActionableDynamicQuery() throws SystemException {
		setBaseLocalService(Oauth2TokenLocalServiceUtil.getService());
		setClass(Oauth2Token.class);

		setClassLoader(com.labimo.portlet.tincan.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("id");
	}
}
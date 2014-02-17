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

package com.labimo.model;

import com.labimo.service.ClpSerializer;
import com.labimo.service.LicenseLocalServiceUtil;
import com.labimo.service.persistence.LicensePK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wzgong
 */
public class LicenseClp extends BaseModelImpl<License> implements License {
	public LicenseClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return License.class;
	}

	@Override
	public String getModelClassName() {
		return License.class.getName();
	}

	@Override
	public LicensePK getPrimaryKey() {
		return new LicensePK(_licenseUuid, _hardwareUuid);
	}

	@Override
	public void setPrimaryKey(LicensePK primaryKey) {
		setLicenseUuid(primaryKey.licenseUuid);
		setHardwareUuid(primaryKey.hardwareUuid);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new LicensePK(_licenseUuid, _hardwareUuid);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((LicensePK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("licenseUuid", getLicenseUuid());
		attributes.put("hardwareUuid", getHardwareUuid());
		attributes.put("userId", getUserId());
		attributes.put("content", getContent());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String licenseUuid = (String)attributes.get("licenseUuid");

		if (licenseUuid != null) {
			setLicenseUuid(licenseUuid);
		}

		String hardwareUuid = (String)attributes.get("hardwareUuid");

		if (hardwareUuid != null) {
			setHardwareUuid(hardwareUuid);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public String getLicenseUuid() {
		return _licenseUuid;
	}

	@Override
	public void setLicenseUuid(String licenseUuid) {
		_licenseUuid = licenseUuid;

		if (_licenseRemoteModel != null) {
			try {
				Class<?> clazz = _licenseRemoteModel.getClass();

				Method method = clazz.getMethod("setLicenseUuid", String.class);

				method.invoke(_licenseRemoteModel, licenseUuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHardwareUuid() {
		return _hardwareUuid;
	}

	@Override
	public void setHardwareUuid(String hardwareUuid) {
		_hardwareUuid = hardwareUuid;

		if (_licenseRemoteModel != null) {
			try {
				Class<?> clazz = _licenseRemoteModel.getClass();

				Method method = clazz.getMethod("setHardwareUuid", String.class);

				method.invoke(_licenseRemoteModel, hardwareUuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_licenseRemoteModel != null) {
			try {
				Class<?> clazz = _licenseRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_licenseRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getContent() {
		return _content;
	}

	@Override
	public void setContent(String content) {
		_content = content;

		if (_licenseRemoteModel != null) {
			try {
				Class<?> clazz = _licenseRemoteModel.getClass();

				Method method = clazz.getMethod("setContent", String.class);

				method.invoke(_licenseRemoteModel, content);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_licenseRemoteModel != null) {
			try {
				Class<?> clazz = _licenseRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_licenseRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_licenseRemoteModel != null) {
			try {
				Class<?> clazz = _licenseRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_licenseRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLicenseRemoteModel() {
		return _licenseRemoteModel;
	}

	public void setLicenseRemoteModel(BaseModel<?> licenseRemoteModel) {
		_licenseRemoteModel = licenseRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _licenseRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_licenseRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LicenseLocalServiceUtil.addLicense(this);
		}
		else {
			LicenseLocalServiceUtil.updateLicense(this);
		}
	}

	@Override
	public License toEscapedModel() {
		return (License)ProxyUtil.newProxyInstance(License.class.getClassLoader(),
			new Class[] { License.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LicenseClp clone = new LicenseClp();

		clone.setLicenseUuid(getLicenseUuid());
		clone.setHardwareUuid(getHardwareUuid());
		clone.setUserId(getUserId());
		clone.setContent(getContent());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(License license) {
		LicensePK primaryKey = license.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LicenseClp)) {
			return false;
		}

		LicenseClp license = (LicenseClp)obj;

		LicensePK primaryKey = license.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{licenseUuid=");
		sb.append(getLicenseUuid());
		sb.append(", hardwareUuid=");
		sb.append(getHardwareUuid());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.labimo.model.License");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>licenseUuid</column-name><column-value><![CDATA[");
		sb.append(getLicenseUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hardwareUuid</column-name><column-value><![CDATA[");
		sb.append(getHardwareUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _licenseUuid;
	private String _hardwareUuid;
	private long _userId;
	private String _userUuid;
	private String _content;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _licenseRemoteModel;
}
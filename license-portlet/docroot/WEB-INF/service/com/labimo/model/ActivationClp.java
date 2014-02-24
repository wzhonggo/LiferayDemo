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

import com.labimo.service.ActivationLocalServiceUtil;
import com.labimo.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wzgong
 */
public class ActivationClp extends BaseModelImpl<Activation>
	implements Activation {
	public ActivationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Activation.class;
	}

	@Override
	public String getModelClassName() {
		return Activation.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _activationId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setActivationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _activationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("activationId", getActivationId());
		attributes.put("hardwareUuid", getHardwareUuid());
		attributes.put("licenseUuid", getLicenseUuid());
		attributes.put("createTime", getCreateTime());
		attributes.put("valid", getValid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String activationId = (String)attributes.get("activationId");

		if (activationId != null) {
			setActivationId(activationId);
		}

		String hardwareUuid = (String)attributes.get("hardwareUuid");

		if (hardwareUuid != null) {
			setHardwareUuid(hardwareUuid);
		}

		String licenseUuid = (String)attributes.get("licenseUuid");

		if (licenseUuid != null) {
			setLicenseUuid(licenseUuid);
		}

		Date createTime = (Date)attributes.get("createTime");

		if (createTime != null) {
			setCreateTime(createTime);
		}

		Boolean valid = (Boolean)attributes.get("valid");

		if (valid != null) {
			setValid(valid);
		}
	}

	@Override
	public String getActivationId() {
		return _activationId;
	}

	@Override
	public void setActivationId(String activationId) {
		_activationId = activationId;

		if (_activationRemoteModel != null) {
			try {
				Class<?> clazz = _activationRemoteModel.getClass();

				Method method = clazz.getMethod("setActivationId", String.class);

				method.invoke(_activationRemoteModel, activationId);
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

		if (_activationRemoteModel != null) {
			try {
				Class<?> clazz = _activationRemoteModel.getClass();

				Method method = clazz.getMethod("setHardwareUuid", String.class);

				method.invoke(_activationRemoteModel, hardwareUuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLicenseUuid() {
		return _licenseUuid;
	}

	@Override
	public void setLicenseUuid(String licenseUuid) {
		_licenseUuid = licenseUuid;

		if (_activationRemoteModel != null) {
			try {
				Class<?> clazz = _activationRemoteModel.getClass();

				Method method = clazz.getMethod("setLicenseUuid", String.class);

				method.invoke(_activationRemoteModel, licenseUuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateTime() {
		return _createTime;
	}

	@Override
	public void setCreateTime(Date createTime) {
		_createTime = createTime;

		if (_activationRemoteModel != null) {
			try {
				Class<?> clazz = _activationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateTime", Date.class);

				method.invoke(_activationRemoteModel, createTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getValid() {
		return _valid;
	}

	@Override
	public boolean isValid() {
		return _valid;
	}

	@Override
	public void setValid(boolean valid) {
		_valid = valid;

		if (_activationRemoteModel != null) {
			try {
				Class<?> clazz = _activationRemoteModel.getClass();

				Method method = clazz.getMethod("setValid", boolean.class);

				method.invoke(_activationRemoteModel, valid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getActivationRemoteModel() {
		return _activationRemoteModel;
	}

	public void setActivationRemoteModel(BaseModel<?> activationRemoteModel) {
		_activationRemoteModel = activationRemoteModel;
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

		Class<?> remoteModelClass = _activationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_activationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ActivationLocalServiceUtil.addActivation(this);
		}
		else {
			ActivationLocalServiceUtil.updateActivation(this);
		}
	}

	@Override
	public Activation toEscapedModel() {
		return (Activation)ProxyUtil.newProxyInstance(Activation.class.getClassLoader(),
			new Class[] { Activation.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ActivationClp clone = new ActivationClp();

		clone.setActivationId(getActivationId());
		clone.setHardwareUuid(getHardwareUuid());
		clone.setLicenseUuid(getLicenseUuid());
		clone.setCreateTime(getCreateTime());
		clone.setValid(getValid());

		return clone;
	}

	@Override
	public int compareTo(Activation activation) {
		String primaryKey = activation.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActivationClp)) {
			return false;
		}

		ActivationClp activation = (ActivationClp)obj;

		String primaryKey = activation.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{activationId=");
		sb.append(getActivationId());
		sb.append(", hardwareUuid=");
		sb.append(getHardwareUuid());
		sb.append(", licenseUuid=");
		sb.append(getLicenseUuid());
		sb.append(", createTime=");
		sb.append(getCreateTime());
		sb.append(", valid=");
		sb.append(getValid());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.labimo.model.Activation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>activationId</column-name><column-value><![CDATA[");
		sb.append(getActivationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hardwareUuid</column-name><column-value><![CDATA[");
		sb.append(getHardwareUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>licenseUuid</column-name><column-value><![CDATA[");
		sb.append(getLicenseUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createTime</column-name><column-value><![CDATA[");
		sb.append(getCreateTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>valid</column-name><column-value><![CDATA[");
		sb.append(getValid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _activationId;
	private String _hardwareUuid;
	private String _licenseUuid;
	private Date _createTime;
	private boolean _valid;
	private BaseModel<?> _activationRemoteModel;
}
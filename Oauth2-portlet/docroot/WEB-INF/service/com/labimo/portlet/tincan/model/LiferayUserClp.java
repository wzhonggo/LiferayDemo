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

package com.labimo.portlet.tincan.model;

import com.labimo.portlet.tincan.service.ClpSerializer;
import com.labimo.portlet.tincan.service.LiferayUserLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wzgong
 */
public class LiferayUserClp extends BaseModelImpl<LiferayUser>
	implements LiferayUser {
	public LiferayUserClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LiferayUser.class;
	}

	@Override
	public String getModelClassName() {
		return LiferayUser.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("liferayUserId", getLiferayUserId());
		attributes.put("name", getName());
		attributes.put("preferredAudioLevel", getPreferredAudioLevel());
		attributes.put("preferredLanguage", getPreferredLanguage());
		attributes.put("preferredDeliverySpeed", getPreferredDeliverySpeed());
		attributes.put("preferredAudioCaptioning", getPreferredAudioCaptioning());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long liferayUserId = (Long)attributes.get("liferayUserId");

		if (liferayUserId != null) {
			setLiferayUserId(liferayUserId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Double preferredAudioLevel = (Double)attributes.get(
				"preferredAudioLevel");

		if (preferredAudioLevel != null) {
			setPreferredAudioLevel(preferredAudioLevel);
		}

		String preferredLanguage = (String)attributes.get("preferredLanguage");

		if (preferredLanguage != null) {
			setPreferredLanguage(preferredLanguage);
		}

		Double preferredDeliverySpeed = (Double)attributes.get(
				"preferredDeliverySpeed");

		if (preferredDeliverySpeed != null) {
			setPreferredDeliverySpeed(preferredDeliverySpeed);
		}

		Long preferredAudioCaptioning = (Long)attributes.get(
				"preferredAudioCaptioning");

		if (preferredAudioCaptioning != null) {
			setPreferredAudioCaptioning(preferredAudioCaptioning);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_liferayUserRemoteModel != null) {
			try {
				Class<?> clazz = _liferayUserRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_liferayUserRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLiferayUserId() {
		return _liferayUserId;
	}

	@Override
	public void setLiferayUserId(long liferayUserId) {
		_liferayUserId = liferayUserId;

		if (_liferayUserRemoteModel != null) {
			try {
				Class<?> clazz = _liferayUserRemoteModel.getClass();

				Method method = clazz.getMethod("setLiferayUserId", long.class);

				method.invoke(_liferayUserRemoteModel, liferayUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLiferayUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getLiferayUserId(), "uuid",
			_liferayUserUuid);
	}

	@Override
	public void setLiferayUserUuid(String liferayUserUuid) {
		_liferayUserUuid = liferayUserUuid;
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_liferayUserRemoteModel != null) {
			try {
				Class<?> clazz = _liferayUserRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_liferayUserRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPreferredAudioLevel() {
		return _preferredAudioLevel;
	}

	@Override
	public void setPreferredAudioLevel(double preferredAudioLevel) {
		_preferredAudioLevel = preferredAudioLevel;

		if (_liferayUserRemoteModel != null) {
			try {
				Class<?> clazz = _liferayUserRemoteModel.getClass();

				Method method = clazz.getMethod("setPreferredAudioLevel",
						double.class);

				method.invoke(_liferayUserRemoteModel, preferredAudioLevel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPreferredLanguage() {
		return _preferredLanguage;
	}

	@Override
	public void setPreferredLanguage(String preferredLanguage) {
		_preferredLanguage = preferredLanguage;

		if (_liferayUserRemoteModel != null) {
			try {
				Class<?> clazz = _liferayUserRemoteModel.getClass();

				Method method = clazz.getMethod("setPreferredLanguage",
						String.class);

				method.invoke(_liferayUserRemoteModel, preferredLanguage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPreferredDeliverySpeed() {
		return _preferredDeliverySpeed;
	}

	@Override
	public void setPreferredDeliverySpeed(double preferredDeliverySpeed) {
		_preferredDeliverySpeed = preferredDeliverySpeed;

		if (_liferayUserRemoteModel != null) {
			try {
				Class<?> clazz = _liferayUserRemoteModel.getClass();

				Method method = clazz.getMethod("setPreferredDeliverySpeed",
						double.class);

				method.invoke(_liferayUserRemoteModel, preferredDeliverySpeed);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPreferredAudioCaptioning() {
		return _preferredAudioCaptioning;
	}

	@Override
	public void setPreferredAudioCaptioning(long preferredAudioCaptioning) {
		_preferredAudioCaptioning = preferredAudioCaptioning;

		if (_liferayUserRemoteModel != null) {
			try {
				Class<?> clazz = _liferayUserRemoteModel.getClass();

				Method method = clazz.getMethod("setPreferredAudioCaptioning",
						long.class);

				method.invoke(_liferayUserRemoteModel, preferredAudioCaptioning);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLiferayUserRemoteModel() {
		return _liferayUserRemoteModel;
	}

	public void setLiferayUserRemoteModel(BaseModel<?> liferayUserRemoteModel) {
		_liferayUserRemoteModel = liferayUserRemoteModel;
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

		Class<?> remoteModelClass = _liferayUserRemoteModel.getClass();

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

		Object returnValue = method.invoke(_liferayUserRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LiferayUserLocalServiceUtil.addLiferayUser(this);
		}
		else {
			LiferayUserLocalServiceUtil.updateLiferayUser(this);
		}
	}

	@Override
	public LiferayUser toEscapedModel() {
		return (LiferayUser)ProxyUtil.newProxyInstance(LiferayUser.class.getClassLoader(),
			new Class[] { LiferayUser.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LiferayUserClp clone = new LiferayUserClp();

		clone.setId(getId());
		clone.setLiferayUserId(getLiferayUserId());
		clone.setName(getName());
		clone.setPreferredAudioLevel(getPreferredAudioLevel());
		clone.setPreferredLanguage(getPreferredLanguage());
		clone.setPreferredDeliverySpeed(getPreferredDeliverySpeed());
		clone.setPreferredAudioCaptioning(getPreferredAudioCaptioning());

		return clone;
	}

	@Override
	public int compareTo(LiferayUser liferayUser) {
		long primaryKey = liferayUser.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LiferayUserClp)) {
			return false;
		}

		LiferayUserClp liferayUser = (LiferayUserClp)obj;

		long primaryKey = liferayUser.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", liferayUserId=");
		sb.append(getLiferayUserId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", preferredAudioLevel=");
		sb.append(getPreferredAudioLevel());
		sb.append(", preferredLanguage=");
		sb.append(getPreferredLanguage());
		sb.append(", preferredDeliverySpeed=");
		sb.append(getPreferredDeliverySpeed());
		sb.append(", preferredAudioCaptioning=");
		sb.append(getPreferredAudioCaptioning());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.LiferayUser");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>liferayUserId</column-name><column-value><![CDATA[");
		sb.append(getLiferayUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preferredAudioLevel</column-name><column-value><![CDATA[");
		sb.append(getPreferredAudioLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preferredLanguage</column-name><column-value><![CDATA[");
		sb.append(getPreferredLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preferredDeliverySpeed</column-name><column-value><![CDATA[");
		sb.append(getPreferredDeliverySpeed());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preferredAudioCaptioning</column-name><column-value><![CDATA[");
		sb.append(getPreferredAudioCaptioning());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _liferayUserId;
	private String _liferayUserUuid;
	private String _name;
	private double _preferredAudioLevel;
	private String _preferredLanguage;
	private double _preferredDeliverySpeed;
	private long _preferredAudioCaptioning;
	private BaseModel<?> _liferayUserRemoteModel;
}
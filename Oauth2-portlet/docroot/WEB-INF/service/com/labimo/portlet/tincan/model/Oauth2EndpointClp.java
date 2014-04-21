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
import com.labimo.portlet.tincan.service.Oauth2EndpointLocalServiceUtil;

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
public class Oauth2EndpointClp extends BaseModelImpl<Oauth2Endpoint>
	implements Oauth2Endpoint {
	public Oauth2EndpointClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Oauth2Endpoint.class;
	}

	@Override
	public String getModelClassName() {
		return Oauth2Endpoint.class.getName();
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
		attributes.put("oauthType", getOauthType());
		attributes.put("isPublic", getIsPublic());
		attributes.put("guestAccess", getGuestAccess());

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

		String oauthType = (String)attributes.get("oauthType");

		if (oauthType != null) {
			setOauthType(oauthType);
		}

		Boolean isPublic = (Boolean)attributes.get("isPublic");

		if (isPublic != null) {
			setIsPublic(isPublic);
		}

		Boolean guestAccess = (Boolean)attributes.get("guestAccess");

		if (guestAccess != null) {
			setGuestAccess(guestAccess);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_oauth2EndpointRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2EndpointRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_oauth2EndpointRemoteModel, id);
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

		if (_oauth2EndpointRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2EndpointRemoteModel.getClass();

				Method method = clazz.getMethod("setLiferayUserId", long.class);

				method.invoke(_oauth2EndpointRemoteModel, liferayUserId);
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
	public String getOauthType() {
		return _oauthType;
	}

	@Override
	public void setOauthType(String oauthType) {
		_oauthType = oauthType;

		if (_oauth2EndpointRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2EndpointRemoteModel.getClass();

				Method method = clazz.getMethod("setOauthType", String.class);

				method.invoke(_oauth2EndpointRemoteModel, oauthType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getIsPublic() {
		return _isPublic;
	}

	@Override
	public boolean isIsPublic() {
		return _isPublic;
	}

	@Override
	public void setIsPublic(boolean isPublic) {
		_isPublic = isPublic;

		if (_oauth2EndpointRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2EndpointRemoteModel.getClass();

				Method method = clazz.getMethod("setIsPublic", boolean.class);

				method.invoke(_oauth2EndpointRemoteModel, isPublic);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getGuestAccess() {
		return _guestAccess;
	}

	@Override
	public boolean isGuestAccess() {
		return _guestAccess;
	}

	@Override
	public void setGuestAccess(boolean guestAccess) {
		_guestAccess = guestAccess;

		if (_oauth2EndpointRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2EndpointRemoteModel.getClass();

				Method method = clazz.getMethod("setGuestAccess", boolean.class);

				method.invoke(_oauth2EndpointRemoteModel, guestAccess);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getOauth2EndpointRemoteModel() {
		return _oauth2EndpointRemoteModel;
	}

	public void setOauth2EndpointRemoteModel(
		BaseModel<?> oauth2EndpointRemoteModel) {
		_oauth2EndpointRemoteModel = oauth2EndpointRemoteModel;
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

		Class<?> remoteModelClass = _oauth2EndpointRemoteModel.getClass();

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

		Object returnValue = method.invoke(_oauth2EndpointRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Oauth2EndpointLocalServiceUtil.addOauth2Endpoint(this);
		}
		else {
			Oauth2EndpointLocalServiceUtil.updateOauth2Endpoint(this);
		}
	}

	@Override
	public Oauth2Endpoint toEscapedModel() {
		return (Oauth2Endpoint)ProxyUtil.newProxyInstance(Oauth2Endpoint.class.getClassLoader(),
			new Class[] { Oauth2Endpoint.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		Oauth2EndpointClp clone = new Oauth2EndpointClp();

		clone.setId(getId());
		clone.setLiferayUserId(getLiferayUserId());
		clone.setOauthType(getOauthType());
		clone.setIsPublic(getIsPublic());
		clone.setGuestAccess(getGuestAccess());

		return clone;
	}

	@Override
	public int compareTo(Oauth2Endpoint oauth2Endpoint) {
		long primaryKey = oauth2Endpoint.getPrimaryKey();

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

		if (!(obj instanceof Oauth2EndpointClp)) {
			return false;
		}

		Oauth2EndpointClp oauth2Endpoint = (Oauth2EndpointClp)obj;

		long primaryKey = oauth2Endpoint.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", liferayUserId=");
		sb.append(getLiferayUserId());
		sb.append(", oauthType=");
		sb.append(getOauthType());
		sb.append(", isPublic=");
		sb.append(getIsPublic());
		sb.append(", guestAccess=");
		sb.append(getGuestAccess());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.Oauth2Endpoint");
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
			"<column><column-name>oauthType</column-name><column-value><![CDATA[");
		sb.append(getOauthType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isPublic</column-name><column-value><![CDATA[");
		sb.append(getIsPublic());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>guestAccess</column-name><column-value><![CDATA[");
		sb.append(getGuestAccess());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _liferayUserId;
	private String _liferayUserUuid;
	private String _oauthType;
	private boolean _isPublic;
	private boolean _guestAccess;
	private BaseModel<?> _oauth2EndpointRemoteModel;
}
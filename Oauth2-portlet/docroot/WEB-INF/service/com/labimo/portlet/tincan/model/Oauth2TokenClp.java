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
import com.labimo.portlet.tincan.service.Oauth2TokenLocalServiceUtil;

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
public class Oauth2TokenClp extends BaseModelImpl<Oauth2Token>
	implements Oauth2Token {
	public Oauth2TokenClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Oauth2Token.class;
	}

	@Override
	public String getModelClassName() {
		return Oauth2Token.class.getName();
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
		attributes.put("code", getCode());
		attributes.put("token", getToken());
		attributes.put("refreshToken", getRefreshToken());
		attributes.put("clientId", getClientId());
		attributes.put("expiredIn", getExpiredIn());
		attributes.put("liferayUserId", getLiferayUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String token = (String)attributes.get("token");

		if (token != null) {
			setToken(token);
		}

		String refreshToken = (String)attributes.get("refreshToken");

		if (refreshToken != null) {
			setRefreshToken(refreshToken);
		}

		Long clientId = (Long)attributes.get("clientId");

		if (clientId != null) {
			setClientId(clientId);
		}

		Long expiredIn = (Long)attributes.get("expiredIn");

		if (expiredIn != null) {
			setExpiredIn(expiredIn);
		}

		Long liferayUserId = (Long)attributes.get("liferayUserId");

		if (liferayUserId != null) {
			setLiferayUserId(liferayUserId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_oauth2TokenRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2TokenRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_oauth2TokenRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode() {
		return _code;
	}

	@Override
	public void setCode(String code) {
		_code = code;

		if (_oauth2TokenRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2TokenRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_oauth2TokenRemoteModel, code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getToken() {
		return _token;
	}

	@Override
	public void setToken(String token) {
		_token = token;

		if (_oauth2TokenRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2TokenRemoteModel.getClass();

				Method method = clazz.getMethod("setToken", String.class);

				method.invoke(_oauth2TokenRemoteModel, token);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRefreshToken() {
		return _refreshToken;
	}

	@Override
	public void setRefreshToken(String refreshToken) {
		_refreshToken = refreshToken;

		if (_oauth2TokenRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2TokenRemoteModel.getClass();

				Method method = clazz.getMethod("setRefreshToken", String.class);

				method.invoke(_oauth2TokenRemoteModel, refreshToken);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getClientId() {
		return _clientId;
	}

	@Override
	public void setClientId(long clientId) {
		_clientId = clientId;

		if (_oauth2TokenRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2TokenRemoteModel.getClass();

				Method method = clazz.getMethod("setClientId", long.class);

				method.invoke(_oauth2TokenRemoteModel, clientId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getExpiredIn() {
		return _expiredIn;
	}

	@Override
	public void setExpiredIn(long expiredIn) {
		_expiredIn = expiredIn;

		if (_oauth2TokenRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2TokenRemoteModel.getClass();

				Method method = clazz.getMethod("setExpiredIn", long.class);

				method.invoke(_oauth2TokenRemoteModel, expiredIn);
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

		if (_oauth2TokenRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2TokenRemoteModel.getClass();

				Method method = clazz.getMethod("setLiferayUserId", long.class);

				method.invoke(_oauth2TokenRemoteModel, liferayUserId);
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

	public BaseModel<?> getOauth2TokenRemoteModel() {
		return _oauth2TokenRemoteModel;
	}

	public void setOauth2TokenRemoteModel(BaseModel<?> oauth2TokenRemoteModel) {
		_oauth2TokenRemoteModel = oauth2TokenRemoteModel;
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

		Class<?> remoteModelClass = _oauth2TokenRemoteModel.getClass();

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

		Object returnValue = method.invoke(_oauth2TokenRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Oauth2TokenLocalServiceUtil.addOauth2Token(this);
		}
		else {
			Oauth2TokenLocalServiceUtil.updateOauth2Token(this);
		}
	}

	@Override
	public Oauth2Token toEscapedModel() {
		return (Oauth2Token)ProxyUtil.newProxyInstance(Oauth2Token.class.getClassLoader(),
			new Class[] { Oauth2Token.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		Oauth2TokenClp clone = new Oauth2TokenClp();

		clone.setId(getId());
		clone.setCode(getCode());
		clone.setToken(getToken());
		clone.setRefreshToken(getRefreshToken());
		clone.setClientId(getClientId());
		clone.setExpiredIn(getExpiredIn());
		clone.setLiferayUserId(getLiferayUserId());

		return clone;
	}

	@Override
	public int compareTo(Oauth2Token oauth2Token) {
		long primaryKey = oauth2Token.getPrimaryKey();

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

		if (!(obj instanceof Oauth2TokenClp)) {
			return false;
		}

		Oauth2TokenClp oauth2Token = (Oauth2TokenClp)obj;

		long primaryKey = oauth2Token.getPrimaryKey();

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
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", token=");
		sb.append(getToken());
		sb.append(", refreshToken=");
		sb.append(getRefreshToken());
		sb.append(", clientId=");
		sb.append(getClientId());
		sb.append(", expiredIn=");
		sb.append(getExpiredIn());
		sb.append(", liferayUserId=");
		sb.append(getLiferayUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.Oauth2Token");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>token</column-name><column-value><![CDATA[");
		sb.append(getToken());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>refreshToken</column-name><column-value><![CDATA[");
		sb.append(getRefreshToken());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clientId</column-name><column-value><![CDATA[");
		sb.append(getClientId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expiredIn</column-name><column-value><![CDATA[");
		sb.append(getExpiredIn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>liferayUserId</column-name><column-value><![CDATA[");
		sb.append(getLiferayUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _code;
	private String _token;
	private String _refreshToken;
	private long _clientId;
	private long _expiredIn;
	private long _liferayUserId;
	private String _liferayUserUuid;
	private BaseModel<?> _oauth2TokenRemoteModel;
}
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
import com.labimo.portlet.tincan.service.Oauth2ClientLocalServiceUtil;

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
public class Oauth2ClientClp extends BaseModelImpl<Oauth2Client>
	implements Oauth2Client {
	public Oauth2ClientClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Oauth2Client.class;
	}

	@Override
	public String getModelClassName() {
		return Oauth2Client.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("secret", getSecret());
		attributes.put("url", getUrl());
		attributes.put("redirectUrl", getRedirectUrl());
		attributes.put("scope", getScope());
		attributes.put("iconUrl", getIconUrl());
		attributes.put("liferayUserId", getLiferayUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String id = (String)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String secret = (String)attributes.get("secret");

		if (secret != null) {
			setSecret(secret);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String redirectUrl = (String)attributes.get("redirectUrl");

		if (redirectUrl != null) {
			setRedirectUrl(redirectUrl);
		}

		String scope = (String)attributes.get("scope");

		if (scope != null) {
			setScope(scope);
		}

		String iconUrl = (String)attributes.get("iconUrl");

		if (iconUrl != null) {
			setIconUrl(iconUrl);
		}

		Long liferayUserId = (Long)attributes.get("liferayUserId");

		if (liferayUserId != null) {
			setLiferayUserId(liferayUserId);
		}
	}

	@Override
	public String getId() {
		return _id;
	}

	@Override
	public void setId(String id) {
		_id = id;

		if (_oauth2ClientRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2ClientRemoteModel.getClass();

				Method method = clazz.getMethod("setId", String.class);

				method.invoke(_oauth2ClientRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_oauth2ClientRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2ClientRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_oauth2ClientRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_oauth2ClientRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2ClientRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_oauth2ClientRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSecret() {
		return _secret;
	}

	@Override
	public void setSecret(String secret) {
		_secret = secret;

		if (_oauth2ClientRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2ClientRemoteModel.getClass();

				Method method = clazz.getMethod("setSecret", String.class);

				method.invoke(_oauth2ClientRemoteModel, secret);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUrl() {
		return _url;
	}

	@Override
	public void setUrl(String url) {
		_url = url;

		if (_oauth2ClientRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2ClientRemoteModel.getClass();

				Method method = clazz.getMethod("setUrl", String.class);

				method.invoke(_oauth2ClientRemoteModel, url);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRedirectUrl() {
		return _redirectUrl;
	}

	@Override
	public void setRedirectUrl(String redirectUrl) {
		_redirectUrl = redirectUrl;

		if (_oauth2ClientRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2ClientRemoteModel.getClass();

				Method method = clazz.getMethod("setRedirectUrl", String.class);

				method.invoke(_oauth2ClientRemoteModel, redirectUrl);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getScope() {
		return _scope;
	}

	@Override
	public void setScope(String scope) {
		_scope = scope;

		if (_oauth2ClientRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2ClientRemoteModel.getClass();

				Method method = clazz.getMethod("setScope", String.class);

				method.invoke(_oauth2ClientRemoteModel, scope);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIconUrl() {
		return _iconUrl;
	}

	@Override
	public void setIconUrl(String iconUrl) {
		_iconUrl = iconUrl;

		if (_oauth2ClientRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2ClientRemoteModel.getClass();

				Method method = clazz.getMethod("setIconUrl", String.class);

				method.invoke(_oauth2ClientRemoteModel, iconUrl);
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

		if (_oauth2ClientRemoteModel != null) {
			try {
				Class<?> clazz = _oauth2ClientRemoteModel.getClass();

				Method method = clazz.getMethod("setLiferayUserId", long.class);

				method.invoke(_oauth2ClientRemoteModel, liferayUserId);
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

	public BaseModel<?> getOauth2ClientRemoteModel() {
		return _oauth2ClientRemoteModel;
	}

	public void setOauth2ClientRemoteModel(BaseModel<?> oauth2ClientRemoteModel) {
		_oauth2ClientRemoteModel = oauth2ClientRemoteModel;
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

		Class<?> remoteModelClass = _oauth2ClientRemoteModel.getClass();

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

		Object returnValue = method.invoke(_oauth2ClientRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Oauth2ClientLocalServiceUtil.addOauth2Client(this);
		}
		else {
			Oauth2ClientLocalServiceUtil.updateOauth2Client(this);
		}
	}

	@Override
	public Oauth2Client toEscapedModel() {
		return (Oauth2Client)ProxyUtil.newProxyInstance(Oauth2Client.class.getClassLoader(),
			new Class[] { Oauth2Client.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		Oauth2ClientClp clone = new Oauth2ClientClp();

		clone.setId(getId());
		clone.setName(getName());
		clone.setDescription(getDescription());
		clone.setSecret(getSecret());
		clone.setUrl(getUrl());
		clone.setRedirectUrl(getRedirectUrl());
		clone.setScope(getScope());
		clone.setIconUrl(getIconUrl());
		clone.setLiferayUserId(getLiferayUserId());

		return clone;
	}

	@Override
	public int compareTo(Oauth2Client oauth2Client) {
		String primaryKey = oauth2Client.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Oauth2ClientClp)) {
			return false;
		}

		Oauth2ClientClp oauth2Client = (Oauth2ClientClp)obj;

		String primaryKey = oauth2Client.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", secret=");
		sb.append(getSecret());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", redirectUrl=");
		sb.append(getRedirectUrl());
		sb.append(", scope=");
		sb.append(getScope());
		sb.append(", iconUrl=");
		sb.append(getIconUrl());
		sb.append(", liferayUserId=");
		sb.append(getLiferayUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.Oauth2Client");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>secret</column-name><column-value><![CDATA[");
		sb.append(getSecret());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>redirectUrl</column-name><column-value><![CDATA[");
		sb.append(getRedirectUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scope</column-name><column-value><![CDATA[");
		sb.append(getScope());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>iconUrl</column-name><column-value><![CDATA[");
		sb.append(getIconUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>liferayUserId</column-name><column-value><![CDATA[");
		sb.append(getLiferayUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _id;
	private String _name;
	private String _description;
	private String _secret;
	private String _url;
	private String _redirectUrl;
	private String _scope;
	private String _iconUrl;
	private long _liferayUserId;
	private String _liferayUserUuid;
	private BaseModel<?> _oauth2ClientRemoteModel;
}
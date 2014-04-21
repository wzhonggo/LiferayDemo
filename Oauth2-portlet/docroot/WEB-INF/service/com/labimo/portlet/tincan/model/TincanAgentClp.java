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
import com.labimo.portlet.tincan.service.TincanAgentLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wzgong
 */
public class TincanAgentClp extends BaseModelImpl<TincanAgent>
	implements TincanAgent {
	public TincanAgentClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TincanAgent.class;
	}

	@Override
	public String getModelClassName() {
		return TincanAgent.class.getName();
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
		attributes.put("objectType", getObjectType());
		attributes.put("name", getName());
		attributes.put("mbox", getMbox());
		attributes.put("mbox_sha1sum", getMbox_sha1sum());
		attributes.put("openID", getOpenID());
		attributes.put("oauth_identifier", getOauth_identifier());
		attributes.put("canonical_version", getCanonical_version());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String objectType = (String)attributes.get("objectType");

		if (objectType != null) {
			setObjectType(objectType);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String mbox = (String)attributes.get("mbox");

		if (mbox != null) {
			setMbox(mbox);
		}

		String mbox_sha1sum = (String)attributes.get("mbox_sha1sum");

		if (mbox_sha1sum != null) {
			setMbox_sha1sum(mbox_sha1sum);
		}

		String openID = (String)attributes.get("openID");

		if (openID != null) {
			setOpenID(openID);
		}

		String oauth_identifier = (String)attributes.get("oauth_identifier");

		if (oauth_identifier != null) {
			setOauth_identifier(oauth_identifier);
		}

		Boolean canonical_version = (Boolean)attributes.get("canonical_version");

		if (canonical_version != null) {
			setCanonical_version(canonical_version);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tincanAgentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tincanAgentRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getObjectType() {
		return _objectType;
	}

	@Override
	public void setObjectType(String objectType) {
		_objectType = objectType;

		if (_tincanAgentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentRemoteModel.getClass();

				Method method = clazz.getMethod("setObjectType", String.class);

				method.invoke(_tincanAgentRemoteModel, objectType);
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

		if (_tincanAgentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_tincanAgentRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMbox() {
		return _mbox;
	}

	@Override
	public void setMbox(String mbox) {
		_mbox = mbox;

		if (_tincanAgentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentRemoteModel.getClass();

				Method method = clazz.getMethod("setMbox", String.class);

				method.invoke(_tincanAgentRemoteModel, mbox);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMbox_sha1sum() {
		return _mbox_sha1sum;
	}

	@Override
	public void setMbox_sha1sum(String mbox_sha1sum) {
		_mbox_sha1sum = mbox_sha1sum;

		if (_tincanAgentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentRemoteModel.getClass();

				Method method = clazz.getMethod("setMbox_sha1sum", String.class);

				method.invoke(_tincanAgentRemoteModel, mbox_sha1sum);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOpenID() {
		return _openID;
	}

	@Override
	public void setOpenID(String openID) {
		_openID = openID;

		if (_tincanAgentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentRemoteModel.getClass();

				Method method = clazz.getMethod("setOpenID", String.class);

				method.invoke(_tincanAgentRemoteModel, openID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOauth_identifier() {
		return _oauth_identifier;
	}

	@Override
	public void setOauth_identifier(String oauth_identifier) {
		_oauth_identifier = oauth_identifier;

		if (_tincanAgentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentRemoteModel.getClass();

				Method method = clazz.getMethod("setOauth_identifier",
						String.class);

				method.invoke(_tincanAgentRemoteModel, oauth_identifier);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getCanonical_version() {
		return _canonical_version;
	}

	@Override
	public boolean isCanonical_version() {
		return _canonical_version;
	}

	@Override
	public void setCanonical_version(boolean canonical_version) {
		_canonical_version = canonical_version;

		if (_tincanAgentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentRemoteModel.getClass();

				Method method = clazz.getMethod("setCanonical_version",
						boolean.class);

				method.invoke(_tincanAgentRemoteModel, canonical_version);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTincanAgentRemoteModel() {
		return _tincanAgentRemoteModel;
	}

	public void setTincanAgentRemoteModel(BaseModel<?> tincanAgentRemoteModel) {
		_tincanAgentRemoteModel = tincanAgentRemoteModel;
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

		Class<?> remoteModelClass = _tincanAgentRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tincanAgentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TincanAgentLocalServiceUtil.addTincanAgent(this);
		}
		else {
			TincanAgentLocalServiceUtil.updateTincanAgent(this);
		}
	}

	@Override
	public TincanAgent toEscapedModel() {
		return (TincanAgent)ProxyUtil.newProxyInstance(TincanAgent.class.getClassLoader(),
			new Class[] { TincanAgent.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TincanAgentClp clone = new TincanAgentClp();

		clone.setId(getId());
		clone.setObjectType(getObjectType());
		clone.setName(getName());
		clone.setMbox(getMbox());
		clone.setMbox_sha1sum(getMbox_sha1sum());
		clone.setOpenID(getOpenID());
		clone.setOauth_identifier(getOauth_identifier());
		clone.setCanonical_version(getCanonical_version());

		return clone;
	}

	@Override
	public int compareTo(TincanAgent tincanAgent) {
		long primaryKey = tincanAgent.getPrimaryKey();

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

		if (!(obj instanceof TincanAgentClp)) {
			return false;
		}

		TincanAgentClp tincanAgent = (TincanAgentClp)obj;

		long primaryKey = tincanAgent.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", objectType=");
		sb.append(getObjectType());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", mbox=");
		sb.append(getMbox());
		sb.append(", mbox_sha1sum=");
		sb.append(getMbox_sha1sum());
		sb.append(", openID=");
		sb.append(getOpenID());
		sb.append(", oauth_identifier=");
		sb.append(getOauth_identifier());
		sb.append(", canonical_version=");
		sb.append(getCanonical_version());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.TincanAgent");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>objectType</column-name><column-value><![CDATA[");
		sb.append(getObjectType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mbox</column-name><column-value><![CDATA[");
		sb.append(getMbox());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mbox_sha1sum</column-name><column-value><![CDATA[");
		sb.append(getMbox_sha1sum());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>openID</column-name><column-value><![CDATA[");
		sb.append(getOpenID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oauth_identifier</column-name><column-value><![CDATA[");
		sb.append(getOauth_identifier());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>canonical_version</column-name><column-value><![CDATA[");
		sb.append(getCanonical_version());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _objectType;
	private String _name;
	private String _mbox;
	private String _mbox_sha1sum;
	private String _openID;
	private String _oauth_identifier;
	private boolean _canonical_version;
	private BaseModel<?> _tincanAgentRemoteModel;
}
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
import com.labimo.portlet.tincan.service.TincanAgentProfileLocalServiceUtil;

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
public class TincanAgentProfileClp extends BaseModelImpl<TincanAgentProfile>
	implements TincanAgentProfile {
	public TincanAgentProfileClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TincanAgentProfile.class;
	}

	@Override
	public String getModelClassName() {
		return TincanAgentProfile.class.getName();
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
		attributes.put("profileId", getProfileId());
		attributes.put("updated", getUpdated());
		attributes.put("agentId", getAgentId());
		attributes.put("profile", getProfile());
		attributes.put("json_profile", getJson_profile());
		attributes.put("content_type", getContent_type());
		attributes.put("etag", getEtag());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String profileId = (String)attributes.get("profileId");

		if (profileId != null) {
			setProfileId(profileId);
		}

		Date updated = (Date)attributes.get("updated");

		if (updated != null) {
			setUpdated(updated);
		}

		Long agentId = (Long)attributes.get("agentId");

		if (agentId != null) {
			setAgentId(agentId);
		}

		String profile = (String)attributes.get("profile");

		if (profile != null) {
			setProfile(profile);
		}

		String json_profile = (String)attributes.get("json_profile");

		if (json_profile != null) {
			setJson_profile(json_profile);
		}

		String content_type = (String)attributes.get("content_type");

		if (content_type != null) {
			setContent_type(content_type);
		}

		String etag = (String)attributes.get("etag");

		if (etag != null) {
			setEtag(etag);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tincanAgentProfileRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentProfileRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tincanAgentProfileRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProfileId() {
		return _profileId;
	}

	@Override
	public void setProfileId(String profileId) {
		_profileId = profileId;

		if (_tincanAgentProfileRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentProfileRemoteModel.getClass();

				Method method = clazz.getMethod("setProfileId", String.class);

				method.invoke(_tincanAgentProfileRemoteModel, profileId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUpdated() {
		return _updated;
	}

	@Override
	public void setUpdated(Date updated) {
		_updated = updated;

		if (_tincanAgentProfileRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentProfileRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdated", Date.class);

				method.invoke(_tincanAgentProfileRemoteModel, updated);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAgentId() {
		return _agentId;
	}

	@Override
	public void setAgentId(long agentId) {
		_agentId = agentId;

		if (_tincanAgentProfileRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentProfileRemoteModel.getClass();

				Method method = clazz.getMethod("setAgentId", long.class);

				method.invoke(_tincanAgentProfileRemoteModel, agentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProfile() {
		return _profile;
	}

	@Override
	public void setProfile(String profile) {
		_profile = profile;

		if (_tincanAgentProfileRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentProfileRemoteModel.getClass();

				Method method = clazz.getMethod("setProfile", String.class);

				method.invoke(_tincanAgentProfileRemoteModel, profile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getJson_profile() {
		return _json_profile;
	}

	@Override
	public void setJson_profile(String json_profile) {
		_json_profile = json_profile;

		if (_tincanAgentProfileRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentProfileRemoteModel.getClass();

				Method method = clazz.getMethod("setJson_profile", String.class);

				method.invoke(_tincanAgentProfileRemoteModel, json_profile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContent_type() {
		return _content_type;
	}

	@Override
	public void setContent_type(String content_type) {
		_content_type = content_type;

		if (_tincanAgentProfileRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentProfileRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_type", String.class);

				method.invoke(_tincanAgentProfileRemoteModel, content_type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEtag() {
		return _etag;
	}

	@Override
	public void setEtag(String etag) {
		_etag = etag;

		if (_tincanAgentProfileRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAgentProfileRemoteModel.getClass();

				Method method = clazz.getMethod("setEtag", String.class);

				method.invoke(_tincanAgentProfileRemoteModel, etag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTincanAgentProfileRemoteModel() {
		return _tincanAgentProfileRemoteModel;
	}

	public void setTincanAgentProfileRemoteModel(
		BaseModel<?> tincanAgentProfileRemoteModel) {
		_tincanAgentProfileRemoteModel = tincanAgentProfileRemoteModel;
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

		Class<?> remoteModelClass = _tincanAgentProfileRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tincanAgentProfileRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TincanAgentProfileLocalServiceUtil.addTincanAgentProfile(this);
		}
		else {
			TincanAgentProfileLocalServiceUtil.updateTincanAgentProfile(this);
		}
	}

	@Override
	public TincanAgentProfile toEscapedModel() {
		return (TincanAgentProfile)ProxyUtil.newProxyInstance(TincanAgentProfile.class.getClassLoader(),
			new Class[] { TincanAgentProfile.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TincanAgentProfileClp clone = new TincanAgentProfileClp();

		clone.setId(getId());
		clone.setProfileId(getProfileId());
		clone.setUpdated(getUpdated());
		clone.setAgentId(getAgentId());
		clone.setProfile(getProfile());
		clone.setJson_profile(getJson_profile());
		clone.setContent_type(getContent_type());
		clone.setEtag(getEtag());

		return clone;
	}

	@Override
	public int compareTo(TincanAgentProfile tincanAgentProfile) {
		long primaryKey = tincanAgentProfile.getPrimaryKey();

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

		if (!(obj instanceof TincanAgentProfileClp)) {
			return false;
		}

		TincanAgentProfileClp tincanAgentProfile = (TincanAgentProfileClp)obj;

		long primaryKey = tincanAgentProfile.getPrimaryKey();

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
		sb.append(", profileId=");
		sb.append(getProfileId());
		sb.append(", updated=");
		sb.append(getUpdated());
		sb.append(", agentId=");
		sb.append(getAgentId());
		sb.append(", profile=");
		sb.append(getProfile());
		sb.append(", json_profile=");
		sb.append(getJson_profile());
		sb.append(", content_type=");
		sb.append(getContent_type());
		sb.append(", etag=");
		sb.append(getEtag());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.TincanAgentProfile");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>profileId</column-name><column-value><![CDATA[");
		sb.append(getProfileId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updated</column-name><column-value><![CDATA[");
		sb.append(getUpdated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>agentId</column-name><column-value><![CDATA[");
		sb.append(getAgentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>profile</column-name><column-value><![CDATA[");
		sb.append(getProfile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>json_profile</column-name><column-value><![CDATA[");
		sb.append(getJson_profile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content_type</column-name><column-value><![CDATA[");
		sb.append(getContent_type());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>etag</column-name><column-value><![CDATA[");
		sb.append(getEtag());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _profileId;
	private Date _updated;
	private long _agentId;
	private String _profile;
	private String _json_profile;
	private String _content_type;
	private String _etag;
	private BaseModel<?> _tincanAgentProfileRemoteModel;
}
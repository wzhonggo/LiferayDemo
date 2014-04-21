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
import com.labimo.portlet.tincan.service.TincanActivityStateLocalServiceUtil;

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
public class TincanActivityStateClp extends BaseModelImpl<TincanActivityState>
	implements TincanActivityState {
	public TincanActivityStateClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TincanActivityState.class;
	}

	@Override
	public String getModelClassName() {
		return TincanActivityState.class.getName();
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
		attributes.put("stateId", getStateId());
		attributes.put("state", getState());
		attributes.put("jsonState", getJsonState());
		attributes.put("agentId", getAgentId());
		attributes.put("activityId", getActivityId());
		attributes.put("registration", getRegistration());
		attributes.put("etag", getEtag());
		attributes.put("updated", getUpdated());
		attributes.put("contentType", getContentType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String stateId = (String)attributes.get("stateId");

		if (stateId != null) {
			setStateId(stateId);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String jsonState = (String)attributes.get("jsonState");

		if (jsonState != null) {
			setJsonState(jsonState);
		}

		Long agentId = (Long)attributes.get("agentId");

		if (agentId != null) {
			setAgentId(agentId);
		}

		Long activityId = (Long)attributes.get("activityId");

		if (activityId != null) {
			setActivityId(activityId);
		}

		String registration = (String)attributes.get("registration");

		if (registration != null) {
			setRegistration(registration);
		}

		String etag = (String)attributes.get("etag");

		if (etag != null) {
			setEtag(etag);
		}

		Date updated = (Date)attributes.get("updated");

		if (updated != null) {
			setUpdated(updated);
		}

		String contentType = (String)attributes.get("contentType");

		if (contentType != null) {
			setContentType(contentType);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tincanActivityStateRemoteModel != null) {
			try {
				Class<?> clazz = _tincanActivityStateRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tincanActivityStateRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStateId() {
		return _stateId;
	}

	@Override
	public void setStateId(String stateId) {
		_stateId = stateId;

		if (_tincanActivityStateRemoteModel != null) {
			try {
				Class<?> clazz = _tincanActivityStateRemoteModel.getClass();

				Method method = clazz.getMethod("setStateId", String.class);

				method.invoke(_tincanActivityStateRemoteModel, stateId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getState() {
		return _state;
	}

	@Override
	public void setState(String state) {
		_state = state;

		if (_tincanActivityStateRemoteModel != null) {
			try {
				Class<?> clazz = _tincanActivityStateRemoteModel.getClass();

				Method method = clazz.getMethod("setState", String.class);

				method.invoke(_tincanActivityStateRemoteModel, state);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getJsonState() {
		return _jsonState;
	}

	@Override
	public void setJsonState(String jsonState) {
		_jsonState = jsonState;

		if (_tincanActivityStateRemoteModel != null) {
			try {
				Class<?> clazz = _tincanActivityStateRemoteModel.getClass();

				Method method = clazz.getMethod("setJsonState", String.class);

				method.invoke(_tincanActivityStateRemoteModel, jsonState);
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

		if (_tincanActivityStateRemoteModel != null) {
			try {
				Class<?> clazz = _tincanActivityStateRemoteModel.getClass();

				Method method = clazz.getMethod("setAgentId", long.class);

				method.invoke(_tincanActivityStateRemoteModel, agentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getActivityId() {
		return _activityId;
	}

	@Override
	public void setActivityId(long activityId) {
		_activityId = activityId;

		if (_tincanActivityStateRemoteModel != null) {
			try {
				Class<?> clazz = _tincanActivityStateRemoteModel.getClass();

				Method method = clazz.getMethod("setActivityId", long.class);

				method.invoke(_tincanActivityStateRemoteModel, activityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegistration() {
		return _registration;
	}

	@Override
	public void setRegistration(String registration) {
		_registration = registration;

		if (_tincanActivityStateRemoteModel != null) {
			try {
				Class<?> clazz = _tincanActivityStateRemoteModel.getClass();

				Method method = clazz.getMethod("setRegistration", String.class);

				method.invoke(_tincanActivityStateRemoteModel, registration);
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

		if (_tincanActivityStateRemoteModel != null) {
			try {
				Class<?> clazz = _tincanActivityStateRemoteModel.getClass();

				Method method = clazz.getMethod("setEtag", String.class);

				method.invoke(_tincanActivityStateRemoteModel, etag);
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

		if (_tincanActivityStateRemoteModel != null) {
			try {
				Class<?> clazz = _tincanActivityStateRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdated", Date.class);

				method.invoke(_tincanActivityStateRemoteModel, updated);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContentType() {
		return _contentType;
	}

	@Override
	public void setContentType(String contentType) {
		_contentType = contentType;

		if (_tincanActivityStateRemoteModel != null) {
			try {
				Class<?> clazz = _tincanActivityStateRemoteModel.getClass();

				Method method = clazz.getMethod("setContentType", String.class);

				method.invoke(_tincanActivityStateRemoteModel, contentType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTincanActivityStateRemoteModel() {
		return _tincanActivityStateRemoteModel;
	}

	public void setTincanActivityStateRemoteModel(
		BaseModel<?> tincanActivityStateRemoteModel) {
		_tincanActivityStateRemoteModel = tincanActivityStateRemoteModel;
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

		Class<?> remoteModelClass = _tincanActivityStateRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tincanActivityStateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TincanActivityStateLocalServiceUtil.addTincanActivityState(this);
		}
		else {
			TincanActivityStateLocalServiceUtil.updateTincanActivityState(this);
		}
	}

	@Override
	public TincanActivityState toEscapedModel() {
		return (TincanActivityState)ProxyUtil.newProxyInstance(TincanActivityState.class.getClassLoader(),
			new Class[] { TincanActivityState.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TincanActivityStateClp clone = new TincanActivityStateClp();

		clone.setId(getId());
		clone.setStateId(getStateId());
		clone.setState(getState());
		clone.setJsonState(getJsonState());
		clone.setAgentId(getAgentId());
		clone.setActivityId(getActivityId());
		clone.setRegistration(getRegistration());
		clone.setEtag(getEtag());
		clone.setUpdated(getUpdated());
		clone.setContentType(getContentType());

		return clone;
	}

	@Override
	public int compareTo(TincanActivityState tincanActivityState) {
		long primaryKey = tincanActivityState.getPrimaryKey();

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

		if (!(obj instanceof TincanActivityStateClp)) {
			return false;
		}

		TincanActivityStateClp tincanActivityState = (TincanActivityStateClp)obj;

		long primaryKey = tincanActivityState.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", stateId=");
		sb.append(getStateId());
		sb.append(", state=");
		sb.append(getState());
		sb.append(", jsonState=");
		sb.append(getJsonState());
		sb.append(", agentId=");
		sb.append(getAgentId());
		sb.append(", activityId=");
		sb.append(getActivityId());
		sb.append(", registration=");
		sb.append(getRegistration());
		sb.append(", etag=");
		sb.append(getEtag());
		sb.append(", updated=");
		sb.append(getUpdated());
		sb.append(", contentType=");
		sb.append(getContentType());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.TincanActivityState");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateId</column-name><column-value><![CDATA[");
		sb.append(getStateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsonState</column-name><column-value><![CDATA[");
		sb.append(getJsonState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>agentId</column-name><column-value><![CDATA[");
		sb.append(getAgentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>activityId</column-name><column-value><![CDATA[");
		sb.append(getActivityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registration</column-name><column-value><![CDATA[");
		sb.append(getRegistration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>etag</column-name><column-value><![CDATA[");
		sb.append(getEtag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updated</column-name><column-value><![CDATA[");
		sb.append(getUpdated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contentType</column-name><column-value><![CDATA[");
		sb.append(getContentType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _stateId;
	private String _state;
	private String _jsonState;
	private long _agentId;
	private long _activityId;
	private String _registration;
	private String _etag;
	private Date _updated;
	private String _contentType;
	private BaseModel<?> _tincanActivityStateRemoteModel;
}
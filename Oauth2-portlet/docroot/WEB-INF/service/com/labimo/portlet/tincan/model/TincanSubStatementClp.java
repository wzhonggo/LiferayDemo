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
import com.labimo.portlet.tincan.service.TincanSubStatementLocalServiceUtil;

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
public class TincanSubStatementClp extends BaseModelImpl<TincanSubStatement>
	implements TincanSubStatement {
	public TincanSubStatementClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TincanSubStatement.class;
	}

	@Override
	public String getModelClassName() {
		return TincanSubStatement.class.getName();
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
		attributes.put("agentId", getAgentId());
		attributes.put("activityId", getActivityId());
		attributes.put("resultId", getResultId());
		attributes.put("contextId", getContextId());
		attributes.put("verbId", getVerbId());
		attributes.put("timestamp", getTimestamp());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long agentId = (Long)attributes.get("agentId");

		if (agentId != null) {
			setAgentId(agentId);
		}

		Long activityId = (Long)attributes.get("activityId");

		if (activityId != null) {
			setActivityId(activityId);
		}

		Long resultId = (Long)attributes.get("resultId");

		if (resultId != null) {
			setResultId(resultId);
		}

		Long contextId = (Long)attributes.get("contextId");

		if (contextId != null) {
			setContextId(contextId);
		}

		Long verbId = (Long)attributes.get("verbId");

		if (verbId != null) {
			setVerbId(verbId);
		}

		Date timestamp = (Date)attributes.get("timestamp");

		if (timestamp != null) {
			setTimestamp(timestamp);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tincanSubStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanSubStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tincanSubStatementRemoteModel, id);
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

		if (_tincanSubStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanSubStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setAgentId", long.class);

				method.invoke(_tincanSubStatementRemoteModel, agentId);
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

		if (_tincanSubStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanSubStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setActivityId", long.class);

				method.invoke(_tincanSubStatementRemoteModel, activityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getResultId() {
		return _resultId;
	}

	@Override
	public void setResultId(long resultId) {
		_resultId = resultId;

		if (_tincanSubStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanSubStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setResultId", long.class);

				method.invoke(_tincanSubStatementRemoteModel, resultId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getContextId() {
		return _contextId;
	}

	@Override
	public void setContextId(long contextId) {
		_contextId = contextId;

		if (_tincanSubStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanSubStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setContextId", long.class);

				method.invoke(_tincanSubStatementRemoteModel, contextId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVerbId() {
		return _verbId;
	}

	@Override
	public void setVerbId(long verbId) {
		_verbId = verbId;

		if (_tincanSubStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanSubStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setVerbId", long.class);

				method.invoke(_tincanSubStatementRemoteModel, verbId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTimestamp() {
		return _timestamp;
	}

	@Override
	public void setTimestamp(Date timestamp) {
		_timestamp = timestamp;

		if (_tincanSubStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanSubStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setTimestamp", Date.class);

				method.invoke(_tincanSubStatementRemoteModel, timestamp);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTincanSubStatementRemoteModel() {
		return _tincanSubStatementRemoteModel;
	}

	public void setTincanSubStatementRemoteModel(
		BaseModel<?> tincanSubStatementRemoteModel) {
		_tincanSubStatementRemoteModel = tincanSubStatementRemoteModel;
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

		Class<?> remoteModelClass = _tincanSubStatementRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tincanSubStatementRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TincanSubStatementLocalServiceUtil.addTincanSubStatement(this);
		}
		else {
			TincanSubStatementLocalServiceUtil.updateTincanSubStatement(this);
		}
	}

	@Override
	public TincanSubStatement toEscapedModel() {
		return (TincanSubStatement)ProxyUtil.newProxyInstance(TincanSubStatement.class.getClassLoader(),
			new Class[] { TincanSubStatement.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TincanSubStatementClp clone = new TincanSubStatementClp();

		clone.setId(getId());
		clone.setAgentId(getAgentId());
		clone.setActivityId(getActivityId());
		clone.setResultId(getResultId());
		clone.setContextId(getContextId());
		clone.setVerbId(getVerbId());
		clone.setTimestamp(getTimestamp());

		return clone;
	}

	@Override
	public int compareTo(TincanSubStatement tincanSubStatement) {
		long primaryKey = tincanSubStatement.getPrimaryKey();

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

		if (!(obj instanceof TincanSubStatementClp)) {
			return false;
		}

		TincanSubStatementClp tincanSubStatement = (TincanSubStatementClp)obj;

		long primaryKey = tincanSubStatement.getPrimaryKey();

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
		sb.append(", agentId=");
		sb.append(getAgentId());
		sb.append(", activityId=");
		sb.append(getActivityId());
		sb.append(", resultId=");
		sb.append(getResultId());
		sb.append(", contextId=");
		sb.append(getContextId());
		sb.append(", verbId=");
		sb.append(getVerbId());
		sb.append(", timestamp=");
		sb.append(getTimestamp());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.TincanSubStatement");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>resultId</column-name><column-value><![CDATA[");
		sb.append(getResultId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contextId</column-name><column-value><![CDATA[");
		sb.append(getContextId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>verbId</column-name><column-value><![CDATA[");
		sb.append(getVerbId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timestamp</column-name><column-value><![CDATA[");
		sb.append(getTimestamp());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _agentId;
	private long _activityId;
	private long _resultId;
	private long _contextId;
	private long _verbId;
	private Date _timestamp;
	private BaseModel<?> _tincanSubStatementRemoteModel;
}
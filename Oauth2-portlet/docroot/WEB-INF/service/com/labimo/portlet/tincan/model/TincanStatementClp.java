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
import com.labimo.portlet.tincan.service.TincanStatementLocalServiceUtil;

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
public class TincanStatementClp extends BaseModelImpl<TincanStatement>
	implements TincanStatement {
	public TincanStatementClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TincanStatement.class;
	}

	@Override
	public String getModelClassName() {
		return TincanStatement.class.getName();
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
		attributes.put("statementId", getStatementId());
		attributes.put("subStatementId", getSubStatementId());
		attributes.put("agentId", getAgentId());
		attributes.put("contextId", getContextId());
		attributes.put("activityId", getActivityId());
		attributes.put("resultId", getResultId());
		attributes.put("authorityId", getAuthorityId());
		attributes.put("timestamp", getTimestamp());
		attributes.put("stored", getStored());
		attributes.put("version", getVersion());
		attributes.put("verbId", getVerbId());
		attributes.put("voided", getVoided());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String statementId = (String)attributes.get("statementId");

		if (statementId != null) {
			setStatementId(statementId);
		}

		Long subStatementId = (Long)attributes.get("subStatementId");

		if (subStatementId != null) {
			setSubStatementId(subStatementId);
		}

		Long agentId = (Long)attributes.get("agentId");

		if (agentId != null) {
			setAgentId(agentId);
		}

		Long contextId = (Long)attributes.get("contextId");

		if (contextId != null) {
			setContextId(contextId);
		}

		Long activityId = (Long)attributes.get("activityId");

		if (activityId != null) {
			setActivityId(activityId);
		}

		Long resultId = (Long)attributes.get("resultId");

		if (resultId != null) {
			setResultId(resultId);
		}

		Long authorityId = (Long)attributes.get("authorityId");

		if (authorityId != null) {
			setAuthorityId(authorityId);
		}

		Date timestamp = (Date)attributes.get("timestamp");

		if (timestamp != null) {
			setTimestamp(timestamp);
		}

		Date stored = (Date)attributes.get("stored");

		if (stored != null) {
			setStored(stored);
		}

		String version = (String)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		Long verbId = (Long)attributes.get("verbId");

		if (verbId != null) {
			setVerbId(verbId);
		}

		Boolean voided = (Boolean)attributes.get("voided");

		if (voided != null) {
			setVoided(voided);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tincanStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tincanStatementRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatementId() {
		return _statementId;
	}

	@Override
	public void setStatementId(String statementId) {
		_statementId = statementId;

		if (_tincanStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setStatementId", String.class);

				method.invoke(_tincanStatementRemoteModel, statementId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSubStatementId() {
		return _subStatementId;
	}

	@Override
	public void setSubStatementId(long subStatementId) {
		_subStatementId = subStatementId;

		if (_tincanStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setSubStatementId", long.class);

				method.invoke(_tincanStatementRemoteModel, subStatementId);
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

		if (_tincanStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setAgentId", long.class);

				method.invoke(_tincanStatementRemoteModel, agentId);
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

		if (_tincanStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setContextId", long.class);

				method.invoke(_tincanStatementRemoteModel, contextId);
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

		if (_tincanStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setActivityId", long.class);

				method.invoke(_tincanStatementRemoteModel, activityId);
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

		if (_tincanStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setResultId", long.class);

				method.invoke(_tincanStatementRemoteModel, resultId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAuthorityId() {
		return _authorityId;
	}

	@Override
	public void setAuthorityId(long authorityId) {
		_authorityId = authorityId;

		if (_tincanStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setAuthorityId", long.class);

				method.invoke(_tincanStatementRemoteModel, authorityId);
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

		if (_tincanStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setTimestamp", Date.class);

				method.invoke(_tincanStatementRemoteModel, timestamp);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStored() {
		return _stored;
	}

	@Override
	public void setStored(Date stored) {
		_stored = stored;

		if (_tincanStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setStored", Date.class);

				method.invoke(_tincanStatementRemoteModel, stored);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVersion() {
		return _version;
	}

	@Override
	public void setVersion(String version) {
		_version = version;

		if (_tincanStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setVersion", String.class);

				method.invoke(_tincanStatementRemoteModel, version);
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

		if (_tincanStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setVerbId", long.class);

				method.invoke(_tincanStatementRemoteModel, verbId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getVoided() {
		return _voided;
	}

	@Override
	public boolean isVoided() {
		return _voided;
	}

	@Override
	public void setVoided(boolean voided) {
		_voided = voided;

		if (_tincanStatementRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementRemoteModel.getClass();

				Method method = clazz.getMethod("setVoided", boolean.class);

				method.invoke(_tincanStatementRemoteModel, voided);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTincanStatementRemoteModel() {
		return _tincanStatementRemoteModel;
	}

	public void setTincanStatementRemoteModel(
		BaseModel<?> tincanStatementRemoteModel) {
		_tincanStatementRemoteModel = tincanStatementRemoteModel;
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

		Class<?> remoteModelClass = _tincanStatementRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tincanStatementRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TincanStatementLocalServiceUtil.addTincanStatement(this);
		}
		else {
			TincanStatementLocalServiceUtil.updateTincanStatement(this);
		}
	}

	@Override
	public TincanStatement toEscapedModel() {
		return (TincanStatement)ProxyUtil.newProxyInstance(TincanStatement.class.getClassLoader(),
			new Class[] { TincanStatement.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TincanStatementClp clone = new TincanStatementClp();

		clone.setId(getId());
		clone.setStatementId(getStatementId());
		clone.setSubStatementId(getSubStatementId());
		clone.setAgentId(getAgentId());
		clone.setContextId(getContextId());
		clone.setActivityId(getActivityId());
		clone.setResultId(getResultId());
		clone.setAuthorityId(getAuthorityId());
		clone.setTimestamp(getTimestamp());
		clone.setStored(getStored());
		clone.setVersion(getVersion());
		clone.setVerbId(getVerbId());
		clone.setVoided(getVoided());

		return clone;
	}

	@Override
	public int compareTo(TincanStatement tincanStatement) {
		long primaryKey = tincanStatement.getPrimaryKey();

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

		if (!(obj instanceof TincanStatementClp)) {
			return false;
		}

		TincanStatementClp tincanStatement = (TincanStatementClp)obj;

		long primaryKey = tincanStatement.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", statementId=");
		sb.append(getStatementId());
		sb.append(", subStatementId=");
		sb.append(getSubStatementId());
		sb.append(", agentId=");
		sb.append(getAgentId());
		sb.append(", contextId=");
		sb.append(getContextId());
		sb.append(", activityId=");
		sb.append(getActivityId());
		sb.append(", resultId=");
		sb.append(getResultId());
		sb.append(", authorityId=");
		sb.append(getAuthorityId());
		sb.append(", timestamp=");
		sb.append(getTimestamp());
		sb.append(", stored=");
		sb.append(getStored());
		sb.append(", version=");
		sb.append(getVersion());
		sb.append(", verbId=");
		sb.append(getVerbId());
		sb.append(", voided=");
		sb.append(getVoided());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.TincanStatement");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statementId</column-name><column-value><![CDATA[");
		sb.append(getStatementId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subStatementId</column-name><column-value><![CDATA[");
		sb.append(getSubStatementId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>agentId</column-name><column-value><![CDATA[");
		sb.append(getAgentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contextId</column-name><column-value><![CDATA[");
		sb.append(getContextId());
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
			"<column><column-name>authorityId</column-name><column-value><![CDATA[");
		sb.append(getAuthorityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timestamp</column-name><column-value><![CDATA[");
		sb.append(getTimestamp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stored</column-name><column-value><![CDATA[");
		sb.append(getStored());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>verbId</column-name><column-value><![CDATA[");
		sb.append(getVerbId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>voided</column-name><column-value><![CDATA[");
		sb.append(getVoided());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _statementId;
	private long _subStatementId;
	private long _agentId;
	private long _contextId;
	private long _activityId;
	private long _resultId;
	private long _authorityId;
	private Date _timestamp;
	private Date _stored;
	private String _version;
	private long _verbId;
	private boolean _voided;
	private BaseModel<?> _tincanStatementRemoteModel;
}
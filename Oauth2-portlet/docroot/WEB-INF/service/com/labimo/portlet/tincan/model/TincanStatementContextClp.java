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
import com.labimo.portlet.tincan.service.TincanStatementContextLocalServiceUtil;

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
public class TincanStatementContextClp extends BaseModelImpl<TincanStatementContext>
	implements TincanStatementContext {
	public TincanStatementContextClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TincanStatementContext.class;
	}

	@Override
	public String getModelClassName() {
		return TincanStatementContext.class.getName();
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
		attributes.put("registration", getRegistration());
		attributes.put("instructorId", getInstructorId());
		attributes.put("teamId", getTeamId());
		attributes.put("contextActivitiesId", getContextActivitiesId());
		attributes.put("revision", getRevision());
		attributes.put("platform", getPlatform());
		attributes.put("language", getLanguage());
		attributes.put("statement", getStatement());
		attributes.put("extensions", getExtensions());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String registration = (String)attributes.get("registration");

		if (registration != null) {
			setRegistration(registration);
		}

		Long instructorId = (Long)attributes.get("instructorId");

		if (instructorId != null) {
			setInstructorId(instructorId);
		}

		Long teamId = (Long)attributes.get("teamId");

		if (teamId != null) {
			setTeamId(teamId);
		}

		Long contextActivitiesId = (Long)attributes.get("contextActivitiesId");

		if (contextActivitiesId != null) {
			setContextActivitiesId(contextActivitiesId);
		}

		String revision = (String)attributes.get("revision");

		if (revision != null) {
			setRevision(revision);
		}

		String platform = (String)attributes.get("platform");

		if (platform != null) {
			setPlatform(platform);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		String statement = (String)attributes.get("statement");

		if (statement != null) {
			setStatement(statement);
		}

		String extensions = (String)attributes.get("extensions");

		if (extensions != null) {
			setExtensions(extensions);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tincanStatementContextRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementContextRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tincanStatementContextRemoteModel, id);
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

		if (_tincanStatementContextRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementContextRemoteModel.getClass();

				Method method = clazz.getMethod("setRegistration", String.class);

				method.invoke(_tincanStatementContextRemoteModel, registration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInstructorId() {
		return _instructorId;
	}

	@Override
	public void setInstructorId(long instructorId) {
		_instructorId = instructorId;

		if (_tincanStatementContextRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementContextRemoteModel.getClass();

				Method method = clazz.getMethod("setInstructorId", long.class);

				method.invoke(_tincanStatementContextRemoteModel, instructorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTeamId() {
		return _teamId;
	}

	@Override
	public void setTeamId(long teamId) {
		_teamId = teamId;

		if (_tincanStatementContextRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementContextRemoteModel.getClass();

				Method method = clazz.getMethod("setTeamId", long.class);

				method.invoke(_tincanStatementContextRemoteModel, teamId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getContextActivitiesId() {
		return _contextActivitiesId;
	}

	@Override
	public void setContextActivitiesId(long contextActivitiesId) {
		_contextActivitiesId = contextActivitiesId;

		if (_tincanStatementContextRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementContextRemoteModel.getClass();

				Method method = clazz.getMethod("setContextActivitiesId",
						long.class);

				method.invoke(_tincanStatementContextRemoteModel,
					contextActivitiesId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRevision() {
		return _revision;
	}

	@Override
	public void setRevision(String revision) {
		_revision = revision;

		if (_tincanStatementContextRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementContextRemoteModel.getClass();

				Method method = clazz.getMethod("setRevision", String.class);

				method.invoke(_tincanStatementContextRemoteModel, revision);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPlatform() {
		return _platform;
	}

	@Override
	public void setPlatform(String platform) {
		_platform = platform;

		if (_tincanStatementContextRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementContextRemoteModel.getClass();

				Method method = clazz.getMethod("setPlatform", String.class);

				method.invoke(_tincanStatementContextRemoteModel, platform);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLanguage() {
		return _language;
	}

	@Override
	public void setLanguage(String language) {
		_language = language;

		if (_tincanStatementContextRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementContextRemoteModel.getClass();

				Method method = clazz.getMethod("setLanguage", String.class);

				method.invoke(_tincanStatementContextRemoteModel, language);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatement() {
		return _statement;
	}

	@Override
	public void setStatement(String statement) {
		_statement = statement;

		if (_tincanStatementContextRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementContextRemoteModel.getClass();

				Method method = clazz.getMethod("setStatement", String.class);

				method.invoke(_tincanStatementContextRemoteModel, statement);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExtensions() {
		return _extensions;
	}

	@Override
	public void setExtensions(String extensions) {
		_extensions = extensions;

		if (_tincanStatementContextRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementContextRemoteModel.getClass();

				Method method = clazz.getMethod("setExtensions", String.class);

				method.invoke(_tincanStatementContextRemoteModel, extensions);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTincanStatementContextRemoteModel() {
		return _tincanStatementContextRemoteModel;
	}

	public void setTincanStatementContextRemoteModel(
		BaseModel<?> tincanStatementContextRemoteModel) {
		_tincanStatementContextRemoteModel = tincanStatementContextRemoteModel;
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

		Class<?> remoteModelClass = _tincanStatementContextRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tincanStatementContextRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TincanStatementContextLocalServiceUtil.addTincanStatementContext(this);
		}
		else {
			TincanStatementContextLocalServiceUtil.updateTincanStatementContext(this);
		}
	}

	@Override
	public TincanStatementContext toEscapedModel() {
		return (TincanStatementContext)ProxyUtil.newProxyInstance(TincanStatementContext.class.getClassLoader(),
			new Class[] { TincanStatementContext.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TincanStatementContextClp clone = new TincanStatementContextClp();

		clone.setId(getId());
		clone.setRegistration(getRegistration());
		clone.setInstructorId(getInstructorId());
		clone.setTeamId(getTeamId());
		clone.setContextActivitiesId(getContextActivitiesId());
		clone.setRevision(getRevision());
		clone.setPlatform(getPlatform());
		clone.setLanguage(getLanguage());
		clone.setStatement(getStatement());
		clone.setExtensions(getExtensions());

		return clone;
	}

	@Override
	public int compareTo(TincanStatementContext tincanStatementContext) {
		long primaryKey = tincanStatementContext.getPrimaryKey();

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

		if (!(obj instanceof TincanStatementContextClp)) {
			return false;
		}

		TincanStatementContextClp tincanStatementContext = (TincanStatementContextClp)obj;

		long primaryKey = tincanStatementContext.getPrimaryKey();

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
		sb.append(", registration=");
		sb.append(getRegistration());
		sb.append(", instructorId=");
		sb.append(getInstructorId());
		sb.append(", teamId=");
		sb.append(getTeamId());
		sb.append(", contextActivitiesId=");
		sb.append(getContextActivitiesId());
		sb.append(", revision=");
		sb.append(getRevision());
		sb.append(", platform=");
		sb.append(getPlatform());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", statement=");
		sb.append(getStatement());
		sb.append(", extensions=");
		sb.append(getExtensions());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.TincanStatementContext");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registration</column-name><column-value><![CDATA[");
		sb.append(getRegistration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>instructorId</column-name><column-value><![CDATA[");
		sb.append(getInstructorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>teamId</column-name><column-value><![CDATA[");
		sb.append(getTeamId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contextActivitiesId</column-name><column-value><![CDATA[");
		sb.append(getContextActivitiesId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>revision</column-name><column-value><![CDATA[");
		sb.append(getRevision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>platform</column-name><column-value><![CDATA[");
		sb.append(getPlatform());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statement</column-name><column-value><![CDATA[");
		sb.append(getStatement());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extensions</column-name><column-value><![CDATA[");
		sb.append(getExtensions());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _registration;
	private long _instructorId;
	private long _teamId;
	private long _contextActivitiesId;
	private String _revision;
	private String _platform;
	private String _language;
	private String _statement;
	private String _extensions;
	private BaseModel<?> _tincanStatementContextRemoteModel;
}
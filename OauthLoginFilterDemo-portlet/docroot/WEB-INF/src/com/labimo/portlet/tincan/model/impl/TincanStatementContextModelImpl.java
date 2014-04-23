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

package com.labimo.portlet.tincan.model.impl;

import com.labimo.portlet.tincan.model.TincanStatementContext;
import com.labimo.portlet.tincan.model.TincanStatementContextModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TincanStatementContext service. Represents a row in the &quot;labimo_TincanStatementContext&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.labimo.portlet.tincan.model.TincanStatementContextModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TincanStatementContextImpl}.
 * </p>
 *
 * @author wzgong
 * @see TincanStatementContextImpl
 * @see com.labimo.portlet.tincan.model.TincanStatementContext
 * @see com.labimo.portlet.tincan.model.TincanStatementContextModel
 * @generated
 */
public class TincanStatementContextModelImpl extends BaseModelImpl<TincanStatementContext>
	implements TincanStatementContextModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tincan statement context model instance should use the {@link com.labimo.portlet.tincan.model.TincanStatementContext} interface instead.
	 */
	public static final String TABLE_NAME = "labimo_TincanStatementContext";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "registration", Types.VARCHAR },
			{ "instructorId", Types.BIGINT },
			{ "teamId", Types.BIGINT },
			{ "contextActivitiesId", Types.BIGINT },
			{ "revision", Types.VARCHAR },
			{ "platform", Types.VARCHAR },
			{ "language", Types.VARCHAR },
			{ "statement", Types.VARCHAR },
			{ "extensions", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table labimo_TincanStatementContext (id_ LONG not null primary key,registration VARCHAR(75) null,instructorId LONG,teamId LONG,contextActivitiesId LONG,revision VARCHAR(75) null,platform VARCHAR(75) null,language VARCHAR(75) null,statement VARCHAR(75) null,extensions VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table labimo_TincanStatementContext";
	public static final String ORDER_BY_JPQL = " ORDER BY tincanStatementContext.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY labimo_TincanStatementContext.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.labimo.portlet.tincan.model.TincanStatementContext"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.labimo.portlet.tincan.model.TincanStatementContext"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.labimo.portlet.tincan.model.TincanStatementContext"));

	public TincanStatementContextModelImpl() {
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
	public Class<?> getModelClass() {
		return TincanStatementContext.class;
	}

	@Override
	public String getModelClassName() {
		return TincanStatementContext.class.getName();
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
	}

	@Override
	public String getRegistration() {
		if (_registration == null) {
			return StringPool.BLANK;
		}
		else {
			return _registration;
		}
	}

	@Override
	public void setRegistration(String registration) {
		_registration = registration;
	}

	@Override
	public long getInstructorId() {
		return _instructorId;
	}

	@Override
	public void setInstructorId(long instructorId) {
		_instructorId = instructorId;
	}

	@Override
	public long getTeamId() {
		return _teamId;
	}

	@Override
	public void setTeamId(long teamId) {
		_teamId = teamId;
	}

	@Override
	public long getContextActivitiesId() {
		return _contextActivitiesId;
	}

	@Override
	public void setContextActivitiesId(long contextActivitiesId) {
		_contextActivitiesId = contextActivitiesId;
	}

	@Override
	public String getRevision() {
		if (_revision == null) {
			return StringPool.BLANK;
		}
		else {
			return _revision;
		}
	}

	@Override
	public void setRevision(String revision) {
		_revision = revision;
	}

	@Override
	public String getPlatform() {
		if (_platform == null) {
			return StringPool.BLANK;
		}
		else {
			return _platform;
		}
	}

	@Override
	public void setPlatform(String platform) {
		_platform = platform;
	}

	@Override
	public String getLanguage() {
		if (_language == null) {
			return StringPool.BLANK;
		}
		else {
			return _language;
		}
	}

	@Override
	public void setLanguage(String language) {
		_language = language;
	}

	@Override
	public String getStatement() {
		if (_statement == null) {
			return StringPool.BLANK;
		}
		else {
			return _statement;
		}
	}

	@Override
	public void setStatement(String statement) {
		_statement = statement;
	}

	@Override
	public String getExtensions() {
		if (_extensions == null) {
			return StringPool.BLANK;
		}
		else {
			return _extensions;
		}
	}

	@Override
	public void setExtensions(String extensions) {
		_extensions = extensions;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TincanStatementContext.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TincanStatementContext toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TincanStatementContext)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TincanStatementContextImpl tincanStatementContextImpl = new TincanStatementContextImpl();

		tincanStatementContextImpl.setId(getId());
		tincanStatementContextImpl.setRegistration(getRegistration());
		tincanStatementContextImpl.setInstructorId(getInstructorId());
		tincanStatementContextImpl.setTeamId(getTeamId());
		tincanStatementContextImpl.setContextActivitiesId(getContextActivitiesId());
		tincanStatementContextImpl.setRevision(getRevision());
		tincanStatementContextImpl.setPlatform(getPlatform());
		tincanStatementContextImpl.setLanguage(getLanguage());
		tincanStatementContextImpl.setStatement(getStatement());
		tincanStatementContextImpl.setExtensions(getExtensions());

		tincanStatementContextImpl.resetOriginalValues();

		return tincanStatementContextImpl;
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

		if (!(obj instanceof TincanStatementContext)) {
			return false;
		}

		TincanStatementContext tincanStatementContext = (TincanStatementContext)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<TincanStatementContext> toCacheModel() {
		TincanStatementContextCacheModel tincanStatementContextCacheModel = new TincanStatementContextCacheModel();

		tincanStatementContextCacheModel.id = getId();

		tincanStatementContextCacheModel.registration = getRegistration();

		String registration = tincanStatementContextCacheModel.registration;

		if ((registration != null) && (registration.length() == 0)) {
			tincanStatementContextCacheModel.registration = null;
		}

		tincanStatementContextCacheModel.instructorId = getInstructorId();

		tincanStatementContextCacheModel.teamId = getTeamId();

		tincanStatementContextCacheModel.contextActivitiesId = getContextActivitiesId();

		tincanStatementContextCacheModel.revision = getRevision();

		String revision = tincanStatementContextCacheModel.revision;

		if ((revision != null) && (revision.length() == 0)) {
			tincanStatementContextCacheModel.revision = null;
		}

		tincanStatementContextCacheModel.platform = getPlatform();

		String platform = tincanStatementContextCacheModel.platform;

		if ((platform != null) && (platform.length() == 0)) {
			tincanStatementContextCacheModel.platform = null;
		}

		tincanStatementContextCacheModel.language = getLanguage();

		String language = tincanStatementContextCacheModel.language;

		if ((language != null) && (language.length() == 0)) {
			tincanStatementContextCacheModel.language = null;
		}

		tincanStatementContextCacheModel.statement = getStatement();

		String statement = tincanStatementContextCacheModel.statement;

		if ((statement != null) && (statement.length() == 0)) {
			tincanStatementContextCacheModel.statement = null;
		}

		tincanStatementContextCacheModel.extensions = getExtensions();

		String extensions = tincanStatementContextCacheModel.extensions;

		if ((extensions != null) && (extensions.length() == 0)) {
			tincanStatementContextCacheModel.extensions = null;
		}

		return tincanStatementContextCacheModel;
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

	private static ClassLoader _classLoader = TincanStatementContext.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TincanStatementContext.class
		};
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
	private TincanStatementContext _escapedModel;
}
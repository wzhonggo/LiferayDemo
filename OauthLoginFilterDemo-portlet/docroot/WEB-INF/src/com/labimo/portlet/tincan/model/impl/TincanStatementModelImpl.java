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

import com.labimo.portlet.tincan.model.TincanStatement;
import com.labimo.portlet.tincan.model.TincanStatementModel;

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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TincanStatement service. Represents a row in the &quot;labimo_TincanStatement&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.labimo.portlet.tincan.model.TincanStatementModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TincanStatementImpl}.
 * </p>
 *
 * @author wzgong
 * @see TincanStatementImpl
 * @see com.labimo.portlet.tincan.model.TincanStatement
 * @see com.labimo.portlet.tincan.model.TincanStatementModel
 * @generated
 */
public class TincanStatementModelImpl extends BaseModelImpl<TincanStatement>
	implements TincanStatementModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tincan statement model instance should use the {@link com.labimo.portlet.tincan.model.TincanStatement} interface instead.
	 */
	public static final String TABLE_NAME = "labimo_TincanStatement";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "statementId", Types.VARCHAR },
			{ "subStatementId", Types.BIGINT },
			{ "agentId", Types.BIGINT },
			{ "contextId", Types.BIGINT },
			{ "activityId", Types.BIGINT },
			{ "resultId", Types.BIGINT },
			{ "authorityId", Types.BIGINT },
			{ "timestamp", Types.TIMESTAMP },
			{ "stored", Types.TIMESTAMP },
			{ "version", Types.VARCHAR },
			{ "verbId", Types.BIGINT },
			{ "voided", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table labimo_TincanStatement (id_ LONG not null primary key,statementId VARCHAR(75) null,subStatementId LONG,agentId LONG,contextId LONG,activityId LONG,resultId LONG,authorityId LONG,timestamp DATE null,stored DATE null,version VARCHAR(75) null,verbId LONG,voided BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table labimo_TincanStatement";
	public static final String ORDER_BY_JPQL = " ORDER BY tincanStatement.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY labimo_TincanStatement.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.labimo.portlet.tincan.model.TincanStatement"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.labimo.portlet.tincan.model.TincanStatement"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.labimo.portlet.tincan.model.TincanStatement"));

	public TincanStatementModelImpl() {
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
		return TincanStatement.class;
	}

	@Override
	public String getModelClassName() {
		return TincanStatement.class.getName();
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
	}

	@Override
	public String getStatementId() {
		if (_statementId == null) {
			return StringPool.BLANK;
		}
		else {
			return _statementId;
		}
	}

	@Override
	public void setStatementId(String statementId) {
		_statementId = statementId;
	}

	@Override
	public long getSubStatementId() {
		return _subStatementId;
	}

	@Override
	public void setSubStatementId(long subStatementId) {
		_subStatementId = subStatementId;
	}

	@Override
	public long getAgentId() {
		return _agentId;
	}

	@Override
	public void setAgentId(long agentId) {
		_agentId = agentId;
	}

	@Override
	public long getContextId() {
		return _contextId;
	}

	@Override
	public void setContextId(long contextId) {
		_contextId = contextId;
	}

	@Override
	public long getActivityId() {
		return _activityId;
	}

	@Override
	public void setActivityId(long activityId) {
		_activityId = activityId;
	}

	@Override
	public long getResultId() {
		return _resultId;
	}

	@Override
	public void setResultId(long resultId) {
		_resultId = resultId;
	}

	@Override
	public long getAuthorityId() {
		return _authorityId;
	}

	@Override
	public void setAuthorityId(long authorityId) {
		_authorityId = authorityId;
	}

	@Override
	public Date getTimestamp() {
		return _timestamp;
	}

	@Override
	public void setTimestamp(Date timestamp) {
		_timestamp = timestamp;
	}

	@Override
	public Date getStored() {
		return _stored;
	}

	@Override
	public void setStored(Date stored) {
		_stored = stored;
	}

	@Override
	public String getVersion() {
		if (_version == null) {
			return StringPool.BLANK;
		}
		else {
			return _version;
		}
	}

	@Override
	public void setVersion(String version) {
		_version = version;
	}

	@Override
	public long getVerbId() {
		return _verbId;
	}

	@Override
	public void setVerbId(long verbId) {
		_verbId = verbId;
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
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TincanStatement.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TincanStatement toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TincanStatement)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TincanStatementImpl tincanStatementImpl = new TincanStatementImpl();

		tincanStatementImpl.setId(getId());
		tincanStatementImpl.setStatementId(getStatementId());
		tincanStatementImpl.setSubStatementId(getSubStatementId());
		tincanStatementImpl.setAgentId(getAgentId());
		tincanStatementImpl.setContextId(getContextId());
		tincanStatementImpl.setActivityId(getActivityId());
		tincanStatementImpl.setResultId(getResultId());
		tincanStatementImpl.setAuthorityId(getAuthorityId());
		tincanStatementImpl.setTimestamp(getTimestamp());
		tincanStatementImpl.setStored(getStored());
		tincanStatementImpl.setVersion(getVersion());
		tincanStatementImpl.setVerbId(getVerbId());
		tincanStatementImpl.setVoided(getVoided());

		tincanStatementImpl.resetOriginalValues();

		return tincanStatementImpl;
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

		if (!(obj instanceof TincanStatement)) {
			return false;
		}

		TincanStatement tincanStatement = (TincanStatement)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<TincanStatement> toCacheModel() {
		TincanStatementCacheModel tincanStatementCacheModel = new TincanStatementCacheModel();

		tincanStatementCacheModel.id = getId();

		tincanStatementCacheModel.statementId = getStatementId();

		String statementId = tincanStatementCacheModel.statementId;

		if ((statementId != null) && (statementId.length() == 0)) {
			tincanStatementCacheModel.statementId = null;
		}

		tincanStatementCacheModel.subStatementId = getSubStatementId();

		tincanStatementCacheModel.agentId = getAgentId();

		tincanStatementCacheModel.contextId = getContextId();

		tincanStatementCacheModel.activityId = getActivityId();

		tincanStatementCacheModel.resultId = getResultId();

		tincanStatementCacheModel.authorityId = getAuthorityId();

		Date timestamp = getTimestamp();

		if (timestamp != null) {
			tincanStatementCacheModel.timestamp = timestamp.getTime();
		}
		else {
			tincanStatementCacheModel.timestamp = Long.MIN_VALUE;
		}

		Date stored = getStored();

		if (stored != null) {
			tincanStatementCacheModel.stored = stored.getTime();
		}
		else {
			tincanStatementCacheModel.stored = Long.MIN_VALUE;
		}

		tincanStatementCacheModel.version = getVersion();

		String version = tincanStatementCacheModel.version;

		if ((version != null) && (version.length() == 0)) {
			tincanStatementCacheModel.version = null;
		}

		tincanStatementCacheModel.verbId = getVerbId();

		tincanStatementCacheModel.voided = getVoided();

		return tincanStatementCacheModel;
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

	private static ClassLoader _classLoader = TincanStatement.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TincanStatement.class
		};
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
	private TincanStatement _escapedModel;
}
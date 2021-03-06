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

import com.labimo.portlet.tincan.model.TincanActivityState;
import com.labimo.portlet.tincan.model.TincanActivityStateModel;

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
 * The base model implementation for the TincanActivityState service. Represents a row in the &quot;labimo_TincanActivityState&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.labimo.portlet.tincan.model.TincanActivityStateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TincanActivityStateImpl}.
 * </p>
 *
 * @author wzgong
 * @see TincanActivityStateImpl
 * @see com.labimo.portlet.tincan.model.TincanActivityState
 * @see com.labimo.portlet.tincan.model.TincanActivityStateModel
 * @generated
 */
public class TincanActivityStateModelImpl extends BaseModelImpl<TincanActivityState>
	implements TincanActivityStateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tincan activity state model instance should use the {@link com.labimo.portlet.tincan.model.TincanActivityState} interface instead.
	 */
	public static final String TABLE_NAME = "labimo_TincanActivityState";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "stateId", Types.VARCHAR },
			{ "state_", Types.VARCHAR },
			{ "jsonState", Types.VARCHAR },
			{ "agentId", Types.BIGINT },
			{ "activityId", Types.BIGINT },
			{ "registration", Types.VARCHAR },
			{ "etag", Types.VARCHAR },
			{ "updated", Types.TIMESTAMP },
			{ "contentType", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table labimo_TincanActivityState (id_ LONG not null primary key,stateId VARCHAR(75) null,state_ VARCHAR(75) null,jsonState VARCHAR(75) null,agentId LONG,activityId LONG,registration VARCHAR(75) null,etag VARCHAR(75) null,updated DATE null,contentType VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table labimo_TincanActivityState";
	public static final String ORDER_BY_JPQL = " ORDER BY tincanActivityState.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY labimo_TincanActivityState.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.labimo.portlet.tincan.model.TincanActivityState"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.labimo.portlet.tincan.model.TincanActivityState"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.labimo.portlet.tincan.model.TincanActivityState"));

	public TincanActivityStateModelImpl() {
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
		return TincanActivityState.class;
	}

	@Override
	public String getModelClassName() {
		return TincanActivityState.class.getName();
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
	}

	@Override
	public String getStateId() {
		if (_stateId == null) {
			return StringPool.BLANK;
		}
		else {
			return _stateId;
		}
	}

	@Override
	public void setStateId(String stateId) {
		_stateId = stateId;
	}

	@Override
	public String getState() {
		if (_state == null) {
			return StringPool.BLANK;
		}
		else {
			return _state;
		}
	}

	@Override
	public void setState(String state) {
		_state = state;
	}

	@Override
	public String getJsonState() {
		if (_jsonState == null) {
			return StringPool.BLANK;
		}
		else {
			return _jsonState;
		}
	}

	@Override
	public void setJsonState(String jsonState) {
		_jsonState = jsonState;
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
	public long getActivityId() {
		return _activityId;
	}

	@Override
	public void setActivityId(long activityId) {
		_activityId = activityId;
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
	public String getEtag() {
		if (_etag == null) {
			return StringPool.BLANK;
		}
		else {
			return _etag;
		}
	}

	@Override
	public void setEtag(String etag) {
		_etag = etag;
	}

	@Override
	public Date getUpdated() {
		return _updated;
	}

	@Override
	public void setUpdated(Date updated) {
		_updated = updated;
	}

	@Override
	public String getContentType() {
		if (_contentType == null) {
			return StringPool.BLANK;
		}
		else {
			return _contentType;
		}
	}

	@Override
	public void setContentType(String contentType) {
		_contentType = contentType;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TincanActivityState.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TincanActivityState toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TincanActivityState)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TincanActivityStateImpl tincanActivityStateImpl = new TincanActivityStateImpl();

		tincanActivityStateImpl.setId(getId());
		tincanActivityStateImpl.setStateId(getStateId());
		tincanActivityStateImpl.setState(getState());
		tincanActivityStateImpl.setJsonState(getJsonState());
		tincanActivityStateImpl.setAgentId(getAgentId());
		tincanActivityStateImpl.setActivityId(getActivityId());
		tincanActivityStateImpl.setRegistration(getRegistration());
		tincanActivityStateImpl.setEtag(getEtag());
		tincanActivityStateImpl.setUpdated(getUpdated());
		tincanActivityStateImpl.setContentType(getContentType());

		tincanActivityStateImpl.resetOriginalValues();

		return tincanActivityStateImpl;
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

		if (!(obj instanceof TincanActivityState)) {
			return false;
		}

		TincanActivityState tincanActivityState = (TincanActivityState)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<TincanActivityState> toCacheModel() {
		TincanActivityStateCacheModel tincanActivityStateCacheModel = new TincanActivityStateCacheModel();

		tincanActivityStateCacheModel.id = getId();

		tincanActivityStateCacheModel.stateId = getStateId();

		String stateId = tincanActivityStateCacheModel.stateId;

		if ((stateId != null) && (stateId.length() == 0)) {
			tincanActivityStateCacheModel.stateId = null;
		}

		tincanActivityStateCacheModel.state = getState();

		String state = tincanActivityStateCacheModel.state;

		if ((state != null) && (state.length() == 0)) {
			tincanActivityStateCacheModel.state = null;
		}

		tincanActivityStateCacheModel.jsonState = getJsonState();

		String jsonState = tincanActivityStateCacheModel.jsonState;

		if ((jsonState != null) && (jsonState.length() == 0)) {
			tincanActivityStateCacheModel.jsonState = null;
		}

		tincanActivityStateCacheModel.agentId = getAgentId();

		tincanActivityStateCacheModel.activityId = getActivityId();

		tincanActivityStateCacheModel.registration = getRegistration();

		String registration = tincanActivityStateCacheModel.registration;

		if ((registration != null) && (registration.length() == 0)) {
			tincanActivityStateCacheModel.registration = null;
		}

		tincanActivityStateCacheModel.etag = getEtag();

		String etag = tincanActivityStateCacheModel.etag;

		if ((etag != null) && (etag.length() == 0)) {
			tincanActivityStateCacheModel.etag = null;
		}

		Date updated = getUpdated();

		if (updated != null) {
			tincanActivityStateCacheModel.updated = updated.getTime();
		}
		else {
			tincanActivityStateCacheModel.updated = Long.MIN_VALUE;
		}

		tincanActivityStateCacheModel.contentType = getContentType();

		String contentType = tincanActivityStateCacheModel.contentType;

		if ((contentType != null) && (contentType.length() == 0)) {
			tincanActivityStateCacheModel.contentType = null;
		}

		return tincanActivityStateCacheModel;
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

	private static ClassLoader _classLoader = TincanActivityState.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TincanActivityState.class
		};
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
	private TincanActivityState _escapedModel;
}
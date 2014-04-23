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

import com.labimo.portlet.tincan.model.TincanStatementResult;
import com.labimo.portlet.tincan.model.TincanStatementResultModel;

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
 * The base model implementation for the TincanStatementResult service. Represents a row in the &quot;labimo_TincanStatementResult&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.labimo.portlet.tincan.model.TincanStatementResultModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TincanStatementResultImpl}.
 * </p>
 *
 * @author wzgong
 * @see TincanStatementResultImpl
 * @see com.labimo.portlet.tincan.model.TincanStatementResult
 * @see com.labimo.portlet.tincan.model.TincanStatementResultModel
 * @generated
 */
public class TincanStatementResultModelImpl extends BaseModelImpl<TincanStatementResult>
	implements TincanStatementResultModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tincan statement result model instance should use the {@link com.labimo.portlet.tincan.model.TincanStatementResult} interface instead.
	 */
	public static final String TABLE_NAME = "labimo_TincanStatementResult";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "success", Types.BOOLEAN },
			{ "completion", Types.BOOLEAN },
			{ "response", Types.VARCHAR },
			{ "duration", Types.VARCHAR },
			{ "extension", Types.VARCHAR },
			{ "scoreScaled", Types.DOUBLE },
			{ "scoreRaw", Types.DOUBLE },
			{ "scoreMin", Types.DOUBLE },
			{ "scoreMax", Types.DOUBLE }
		};
	public static final String TABLE_SQL_CREATE = "create table labimo_TincanStatementResult (id_ LONG not null primary key,success BOOLEAN,completion BOOLEAN,response VARCHAR(75) null,duration VARCHAR(75) null,extension VARCHAR(75) null,scoreScaled DOUBLE,scoreRaw DOUBLE,scoreMin DOUBLE,scoreMax DOUBLE)";
	public static final String TABLE_SQL_DROP = "drop table labimo_TincanStatementResult";
	public static final String ORDER_BY_JPQL = " ORDER BY tincanStatementResult.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY labimo_TincanStatementResult.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.labimo.portlet.tincan.model.TincanStatementResult"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.labimo.portlet.tincan.model.TincanStatementResult"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.labimo.portlet.tincan.model.TincanStatementResult"));

	public TincanStatementResultModelImpl() {
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
		return TincanStatementResult.class;
	}

	@Override
	public String getModelClassName() {
		return TincanStatementResult.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("success", getSuccess());
		attributes.put("completion", getCompletion());
		attributes.put("response", getResponse());
		attributes.put("duration", getDuration());
		attributes.put("extension", getExtension());
		attributes.put("scoreScaled", getScoreScaled());
		attributes.put("scoreRaw", getScoreRaw());
		attributes.put("scoreMin", getScoreMin());
		attributes.put("scoreMax", getScoreMax());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Boolean success = (Boolean)attributes.get("success");

		if (success != null) {
			setSuccess(success);
		}

		Boolean completion = (Boolean)attributes.get("completion");

		if (completion != null) {
			setCompletion(completion);
		}

		String response = (String)attributes.get("response");

		if (response != null) {
			setResponse(response);
		}

		String duration = (String)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}

		String extension = (String)attributes.get("extension");

		if (extension != null) {
			setExtension(extension);
		}

		Double scoreScaled = (Double)attributes.get("scoreScaled");

		if (scoreScaled != null) {
			setScoreScaled(scoreScaled);
		}

		Double scoreRaw = (Double)attributes.get("scoreRaw");

		if (scoreRaw != null) {
			setScoreRaw(scoreRaw);
		}

		Double scoreMin = (Double)attributes.get("scoreMin");

		if (scoreMin != null) {
			setScoreMin(scoreMin);
		}

		Double scoreMax = (Double)attributes.get("scoreMax");

		if (scoreMax != null) {
			setScoreMax(scoreMax);
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
	public boolean getSuccess() {
		return _success;
	}

	@Override
	public boolean isSuccess() {
		return _success;
	}

	@Override
	public void setSuccess(boolean success) {
		_success = success;
	}

	@Override
	public boolean getCompletion() {
		return _completion;
	}

	@Override
	public boolean isCompletion() {
		return _completion;
	}

	@Override
	public void setCompletion(boolean completion) {
		_completion = completion;
	}

	@Override
	public String getResponse() {
		if (_response == null) {
			return StringPool.BLANK;
		}
		else {
			return _response;
		}
	}

	@Override
	public void setResponse(String response) {
		_response = response;
	}

	@Override
	public String getDuration() {
		if (_duration == null) {
			return StringPool.BLANK;
		}
		else {
			return _duration;
		}
	}

	@Override
	public void setDuration(String duration) {
		_duration = duration;
	}

	@Override
	public String getExtension() {
		if (_extension == null) {
			return StringPool.BLANK;
		}
		else {
			return _extension;
		}
	}

	@Override
	public void setExtension(String extension) {
		_extension = extension;
	}

	@Override
	public double getScoreScaled() {
		return _scoreScaled;
	}

	@Override
	public void setScoreScaled(double scoreScaled) {
		_scoreScaled = scoreScaled;
	}

	@Override
	public double getScoreRaw() {
		return _scoreRaw;
	}

	@Override
	public void setScoreRaw(double scoreRaw) {
		_scoreRaw = scoreRaw;
	}

	@Override
	public double getScoreMin() {
		return _scoreMin;
	}

	@Override
	public void setScoreMin(double scoreMin) {
		_scoreMin = scoreMin;
	}

	@Override
	public double getScoreMax() {
		return _scoreMax;
	}

	@Override
	public void setScoreMax(double scoreMax) {
		_scoreMax = scoreMax;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TincanStatementResult.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TincanStatementResult toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TincanStatementResult)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TincanStatementResultImpl tincanStatementResultImpl = new TincanStatementResultImpl();

		tincanStatementResultImpl.setId(getId());
		tincanStatementResultImpl.setSuccess(getSuccess());
		tincanStatementResultImpl.setCompletion(getCompletion());
		tincanStatementResultImpl.setResponse(getResponse());
		tincanStatementResultImpl.setDuration(getDuration());
		tincanStatementResultImpl.setExtension(getExtension());
		tincanStatementResultImpl.setScoreScaled(getScoreScaled());
		tincanStatementResultImpl.setScoreRaw(getScoreRaw());
		tincanStatementResultImpl.setScoreMin(getScoreMin());
		tincanStatementResultImpl.setScoreMax(getScoreMax());

		tincanStatementResultImpl.resetOriginalValues();

		return tincanStatementResultImpl;
	}

	@Override
	public int compareTo(TincanStatementResult tincanStatementResult) {
		long primaryKey = tincanStatementResult.getPrimaryKey();

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

		if (!(obj instanceof TincanStatementResult)) {
			return false;
		}

		TincanStatementResult tincanStatementResult = (TincanStatementResult)obj;

		long primaryKey = tincanStatementResult.getPrimaryKey();

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
	public CacheModel<TincanStatementResult> toCacheModel() {
		TincanStatementResultCacheModel tincanStatementResultCacheModel = new TincanStatementResultCacheModel();

		tincanStatementResultCacheModel.id = getId();

		tincanStatementResultCacheModel.success = getSuccess();

		tincanStatementResultCacheModel.completion = getCompletion();

		tincanStatementResultCacheModel.response = getResponse();

		String response = tincanStatementResultCacheModel.response;

		if ((response != null) && (response.length() == 0)) {
			tincanStatementResultCacheModel.response = null;
		}

		tincanStatementResultCacheModel.duration = getDuration();

		String duration = tincanStatementResultCacheModel.duration;

		if ((duration != null) && (duration.length() == 0)) {
			tincanStatementResultCacheModel.duration = null;
		}

		tincanStatementResultCacheModel.extension = getExtension();

		String extension = tincanStatementResultCacheModel.extension;

		if ((extension != null) && (extension.length() == 0)) {
			tincanStatementResultCacheModel.extension = null;
		}

		tincanStatementResultCacheModel.scoreScaled = getScoreScaled();

		tincanStatementResultCacheModel.scoreRaw = getScoreRaw();

		tincanStatementResultCacheModel.scoreMin = getScoreMin();

		tincanStatementResultCacheModel.scoreMax = getScoreMax();

		return tincanStatementResultCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", success=");
		sb.append(getSuccess());
		sb.append(", completion=");
		sb.append(getCompletion());
		sb.append(", response=");
		sb.append(getResponse());
		sb.append(", duration=");
		sb.append(getDuration());
		sb.append(", extension=");
		sb.append(getExtension());
		sb.append(", scoreScaled=");
		sb.append(getScoreScaled());
		sb.append(", scoreRaw=");
		sb.append(getScoreRaw());
		sb.append(", scoreMin=");
		sb.append(getScoreMin());
		sb.append(", scoreMax=");
		sb.append(getScoreMax());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.TincanStatementResult");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>success</column-name><column-value><![CDATA[");
		sb.append(getSuccess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>completion</column-name><column-value><![CDATA[");
		sb.append(getCompletion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>response</column-name><column-value><![CDATA[");
		sb.append(getResponse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duration</column-name><column-value><![CDATA[");
		sb.append(getDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extension</column-name><column-value><![CDATA[");
		sb.append(getExtension());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scoreScaled</column-name><column-value><![CDATA[");
		sb.append(getScoreScaled());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scoreRaw</column-name><column-value><![CDATA[");
		sb.append(getScoreRaw());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scoreMin</column-name><column-value><![CDATA[");
		sb.append(getScoreMin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scoreMax</column-name><column-value><![CDATA[");
		sb.append(getScoreMax());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TincanStatementResult.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TincanStatementResult.class
		};
	private long _id;
	private boolean _success;
	private boolean _completion;
	private String _response;
	private String _duration;
	private String _extension;
	private double _scoreScaled;
	private double _scoreRaw;
	private double _scoreMin;
	private double _scoreMax;
	private TincanStatementResult _escapedModel;
}
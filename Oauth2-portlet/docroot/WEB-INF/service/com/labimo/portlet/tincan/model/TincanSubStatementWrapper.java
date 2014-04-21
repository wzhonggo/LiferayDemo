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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TincanSubStatement}.
 * </p>
 *
 * @author wzgong
 * @see TincanSubStatement
 * @generated
 */
public class TincanSubStatementWrapper implements TincanSubStatement,
	ModelWrapper<TincanSubStatement> {
	public TincanSubStatementWrapper(TincanSubStatement tincanSubStatement) {
		_tincanSubStatement = tincanSubStatement;
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

	/**
	* Returns the primary key of this tincan sub statement.
	*
	* @return the primary key of this tincan sub statement
	*/
	@Override
	public long getPrimaryKey() {
		return _tincanSubStatement.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tincan sub statement.
	*
	* @param primaryKey the primary key of this tincan sub statement
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tincanSubStatement.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tincan sub statement.
	*
	* @return the ID of this tincan sub statement
	*/
	@Override
	public long getId() {
		return _tincanSubStatement.getId();
	}

	/**
	* Sets the ID of this tincan sub statement.
	*
	* @param id the ID of this tincan sub statement
	*/
	@Override
	public void setId(long id) {
		_tincanSubStatement.setId(id);
	}

	/**
	* Returns the agent ID of this tincan sub statement.
	*
	* @return the agent ID of this tincan sub statement
	*/
	@Override
	public long getAgentId() {
		return _tincanSubStatement.getAgentId();
	}

	/**
	* Sets the agent ID of this tincan sub statement.
	*
	* @param agentId the agent ID of this tincan sub statement
	*/
	@Override
	public void setAgentId(long agentId) {
		_tincanSubStatement.setAgentId(agentId);
	}

	/**
	* Returns the activity ID of this tincan sub statement.
	*
	* @return the activity ID of this tincan sub statement
	*/
	@Override
	public long getActivityId() {
		return _tincanSubStatement.getActivityId();
	}

	/**
	* Sets the activity ID of this tincan sub statement.
	*
	* @param activityId the activity ID of this tincan sub statement
	*/
	@Override
	public void setActivityId(long activityId) {
		_tincanSubStatement.setActivityId(activityId);
	}

	/**
	* Returns the result ID of this tincan sub statement.
	*
	* @return the result ID of this tincan sub statement
	*/
	@Override
	public long getResultId() {
		return _tincanSubStatement.getResultId();
	}

	/**
	* Sets the result ID of this tincan sub statement.
	*
	* @param resultId the result ID of this tincan sub statement
	*/
	@Override
	public void setResultId(long resultId) {
		_tincanSubStatement.setResultId(resultId);
	}

	/**
	* Returns the context ID of this tincan sub statement.
	*
	* @return the context ID of this tincan sub statement
	*/
	@Override
	public long getContextId() {
		return _tincanSubStatement.getContextId();
	}

	/**
	* Sets the context ID of this tincan sub statement.
	*
	* @param contextId the context ID of this tincan sub statement
	*/
	@Override
	public void setContextId(long contextId) {
		_tincanSubStatement.setContextId(contextId);
	}

	/**
	* Returns the verb ID of this tincan sub statement.
	*
	* @return the verb ID of this tincan sub statement
	*/
	@Override
	public long getVerbId() {
		return _tincanSubStatement.getVerbId();
	}

	/**
	* Sets the verb ID of this tincan sub statement.
	*
	* @param verbId the verb ID of this tincan sub statement
	*/
	@Override
	public void setVerbId(long verbId) {
		_tincanSubStatement.setVerbId(verbId);
	}

	/**
	* Returns the timestamp of this tincan sub statement.
	*
	* @return the timestamp of this tincan sub statement
	*/
	@Override
	public java.util.Date getTimestamp() {
		return _tincanSubStatement.getTimestamp();
	}

	/**
	* Sets the timestamp of this tincan sub statement.
	*
	* @param timestamp the timestamp of this tincan sub statement
	*/
	@Override
	public void setTimestamp(java.util.Date timestamp) {
		_tincanSubStatement.setTimestamp(timestamp);
	}

	@Override
	public boolean isNew() {
		return _tincanSubStatement.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tincanSubStatement.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tincanSubStatement.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tincanSubStatement.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tincanSubStatement.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tincanSubStatement.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tincanSubStatement.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tincanSubStatement.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tincanSubStatement.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tincanSubStatement.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tincanSubStatement.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TincanSubStatementWrapper((TincanSubStatement)_tincanSubStatement.clone());
	}

	@Override
	public int compareTo(TincanSubStatement tincanSubStatement) {
		return _tincanSubStatement.compareTo(tincanSubStatement);
	}

	@Override
	public int hashCode() {
		return _tincanSubStatement.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TincanSubStatement> toCacheModel() {
		return _tincanSubStatement.toCacheModel();
	}

	@Override
	public TincanSubStatement toEscapedModel() {
		return new TincanSubStatementWrapper(_tincanSubStatement.toEscapedModel());
	}

	@Override
	public TincanSubStatement toUnescapedModel() {
		return new TincanSubStatementWrapper(_tincanSubStatement.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tincanSubStatement.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tincanSubStatement.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tincanSubStatement.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TincanSubStatementWrapper)) {
			return false;
		}

		TincanSubStatementWrapper tincanSubStatementWrapper = (TincanSubStatementWrapper)obj;

		if (Validator.equals(_tincanSubStatement,
					tincanSubStatementWrapper._tincanSubStatement)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TincanSubStatement getWrappedTincanSubStatement() {
		return _tincanSubStatement;
	}

	@Override
	public TincanSubStatement getWrappedModel() {
		return _tincanSubStatement;
	}

	@Override
	public void resetOriginalValues() {
		_tincanSubStatement.resetOriginalValues();
	}

	private TincanSubStatement _tincanSubStatement;
}
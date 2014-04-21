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
 * This class is a wrapper for {@link TincanStatement}.
 * </p>
 *
 * @author wzgong
 * @see TincanStatement
 * @generated
 */
public class TincanStatementWrapper implements TincanStatement,
	ModelWrapper<TincanStatement> {
	public TincanStatementWrapper(TincanStatement tincanStatement) {
		_tincanStatement = tincanStatement;
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

	/**
	* Returns the primary key of this tincan statement.
	*
	* @return the primary key of this tincan statement
	*/
	@Override
	public long getPrimaryKey() {
		return _tincanStatement.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tincan statement.
	*
	* @param primaryKey the primary key of this tincan statement
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tincanStatement.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tincan statement.
	*
	* @return the ID of this tincan statement
	*/
	@Override
	public long getId() {
		return _tincanStatement.getId();
	}

	/**
	* Sets the ID of this tincan statement.
	*
	* @param id the ID of this tincan statement
	*/
	@Override
	public void setId(long id) {
		_tincanStatement.setId(id);
	}

	/**
	* Returns the statement ID of this tincan statement.
	*
	* @return the statement ID of this tincan statement
	*/
	@Override
	public java.lang.String getStatementId() {
		return _tincanStatement.getStatementId();
	}

	/**
	* Sets the statement ID of this tincan statement.
	*
	* @param statementId the statement ID of this tincan statement
	*/
	@Override
	public void setStatementId(java.lang.String statementId) {
		_tincanStatement.setStatementId(statementId);
	}

	/**
	* Returns the sub statement ID of this tincan statement.
	*
	* @return the sub statement ID of this tincan statement
	*/
	@Override
	public long getSubStatementId() {
		return _tincanStatement.getSubStatementId();
	}

	/**
	* Sets the sub statement ID of this tincan statement.
	*
	* @param subStatementId the sub statement ID of this tincan statement
	*/
	@Override
	public void setSubStatementId(long subStatementId) {
		_tincanStatement.setSubStatementId(subStatementId);
	}

	/**
	* Returns the agent ID of this tincan statement.
	*
	* @return the agent ID of this tincan statement
	*/
	@Override
	public long getAgentId() {
		return _tincanStatement.getAgentId();
	}

	/**
	* Sets the agent ID of this tincan statement.
	*
	* @param agentId the agent ID of this tincan statement
	*/
	@Override
	public void setAgentId(long agentId) {
		_tincanStatement.setAgentId(agentId);
	}

	/**
	* Returns the context ID of this tincan statement.
	*
	* @return the context ID of this tincan statement
	*/
	@Override
	public long getContextId() {
		return _tincanStatement.getContextId();
	}

	/**
	* Sets the context ID of this tincan statement.
	*
	* @param contextId the context ID of this tincan statement
	*/
	@Override
	public void setContextId(long contextId) {
		_tincanStatement.setContextId(contextId);
	}

	/**
	* Returns the activity ID of this tincan statement.
	*
	* @return the activity ID of this tincan statement
	*/
	@Override
	public long getActivityId() {
		return _tincanStatement.getActivityId();
	}

	/**
	* Sets the activity ID of this tincan statement.
	*
	* @param activityId the activity ID of this tincan statement
	*/
	@Override
	public void setActivityId(long activityId) {
		_tincanStatement.setActivityId(activityId);
	}

	/**
	* Returns the result ID of this tincan statement.
	*
	* @return the result ID of this tincan statement
	*/
	@Override
	public long getResultId() {
		return _tincanStatement.getResultId();
	}

	/**
	* Sets the result ID of this tincan statement.
	*
	* @param resultId the result ID of this tincan statement
	*/
	@Override
	public void setResultId(long resultId) {
		_tincanStatement.setResultId(resultId);
	}

	/**
	* Returns the authority ID of this tincan statement.
	*
	* @return the authority ID of this tincan statement
	*/
	@Override
	public long getAuthorityId() {
		return _tincanStatement.getAuthorityId();
	}

	/**
	* Sets the authority ID of this tincan statement.
	*
	* @param authorityId the authority ID of this tincan statement
	*/
	@Override
	public void setAuthorityId(long authorityId) {
		_tincanStatement.setAuthorityId(authorityId);
	}

	/**
	* Returns the timestamp of this tincan statement.
	*
	* @return the timestamp of this tincan statement
	*/
	@Override
	public java.util.Date getTimestamp() {
		return _tincanStatement.getTimestamp();
	}

	/**
	* Sets the timestamp of this tincan statement.
	*
	* @param timestamp the timestamp of this tincan statement
	*/
	@Override
	public void setTimestamp(java.util.Date timestamp) {
		_tincanStatement.setTimestamp(timestamp);
	}

	/**
	* Returns the stored of this tincan statement.
	*
	* @return the stored of this tincan statement
	*/
	@Override
	public java.util.Date getStored() {
		return _tincanStatement.getStored();
	}

	/**
	* Sets the stored of this tincan statement.
	*
	* @param stored the stored of this tincan statement
	*/
	@Override
	public void setStored(java.util.Date stored) {
		_tincanStatement.setStored(stored);
	}

	/**
	* Returns the version of this tincan statement.
	*
	* @return the version of this tincan statement
	*/
	@Override
	public java.lang.String getVersion() {
		return _tincanStatement.getVersion();
	}

	/**
	* Sets the version of this tincan statement.
	*
	* @param version the version of this tincan statement
	*/
	@Override
	public void setVersion(java.lang.String version) {
		_tincanStatement.setVersion(version);
	}

	/**
	* Returns the verb ID of this tincan statement.
	*
	* @return the verb ID of this tincan statement
	*/
	@Override
	public long getVerbId() {
		return _tincanStatement.getVerbId();
	}

	/**
	* Sets the verb ID of this tincan statement.
	*
	* @param verbId the verb ID of this tincan statement
	*/
	@Override
	public void setVerbId(long verbId) {
		_tincanStatement.setVerbId(verbId);
	}

	/**
	* Returns the voided of this tincan statement.
	*
	* @return the voided of this tincan statement
	*/
	@Override
	public boolean getVoided() {
		return _tincanStatement.getVoided();
	}

	/**
	* Returns <code>true</code> if this tincan statement is voided.
	*
	* @return <code>true</code> if this tincan statement is voided; <code>false</code> otherwise
	*/
	@Override
	public boolean isVoided() {
		return _tincanStatement.isVoided();
	}

	/**
	* Sets whether this tincan statement is voided.
	*
	* @param voided the voided of this tincan statement
	*/
	@Override
	public void setVoided(boolean voided) {
		_tincanStatement.setVoided(voided);
	}

	@Override
	public boolean isNew() {
		return _tincanStatement.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tincanStatement.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tincanStatement.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tincanStatement.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tincanStatement.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tincanStatement.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tincanStatement.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tincanStatement.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tincanStatement.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tincanStatement.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tincanStatement.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TincanStatementWrapper((TincanStatement)_tincanStatement.clone());
	}

	@Override
	public int compareTo(TincanStatement tincanStatement) {
		return _tincanStatement.compareTo(tincanStatement);
	}

	@Override
	public int hashCode() {
		return _tincanStatement.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TincanStatement> toCacheModel() {
		return _tincanStatement.toCacheModel();
	}

	@Override
	public TincanStatement toEscapedModel() {
		return new TincanStatementWrapper(_tincanStatement.toEscapedModel());
	}

	@Override
	public TincanStatement toUnescapedModel() {
		return new TincanStatementWrapper(_tincanStatement.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tincanStatement.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tincanStatement.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tincanStatement.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TincanStatementWrapper)) {
			return false;
		}

		TincanStatementWrapper tincanStatementWrapper = (TincanStatementWrapper)obj;

		if (Validator.equals(_tincanStatement,
					tincanStatementWrapper._tincanStatement)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TincanStatement getWrappedTincanStatement() {
		return _tincanStatement;
	}

	@Override
	public TincanStatement getWrappedModel() {
		return _tincanStatement;
	}

	@Override
	public void resetOriginalValues() {
		_tincanStatement.resetOriginalValues();
	}

	private TincanStatement _tincanStatement;
}
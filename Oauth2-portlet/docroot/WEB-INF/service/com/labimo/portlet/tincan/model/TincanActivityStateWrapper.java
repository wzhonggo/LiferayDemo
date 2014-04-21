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
 * This class is a wrapper for {@link TincanActivityState}.
 * </p>
 *
 * @author wzgong
 * @see TincanActivityState
 * @generated
 */
public class TincanActivityStateWrapper implements TincanActivityState,
	ModelWrapper<TincanActivityState> {
	public TincanActivityStateWrapper(TincanActivityState tincanActivityState) {
		_tincanActivityState = tincanActivityState;
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

	/**
	* Returns the primary key of this tincan activity state.
	*
	* @return the primary key of this tincan activity state
	*/
	@Override
	public long getPrimaryKey() {
		return _tincanActivityState.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tincan activity state.
	*
	* @param primaryKey the primary key of this tincan activity state
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tincanActivityState.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tincan activity state.
	*
	* @return the ID of this tincan activity state
	*/
	@Override
	public long getId() {
		return _tincanActivityState.getId();
	}

	/**
	* Sets the ID of this tincan activity state.
	*
	* @param id the ID of this tincan activity state
	*/
	@Override
	public void setId(long id) {
		_tincanActivityState.setId(id);
	}

	/**
	* Returns the state ID of this tincan activity state.
	*
	* @return the state ID of this tincan activity state
	*/
	@Override
	public java.lang.String getStateId() {
		return _tincanActivityState.getStateId();
	}

	/**
	* Sets the state ID of this tincan activity state.
	*
	* @param stateId the state ID of this tincan activity state
	*/
	@Override
	public void setStateId(java.lang.String stateId) {
		_tincanActivityState.setStateId(stateId);
	}

	/**
	* Returns the state of this tincan activity state.
	*
	* @return the state of this tincan activity state
	*/
	@Override
	public java.lang.String getState() {
		return _tincanActivityState.getState();
	}

	/**
	* Sets the state of this tincan activity state.
	*
	* @param state the state of this tincan activity state
	*/
	@Override
	public void setState(java.lang.String state) {
		_tincanActivityState.setState(state);
	}

	/**
	* Returns the json state of this tincan activity state.
	*
	* @return the json state of this tincan activity state
	*/
	@Override
	public java.lang.String getJsonState() {
		return _tincanActivityState.getJsonState();
	}

	/**
	* Sets the json state of this tincan activity state.
	*
	* @param jsonState the json state of this tincan activity state
	*/
	@Override
	public void setJsonState(java.lang.String jsonState) {
		_tincanActivityState.setJsonState(jsonState);
	}

	/**
	* Returns the agent ID of this tincan activity state.
	*
	* @return the agent ID of this tincan activity state
	*/
	@Override
	public long getAgentId() {
		return _tincanActivityState.getAgentId();
	}

	/**
	* Sets the agent ID of this tincan activity state.
	*
	* @param agentId the agent ID of this tincan activity state
	*/
	@Override
	public void setAgentId(long agentId) {
		_tincanActivityState.setAgentId(agentId);
	}

	/**
	* Returns the activity ID of this tincan activity state.
	*
	* @return the activity ID of this tincan activity state
	*/
	@Override
	public long getActivityId() {
		return _tincanActivityState.getActivityId();
	}

	/**
	* Sets the activity ID of this tincan activity state.
	*
	* @param activityId the activity ID of this tincan activity state
	*/
	@Override
	public void setActivityId(long activityId) {
		_tincanActivityState.setActivityId(activityId);
	}

	/**
	* Returns the registration of this tincan activity state.
	*
	* @return the registration of this tincan activity state
	*/
	@Override
	public java.lang.String getRegistration() {
		return _tincanActivityState.getRegistration();
	}

	/**
	* Sets the registration of this tincan activity state.
	*
	* @param registration the registration of this tincan activity state
	*/
	@Override
	public void setRegistration(java.lang.String registration) {
		_tincanActivityState.setRegistration(registration);
	}

	/**
	* Returns the etag of this tincan activity state.
	*
	* @return the etag of this tincan activity state
	*/
	@Override
	public java.lang.String getEtag() {
		return _tincanActivityState.getEtag();
	}

	/**
	* Sets the etag of this tincan activity state.
	*
	* @param etag the etag of this tincan activity state
	*/
	@Override
	public void setEtag(java.lang.String etag) {
		_tincanActivityState.setEtag(etag);
	}

	/**
	* Returns the updated of this tincan activity state.
	*
	* @return the updated of this tincan activity state
	*/
	@Override
	public java.util.Date getUpdated() {
		return _tincanActivityState.getUpdated();
	}

	/**
	* Sets the updated of this tincan activity state.
	*
	* @param updated the updated of this tincan activity state
	*/
	@Override
	public void setUpdated(java.util.Date updated) {
		_tincanActivityState.setUpdated(updated);
	}

	/**
	* Returns the content type of this tincan activity state.
	*
	* @return the content type of this tincan activity state
	*/
	@Override
	public java.lang.String getContentType() {
		return _tincanActivityState.getContentType();
	}

	/**
	* Sets the content type of this tincan activity state.
	*
	* @param contentType the content type of this tincan activity state
	*/
	@Override
	public void setContentType(java.lang.String contentType) {
		_tincanActivityState.setContentType(contentType);
	}

	@Override
	public boolean isNew() {
		return _tincanActivityState.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tincanActivityState.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tincanActivityState.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tincanActivityState.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tincanActivityState.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tincanActivityState.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tincanActivityState.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tincanActivityState.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tincanActivityState.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tincanActivityState.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tincanActivityState.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TincanActivityStateWrapper((TincanActivityState)_tincanActivityState.clone());
	}

	@Override
	public int compareTo(TincanActivityState tincanActivityState) {
		return _tincanActivityState.compareTo(tincanActivityState);
	}

	@Override
	public int hashCode() {
		return _tincanActivityState.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TincanActivityState> toCacheModel() {
		return _tincanActivityState.toCacheModel();
	}

	@Override
	public TincanActivityState toEscapedModel() {
		return new TincanActivityStateWrapper(_tincanActivityState.toEscapedModel());
	}

	@Override
	public TincanActivityState toUnescapedModel() {
		return new TincanActivityStateWrapper(_tincanActivityState.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tincanActivityState.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tincanActivityState.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tincanActivityState.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TincanActivityStateWrapper)) {
			return false;
		}

		TincanActivityStateWrapper tincanActivityStateWrapper = (TincanActivityStateWrapper)obj;

		if (Validator.equals(_tincanActivityState,
					tincanActivityStateWrapper._tincanActivityState)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TincanActivityState getWrappedTincanActivityState() {
		return _tincanActivityState;
	}

	@Override
	public TincanActivityState getWrappedModel() {
		return _tincanActivityState;
	}

	@Override
	public void resetOriginalValues() {
		_tincanActivityState.resetOriginalValues();
	}

	private TincanActivityState _tincanActivityState;
}
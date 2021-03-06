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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TincanActivityState service. Represents a row in the &quot;labimo_TincanActivityState&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.labimo.portlet.tincan.model.impl.TincanActivityStateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.labimo.portlet.tincan.model.impl.TincanActivityStateImpl}.
 * </p>
 *
 * @author wzgong
 * @see TincanActivityState
 * @see com.labimo.portlet.tincan.model.impl.TincanActivityStateImpl
 * @see com.labimo.portlet.tincan.model.impl.TincanActivityStateModelImpl
 * @generated
 */
public interface TincanActivityStateModel extends BaseModel<TincanActivityState> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tincan activity state model instance should use the {@link TincanActivityState} interface instead.
	 */

	/**
	 * Returns the primary key of this tincan activity state.
	 *
	 * @return the primary key of this tincan activity state
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tincan activity state.
	 *
	 * @param primaryKey the primary key of this tincan activity state
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this tincan activity state.
	 *
	 * @return the ID of this tincan activity state
	 */
	public long getId();

	/**
	 * Sets the ID of this tincan activity state.
	 *
	 * @param id the ID of this tincan activity state
	 */
	public void setId(long id);

	/**
	 * Returns the state ID of this tincan activity state.
	 *
	 * @return the state ID of this tincan activity state
	 */
	@AutoEscape
	public String getStateId();

	/**
	 * Sets the state ID of this tincan activity state.
	 *
	 * @param stateId the state ID of this tincan activity state
	 */
	public void setStateId(String stateId);

	/**
	 * Returns the state of this tincan activity state.
	 *
	 * @return the state of this tincan activity state
	 */
	@AutoEscape
	public String getState();

	/**
	 * Sets the state of this tincan activity state.
	 *
	 * @param state the state of this tincan activity state
	 */
	public void setState(String state);

	/**
	 * Returns the json state of this tincan activity state.
	 *
	 * @return the json state of this tincan activity state
	 */
	@AutoEscape
	public String getJsonState();

	/**
	 * Sets the json state of this tincan activity state.
	 *
	 * @param jsonState the json state of this tincan activity state
	 */
	public void setJsonState(String jsonState);

	/**
	 * Returns the agent ID of this tincan activity state.
	 *
	 * @return the agent ID of this tincan activity state
	 */
	public long getAgentId();

	/**
	 * Sets the agent ID of this tincan activity state.
	 *
	 * @param agentId the agent ID of this tincan activity state
	 */
	public void setAgentId(long agentId);

	/**
	 * Returns the activity ID of this tincan activity state.
	 *
	 * @return the activity ID of this tincan activity state
	 */
	public long getActivityId();

	/**
	 * Sets the activity ID of this tincan activity state.
	 *
	 * @param activityId the activity ID of this tincan activity state
	 */
	public void setActivityId(long activityId);

	/**
	 * Returns the registration of this tincan activity state.
	 *
	 * @return the registration of this tincan activity state
	 */
	@AutoEscape
	public String getRegistration();

	/**
	 * Sets the registration of this tincan activity state.
	 *
	 * @param registration the registration of this tincan activity state
	 */
	public void setRegistration(String registration);

	/**
	 * Returns the etag of this tincan activity state.
	 *
	 * @return the etag of this tincan activity state
	 */
	@AutoEscape
	public String getEtag();

	/**
	 * Sets the etag of this tincan activity state.
	 *
	 * @param etag the etag of this tincan activity state
	 */
	public void setEtag(String etag);

	/**
	 * Returns the updated of this tincan activity state.
	 *
	 * @return the updated of this tincan activity state
	 */
	public Date getUpdated();

	/**
	 * Sets the updated of this tincan activity state.
	 *
	 * @param updated the updated of this tincan activity state
	 */
	public void setUpdated(Date updated);

	/**
	 * Returns the content type of this tincan activity state.
	 *
	 * @return the content type of this tincan activity state
	 */
	@AutoEscape
	public String getContentType();

	/**
	 * Sets the content type of this tincan activity state.
	 *
	 * @param contentType the content type of this tincan activity state
	 */
	public void setContentType(String contentType);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(TincanActivityState tincanActivityState);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TincanActivityState> toCacheModel();

	@Override
	public TincanActivityState toEscapedModel();

	@Override
	public TincanActivityState toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
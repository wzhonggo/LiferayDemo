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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author wzgong
 * @generated
 */
public class TincanActivityStateSoap implements Serializable {
	public static TincanActivityStateSoap toSoapModel(TincanActivityState model) {
		TincanActivityStateSoap soapModel = new TincanActivityStateSoap();

		soapModel.setId(model.getId());
		soapModel.setStateId(model.getStateId());
		soapModel.setState(model.getState());
		soapModel.setJsonState(model.getJsonState());
		soapModel.setAgentId(model.getAgentId());
		soapModel.setActivityId(model.getActivityId());
		soapModel.setRegistration(model.getRegistration());
		soapModel.setEtag(model.getEtag());
		soapModel.setUpdated(model.getUpdated());
		soapModel.setContentType(model.getContentType());

		return soapModel;
	}

	public static TincanActivityStateSoap[] toSoapModels(
		TincanActivityState[] models) {
		TincanActivityStateSoap[] soapModels = new TincanActivityStateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TincanActivityStateSoap[][] toSoapModels(
		TincanActivityState[][] models) {
		TincanActivityStateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TincanActivityStateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TincanActivityStateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TincanActivityStateSoap[] toSoapModels(
		List<TincanActivityState> models) {
		List<TincanActivityStateSoap> soapModels = new ArrayList<TincanActivityStateSoap>(models.size());

		for (TincanActivityState model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TincanActivityStateSoap[soapModels.size()]);
	}

	public TincanActivityStateSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getStateId() {
		return _stateId;
	}

	public void setStateId(String stateId) {
		_stateId = stateId;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getJsonState() {
		return _jsonState;
	}

	public void setJsonState(String jsonState) {
		_jsonState = jsonState;
	}

	public long getAgentId() {
		return _agentId;
	}

	public void setAgentId(long agentId) {
		_agentId = agentId;
	}

	public long getActivityId() {
		return _activityId;
	}

	public void setActivityId(long activityId) {
		_activityId = activityId;
	}

	public String getRegistration() {
		return _registration;
	}

	public void setRegistration(String registration) {
		_registration = registration;
	}

	public String getEtag() {
		return _etag;
	}

	public void setEtag(String etag) {
		_etag = etag;
	}

	public Date getUpdated() {
		return _updated;
	}

	public void setUpdated(Date updated) {
		_updated = updated;
	}

	public String getContentType() {
		return _contentType;
	}

	public void setContentType(String contentType) {
		_contentType = contentType;
	}

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
}
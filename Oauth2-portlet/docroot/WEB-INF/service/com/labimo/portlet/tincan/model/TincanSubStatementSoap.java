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
public class TincanSubStatementSoap implements Serializable {
	public static TincanSubStatementSoap toSoapModel(TincanSubStatement model) {
		TincanSubStatementSoap soapModel = new TincanSubStatementSoap();

		soapModel.setId(model.getId());
		soapModel.setAgentId(model.getAgentId());
		soapModel.setActivityId(model.getActivityId());
		soapModel.setResultId(model.getResultId());
		soapModel.setContextId(model.getContextId());
		soapModel.setVerbId(model.getVerbId());
		soapModel.setTimestamp(model.getTimestamp());

		return soapModel;
	}

	public static TincanSubStatementSoap[] toSoapModels(
		TincanSubStatement[] models) {
		TincanSubStatementSoap[] soapModels = new TincanSubStatementSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TincanSubStatementSoap[][] toSoapModels(
		TincanSubStatement[][] models) {
		TincanSubStatementSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TincanSubStatementSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TincanSubStatementSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TincanSubStatementSoap[] toSoapModels(
		List<TincanSubStatement> models) {
		List<TincanSubStatementSoap> soapModels = new ArrayList<TincanSubStatementSoap>(models.size());

		for (TincanSubStatement model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TincanSubStatementSoap[soapModels.size()]);
	}

	public TincanSubStatementSoap() {
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

	public long getResultId() {
		return _resultId;
	}

	public void setResultId(long resultId) {
		_resultId = resultId;
	}

	public long getContextId() {
		return _contextId;
	}

	public void setContextId(long contextId) {
		_contextId = contextId;
	}

	public long getVerbId() {
		return _verbId;
	}

	public void setVerbId(long verbId) {
		_verbId = verbId;
	}

	public Date getTimestamp() {
		return _timestamp;
	}

	public void setTimestamp(Date timestamp) {
		_timestamp = timestamp;
	}

	private long _id;
	private long _agentId;
	private long _activityId;
	private long _resultId;
	private long _contextId;
	private long _verbId;
	private Date _timestamp;
}
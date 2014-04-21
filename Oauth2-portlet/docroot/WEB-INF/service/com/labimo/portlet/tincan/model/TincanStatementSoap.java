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
public class TincanStatementSoap implements Serializable {
	public static TincanStatementSoap toSoapModel(TincanStatement model) {
		TincanStatementSoap soapModel = new TincanStatementSoap();

		soapModel.setId(model.getId());
		soapModel.setStatementId(model.getStatementId());
		soapModel.setSubStatementId(model.getSubStatementId());
		soapModel.setAgentId(model.getAgentId());
		soapModel.setContextId(model.getContextId());
		soapModel.setActivityId(model.getActivityId());
		soapModel.setResultId(model.getResultId());
		soapModel.setAuthorityId(model.getAuthorityId());
		soapModel.setTimestamp(model.getTimestamp());
		soapModel.setStored(model.getStored());
		soapModel.setVersion(model.getVersion());
		soapModel.setVerbId(model.getVerbId());
		soapModel.setVoided(model.getVoided());

		return soapModel;
	}

	public static TincanStatementSoap[] toSoapModels(TincanStatement[] models) {
		TincanStatementSoap[] soapModels = new TincanStatementSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TincanStatementSoap[][] toSoapModels(
		TincanStatement[][] models) {
		TincanStatementSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TincanStatementSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TincanStatementSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TincanStatementSoap[] toSoapModels(
		List<TincanStatement> models) {
		List<TincanStatementSoap> soapModels = new ArrayList<TincanStatementSoap>(models.size());

		for (TincanStatement model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TincanStatementSoap[soapModels.size()]);
	}

	public TincanStatementSoap() {
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

	public String getStatementId() {
		return _statementId;
	}

	public void setStatementId(String statementId) {
		_statementId = statementId;
	}

	public long getSubStatementId() {
		return _subStatementId;
	}

	public void setSubStatementId(long subStatementId) {
		_subStatementId = subStatementId;
	}

	public long getAgentId() {
		return _agentId;
	}

	public void setAgentId(long agentId) {
		_agentId = agentId;
	}

	public long getContextId() {
		return _contextId;
	}

	public void setContextId(long contextId) {
		_contextId = contextId;
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

	public long getAuthorityId() {
		return _authorityId;
	}

	public void setAuthorityId(long authorityId) {
		_authorityId = authorityId;
	}

	public Date getTimestamp() {
		return _timestamp;
	}

	public void setTimestamp(Date timestamp) {
		_timestamp = timestamp;
	}

	public Date getStored() {
		return _stored;
	}

	public void setStored(Date stored) {
		_stored = stored;
	}

	public String getVersion() {
		return _version;
	}

	public void setVersion(String version) {
		_version = version;
	}

	public long getVerbId() {
		return _verbId;
	}

	public void setVerbId(long verbId) {
		_verbId = verbId;
	}

	public boolean getVoided() {
		return _voided;
	}

	public boolean isVoided() {
		return _voided;
	}

	public void setVoided(boolean voided) {
		_voided = voided;
	}

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
}
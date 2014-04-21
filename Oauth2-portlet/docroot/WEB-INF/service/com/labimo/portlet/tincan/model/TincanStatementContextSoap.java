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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author wzgong
 * @generated
 */
public class TincanStatementContextSoap implements Serializable {
	public static TincanStatementContextSoap toSoapModel(
		TincanStatementContext model) {
		TincanStatementContextSoap soapModel = new TincanStatementContextSoap();

		soapModel.setId(model.getId());
		soapModel.setRegistration(model.getRegistration());
		soapModel.setInstructorId(model.getInstructorId());
		soapModel.setTeamId(model.getTeamId());
		soapModel.setContextActivitiesId(model.getContextActivitiesId());
		soapModel.setRevision(model.getRevision());
		soapModel.setPlatform(model.getPlatform());
		soapModel.setLanguage(model.getLanguage());
		soapModel.setStatement(model.getStatement());
		soapModel.setExtensions(model.getExtensions());

		return soapModel;
	}

	public static TincanStatementContextSoap[] toSoapModels(
		TincanStatementContext[] models) {
		TincanStatementContextSoap[] soapModels = new TincanStatementContextSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TincanStatementContextSoap[][] toSoapModels(
		TincanStatementContext[][] models) {
		TincanStatementContextSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TincanStatementContextSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TincanStatementContextSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TincanStatementContextSoap[] toSoapModels(
		List<TincanStatementContext> models) {
		List<TincanStatementContextSoap> soapModels = new ArrayList<TincanStatementContextSoap>(models.size());

		for (TincanStatementContext model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TincanStatementContextSoap[soapModels.size()]);
	}

	public TincanStatementContextSoap() {
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

	public String getRegistration() {
		return _registration;
	}

	public void setRegistration(String registration) {
		_registration = registration;
	}

	public long getInstructorId() {
		return _instructorId;
	}

	public void setInstructorId(long instructorId) {
		_instructorId = instructorId;
	}

	public long getTeamId() {
		return _teamId;
	}

	public void setTeamId(long teamId) {
		_teamId = teamId;
	}

	public long getContextActivitiesId() {
		return _contextActivitiesId;
	}

	public void setContextActivitiesId(long contextActivitiesId) {
		_contextActivitiesId = contextActivitiesId;
	}

	public String getRevision() {
		return _revision;
	}

	public void setRevision(String revision) {
		_revision = revision;
	}

	public String getPlatform() {
		return _platform;
	}

	public void setPlatform(String platform) {
		_platform = platform;
	}

	public String getLanguage() {
		return _language;
	}

	public void setLanguage(String language) {
		_language = language;
	}

	public String getStatement() {
		return _statement;
	}

	public void setStatement(String statement) {
		_statement = statement;
	}

	public String getExtensions() {
		return _extensions;
	}

	public void setExtensions(String extensions) {
		_extensions = extensions;
	}

	private long _id;
	private String _registration;
	private long _instructorId;
	private long _teamId;
	private long _contextActivitiesId;
	private String _revision;
	private String _platform;
	private String _language;
	private String _statement;
	private String _extensions;
}
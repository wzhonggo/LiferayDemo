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
public class TincanStatementResultSoap implements Serializable {
	public static TincanStatementResultSoap toSoapModel(
		TincanStatementResult model) {
		TincanStatementResultSoap soapModel = new TincanStatementResultSoap();

		soapModel.setId(model.getId());
		soapModel.setSuccess(model.getSuccess());
		soapModel.setCompletion(model.getCompletion());
		soapModel.setResponse(model.getResponse());
		soapModel.setDuration(model.getDuration());
		soapModel.setExtension(model.getExtension());
		soapModel.setScoreScaled(model.getScoreScaled());
		soapModel.setScoreRaw(model.getScoreRaw());
		soapModel.setScoreMin(model.getScoreMin());
		soapModel.setScoreMax(model.getScoreMax());

		return soapModel;
	}

	public static TincanStatementResultSoap[] toSoapModels(
		TincanStatementResult[] models) {
		TincanStatementResultSoap[] soapModels = new TincanStatementResultSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TincanStatementResultSoap[][] toSoapModels(
		TincanStatementResult[][] models) {
		TincanStatementResultSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TincanStatementResultSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TincanStatementResultSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TincanStatementResultSoap[] toSoapModels(
		List<TincanStatementResult> models) {
		List<TincanStatementResultSoap> soapModels = new ArrayList<TincanStatementResultSoap>(models.size());

		for (TincanStatementResult model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TincanStatementResultSoap[soapModels.size()]);
	}

	public TincanStatementResultSoap() {
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

	public boolean getSuccess() {
		return _success;
	}

	public boolean isSuccess() {
		return _success;
	}

	public void setSuccess(boolean success) {
		_success = success;
	}

	public boolean getCompletion() {
		return _completion;
	}

	public boolean isCompletion() {
		return _completion;
	}

	public void setCompletion(boolean completion) {
		_completion = completion;
	}

	public String getResponse() {
		return _response;
	}

	public void setResponse(String response) {
		_response = response;
	}

	public String getDuration() {
		return _duration;
	}

	public void setDuration(String duration) {
		_duration = duration;
	}

	public String getExtension() {
		return _extension;
	}

	public void setExtension(String extension) {
		_extension = extension;
	}

	public double getScoreScaled() {
		return _scoreScaled;
	}

	public void setScoreScaled(double scoreScaled) {
		_scoreScaled = scoreScaled;
	}

	public double getScoreRaw() {
		return _scoreRaw;
	}

	public void setScoreRaw(double scoreRaw) {
		_scoreRaw = scoreRaw;
	}

	public double getScoreMin() {
		return _scoreMin;
	}

	public void setScoreMin(double scoreMin) {
		_scoreMin = scoreMin;
	}

	public double getScoreMax() {
		return _scoreMax;
	}

	public void setScoreMax(double scoreMax) {
		_scoreMax = scoreMax;
	}

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
}
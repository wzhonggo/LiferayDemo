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
public class TincanVerbSoap implements Serializable {
	public static TincanVerbSoap toSoapModel(TincanVerb model) {
		TincanVerbSoap soapModel = new TincanVerbSoap();

		soapModel.setId(model.getId());
		soapModel.setVerbId(model.getVerbId());
		soapModel.setDisplay(model.getDisplay());

		return soapModel;
	}

	public static TincanVerbSoap[] toSoapModels(TincanVerb[] models) {
		TincanVerbSoap[] soapModels = new TincanVerbSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TincanVerbSoap[][] toSoapModels(TincanVerb[][] models) {
		TincanVerbSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TincanVerbSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TincanVerbSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TincanVerbSoap[] toSoapModels(List<TincanVerb> models) {
		List<TincanVerbSoap> soapModels = new ArrayList<TincanVerbSoap>(models.size());

		for (TincanVerb model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TincanVerbSoap[soapModels.size()]);
	}

	public TincanVerbSoap() {
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

	public String getVerbId() {
		return _verbId;
	}

	public void setVerbId(String verbId) {
		_verbId = verbId;
	}

	public String getDisplay() {
		return _display;
	}

	public void setDisplay(String display) {
		_display = display;
	}

	private long _id;
	private String _verbId;
	private String _display;
}
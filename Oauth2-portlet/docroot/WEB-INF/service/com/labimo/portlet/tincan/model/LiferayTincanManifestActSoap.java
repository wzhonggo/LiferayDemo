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
public class LiferayTincanManifestActSoap implements Serializable {
	public static LiferayTincanManifestActSoap toSoapModel(
		LiferayTincanManifestAct model) {
		LiferayTincanManifestActSoap soapModel = new LiferayTincanManifestActSoap();

		soapModel.setId(model.getId());
		soapModel.setActivityId(model.getActivityId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setLaunch(model.getLaunch());

		return soapModel;
	}

	public static LiferayTincanManifestActSoap[] toSoapModels(
		LiferayTincanManifestAct[] models) {
		LiferayTincanManifestActSoap[] soapModels = new LiferayTincanManifestActSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LiferayTincanManifestActSoap[][] toSoapModels(
		LiferayTincanManifestAct[][] models) {
		LiferayTincanManifestActSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LiferayTincanManifestActSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LiferayTincanManifestActSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LiferayTincanManifestActSoap[] toSoapModels(
		List<LiferayTincanManifestAct> models) {
		List<LiferayTincanManifestActSoap> soapModels = new ArrayList<LiferayTincanManifestActSoap>(models.size());

		for (LiferayTincanManifestAct model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LiferayTincanManifestActSoap[soapModels.size()]);
	}

	public LiferayTincanManifestActSoap() {
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

	public String getActivityId() {
		return _activityId;
	}

	public void setActivityId(String activityId) {
		_activityId = activityId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getLaunch() {
		return _launch;
	}

	public void setLaunch(String launch) {
		_launch = launch;
	}

	private long _id;
	private String _activityId;
	private String _name;
	private String _description;
	private String _launch;
}
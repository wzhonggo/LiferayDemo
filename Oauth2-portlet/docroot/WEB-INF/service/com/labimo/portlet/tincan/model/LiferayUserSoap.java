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
public class LiferayUserSoap implements Serializable {
	public static LiferayUserSoap toSoapModel(LiferayUser model) {
		LiferayUserSoap soapModel = new LiferayUserSoap();

		soapModel.setId(model.getId());
		soapModel.setLiferayUserId(model.getLiferayUserId());
		soapModel.setName(model.getName());
		soapModel.setPreferredAudioLevel(model.getPreferredAudioLevel());
		soapModel.setPreferredLanguage(model.getPreferredLanguage());
		soapModel.setPreferredDeliverySpeed(model.getPreferredDeliverySpeed());
		soapModel.setPreferredAudioCaptioning(model.getPreferredAudioCaptioning());

		return soapModel;
	}

	public static LiferayUserSoap[] toSoapModels(LiferayUser[] models) {
		LiferayUserSoap[] soapModels = new LiferayUserSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LiferayUserSoap[][] toSoapModels(LiferayUser[][] models) {
		LiferayUserSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LiferayUserSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LiferayUserSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LiferayUserSoap[] toSoapModels(List<LiferayUser> models) {
		List<LiferayUserSoap> soapModels = new ArrayList<LiferayUserSoap>(models.size());

		for (LiferayUser model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LiferayUserSoap[soapModels.size()]);
	}

	public LiferayUserSoap() {
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

	public long getLiferayUserId() {
		return _liferayUserId;
	}

	public void setLiferayUserId(long liferayUserId) {
		_liferayUserId = liferayUserId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public double getPreferredAudioLevel() {
		return _preferredAudioLevel;
	}

	public void setPreferredAudioLevel(double preferredAudioLevel) {
		_preferredAudioLevel = preferredAudioLevel;
	}

	public String getPreferredLanguage() {
		return _preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		_preferredLanguage = preferredLanguage;
	}

	public double getPreferredDeliverySpeed() {
		return _preferredDeliverySpeed;
	}

	public void setPreferredDeliverySpeed(double preferredDeliverySpeed) {
		_preferredDeliverySpeed = preferredDeliverySpeed;
	}

	public long getPreferredAudioCaptioning() {
		return _preferredAudioCaptioning;
	}

	public void setPreferredAudioCaptioning(long preferredAudioCaptioning) {
		_preferredAudioCaptioning = preferredAudioCaptioning;
	}

	private long _id;
	private long _liferayUserId;
	private String _name;
	private double _preferredAudioLevel;
	private String _preferredLanguage;
	private double _preferredDeliverySpeed;
	private long _preferredAudioCaptioning;
}
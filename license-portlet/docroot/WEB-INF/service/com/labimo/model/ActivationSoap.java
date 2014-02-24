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

package com.labimo.model;

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
public class ActivationSoap implements Serializable {
	public static ActivationSoap toSoapModel(Activation model) {
		ActivationSoap soapModel = new ActivationSoap();

		soapModel.setActivationId(model.getActivationId());
		soapModel.setHardwareUuid(model.getHardwareUuid());
		soapModel.setLicenseUuid(model.getLicenseUuid());
		soapModel.setCreateTime(model.getCreateTime());
		soapModel.setValid(model.getValid());

		return soapModel;
	}

	public static ActivationSoap[] toSoapModels(Activation[] models) {
		ActivationSoap[] soapModels = new ActivationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ActivationSoap[][] toSoapModels(Activation[][] models) {
		ActivationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ActivationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ActivationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ActivationSoap[] toSoapModels(List<Activation> models) {
		List<ActivationSoap> soapModels = new ArrayList<ActivationSoap>(models.size());

		for (Activation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ActivationSoap[soapModels.size()]);
	}

	public ActivationSoap() {
	}

	public String getPrimaryKey() {
		return _activationId;
	}

	public void setPrimaryKey(String pk) {
		setActivationId(pk);
	}

	public String getActivationId() {
		return _activationId;
	}

	public void setActivationId(String activationId) {
		_activationId = activationId;
	}

	public String getHardwareUuid() {
		return _hardwareUuid;
	}

	public void setHardwareUuid(String hardwareUuid) {
		_hardwareUuid = hardwareUuid;
	}

	public String getLicenseUuid() {
		return _licenseUuid;
	}

	public void setLicenseUuid(String licenseUuid) {
		_licenseUuid = licenseUuid;
	}

	public Date getCreateTime() {
		return _createTime;
	}

	public void setCreateTime(Date createTime) {
		_createTime = createTime;
	}

	public boolean getValid() {
		return _valid;
	}

	public boolean isValid() {
		return _valid;
	}

	public void setValid(boolean valid) {
		_valid = valid;
	}

	private String _activationId;
	private String _hardwareUuid;
	private String _licenseUuid;
	private Date _createTime;
	private boolean _valid;
}
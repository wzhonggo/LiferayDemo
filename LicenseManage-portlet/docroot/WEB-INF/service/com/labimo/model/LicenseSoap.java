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

import com.labimo.service.persistence.LicensePK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.labimo.service.http.LicenseServiceSoap}.
 *
 * @author wzgong
 * @see com.labimo.service.http.LicenseServiceSoap
 * @generated
 */
public class LicenseSoap implements Serializable {
	public static LicenseSoap toSoapModel(License model) {
		LicenseSoap soapModel = new LicenseSoap();

		soapModel.setLicenseUuid(model.getLicenseUuid());
		soapModel.setHardwareUuid(model.getHardwareUuid());
		soapModel.setUserId(model.getUserId());
		soapModel.setContent(model.getContent());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static LicenseSoap[] toSoapModels(License[] models) {
		LicenseSoap[] soapModels = new LicenseSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LicenseSoap[][] toSoapModels(License[][] models) {
		LicenseSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LicenseSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LicenseSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LicenseSoap[] toSoapModels(List<License> models) {
		List<LicenseSoap> soapModels = new ArrayList<LicenseSoap>(models.size());

		for (License model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LicenseSoap[soapModels.size()]);
	}

	public LicenseSoap() {
	}

	public LicensePK getPrimaryKey() {
		return new LicensePK(_licenseUuid, _hardwareUuid);
	}

	public void setPrimaryKey(LicensePK pk) {
		setLicenseUuid(pk.licenseUuid);
		setHardwareUuid(pk.hardwareUuid);
	}

	public String getLicenseUuid() {
		return _licenseUuid;
	}

	public void setLicenseUuid(String licenseUuid) {
		_licenseUuid = licenseUuid;
	}

	public String getHardwareUuid() {
		return _hardwareUuid;
	}

	public void setHardwareUuid(String hardwareUuid) {
		_hardwareUuid = hardwareUuid;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private String _licenseUuid;
	private String _hardwareUuid;
	private long _userId;
	private String _content;
	private Date _createDate;
	private Date _modifiedDate;
}
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
public class TincanAttachmentSoap implements Serializable {
	public static TincanAttachmentSoap toSoapModel(TincanAttachment model) {
		TincanAttachmentSoap soapModel = new TincanAttachmentSoap();

		soapModel.setId(model.getId());
		soapModel.setUsageType(model.getUsageType());
		soapModel.setContentType(model.getContentType());
		soapModel.setLength(model.getLength());
		soapModel.setSha2(model.getSha2());
		soapModel.setFileUrl(model.getFileUrl());
		soapModel.setPayload(model.getPayload());
		soapModel.setDisplay(model.getDisplay());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static TincanAttachmentSoap[] toSoapModels(TincanAttachment[] models) {
		TincanAttachmentSoap[] soapModels = new TincanAttachmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TincanAttachmentSoap[][] toSoapModels(
		TincanAttachment[][] models) {
		TincanAttachmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TincanAttachmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TincanAttachmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TincanAttachmentSoap[] toSoapModels(
		List<TincanAttachment> models) {
		List<TincanAttachmentSoap> soapModels = new ArrayList<TincanAttachmentSoap>(models.size());

		for (TincanAttachment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TincanAttachmentSoap[soapModels.size()]);
	}

	public TincanAttachmentSoap() {
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

	public String getUsageType() {
		return _usageType;
	}

	public void setUsageType(String usageType) {
		_usageType = usageType;
	}

	public String getContentType() {
		return _contentType;
	}

	public void setContentType(String contentType) {
		_contentType = contentType;
	}

	public long getLength() {
		return _length;
	}

	public void setLength(long length) {
		_length = length;
	}

	public long getSha2() {
		return _sha2;
	}

	public void setSha2(long sha2) {
		_sha2 = sha2;
	}

	public String getFileUrl() {
		return _fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		_fileUrl = fileUrl;
	}

	public String getPayload() {
		return _payload;
	}

	public void setPayload(String payload) {
		_payload = payload;
	}

	public String getDisplay() {
		return _display;
	}

	public void setDisplay(String display) {
		_display = display;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _id;
	private String _usageType;
	private String _contentType;
	private long _length;
	private long _sha2;
	private String _fileUrl;
	private String _payload;
	private String _display;
	private String _description;
}
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
public class TincanStatementAttachmentSoap implements Serializable {
	public static TincanStatementAttachmentSoap toSoapModel(
		TincanStatementAttachment model) {
		TincanStatementAttachmentSoap soapModel = new TincanStatementAttachmentSoap();

		soapModel.setId(model.getId());
		soapModel.setStatementId(model.getStatementId());
		soapModel.setStatementAttachmentId(model.getStatementAttachmentId());

		return soapModel;
	}

	public static TincanStatementAttachmentSoap[] toSoapModels(
		TincanStatementAttachment[] models) {
		TincanStatementAttachmentSoap[] soapModels = new TincanStatementAttachmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TincanStatementAttachmentSoap[][] toSoapModels(
		TincanStatementAttachment[][] models) {
		TincanStatementAttachmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TincanStatementAttachmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TincanStatementAttachmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TincanStatementAttachmentSoap[] toSoapModels(
		List<TincanStatementAttachment> models) {
		List<TincanStatementAttachmentSoap> soapModels = new ArrayList<TincanStatementAttachmentSoap>(models.size());

		for (TincanStatementAttachment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TincanStatementAttachmentSoap[soapModels.size()]);
	}

	public TincanStatementAttachmentSoap() {
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

	public long getStatementId() {
		return _statementId;
	}

	public void setStatementId(long statementId) {
		_statementId = statementId;
	}

	public long getStatementAttachmentId() {
		return _statementAttachmentId;
	}

	public void setStatementAttachmentId(long statementAttachmentId) {
		_statementAttachmentId = statementAttachmentId;
	}

	private long _id;
	private long _statementId;
	private long _statementAttachmentId;
}
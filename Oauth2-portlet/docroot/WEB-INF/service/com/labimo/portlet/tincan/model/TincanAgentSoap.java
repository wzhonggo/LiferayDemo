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
public class TincanAgentSoap implements Serializable {
	public static TincanAgentSoap toSoapModel(TincanAgent model) {
		TincanAgentSoap soapModel = new TincanAgentSoap();

		soapModel.setId(model.getId());
		soapModel.setObjectType(model.getObjectType());
		soapModel.setName(model.getName());
		soapModel.setMbox(model.getMbox());
		soapModel.setMbox_sha1sum(model.getMbox_sha1sum());
		soapModel.setOpenID(model.getOpenID());
		soapModel.setOauth_identifier(model.getOauth_identifier());
		soapModel.setCanonical_version(model.getCanonical_version());

		return soapModel;
	}

	public static TincanAgentSoap[] toSoapModels(TincanAgent[] models) {
		TincanAgentSoap[] soapModels = new TincanAgentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TincanAgentSoap[][] toSoapModels(TincanAgent[][] models) {
		TincanAgentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TincanAgentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TincanAgentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TincanAgentSoap[] toSoapModels(List<TincanAgent> models) {
		List<TincanAgentSoap> soapModels = new ArrayList<TincanAgentSoap>(models.size());

		for (TincanAgent model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TincanAgentSoap[soapModels.size()]);
	}

	public TincanAgentSoap() {
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

	public String getObjectType() {
		return _objectType;
	}

	public void setObjectType(String objectType) {
		_objectType = objectType;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getMbox() {
		return _mbox;
	}

	public void setMbox(String mbox) {
		_mbox = mbox;
	}

	public String getMbox_sha1sum() {
		return _mbox_sha1sum;
	}

	public void setMbox_sha1sum(String mbox_sha1sum) {
		_mbox_sha1sum = mbox_sha1sum;
	}

	public String getOpenID() {
		return _openID;
	}

	public void setOpenID(String openID) {
		_openID = openID;
	}

	public String getOauth_identifier() {
		return _oauth_identifier;
	}

	public void setOauth_identifier(String oauth_identifier) {
		_oauth_identifier = oauth_identifier;
	}

	public boolean getCanonical_version() {
		return _canonical_version;
	}

	public boolean isCanonical_version() {
		return _canonical_version;
	}

	public void setCanonical_version(boolean canonical_version) {
		_canonical_version = canonical_version;
	}

	private long _id;
	private String _objectType;
	private String _name;
	private String _mbox;
	private String _mbox_sha1sum;
	private String _openID;
	private String _oauth_identifier;
	private boolean _canonical_version;
}
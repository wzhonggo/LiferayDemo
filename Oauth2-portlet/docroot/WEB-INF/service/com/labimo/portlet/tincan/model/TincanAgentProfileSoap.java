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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author wzgong
 * @generated
 */
public class TincanAgentProfileSoap implements Serializable {
	public static TincanAgentProfileSoap toSoapModel(TincanAgentProfile model) {
		TincanAgentProfileSoap soapModel = new TincanAgentProfileSoap();

		soapModel.setId(model.getId());
		soapModel.setProfileId(model.getProfileId());
		soapModel.setUpdated(model.getUpdated());
		soapModel.setAgentId(model.getAgentId());
		soapModel.setProfile(model.getProfile());
		soapModel.setJson_profile(model.getJson_profile());
		soapModel.setContent_type(model.getContent_type());
		soapModel.setEtag(model.getEtag());

		return soapModel;
	}

	public static TincanAgentProfileSoap[] toSoapModels(
		TincanAgentProfile[] models) {
		TincanAgentProfileSoap[] soapModels = new TincanAgentProfileSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TincanAgentProfileSoap[][] toSoapModels(
		TincanAgentProfile[][] models) {
		TincanAgentProfileSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TincanAgentProfileSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TincanAgentProfileSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TincanAgentProfileSoap[] toSoapModels(
		List<TincanAgentProfile> models) {
		List<TincanAgentProfileSoap> soapModels = new ArrayList<TincanAgentProfileSoap>(models.size());

		for (TincanAgentProfile model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TincanAgentProfileSoap[soapModels.size()]);
	}

	public TincanAgentProfileSoap() {
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

	public String getProfileId() {
		return _profileId;
	}

	public void setProfileId(String profileId) {
		_profileId = profileId;
	}

	public Date getUpdated() {
		return _updated;
	}

	public void setUpdated(Date updated) {
		_updated = updated;
	}

	public long getAgentId() {
		return _agentId;
	}

	public void setAgentId(long agentId) {
		_agentId = agentId;
	}

	public String getProfile() {
		return _profile;
	}

	public void setProfile(String profile) {
		_profile = profile;
	}

	public String getJson_profile() {
		return _json_profile;
	}

	public void setJson_profile(String json_profile) {
		_json_profile = json_profile;
	}

	public String getContent_type() {
		return _content_type;
	}

	public void setContent_type(String content_type) {
		_content_type = content_type;
	}

	public String getEtag() {
		return _etag;
	}

	public void setEtag(String etag) {
		_etag = etag;
	}

	private long _id;
	private String _profileId;
	private Date _updated;
	private long _agentId;
	private String _profile;
	private String _json_profile;
	private String _content_type;
	private String _etag;
}
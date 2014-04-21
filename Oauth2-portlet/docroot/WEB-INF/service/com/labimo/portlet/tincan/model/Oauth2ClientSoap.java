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
public class Oauth2ClientSoap implements Serializable {
	public static Oauth2ClientSoap toSoapModel(Oauth2Client model) {
		Oauth2ClientSoap soapModel = new Oauth2ClientSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setSecret(model.getSecret());
		soapModel.setUrl(model.getUrl());
		soapModel.setRedirectUrl(model.getRedirectUrl());
		soapModel.setScope(model.getScope());
		soapModel.setIconUrl(model.getIconUrl());
		soapModel.setLiferayUserId(model.getLiferayUserId());

		return soapModel;
	}

	public static Oauth2ClientSoap[] toSoapModels(Oauth2Client[] models) {
		Oauth2ClientSoap[] soapModels = new Oauth2ClientSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Oauth2ClientSoap[][] toSoapModels(Oauth2Client[][] models) {
		Oauth2ClientSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Oauth2ClientSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Oauth2ClientSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Oauth2ClientSoap[] toSoapModels(List<Oauth2Client> models) {
		List<Oauth2ClientSoap> soapModels = new ArrayList<Oauth2ClientSoap>(models.size());

		for (Oauth2Client model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Oauth2ClientSoap[soapModels.size()]);
	}

	public Oauth2ClientSoap() {
	}

	public String getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(String pk) {
		setId(pk);
	}

	public String getId() {
		return _id;
	}

	public void setId(String id) {
		_id = id;
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

	public String getSecret() {
		return _secret;
	}

	public void setSecret(String secret) {
		_secret = secret;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public String getRedirectUrl() {
		return _redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		_redirectUrl = redirectUrl;
	}

	public String getScope() {
		return _scope;
	}

	public void setScope(String scope) {
		_scope = scope;
	}

	public String getIconUrl() {
		return _iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		_iconUrl = iconUrl;
	}

	public long getLiferayUserId() {
		return _liferayUserId;
	}

	public void setLiferayUserId(long liferayUserId) {
		_liferayUserId = liferayUserId;
	}

	private String _id;
	private String _name;
	private String _description;
	private String _secret;
	private String _url;
	private String _redirectUrl;
	private String _scope;
	private String _iconUrl;
	private long _liferayUserId;
}
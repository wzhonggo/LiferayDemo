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
public class Oauth2TokenSoap implements Serializable {
	public static Oauth2TokenSoap toSoapModel(Oauth2Token model) {
		Oauth2TokenSoap soapModel = new Oauth2TokenSoap();

		soapModel.setId(model.getId());
		soapModel.setCode(model.getCode());
		soapModel.setToken(model.getToken());
		soapModel.setRefreshToken(model.getRefreshToken());
		soapModel.setClientId(model.getClientId());
		soapModel.setExpiredIn(model.getExpiredIn());
		soapModel.setLiferayUserId(model.getLiferayUserId());

		return soapModel;
	}

	public static Oauth2TokenSoap[] toSoapModels(Oauth2Token[] models) {
		Oauth2TokenSoap[] soapModels = new Oauth2TokenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Oauth2TokenSoap[][] toSoapModels(Oauth2Token[][] models) {
		Oauth2TokenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Oauth2TokenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Oauth2TokenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Oauth2TokenSoap[] toSoapModels(List<Oauth2Token> models) {
		List<Oauth2TokenSoap> soapModels = new ArrayList<Oauth2TokenSoap>(models.size());

		for (Oauth2Token model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Oauth2TokenSoap[soapModels.size()]);
	}

	public Oauth2TokenSoap() {
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

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getToken() {
		return _token;
	}

	public void setToken(String token) {
		_token = token;
	}

	public String getRefreshToken() {
		return _refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		_refreshToken = refreshToken;
	}

	public long getClientId() {
		return _clientId;
	}

	public void setClientId(long clientId) {
		_clientId = clientId;
	}

	public long getExpiredIn() {
		return _expiredIn;
	}

	public void setExpiredIn(long expiredIn) {
		_expiredIn = expiredIn;
	}

	public long getLiferayUserId() {
		return _liferayUserId;
	}

	public void setLiferayUserId(long liferayUserId) {
		_liferayUserId = liferayUserId;
	}

	private long _id;
	private String _code;
	private String _token;
	private String _refreshToken;
	private long _clientId;
	private long _expiredIn;
	private long _liferayUserId;
}
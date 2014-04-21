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
public class Oauth2EndpointSoap implements Serializable {
	public static Oauth2EndpointSoap toSoapModel(Oauth2Endpoint model) {
		Oauth2EndpointSoap soapModel = new Oauth2EndpointSoap();

		soapModel.setId(model.getId());
		soapModel.setLiferayUserId(model.getLiferayUserId());
		soapModel.setOauthType(model.getOauthType());
		soapModel.setIsPublic(model.getIsPublic());
		soapModel.setGuestAccess(model.getGuestAccess());

		return soapModel;
	}

	public static Oauth2EndpointSoap[] toSoapModels(Oauth2Endpoint[] models) {
		Oauth2EndpointSoap[] soapModels = new Oauth2EndpointSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Oauth2EndpointSoap[][] toSoapModels(Oauth2Endpoint[][] models) {
		Oauth2EndpointSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Oauth2EndpointSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Oauth2EndpointSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Oauth2EndpointSoap[] toSoapModels(List<Oauth2Endpoint> models) {
		List<Oauth2EndpointSoap> soapModels = new ArrayList<Oauth2EndpointSoap>(models.size());

		for (Oauth2Endpoint model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Oauth2EndpointSoap[soapModels.size()]);
	}

	public Oauth2EndpointSoap() {
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

	public String getOauthType() {
		return _oauthType;
	}

	public void setOauthType(String oauthType) {
		_oauthType = oauthType;
	}

	public boolean getIsPublic() {
		return _isPublic;
	}

	public boolean isIsPublic() {
		return _isPublic;
	}

	public void setIsPublic(boolean isPublic) {
		_isPublic = isPublic;
	}

	public boolean getGuestAccess() {
		return _guestAccess;
	}

	public boolean isGuestAccess() {
		return _guestAccess;
	}

	public void setGuestAccess(boolean guestAccess) {
		_guestAccess = guestAccess;
	}

	private long _id;
	private long _liferayUserId;
	private String _oauthType;
	private boolean _isPublic;
	private boolean _guestAccess;
}
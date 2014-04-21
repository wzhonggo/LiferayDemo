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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Oauth2Token}.
 * </p>
 *
 * @author wzgong
 * @see Oauth2Token
 * @generated
 */
public class Oauth2TokenWrapper implements Oauth2Token,
	ModelWrapper<Oauth2Token> {
	public Oauth2TokenWrapper(Oauth2Token oauth2Token) {
		_oauth2Token = oauth2Token;
	}

	@Override
	public Class<?> getModelClass() {
		return Oauth2Token.class;
	}

	@Override
	public String getModelClassName() {
		return Oauth2Token.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("code", getCode());
		attributes.put("token", getToken());
		attributes.put("refreshToken", getRefreshToken());
		attributes.put("clientId", getClientId());
		attributes.put("expiredIn", getExpiredIn());
		attributes.put("liferayUserId", getLiferayUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String token = (String)attributes.get("token");

		if (token != null) {
			setToken(token);
		}

		String refreshToken = (String)attributes.get("refreshToken");

		if (refreshToken != null) {
			setRefreshToken(refreshToken);
		}

		Long clientId = (Long)attributes.get("clientId");

		if (clientId != null) {
			setClientId(clientId);
		}

		Long expiredIn = (Long)attributes.get("expiredIn");

		if (expiredIn != null) {
			setExpiredIn(expiredIn);
		}

		Long liferayUserId = (Long)attributes.get("liferayUserId");

		if (liferayUserId != null) {
			setLiferayUserId(liferayUserId);
		}
	}

	/**
	* Returns the primary key of this oauth2 token.
	*
	* @return the primary key of this oauth2 token
	*/
	@Override
	public long getPrimaryKey() {
		return _oauth2Token.getPrimaryKey();
	}

	/**
	* Sets the primary key of this oauth2 token.
	*
	* @param primaryKey the primary key of this oauth2 token
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_oauth2Token.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this oauth2 token.
	*
	* @return the ID of this oauth2 token
	*/
	@Override
	public long getId() {
		return _oauth2Token.getId();
	}

	/**
	* Sets the ID of this oauth2 token.
	*
	* @param id the ID of this oauth2 token
	*/
	@Override
	public void setId(long id) {
		_oauth2Token.setId(id);
	}

	/**
	* Returns the code of this oauth2 token.
	*
	* @return the code of this oauth2 token
	*/
	@Override
	public java.lang.String getCode() {
		return _oauth2Token.getCode();
	}

	/**
	* Sets the code of this oauth2 token.
	*
	* @param code the code of this oauth2 token
	*/
	@Override
	public void setCode(java.lang.String code) {
		_oauth2Token.setCode(code);
	}

	/**
	* Returns the token of this oauth2 token.
	*
	* @return the token of this oauth2 token
	*/
	@Override
	public java.lang.String getToken() {
		return _oauth2Token.getToken();
	}

	/**
	* Sets the token of this oauth2 token.
	*
	* @param token the token of this oauth2 token
	*/
	@Override
	public void setToken(java.lang.String token) {
		_oauth2Token.setToken(token);
	}

	/**
	* Returns the refresh token of this oauth2 token.
	*
	* @return the refresh token of this oauth2 token
	*/
	@Override
	public java.lang.String getRefreshToken() {
		return _oauth2Token.getRefreshToken();
	}

	/**
	* Sets the refresh token of this oauth2 token.
	*
	* @param refreshToken the refresh token of this oauth2 token
	*/
	@Override
	public void setRefreshToken(java.lang.String refreshToken) {
		_oauth2Token.setRefreshToken(refreshToken);
	}

	/**
	* Returns the client ID of this oauth2 token.
	*
	* @return the client ID of this oauth2 token
	*/
	@Override
	public long getClientId() {
		return _oauth2Token.getClientId();
	}

	/**
	* Sets the client ID of this oauth2 token.
	*
	* @param clientId the client ID of this oauth2 token
	*/
	@Override
	public void setClientId(long clientId) {
		_oauth2Token.setClientId(clientId);
	}

	/**
	* Returns the expired in of this oauth2 token.
	*
	* @return the expired in of this oauth2 token
	*/
	@Override
	public long getExpiredIn() {
		return _oauth2Token.getExpiredIn();
	}

	/**
	* Sets the expired in of this oauth2 token.
	*
	* @param expiredIn the expired in of this oauth2 token
	*/
	@Override
	public void setExpiredIn(long expiredIn) {
		_oauth2Token.setExpiredIn(expiredIn);
	}

	/**
	* Returns the liferay user ID of this oauth2 token.
	*
	* @return the liferay user ID of this oauth2 token
	*/
	@Override
	public long getLiferayUserId() {
		return _oauth2Token.getLiferayUserId();
	}

	/**
	* Sets the liferay user ID of this oauth2 token.
	*
	* @param liferayUserId the liferay user ID of this oauth2 token
	*/
	@Override
	public void setLiferayUserId(long liferayUserId) {
		_oauth2Token.setLiferayUserId(liferayUserId);
	}

	/**
	* Returns the liferay user uuid of this oauth2 token.
	*
	* @return the liferay user uuid of this oauth2 token
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getLiferayUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2Token.getLiferayUserUuid();
	}

	/**
	* Sets the liferay user uuid of this oauth2 token.
	*
	* @param liferayUserUuid the liferay user uuid of this oauth2 token
	*/
	@Override
	public void setLiferayUserUuid(java.lang.String liferayUserUuid) {
		_oauth2Token.setLiferayUserUuid(liferayUserUuid);
	}

	@Override
	public boolean isNew() {
		return _oauth2Token.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_oauth2Token.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _oauth2Token.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oauth2Token.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _oauth2Token.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _oauth2Token.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_oauth2Token.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _oauth2Token.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_oauth2Token.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_oauth2Token.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oauth2Token.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Oauth2TokenWrapper((Oauth2Token)_oauth2Token.clone());
	}

	@Override
	public int compareTo(Oauth2Token oauth2Token) {
		return _oauth2Token.compareTo(oauth2Token);
	}

	@Override
	public int hashCode() {
		return _oauth2Token.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Oauth2Token> toCacheModel() {
		return _oauth2Token.toCacheModel();
	}

	@Override
	public Oauth2Token toEscapedModel() {
		return new Oauth2TokenWrapper(_oauth2Token.toEscapedModel());
	}

	@Override
	public Oauth2Token toUnescapedModel() {
		return new Oauth2TokenWrapper(_oauth2Token.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _oauth2Token.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oauth2Token.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_oauth2Token.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Oauth2TokenWrapper)) {
			return false;
		}

		Oauth2TokenWrapper oauth2TokenWrapper = (Oauth2TokenWrapper)obj;

		if (Validator.equals(_oauth2Token, oauth2TokenWrapper._oauth2Token)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Oauth2Token getWrappedOauth2Token() {
		return _oauth2Token;
	}

	@Override
	public Oauth2Token getWrappedModel() {
		return _oauth2Token;
	}

	@Override
	public void resetOriginalValues() {
		_oauth2Token.resetOriginalValues();
	}

	private Oauth2Token _oauth2Token;
}
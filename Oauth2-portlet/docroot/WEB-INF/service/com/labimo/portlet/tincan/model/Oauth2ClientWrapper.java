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
 * This class is a wrapper for {@link Oauth2Client}.
 * </p>
 *
 * @author wzgong
 * @see Oauth2Client
 * @generated
 */
public class Oauth2ClientWrapper implements Oauth2Client,
	ModelWrapper<Oauth2Client> {
	public Oauth2ClientWrapper(Oauth2Client oauth2Client) {
		_oauth2Client = oauth2Client;
	}

	@Override
	public Class<?> getModelClass() {
		return Oauth2Client.class;
	}

	@Override
	public String getModelClassName() {
		return Oauth2Client.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("secret", getSecret());
		attributes.put("url", getUrl());
		attributes.put("redirectUrl", getRedirectUrl());
		attributes.put("scope", getScope());
		attributes.put("iconUrl", getIconUrl());
		attributes.put("liferayUserId", getLiferayUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String id = (String)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String secret = (String)attributes.get("secret");

		if (secret != null) {
			setSecret(secret);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String redirectUrl = (String)attributes.get("redirectUrl");

		if (redirectUrl != null) {
			setRedirectUrl(redirectUrl);
		}

		String scope = (String)attributes.get("scope");

		if (scope != null) {
			setScope(scope);
		}

		String iconUrl = (String)attributes.get("iconUrl");

		if (iconUrl != null) {
			setIconUrl(iconUrl);
		}

		Long liferayUserId = (Long)attributes.get("liferayUserId");

		if (liferayUserId != null) {
			setLiferayUserId(liferayUserId);
		}
	}

	/**
	* Returns the primary key of this oauth2 client.
	*
	* @return the primary key of this oauth2 client
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _oauth2Client.getPrimaryKey();
	}

	/**
	* Sets the primary key of this oauth2 client.
	*
	* @param primaryKey the primary key of this oauth2 client
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_oauth2Client.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this oauth2 client.
	*
	* @return the ID of this oauth2 client
	*/
	@Override
	public java.lang.String getId() {
		return _oauth2Client.getId();
	}

	/**
	* Sets the ID of this oauth2 client.
	*
	* @param id the ID of this oauth2 client
	*/
	@Override
	public void setId(java.lang.String id) {
		_oauth2Client.setId(id);
	}

	/**
	* Returns the name of this oauth2 client.
	*
	* @return the name of this oauth2 client
	*/
	@Override
	public java.lang.String getName() {
		return _oauth2Client.getName();
	}

	/**
	* Sets the name of this oauth2 client.
	*
	* @param name the name of this oauth2 client
	*/
	@Override
	public void setName(java.lang.String name) {
		_oauth2Client.setName(name);
	}

	/**
	* Returns the description of this oauth2 client.
	*
	* @return the description of this oauth2 client
	*/
	@Override
	public java.lang.String getDescription() {
		return _oauth2Client.getDescription();
	}

	/**
	* Sets the description of this oauth2 client.
	*
	* @param description the description of this oauth2 client
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_oauth2Client.setDescription(description);
	}

	/**
	* Returns the secret of this oauth2 client.
	*
	* @return the secret of this oauth2 client
	*/
	@Override
	public java.lang.String getSecret() {
		return _oauth2Client.getSecret();
	}

	/**
	* Sets the secret of this oauth2 client.
	*
	* @param secret the secret of this oauth2 client
	*/
	@Override
	public void setSecret(java.lang.String secret) {
		_oauth2Client.setSecret(secret);
	}

	/**
	* Returns the url of this oauth2 client.
	*
	* @return the url of this oauth2 client
	*/
	@Override
	public java.lang.String getUrl() {
		return _oauth2Client.getUrl();
	}

	/**
	* Sets the url of this oauth2 client.
	*
	* @param url the url of this oauth2 client
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_oauth2Client.setUrl(url);
	}

	/**
	* Returns the redirect url of this oauth2 client.
	*
	* @return the redirect url of this oauth2 client
	*/
	@Override
	public java.lang.String getRedirectUrl() {
		return _oauth2Client.getRedirectUrl();
	}

	/**
	* Sets the redirect url of this oauth2 client.
	*
	* @param redirectUrl the redirect url of this oauth2 client
	*/
	@Override
	public void setRedirectUrl(java.lang.String redirectUrl) {
		_oauth2Client.setRedirectUrl(redirectUrl);
	}

	/**
	* Returns the scope of this oauth2 client.
	*
	* @return the scope of this oauth2 client
	*/
	@Override
	public java.lang.String getScope() {
		return _oauth2Client.getScope();
	}

	/**
	* Sets the scope of this oauth2 client.
	*
	* @param scope the scope of this oauth2 client
	*/
	@Override
	public void setScope(java.lang.String scope) {
		_oauth2Client.setScope(scope);
	}

	/**
	* Returns the icon url of this oauth2 client.
	*
	* @return the icon url of this oauth2 client
	*/
	@Override
	public java.lang.String getIconUrl() {
		return _oauth2Client.getIconUrl();
	}

	/**
	* Sets the icon url of this oauth2 client.
	*
	* @param iconUrl the icon url of this oauth2 client
	*/
	@Override
	public void setIconUrl(java.lang.String iconUrl) {
		_oauth2Client.setIconUrl(iconUrl);
	}

	/**
	* Returns the liferay user ID of this oauth2 client.
	*
	* @return the liferay user ID of this oauth2 client
	*/
	@Override
	public long getLiferayUserId() {
		return _oauth2Client.getLiferayUserId();
	}

	/**
	* Sets the liferay user ID of this oauth2 client.
	*
	* @param liferayUserId the liferay user ID of this oauth2 client
	*/
	@Override
	public void setLiferayUserId(long liferayUserId) {
		_oauth2Client.setLiferayUserId(liferayUserId);
	}

	/**
	* Returns the liferay user uuid of this oauth2 client.
	*
	* @return the liferay user uuid of this oauth2 client
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getLiferayUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2Client.getLiferayUserUuid();
	}

	/**
	* Sets the liferay user uuid of this oauth2 client.
	*
	* @param liferayUserUuid the liferay user uuid of this oauth2 client
	*/
	@Override
	public void setLiferayUserUuid(java.lang.String liferayUserUuid) {
		_oauth2Client.setLiferayUserUuid(liferayUserUuid);
	}

	@Override
	public boolean isNew() {
		return _oauth2Client.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_oauth2Client.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _oauth2Client.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oauth2Client.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _oauth2Client.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _oauth2Client.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_oauth2Client.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _oauth2Client.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_oauth2Client.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_oauth2Client.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oauth2Client.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Oauth2ClientWrapper((Oauth2Client)_oauth2Client.clone());
	}

	@Override
	public int compareTo(Oauth2Client oauth2Client) {
		return _oauth2Client.compareTo(oauth2Client);
	}

	@Override
	public int hashCode() {
		return _oauth2Client.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Oauth2Client> toCacheModel() {
		return _oauth2Client.toCacheModel();
	}

	@Override
	public Oauth2Client toEscapedModel() {
		return new Oauth2ClientWrapper(_oauth2Client.toEscapedModel());
	}

	@Override
	public Oauth2Client toUnescapedModel() {
		return new Oauth2ClientWrapper(_oauth2Client.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _oauth2Client.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oauth2Client.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_oauth2Client.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Oauth2ClientWrapper)) {
			return false;
		}

		Oauth2ClientWrapper oauth2ClientWrapper = (Oauth2ClientWrapper)obj;

		if (Validator.equals(_oauth2Client, oauth2ClientWrapper._oauth2Client)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Oauth2Client getWrappedOauth2Client() {
		return _oauth2Client;
	}

	@Override
	public Oauth2Client getWrappedModel() {
		return _oauth2Client;
	}

	@Override
	public void resetOriginalValues() {
		_oauth2Client.resetOriginalValues();
	}

	private Oauth2Client _oauth2Client;
}
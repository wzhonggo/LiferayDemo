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
 * This class is a wrapper for {@link Oauth2Endpoint}.
 * </p>
 *
 * @author wzgong
 * @see Oauth2Endpoint
 * @generated
 */
public class Oauth2EndpointWrapper implements Oauth2Endpoint,
	ModelWrapper<Oauth2Endpoint> {
	public Oauth2EndpointWrapper(Oauth2Endpoint oauth2Endpoint) {
		_oauth2Endpoint = oauth2Endpoint;
	}

	@Override
	public Class<?> getModelClass() {
		return Oauth2Endpoint.class;
	}

	@Override
	public String getModelClassName() {
		return Oauth2Endpoint.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("liferayUserId", getLiferayUserId());
		attributes.put("oauthType", getOauthType());
		attributes.put("isPublic", getIsPublic());
		attributes.put("guestAccess", getGuestAccess());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long liferayUserId = (Long)attributes.get("liferayUserId");

		if (liferayUserId != null) {
			setLiferayUserId(liferayUserId);
		}

		String oauthType = (String)attributes.get("oauthType");

		if (oauthType != null) {
			setOauthType(oauthType);
		}

		Boolean isPublic = (Boolean)attributes.get("isPublic");

		if (isPublic != null) {
			setIsPublic(isPublic);
		}

		Boolean guestAccess = (Boolean)attributes.get("guestAccess");

		if (guestAccess != null) {
			setGuestAccess(guestAccess);
		}
	}

	/**
	* Returns the primary key of this oauth2 endpoint.
	*
	* @return the primary key of this oauth2 endpoint
	*/
	@Override
	public long getPrimaryKey() {
		return _oauth2Endpoint.getPrimaryKey();
	}

	/**
	* Sets the primary key of this oauth2 endpoint.
	*
	* @param primaryKey the primary key of this oauth2 endpoint
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_oauth2Endpoint.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this oauth2 endpoint.
	*
	* @return the ID of this oauth2 endpoint
	*/
	@Override
	public long getId() {
		return _oauth2Endpoint.getId();
	}

	/**
	* Sets the ID of this oauth2 endpoint.
	*
	* @param id the ID of this oauth2 endpoint
	*/
	@Override
	public void setId(long id) {
		_oauth2Endpoint.setId(id);
	}

	/**
	* Returns the liferay user ID of this oauth2 endpoint.
	*
	* @return the liferay user ID of this oauth2 endpoint
	*/
	@Override
	public long getLiferayUserId() {
		return _oauth2Endpoint.getLiferayUserId();
	}

	/**
	* Sets the liferay user ID of this oauth2 endpoint.
	*
	* @param liferayUserId the liferay user ID of this oauth2 endpoint
	*/
	@Override
	public void setLiferayUserId(long liferayUserId) {
		_oauth2Endpoint.setLiferayUserId(liferayUserId);
	}

	/**
	* Returns the liferay user uuid of this oauth2 endpoint.
	*
	* @return the liferay user uuid of this oauth2 endpoint
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getLiferayUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2Endpoint.getLiferayUserUuid();
	}

	/**
	* Sets the liferay user uuid of this oauth2 endpoint.
	*
	* @param liferayUserUuid the liferay user uuid of this oauth2 endpoint
	*/
	@Override
	public void setLiferayUserUuid(java.lang.String liferayUserUuid) {
		_oauth2Endpoint.setLiferayUserUuid(liferayUserUuid);
	}

	/**
	* Returns the oauth type of this oauth2 endpoint.
	*
	* @return the oauth type of this oauth2 endpoint
	*/
	@Override
	public java.lang.String getOauthType() {
		return _oauth2Endpoint.getOauthType();
	}

	/**
	* Sets the oauth type of this oauth2 endpoint.
	*
	* @param oauthType the oauth type of this oauth2 endpoint
	*/
	@Override
	public void setOauthType(java.lang.String oauthType) {
		_oauth2Endpoint.setOauthType(oauthType);
	}

	/**
	* Returns the is public of this oauth2 endpoint.
	*
	* @return the is public of this oauth2 endpoint
	*/
	@Override
	public boolean getIsPublic() {
		return _oauth2Endpoint.getIsPublic();
	}

	/**
	* Returns <code>true</code> if this oauth2 endpoint is is public.
	*
	* @return <code>true</code> if this oauth2 endpoint is is public; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsPublic() {
		return _oauth2Endpoint.isIsPublic();
	}

	/**
	* Sets whether this oauth2 endpoint is is public.
	*
	* @param isPublic the is public of this oauth2 endpoint
	*/
	@Override
	public void setIsPublic(boolean isPublic) {
		_oauth2Endpoint.setIsPublic(isPublic);
	}

	/**
	* Returns the guest access of this oauth2 endpoint.
	*
	* @return the guest access of this oauth2 endpoint
	*/
	@Override
	public boolean getGuestAccess() {
		return _oauth2Endpoint.getGuestAccess();
	}

	/**
	* Returns <code>true</code> if this oauth2 endpoint is guest access.
	*
	* @return <code>true</code> if this oauth2 endpoint is guest access; <code>false</code> otherwise
	*/
	@Override
	public boolean isGuestAccess() {
		return _oauth2Endpoint.isGuestAccess();
	}

	/**
	* Sets whether this oauth2 endpoint is guest access.
	*
	* @param guestAccess the guest access of this oauth2 endpoint
	*/
	@Override
	public void setGuestAccess(boolean guestAccess) {
		_oauth2Endpoint.setGuestAccess(guestAccess);
	}

	@Override
	public boolean isNew() {
		return _oauth2Endpoint.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_oauth2Endpoint.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _oauth2Endpoint.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oauth2Endpoint.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _oauth2Endpoint.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _oauth2Endpoint.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_oauth2Endpoint.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _oauth2Endpoint.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_oauth2Endpoint.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_oauth2Endpoint.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oauth2Endpoint.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Oauth2EndpointWrapper((Oauth2Endpoint)_oauth2Endpoint.clone());
	}

	@Override
	public int compareTo(Oauth2Endpoint oauth2Endpoint) {
		return _oauth2Endpoint.compareTo(oauth2Endpoint);
	}

	@Override
	public int hashCode() {
		return _oauth2Endpoint.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Oauth2Endpoint> toCacheModel() {
		return _oauth2Endpoint.toCacheModel();
	}

	@Override
	public Oauth2Endpoint toEscapedModel() {
		return new Oauth2EndpointWrapper(_oauth2Endpoint.toEscapedModel());
	}

	@Override
	public Oauth2Endpoint toUnescapedModel() {
		return new Oauth2EndpointWrapper(_oauth2Endpoint.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _oauth2Endpoint.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oauth2Endpoint.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_oauth2Endpoint.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Oauth2EndpointWrapper)) {
			return false;
		}

		Oauth2EndpointWrapper oauth2EndpointWrapper = (Oauth2EndpointWrapper)obj;

		if (Validator.equals(_oauth2Endpoint,
					oauth2EndpointWrapper._oauth2Endpoint)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Oauth2Endpoint getWrappedOauth2Endpoint() {
		return _oauth2Endpoint;
	}

	@Override
	public Oauth2Endpoint getWrappedModel() {
		return _oauth2Endpoint;
	}

	@Override
	public void resetOriginalValues() {
		_oauth2Endpoint.resetOriginalValues();
	}

	private Oauth2Endpoint _oauth2Endpoint;
}
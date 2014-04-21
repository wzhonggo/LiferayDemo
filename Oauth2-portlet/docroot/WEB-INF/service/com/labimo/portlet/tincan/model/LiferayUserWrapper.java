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
 * This class is a wrapper for {@link LiferayUser}.
 * </p>
 *
 * @author wzgong
 * @see LiferayUser
 * @generated
 */
public class LiferayUserWrapper implements LiferayUser,
	ModelWrapper<LiferayUser> {
	public LiferayUserWrapper(LiferayUser liferayUser) {
		_liferayUser = liferayUser;
	}

	@Override
	public Class<?> getModelClass() {
		return LiferayUser.class;
	}

	@Override
	public String getModelClassName() {
		return LiferayUser.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("liferayUserId", getLiferayUserId());
		attributes.put("name", getName());
		attributes.put("preferredAudioLevel", getPreferredAudioLevel());
		attributes.put("preferredLanguage", getPreferredLanguage());
		attributes.put("preferredDeliverySpeed", getPreferredDeliverySpeed());
		attributes.put("preferredAudioCaptioning", getPreferredAudioCaptioning());

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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Double preferredAudioLevel = (Double)attributes.get(
				"preferredAudioLevel");

		if (preferredAudioLevel != null) {
			setPreferredAudioLevel(preferredAudioLevel);
		}

		String preferredLanguage = (String)attributes.get("preferredLanguage");

		if (preferredLanguage != null) {
			setPreferredLanguage(preferredLanguage);
		}

		Double preferredDeliverySpeed = (Double)attributes.get(
				"preferredDeliverySpeed");

		if (preferredDeliverySpeed != null) {
			setPreferredDeliverySpeed(preferredDeliverySpeed);
		}

		Long preferredAudioCaptioning = (Long)attributes.get(
				"preferredAudioCaptioning");

		if (preferredAudioCaptioning != null) {
			setPreferredAudioCaptioning(preferredAudioCaptioning);
		}
	}

	/**
	* Returns the primary key of this liferay user.
	*
	* @return the primary key of this liferay user
	*/
	@Override
	public long getPrimaryKey() {
		return _liferayUser.getPrimaryKey();
	}

	/**
	* Sets the primary key of this liferay user.
	*
	* @param primaryKey the primary key of this liferay user
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_liferayUser.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this liferay user.
	*
	* @return the ID of this liferay user
	*/
	@Override
	public long getId() {
		return _liferayUser.getId();
	}

	/**
	* Sets the ID of this liferay user.
	*
	* @param id the ID of this liferay user
	*/
	@Override
	public void setId(long id) {
		_liferayUser.setId(id);
	}

	/**
	* Returns the liferay user ID of this liferay user.
	*
	* @return the liferay user ID of this liferay user
	*/
	@Override
	public long getLiferayUserId() {
		return _liferayUser.getLiferayUserId();
	}

	/**
	* Sets the liferay user ID of this liferay user.
	*
	* @param liferayUserId the liferay user ID of this liferay user
	*/
	@Override
	public void setLiferayUserId(long liferayUserId) {
		_liferayUser.setLiferayUserId(liferayUserId);
	}

	/**
	* Returns the liferay user uuid of this liferay user.
	*
	* @return the liferay user uuid of this liferay user
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getLiferayUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _liferayUser.getLiferayUserUuid();
	}

	/**
	* Sets the liferay user uuid of this liferay user.
	*
	* @param liferayUserUuid the liferay user uuid of this liferay user
	*/
	@Override
	public void setLiferayUserUuid(java.lang.String liferayUserUuid) {
		_liferayUser.setLiferayUserUuid(liferayUserUuid);
	}

	/**
	* Returns the name of this liferay user.
	*
	* @return the name of this liferay user
	*/
	@Override
	public java.lang.String getName() {
		return _liferayUser.getName();
	}

	/**
	* Sets the name of this liferay user.
	*
	* @param name the name of this liferay user
	*/
	@Override
	public void setName(java.lang.String name) {
		_liferayUser.setName(name);
	}

	/**
	* Returns the preferred audio level of this liferay user.
	*
	* @return the preferred audio level of this liferay user
	*/
	@Override
	public double getPreferredAudioLevel() {
		return _liferayUser.getPreferredAudioLevel();
	}

	/**
	* Sets the preferred audio level of this liferay user.
	*
	* @param preferredAudioLevel the preferred audio level of this liferay user
	*/
	@Override
	public void setPreferredAudioLevel(double preferredAudioLevel) {
		_liferayUser.setPreferredAudioLevel(preferredAudioLevel);
	}

	/**
	* Returns the preferred language of this liferay user.
	*
	* @return the preferred language of this liferay user
	*/
	@Override
	public java.lang.String getPreferredLanguage() {
		return _liferayUser.getPreferredLanguage();
	}

	/**
	* Sets the preferred language of this liferay user.
	*
	* @param preferredLanguage the preferred language of this liferay user
	*/
	@Override
	public void setPreferredLanguage(java.lang.String preferredLanguage) {
		_liferayUser.setPreferredLanguage(preferredLanguage);
	}

	/**
	* Returns the preferred delivery speed of this liferay user.
	*
	* @return the preferred delivery speed of this liferay user
	*/
	@Override
	public double getPreferredDeliverySpeed() {
		return _liferayUser.getPreferredDeliverySpeed();
	}

	/**
	* Sets the preferred delivery speed of this liferay user.
	*
	* @param preferredDeliverySpeed the preferred delivery speed of this liferay user
	*/
	@Override
	public void setPreferredDeliverySpeed(double preferredDeliverySpeed) {
		_liferayUser.setPreferredDeliverySpeed(preferredDeliverySpeed);
	}

	/**
	* Returns the preferred audio captioning of this liferay user.
	*
	* @return the preferred audio captioning of this liferay user
	*/
	@Override
	public long getPreferredAudioCaptioning() {
		return _liferayUser.getPreferredAudioCaptioning();
	}

	/**
	* Sets the preferred audio captioning of this liferay user.
	*
	* @param preferredAudioCaptioning the preferred audio captioning of this liferay user
	*/
	@Override
	public void setPreferredAudioCaptioning(long preferredAudioCaptioning) {
		_liferayUser.setPreferredAudioCaptioning(preferredAudioCaptioning);
	}

	@Override
	public boolean isNew() {
		return _liferayUser.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_liferayUser.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _liferayUser.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_liferayUser.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _liferayUser.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _liferayUser.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_liferayUser.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _liferayUser.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_liferayUser.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_liferayUser.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_liferayUser.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LiferayUserWrapper((LiferayUser)_liferayUser.clone());
	}

	@Override
	public int compareTo(LiferayUser liferayUser) {
		return _liferayUser.compareTo(liferayUser);
	}

	@Override
	public int hashCode() {
		return _liferayUser.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<LiferayUser> toCacheModel() {
		return _liferayUser.toCacheModel();
	}

	@Override
	public LiferayUser toEscapedModel() {
		return new LiferayUserWrapper(_liferayUser.toEscapedModel());
	}

	@Override
	public LiferayUser toUnescapedModel() {
		return new LiferayUserWrapper(_liferayUser.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _liferayUser.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _liferayUser.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_liferayUser.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LiferayUserWrapper)) {
			return false;
		}

		LiferayUserWrapper liferayUserWrapper = (LiferayUserWrapper)obj;

		if (Validator.equals(_liferayUser, liferayUserWrapper._liferayUser)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LiferayUser getWrappedLiferayUser() {
		return _liferayUser;
	}

	@Override
	public LiferayUser getWrappedModel() {
		return _liferayUser;
	}

	@Override
	public void resetOriginalValues() {
		_liferayUser.resetOriginalValues();
	}

	private LiferayUser _liferayUser;
}
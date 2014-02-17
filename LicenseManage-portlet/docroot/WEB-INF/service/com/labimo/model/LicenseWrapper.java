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

package com.labimo.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link License}.
 * </p>
 *
 * @author wzgong
 * @see License
 * @generated
 */
public class LicenseWrapper implements License, ModelWrapper<License> {
	public LicenseWrapper(License license) {
		_license = license;
	}

	@Override
	public Class<?> getModelClass() {
		return License.class;
	}

	@Override
	public String getModelClassName() {
		return License.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("licenseUuid", getLicenseUuid());
		attributes.put("hardwareUuid", getHardwareUuid());
		attributes.put("userId", getUserId());
		attributes.put("content", getContent());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String licenseUuid = (String)attributes.get("licenseUuid");

		if (licenseUuid != null) {
			setLicenseUuid(licenseUuid);
		}

		String hardwareUuid = (String)attributes.get("hardwareUuid");

		if (hardwareUuid != null) {
			setHardwareUuid(hardwareUuid);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this license.
	*
	* @return the primary key of this license
	*/
	@Override
	public com.labimo.service.persistence.LicensePK getPrimaryKey() {
		return _license.getPrimaryKey();
	}

	/**
	* Sets the primary key of this license.
	*
	* @param primaryKey the primary key of this license
	*/
	@Override
	public void setPrimaryKey(
		com.labimo.service.persistence.LicensePK primaryKey) {
		_license.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the license uuid of this license.
	*
	* @return the license uuid of this license
	*/
	@Override
	public java.lang.String getLicenseUuid() {
		return _license.getLicenseUuid();
	}

	/**
	* Sets the license uuid of this license.
	*
	* @param licenseUuid the license uuid of this license
	*/
	@Override
	public void setLicenseUuid(java.lang.String licenseUuid) {
		_license.setLicenseUuid(licenseUuid);
	}

	/**
	* Returns the hardware uuid of this license.
	*
	* @return the hardware uuid of this license
	*/
	@Override
	public java.lang.String getHardwareUuid() {
		return _license.getHardwareUuid();
	}

	/**
	* Sets the hardware uuid of this license.
	*
	* @param hardwareUuid the hardware uuid of this license
	*/
	@Override
	public void setHardwareUuid(java.lang.String hardwareUuid) {
		_license.setHardwareUuid(hardwareUuid);
	}

	/**
	* Returns the user ID of this license.
	*
	* @return the user ID of this license
	*/
	@Override
	public long getUserId() {
		return _license.getUserId();
	}

	/**
	* Sets the user ID of this license.
	*
	* @param userId the user ID of this license
	*/
	@Override
	public void setUserId(long userId) {
		_license.setUserId(userId);
	}

	/**
	* Returns the user uuid of this license.
	*
	* @return the user uuid of this license
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _license.getUserUuid();
	}

	/**
	* Sets the user uuid of this license.
	*
	* @param userUuid the user uuid of this license
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_license.setUserUuid(userUuid);
	}

	/**
	* Returns the content of this license.
	*
	* @return the content of this license
	*/
	@Override
	public java.lang.String getContent() {
		return _license.getContent();
	}

	/**
	* Sets the content of this license.
	*
	* @param content the content of this license
	*/
	@Override
	public void setContent(java.lang.String content) {
		_license.setContent(content);
	}

	/**
	* Returns the create date of this license.
	*
	* @return the create date of this license
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _license.getCreateDate();
	}

	/**
	* Sets the create date of this license.
	*
	* @param createDate the create date of this license
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_license.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this license.
	*
	* @return the modified date of this license
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _license.getModifiedDate();
	}

	/**
	* Sets the modified date of this license.
	*
	* @param modifiedDate the modified date of this license
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_license.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _license.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_license.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _license.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_license.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _license.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _license.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_license.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _license.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_license.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_license.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_license.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LicenseWrapper((License)_license.clone());
	}

	@Override
	public int compareTo(com.labimo.model.License license) {
		return _license.compareTo(license);
	}

	@Override
	public int hashCode() {
		return _license.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.labimo.model.License> toCacheModel() {
		return _license.toCacheModel();
	}

	@Override
	public com.labimo.model.License toEscapedModel() {
		return new LicenseWrapper(_license.toEscapedModel());
	}

	@Override
	public com.labimo.model.License toUnescapedModel() {
		return new LicenseWrapper(_license.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _license.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _license.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_license.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LicenseWrapper)) {
			return false;
		}

		LicenseWrapper licenseWrapper = (LicenseWrapper)obj;

		if (Validator.equals(_license, licenseWrapper._license)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public License getWrappedLicense() {
		return _license;
	}

	@Override
	public License getWrappedModel() {
		return _license;
	}

	@Override
	public void resetOriginalValues() {
		_license.resetOriginalValues();
	}

	private License _license;
}
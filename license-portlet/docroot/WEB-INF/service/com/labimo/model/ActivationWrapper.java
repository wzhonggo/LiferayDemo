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
 * This class is a wrapper for {@link Activation}.
 * </p>
 *
 * @author wzgong
 * @see Activation
 * @generated
 */
public class ActivationWrapper implements Activation, ModelWrapper<Activation> {
	public ActivationWrapper(Activation activation) {
		_activation = activation;
	}

	@Override
	public Class<?> getModelClass() {
		return Activation.class;
	}

	@Override
	public String getModelClassName() {
		return Activation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("activationId", getActivationId());
		attributes.put("hardwareUuid", getHardwareUuid());
		attributes.put("licenseUuid", getLicenseUuid());
		attributes.put("createTime", getCreateTime());
		attributes.put("valid", getValid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String activationId = (String)attributes.get("activationId");

		if (activationId != null) {
			setActivationId(activationId);
		}

		String hardwareUuid = (String)attributes.get("hardwareUuid");

		if (hardwareUuid != null) {
			setHardwareUuid(hardwareUuid);
		}

		String licenseUuid = (String)attributes.get("licenseUuid");

		if (licenseUuid != null) {
			setLicenseUuid(licenseUuid);
		}

		Date createTime = (Date)attributes.get("createTime");

		if (createTime != null) {
			setCreateTime(createTime);
		}

		Boolean valid = (Boolean)attributes.get("valid");

		if (valid != null) {
			setValid(valid);
		}
	}

	/**
	* Returns the primary key of this activation.
	*
	* @return the primary key of this activation
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _activation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this activation.
	*
	* @param primaryKey the primary key of this activation
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_activation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the activation ID of this activation.
	*
	* @return the activation ID of this activation
	*/
	@Override
	public java.lang.String getActivationId() {
		return _activation.getActivationId();
	}

	/**
	* Sets the activation ID of this activation.
	*
	* @param activationId the activation ID of this activation
	*/
	@Override
	public void setActivationId(java.lang.String activationId) {
		_activation.setActivationId(activationId);
	}

	/**
	* Returns the hardware uuid of this activation.
	*
	* @return the hardware uuid of this activation
	*/
	@Override
	public java.lang.String getHardwareUuid() {
		return _activation.getHardwareUuid();
	}

	/**
	* Sets the hardware uuid of this activation.
	*
	* @param hardwareUuid the hardware uuid of this activation
	*/
	@Override
	public void setHardwareUuid(java.lang.String hardwareUuid) {
		_activation.setHardwareUuid(hardwareUuid);
	}

	/**
	* Returns the license uuid of this activation.
	*
	* @return the license uuid of this activation
	*/
	@Override
	public java.lang.String getLicenseUuid() {
		return _activation.getLicenseUuid();
	}

	/**
	* Sets the license uuid of this activation.
	*
	* @param licenseUuid the license uuid of this activation
	*/
	@Override
	public void setLicenseUuid(java.lang.String licenseUuid) {
		_activation.setLicenseUuid(licenseUuid);
	}

	/**
	* Returns the create time of this activation.
	*
	* @return the create time of this activation
	*/
	@Override
	public java.util.Date getCreateTime() {
		return _activation.getCreateTime();
	}

	/**
	* Sets the create time of this activation.
	*
	* @param createTime the create time of this activation
	*/
	@Override
	public void setCreateTime(java.util.Date createTime) {
		_activation.setCreateTime(createTime);
	}

	/**
	* Returns the valid of this activation.
	*
	* @return the valid of this activation
	*/
	@Override
	public boolean getValid() {
		return _activation.getValid();
	}

	/**
	* Returns <code>true</code> if this activation is valid.
	*
	* @return <code>true</code> if this activation is valid; <code>false</code> otherwise
	*/
	@Override
	public boolean isValid() {
		return _activation.isValid();
	}

	/**
	* Sets whether this activation is valid.
	*
	* @param valid the valid of this activation
	*/
	@Override
	public void setValid(boolean valid) {
		_activation.setValid(valid);
	}

	@Override
	public boolean isNew() {
		return _activation.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_activation.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _activation.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_activation.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _activation.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _activation.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_activation.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _activation.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_activation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_activation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_activation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ActivationWrapper((Activation)_activation.clone());
	}

	@Override
	public int compareTo(com.labimo.model.Activation activation) {
		return _activation.compareTo(activation);
	}

	@Override
	public int hashCode() {
		return _activation.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.labimo.model.Activation> toCacheModel() {
		return _activation.toCacheModel();
	}

	@Override
	public com.labimo.model.Activation toEscapedModel() {
		return new ActivationWrapper(_activation.toEscapedModel());
	}

	@Override
	public com.labimo.model.Activation toUnescapedModel() {
		return new ActivationWrapper(_activation.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _activation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _activation.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_activation.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActivationWrapper)) {
			return false;
		}

		ActivationWrapper activationWrapper = (ActivationWrapper)obj;

		if (Validator.equals(_activation, activationWrapper._activation)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Activation getWrappedActivation() {
		return _activation;
	}

	@Override
	public Activation getWrappedModel() {
		return _activation;
	}

	@Override
	public void resetOriginalValues() {
		_activation.resetOriginalValues();
	}

	private Activation _activation;
}
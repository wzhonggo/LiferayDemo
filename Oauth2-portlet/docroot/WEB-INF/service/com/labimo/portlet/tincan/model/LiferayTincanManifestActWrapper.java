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
 * This class is a wrapper for {@link LiferayTincanManifestAct}.
 * </p>
 *
 * @author wzgong
 * @see LiferayTincanManifestAct
 * @generated
 */
public class LiferayTincanManifestActWrapper implements LiferayTincanManifestAct,
	ModelWrapper<LiferayTincanManifestAct> {
	public LiferayTincanManifestActWrapper(
		LiferayTincanManifestAct liferayTincanManifestAct) {
		_liferayTincanManifestAct = liferayTincanManifestAct;
	}

	@Override
	public Class<?> getModelClass() {
		return LiferayTincanManifestAct.class;
	}

	@Override
	public String getModelClassName() {
		return LiferayTincanManifestAct.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("activityId", getActivityId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("launch", getLaunch());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String activityId = (String)attributes.get("activityId");

		if (activityId != null) {
			setActivityId(activityId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String launch = (String)attributes.get("launch");

		if (launch != null) {
			setLaunch(launch);
		}
	}

	/**
	* Returns the primary key of this liferay tincan manifest act.
	*
	* @return the primary key of this liferay tincan manifest act
	*/
	@Override
	public long getPrimaryKey() {
		return _liferayTincanManifestAct.getPrimaryKey();
	}

	/**
	* Sets the primary key of this liferay tincan manifest act.
	*
	* @param primaryKey the primary key of this liferay tincan manifest act
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_liferayTincanManifestAct.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this liferay tincan manifest act.
	*
	* @return the ID of this liferay tincan manifest act
	*/
	@Override
	public long getId() {
		return _liferayTincanManifestAct.getId();
	}

	/**
	* Sets the ID of this liferay tincan manifest act.
	*
	* @param id the ID of this liferay tincan manifest act
	*/
	@Override
	public void setId(long id) {
		_liferayTincanManifestAct.setId(id);
	}

	/**
	* Returns the activity ID of this liferay tincan manifest act.
	*
	* @return the activity ID of this liferay tincan manifest act
	*/
	@Override
	public java.lang.String getActivityId() {
		return _liferayTincanManifestAct.getActivityId();
	}

	/**
	* Sets the activity ID of this liferay tincan manifest act.
	*
	* @param activityId the activity ID of this liferay tincan manifest act
	*/
	@Override
	public void setActivityId(java.lang.String activityId) {
		_liferayTincanManifestAct.setActivityId(activityId);
	}

	/**
	* Returns the name of this liferay tincan manifest act.
	*
	* @return the name of this liferay tincan manifest act
	*/
	@Override
	public java.lang.String getName() {
		return _liferayTincanManifestAct.getName();
	}

	/**
	* Sets the name of this liferay tincan manifest act.
	*
	* @param name the name of this liferay tincan manifest act
	*/
	@Override
	public void setName(java.lang.String name) {
		_liferayTincanManifestAct.setName(name);
	}

	/**
	* Returns the description of this liferay tincan manifest act.
	*
	* @return the description of this liferay tincan manifest act
	*/
	@Override
	public java.lang.String getDescription() {
		return _liferayTincanManifestAct.getDescription();
	}

	/**
	* Sets the description of this liferay tincan manifest act.
	*
	* @param description the description of this liferay tincan manifest act
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_liferayTincanManifestAct.setDescription(description);
	}

	/**
	* Returns the launch of this liferay tincan manifest act.
	*
	* @return the launch of this liferay tincan manifest act
	*/
	@Override
	public java.lang.String getLaunch() {
		return _liferayTincanManifestAct.getLaunch();
	}

	/**
	* Sets the launch of this liferay tincan manifest act.
	*
	* @param launch the launch of this liferay tincan manifest act
	*/
	@Override
	public void setLaunch(java.lang.String launch) {
		_liferayTincanManifestAct.setLaunch(launch);
	}

	@Override
	public boolean isNew() {
		return _liferayTincanManifestAct.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_liferayTincanManifestAct.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _liferayTincanManifestAct.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_liferayTincanManifestAct.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _liferayTincanManifestAct.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _liferayTincanManifestAct.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_liferayTincanManifestAct.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _liferayTincanManifestAct.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_liferayTincanManifestAct.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_liferayTincanManifestAct.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_liferayTincanManifestAct.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LiferayTincanManifestActWrapper((LiferayTincanManifestAct)_liferayTincanManifestAct.clone());
	}

	@Override
	public int compareTo(LiferayTincanManifestAct liferayTincanManifestAct) {
		return _liferayTincanManifestAct.compareTo(liferayTincanManifestAct);
	}

	@Override
	public int hashCode() {
		return _liferayTincanManifestAct.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<LiferayTincanManifestAct> toCacheModel() {
		return _liferayTincanManifestAct.toCacheModel();
	}

	@Override
	public LiferayTincanManifestAct toEscapedModel() {
		return new LiferayTincanManifestActWrapper(_liferayTincanManifestAct.toEscapedModel());
	}

	@Override
	public LiferayTincanManifestAct toUnescapedModel() {
		return new LiferayTincanManifestActWrapper(_liferayTincanManifestAct.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _liferayTincanManifestAct.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _liferayTincanManifestAct.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_liferayTincanManifestAct.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LiferayTincanManifestActWrapper)) {
			return false;
		}

		LiferayTincanManifestActWrapper liferayTincanManifestActWrapper = (LiferayTincanManifestActWrapper)obj;

		if (Validator.equals(_liferayTincanManifestAct,
					liferayTincanManifestActWrapper._liferayTincanManifestAct)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LiferayTincanManifestAct getWrappedLiferayTincanManifestAct() {
		return _liferayTincanManifestAct;
	}

	@Override
	public LiferayTincanManifestAct getWrappedModel() {
		return _liferayTincanManifestAct;
	}

	@Override
	public void resetOriginalValues() {
		_liferayTincanManifestAct.resetOriginalValues();
	}

	private LiferayTincanManifestAct _liferayTincanManifestAct;
}
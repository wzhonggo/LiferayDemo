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
 * This class is a wrapper for {@link TincanVerb}.
 * </p>
 *
 * @author wzgong
 * @see TincanVerb
 * @generated
 */
public class TincanVerbWrapper implements TincanVerb, ModelWrapper<TincanVerb> {
	public TincanVerbWrapper(TincanVerb tincanVerb) {
		_tincanVerb = tincanVerb;
	}

	@Override
	public Class<?> getModelClass() {
		return TincanVerb.class;
	}

	@Override
	public String getModelClassName() {
		return TincanVerb.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("verbId", getVerbId());
		attributes.put("display", getDisplay());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String verbId = (String)attributes.get("verbId");

		if (verbId != null) {
			setVerbId(verbId);
		}

		String display = (String)attributes.get("display");

		if (display != null) {
			setDisplay(display);
		}
	}

	/**
	* Returns the primary key of this tincan verb.
	*
	* @return the primary key of this tincan verb
	*/
	@Override
	public long getPrimaryKey() {
		return _tincanVerb.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tincan verb.
	*
	* @param primaryKey the primary key of this tincan verb
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tincanVerb.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tincan verb.
	*
	* @return the ID of this tincan verb
	*/
	@Override
	public long getId() {
		return _tincanVerb.getId();
	}

	/**
	* Sets the ID of this tincan verb.
	*
	* @param id the ID of this tincan verb
	*/
	@Override
	public void setId(long id) {
		_tincanVerb.setId(id);
	}

	/**
	* Returns the verb ID of this tincan verb.
	*
	* @return the verb ID of this tincan verb
	*/
	@Override
	public java.lang.String getVerbId() {
		return _tincanVerb.getVerbId();
	}

	/**
	* Sets the verb ID of this tincan verb.
	*
	* @param verbId the verb ID of this tincan verb
	*/
	@Override
	public void setVerbId(java.lang.String verbId) {
		_tincanVerb.setVerbId(verbId);
	}

	/**
	* Returns the display of this tincan verb.
	*
	* @return the display of this tincan verb
	*/
	@Override
	public java.lang.String getDisplay() {
		return _tincanVerb.getDisplay();
	}

	/**
	* Sets the display of this tincan verb.
	*
	* @param display the display of this tincan verb
	*/
	@Override
	public void setDisplay(java.lang.String display) {
		_tincanVerb.setDisplay(display);
	}

	@Override
	public boolean isNew() {
		return _tincanVerb.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tincanVerb.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tincanVerb.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tincanVerb.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tincanVerb.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tincanVerb.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tincanVerb.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tincanVerb.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tincanVerb.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tincanVerb.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tincanVerb.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TincanVerbWrapper((TincanVerb)_tincanVerb.clone());
	}

	@Override
	public int compareTo(TincanVerb tincanVerb) {
		return _tincanVerb.compareTo(tincanVerb);
	}

	@Override
	public int hashCode() {
		return _tincanVerb.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TincanVerb> toCacheModel() {
		return _tincanVerb.toCacheModel();
	}

	@Override
	public TincanVerb toEscapedModel() {
		return new TincanVerbWrapper(_tincanVerb.toEscapedModel());
	}

	@Override
	public TincanVerb toUnescapedModel() {
		return new TincanVerbWrapper(_tincanVerb.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tincanVerb.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tincanVerb.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tincanVerb.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TincanVerbWrapper)) {
			return false;
		}

		TincanVerbWrapper tincanVerbWrapper = (TincanVerbWrapper)obj;

		if (Validator.equals(_tincanVerb, tincanVerbWrapper._tincanVerb)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TincanVerb getWrappedTincanVerb() {
		return _tincanVerb;
	}

	@Override
	public TincanVerb getWrappedModel() {
		return _tincanVerb;
	}

	@Override
	public void resetOriginalValues() {
		_tincanVerb.resetOriginalValues();
	}

	private TincanVerb _tincanVerb;
}
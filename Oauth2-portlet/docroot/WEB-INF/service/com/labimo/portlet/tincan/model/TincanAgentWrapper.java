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
 * This class is a wrapper for {@link TincanAgent}.
 * </p>
 *
 * @author wzgong
 * @see TincanAgent
 * @generated
 */
public class TincanAgentWrapper implements TincanAgent,
	ModelWrapper<TincanAgent> {
	public TincanAgentWrapper(TincanAgent tincanAgent) {
		_tincanAgent = tincanAgent;
	}

	@Override
	public Class<?> getModelClass() {
		return TincanAgent.class;
	}

	@Override
	public String getModelClassName() {
		return TincanAgent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("objectType", getObjectType());
		attributes.put("name", getName());
		attributes.put("mbox", getMbox());
		attributes.put("mbox_sha1sum", getMbox_sha1sum());
		attributes.put("openID", getOpenID());
		attributes.put("oauth_identifier", getOauth_identifier());
		attributes.put("canonical_version", getCanonical_version());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String objectType = (String)attributes.get("objectType");

		if (objectType != null) {
			setObjectType(objectType);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String mbox = (String)attributes.get("mbox");

		if (mbox != null) {
			setMbox(mbox);
		}

		String mbox_sha1sum = (String)attributes.get("mbox_sha1sum");

		if (mbox_sha1sum != null) {
			setMbox_sha1sum(mbox_sha1sum);
		}

		String openID = (String)attributes.get("openID");

		if (openID != null) {
			setOpenID(openID);
		}

		String oauth_identifier = (String)attributes.get("oauth_identifier");

		if (oauth_identifier != null) {
			setOauth_identifier(oauth_identifier);
		}

		Boolean canonical_version = (Boolean)attributes.get("canonical_version");

		if (canonical_version != null) {
			setCanonical_version(canonical_version);
		}
	}

	/**
	* Returns the primary key of this tincan agent.
	*
	* @return the primary key of this tincan agent
	*/
	@Override
	public long getPrimaryKey() {
		return _tincanAgent.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tincan agent.
	*
	* @param primaryKey the primary key of this tincan agent
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tincanAgent.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tincan agent.
	*
	* @return the ID of this tincan agent
	*/
	@Override
	public long getId() {
		return _tincanAgent.getId();
	}

	/**
	* Sets the ID of this tincan agent.
	*
	* @param id the ID of this tincan agent
	*/
	@Override
	public void setId(long id) {
		_tincanAgent.setId(id);
	}

	/**
	* Returns the object type of this tincan agent.
	*
	* @return the object type of this tincan agent
	*/
	@Override
	public java.lang.String getObjectType() {
		return _tincanAgent.getObjectType();
	}

	/**
	* Sets the object type of this tincan agent.
	*
	* @param objectType the object type of this tincan agent
	*/
	@Override
	public void setObjectType(java.lang.String objectType) {
		_tincanAgent.setObjectType(objectType);
	}

	/**
	* Returns the name of this tincan agent.
	*
	* @return the name of this tincan agent
	*/
	@Override
	public java.lang.String getName() {
		return _tincanAgent.getName();
	}

	/**
	* Sets the name of this tincan agent.
	*
	* @param name the name of this tincan agent
	*/
	@Override
	public void setName(java.lang.String name) {
		_tincanAgent.setName(name);
	}

	/**
	* Returns the mbox of this tincan agent.
	*
	* @return the mbox of this tincan agent
	*/
	@Override
	public java.lang.String getMbox() {
		return _tincanAgent.getMbox();
	}

	/**
	* Sets the mbox of this tincan agent.
	*
	* @param mbox the mbox of this tincan agent
	*/
	@Override
	public void setMbox(java.lang.String mbox) {
		_tincanAgent.setMbox(mbox);
	}

	/**
	* Returns the mbox_sha1sum of this tincan agent.
	*
	* @return the mbox_sha1sum of this tincan agent
	*/
	@Override
	public java.lang.String getMbox_sha1sum() {
		return _tincanAgent.getMbox_sha1sum();
	}

	/**
	* Sets the mbox_sha1sum of this tincan agent.
	*
	* @param mbox_sha1sum the mbox_sha1sum of this tincan agent
	*/
	@Override
	public void setMbox_sha1sum(java.lang.String mbox_sha1sum) {
		_tincanAgent.setMbox_sha1sum(mbox_sha1sum);
	}

	/**
	* Returns the open i d of this tincan agent.
	*
	* @return the open i d of this tincan agent
	*/
	@Override
	public java.lang.String getOpenID() {
		return _tincanAgent.getOpenID();
	}

	/**
	* Sets the open i d of this tincan agent.
	*
	* @param openID the open i d of this tincan agent
	*/
	@Override
	public void setOpenID(java.lang.String openID) {
		_tincanAgent.setOpenID(openID);
	}

	/**
	* Returns the oauth_identifier of this tincan agent.
	*
	* @return the oauth_identifier of this tincan agent
	*/
	@Override
	public java.lang.String getOauth_identifier() {
		return _tincanAgent.getOauth_identifier();
	}

	/**
	* Sets the oauth_identifier of this tincan agent.
	*
	* @param oauth_identifier the oauth_identifier of this tincan agent
	*/
	@Override
	public void setOauth_identifier(java.lang.String oauth_identifier) {
		_tincanAgent.setOauth_identifier(oauth_identifier);
	}

	/**
	* Returns the canonical_version of this tincan agent.
	*
	* @return the canonical_version of this tincan agent
	*/
	@Override
	public boolean getCanonical_version() {
		return _tincanAgent.getCanonical_version();
	}

	/**
	* Returns <code>true</code> if this tincan agent is canonical_version.
	*
	* @return <code>true</code> if this tincan agent is canonical_version; <code>false</code> otherwise
	*/
	@Override
	public boolean isCanonical_version() {
		return _tincanAgent.isCanonical_version();
	}

	/**
	* Sets whether this tincan agent is canonical_version.
	*
	* @param canonical_version the canonical_version of this tincan agent
	*/
	@Override
	public void setCanonical_version(boolean canonical_version) {
		_tincanAgent.setCanonical_version(canonical_version);
	}

	@Override
	public boolean isNew() {
		return _tincanAgent.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tincanAgent.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tincanAgent.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tincanAgent.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tincanAgent.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tincanAgent.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tincanAgent.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tincanAgent.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tincanAgent.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tincanAgent.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tincanAgent.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TincanAgentWrapper((TincanAgent)_tincanAgent.clone());
	}

	@Override
	public int compareTo(TincanAgent tincanAgent) {
		return _tincanAgent.compareTo(tincanAgent);
	}

	@Override
	public int hashCode() {
		return _tincanAgent.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TincanAgent> toCacheModel() {
		return _tincanAgent.toCacheModel();
	}

	@Override
	public TincanAgent toEscapedModel() {
		return new TincanAgentWrapper(_tincanAgent.toEscapedModel());
	}

	@Override
	public TincanAgent toUnescapedModel() {
		return new TincanAgentWrapper(_tincanAgent.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tincanAgent.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tincanAgent.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tincanAgent.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TincanAgentWrapper)) {
			return false;
		}

		TincanAgentWrapper tincanAgentWrapper = (TincanAgentWrapper)obj;

		if (Validator.equals(_tincanAgent, tincanAgentWrapper._tincanAgent)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TincanAgent getWrappedTincanAgent() {
		return _tincanAgent;
	}

	@Override
	public TincanAgent getWrappedModel() {
		return _tincanAgent;
	}

	@Override
	public void resetOriginalValues() {
		_tincanAgent.resetOriginalValues();
	}

	private TincanAgent _tincanAgent;
}
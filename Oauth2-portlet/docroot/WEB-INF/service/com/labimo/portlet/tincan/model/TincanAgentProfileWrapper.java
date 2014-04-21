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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TincanAgentProfile}.
 * </p>
 *
 * @author wzgong
 * @see TincanAgentProfile
 * @generated
 */
public class TincanAgentProfileWrapper implements TincanAgentProfile,
	ModelWrapper<TincanAgentProfile> {
	public TincanAgentProfileWrapper(TincanAgentProfile tincanAgentProfile) {
		_tincanAgentProfile = tincanAgentProfile;
	}

	@Override
	public Class<?> getModelClass() {
		return TincanAgentProfile.class;
	}

	@Override
	public String getModelClassName() {
		return TincanAgentProfile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("profileId", getProfileId());
		attributes.put("updated", getUpdated());
		attributes.put("agentId", getAgentId());
		attributes.put("profile", getProfile());
		attributes.put("json_profile", getJson_profile());
		attributes.put("content_type", getContent_type());
		attributes.put("etag", getEtag());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String profileId = (String)attributes.get("profileId");

		if (profileId != null) {
			setProfileId(profileId);
		}

		Date updated = (Date)attributes.get("updated");

		if (updated != null) {
			setUpdated(updated);
		}

		Long agentId = (Long)attributes.get("agentId");

		if (agentId != null) {
			setAgentId(agentId);
		}

		String profile = (String)attributes.get("profile");

		if (profile != null) {
			setProfile(profile);
		}

		String json_profile = (String)attributes.get("json_profile");

		if (json_profile != null) {
			setJson_profile(json_profile);
		}

		String content_type = (String)attributes.get("content_type");

		if (content_type != null) {
			setContent_type(content_type);
		}

		String etag = (String)attributes.get("etag");

		if (etag != null) {
			setEtag(etag);
		}
	}

	/**
	* Returns the primary key of this tincan agent profile.
	*
	* @return the primary key of this tincan agent profile
	*/
	@Override
	public long getPrimaryKey() {
		return _tincanAgentProfile.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tincan agent profile.
	*
	* @param primaryKey the primary key of this tincan agent profile
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tincanAgentProfile.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tincan agent profile.
	*
	* @return the ID of this tincan agent profile
	*/
	@Override
	public long getId() {
		return _tincanAgentProfile.getId();
	}

	/**
	* Sets the ID of this tincan agent profile.
	*
	* @param id the ID of this tincan agent profile
	*/
	@Override
	public void setId(long id) {
		_tincanAgentProfile.setId(id);
	}

	/**
	* Returns the profile ID of this tincan agent profile.
	*
	* @return the profile ID of this tincan agent profile
	*/
	@Override
	public java.lang.String getProfileId() {
		return _tincanAgentProfile.getProfileId();
	}

	/**
	* Sets the profile ID of this tincan agent profile.
	*
	* @param profileId the profile ID of this tincan agent profile
	*/
	@Override
	public void setProfileId(java.lang.String profileId) {
		_tincanAgentProfile.setProfileId(profileId);
	}

	/**
	* Returns the updated of this tincan agent profile.
	*
	* @return the updated of this tincan agent profile
	*/
	@Override
	public java.util.Date getUpdated() {
		return _tincanAgentProfile.getUpdated();
	}

	/**
	* Sets the updated of this tincan agent profile.
	*
	* @param updated the updated of this tincan agent profile
	*/
	@Override
	public void setUpdated(java.util.Date updated) {
		_tincanAgentProfile.setUpdated(updated);
	}

	/**
	* Returns the agent ID of this tincan agent profile.
	*
	* @return the agent ID of this tincan agent profile
	*/
	@Override
	public long getAgentId() {
		return _tincanAgentProfile.getAgentId();
	}

	/**
	* Sets the agent ID of this tincan agent profile.
	*
	* @param agentId the agent ID of this tincan agent profile
	*/
	@Override
	public void setAgentId(long agentId) {
		_tincanAgentProfile.setAgentId(agentId);
	}

	/**
	* Returns the profile of this tincan agent profile.
	*
	* @return the profile of this tincan agent profile
	*/
	@Override
	public java.lang.String getProfile() {
		return _tincanAgentProfile.getProfile();
	}

	/**
	* Sets the profile of this tincan agent profile.
	*
	* @param profile the profile of this tincan agent profile
	*/
	@Override
	public void setProfile(java.lang.String profile) {
		_tincanAgentProfile.setProfile(profile);
	}

	/**
	* Returns the json_profile of this tincan agent profile.
	*
	* @return the json_profile of this tincan agent profile
	*/
	@Override
	public java.lang.String getJson_profile() {
		return _tincanAgentProfile.getJson_profile();
	}

	/**
	* Sets the json_profile of this tincan agent profile.
	*
	* @param json_profile the json_profile of this tincan agent profile
	*/
	@Override
	public void setJson_profile(java.lang.String json_profile) {
		_tincanAgentProfile.setJson_profile(json_profile);
	}

	/**
	* Returns the content_type of this tincan agent profile.
	*
	* @return the content_type of this tincan agent profile
	*/
	@Override
	public java.lang.String getContent_type() {
		return _tincanAgentProfile.getContent_type();
	}

	/**
	* Sets the content_type of this tincan agent profile.
	*
	* @param content_type the content_type of this tincan agent profile
	*/
	@Override
	public void setContent_type(java.lang.String content_type) {
		_tincanAgentProfile.setContent_type(content_type);
	}

	/**
	* Returns the etag of this tincan agent profile.
	*
	* @return the etag of this tincan agent profile
	*/
	@Override
	public java.lang.String getEtag() {
		return _tincanAgentProfile.getEtag();
	}

	/**
	* Sets the etag of this tincan agent profile.
	*
	* @param etag the etag of this tincan agent profile
	*/
	@Override
	public void setEtag(java.lang.String etag) {
		_tincanAgentProfile.setEtag(etag);
	}

	@Override
	public boolean isNew() {
		return _tincanAgentProfile.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tincanAgentProfile.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tincanAgentProfile.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tincanAgentProfile.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tincanAgentProfile.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tincanAgentProfile.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tincanAgentProfile.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tincanAgentProfile.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tincanAgentProfile.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tincanAgentProfile.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tincanAgentProfile.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TincanAgentProfileWrapper((TincanAgentProfile)_tincanAgentProfile.clone());
	}

	@Override
	public int compareTo(TincanAgentProfile tincanAgentProfile) {
		return _tincanAgentProfile.compareTo(tincanAgentProfile);
	}

	@Override
	public int hashCode() {
		return _tincanAgentProfile.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TincanAgentProfile> toCacheModel() {
		return _tincanAgentProfile.toCacheModel();
	}

	@Override
	public TincanAgentProfile toEscapedModel() {
		return new TincanAgentProfileWrapper(_tincanAgentProfile.toEscapedModel());
	}

	@Override
	public TincanAgentProfile toUnescapedModel() {
		return new TincanAgentProfileWrapper(_tincanAgentProfile.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tincanAgentProfile.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tincanAgentProfile.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tincanAgentProfile.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TincanAgentProfileWrapper)) {
			return false;
		}

		TincanAgentProfileWrapper tincanAgentProfileWrapper = (TincanAgentProfileWrapper)obj;

		if (Validator.equals(_tincanAgentProfile,
					tincanAgentProfileWrapper._tincanAgentProfile)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TincanAgentProfile getWrappedTincanAgentProfile() {
		return _tincanAgentProfile;
	}

	@Override
	public TincanAgentProfile getWrappedModel() {
		return _tincanAgentProfile;
	}

	@Override
	public void resetOriginalValues() {
		_tincanAgentProfile.resetOriginalValues();
	}

	private TincanAgentProfile _tincanAgentProfile;
}
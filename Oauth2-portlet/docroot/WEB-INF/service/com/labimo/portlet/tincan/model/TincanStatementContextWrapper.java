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
 * This class is a wrapper for {@link TincanStatementContext}.
 * </p>
 *
 * @author wzgong
 * @see TincanStatementContext
 * @generated
 */
public class TincanStatementContextWrapper implements TincanStatementContext,
	ModelWrapper<TincanStatementContext> {
	public TincanStatementContextWrapper(
		TincanStatementContext tincanStatementContext) {
		_tincanStatementContext = tincanStatementContext;
	}

	@Override
	public Class<?> getModelClass() {
		return TincanStatementContext.class;
	}

	@Override
	public String getModelClassName() {
		return TincanStatementContext.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("registration", getRegistration());
		attributes.put("instructorId", getInstructorId());
		attributes.put("teamId", getTeamId());
		attributes.put("contextActivitiesId", getContextActivitiesId());
		attributes.put("revision", getRevision());
		attributes.put("platform", getPlatform());
		attributes.put("language", getLanguage());
		attributes.put("statement", getStatement());
		attributes.put("extensions", getExtensions());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String registration = (String)attributes.get("registration");

		if (registration != null) {
			setRegistration(registration);
		}

		Long instructorId = (Long)attributes.get("instructorId");

		if (instructorId != null) {
			setInstructorId(instructorId);
		}

		Long teamId = (Long)attributes.get("teamId");

		if (teamId != null) {
			setTeamId(teamId);
		}

		Long contextActivitiesId = (Long)attributes.get("contextActivitiesId");

		if (contextActivitiesId != null) {
			setContextActivitiesId(contextActivitiesId);
		}

		String revision = (String)attributes.get("revision");

		if (revision != null) {
			setRevision(revision);
		}

		String platform = (String)attributes.get("platform");

		if (platform != null) {
			setPlatform(platform);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		String statement = (String)attributes.get("statement");

		if (statement != null) {
			setStatement(statement);
		}

		String extensions = (String)attributes.get("extensions");

		if (extensions != null) {
			setExtensions(extensions);
		}
	}

	/**
	* Returns the primary key of this tincan statement context.
	*
	* @return the primary key of this tincan statement context
	*/
	@Override
	public long getPrimaryKey() {
		return _tincanStatementContext.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tincan statement context.
	*
	* @param primaryKey the primary key of this tincan statement context
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tincanStatementContext.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tincan statement context.
	*
	* @return the ID of this tincan statement context
	*/
	@Override
	public long getId() {
		return _tincanStatementContext.getId();
	}

	/**
	* Sets the ID of this tincan statement context.
	*
	* @param id the ID of this tincan statement context
	*/
	@Override
	public void setId(long id) {
		_tincanStatementContext.setId(id);
	}

	/**
	* Returns the registration of this tincan statement context.
	*
	* @return the registration of this tincan statement context
	*/
	@Override
	public java.lang.String getRegistration() {
		return _tincanStatementContext.getRegistration();
	}

	/**
	* Sets the registration of this tincan statement context.
	*
	* @param registration the registration of this tincan statement context
	*/
	@Override
	public void setRegistration(java.lang.String registration) {
		_tincanStatementContext.setRegistration(registration);
	}

	/**
	* Returns the instructor ID of this tincan statement context.
	*
	* @return the instructor ID of this tincan statement context
	*/
	@Override
	public long getInstructorId() {
		return _tincanStatementContext.getInstructorId();
	}

	/**
	* Sets the instructor ID of this tincan statement context.
	*
	* @param instructorId the instructor ID of this tincan statement context
	*/
	@Override
	public void setInstructorId(long instructorId) {
		_tincanStatementContext.setInstructorId(instructorId);
	}

	/**
	* Returns the team ID of this tincan statement context.
	*
	* @return the team ID of this tincan statement context
	*/
	@Override
	public long getTeamId() {
		return _tincanStatementContext.getTeamId();
	}

	/**
	* Sets the team ID of this tincan statement context.
	*
	* @param teamId the team ID of this tincan statement context
	*/
	@Override
	public void setTeamId(long teamId) {
		_tincanStatementContext.setTeamId(teamId);
	}

	/**
	* Returns the context activities ID of this tincan statement context.
	*
	* @return the context activities ID of this tincan statement context
	*/
	@Override
	public long getContextActivitiesId() {
		return _tincanStatementContext.getContextActivitiesId();
	}

	/**
	* Sets the context activities ID of this tincan statement context.
	*
	* @param contextActivitiesId the context activities ID of this tincan statement context
	*/
	@Override
	public void setContextActivitiesId(long contextActivitiesId) {
		_tincanStatementContext.setContextActivitiesId(contextActivitiesId);
	}

	/**
	* Returns the revision of this tincan statement context.
	*
	* @return the revision of this tincan statement context
	*/
	@Override
	public java.lang.String getRevision() {
		return _tincanStatementContext.getRevision();
	}

	/**
	* Sets the revision of this tincan statement context.
	*
	* @param revision the revision of this tincan statement context
	*/
	@Override
	public void setRevision(java.lang.String revision) {
		_tincanStatementContext.setRevision(revision);
	}

	/**
	* Returns the platform of this tincan statement context.
	*
	* @return the platform of this tincan statement context
	*/
	@Override
	public java.lang.String getPlatform() {
		return _tincanStatementContext.getPlatform();
	}

	/**
	* Sets the platform of this tincan statement context.
	*
	* @param platform the platform of this tincan statement context
	*/
	@Override
	public void setPlatform(java.lang.String platform) {
		_tincanStatementContext.setPlatform(platform);
	}

	/**
	* Returns the language of this tincan statement context.
	*
	* @return the language of this tincan statement context
	*/
	@Override
	public java.lang.String getLanguage() {
		return _tincanStatementContext.getLanguage();
	}

	/**
	* Sets the language of this tincan statement context.
	*
	* @param language the language of this tincan statement context
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_tincanStatementContext.setLanguage(language);
	}

	/**
	* Returns the statement of this tincan statement context.
	*
	* @return the statement of this tincan statement context
	*/
	@Override
	public java.lang.String getStatement() {
		return _tincanStatementContext.getStatement();
	}

	/**
	* Sets the statement of this tincan statement context.
	*
	* @param statement the statement of this tincan statement context
	*/
	@Override
	public void setStatement(java.lang.String statement) {
		_tincanStatementContext.setStatement(statement);
	}

	/**
	* Returns the extensions of this tincan statement context.
	*
	* @return the extensions of this tincan statement context
	*/
	@Override
	public java.lang.String getExtensions() {
		return _tincanStatementContext.getExtensions();
	}

	/**
	* Sets the extensions of this tincan statement context.
	*
	* @param extensions the extensions of this tincan statement context
	*/
	@Override
	public void setExtensions(java.lang.String extensions) {
		_tincanStatementContext.setExtensions(extensions);
	}

	@Override
	public boolean isNew() {
		return _tincanStatementContext.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tincanStatementContext.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tincanStatementContext.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tincanStatementContext.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tincanStatementContext.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tincanStatementContext.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tincanStatementContext.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tincanStatementContext.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tincanStatementContext.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tincanStatementContext.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tincanStatementContext.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TincanStatementContextWrapper((TincanStatementContext)_tincanStatementContext.clone());
	}

	@Override
	public int compareTo(TincanStatementContext tincanStatementContext) {
		return _tincanStatementContext.compareTo(tincanStatementContext);
	}

	@Override
	public int hashCode() {
		return _tincanStatementContext.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TincanStatementContext> toCacheModel() {
		return _tincanStatementContext.toCacheModel();
	}

	@Override
	public TincanStatementContext toEscapedModel() {
		return new TincanStatementContextWrapper(_tincanStatementContext.toEscapedModel());
	}

	@Override
	public TincanStatementContext toUnescapedModel() {
		return new TincanStatementContextWrapper(_tincanStatementContext.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tincanStatementContext.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tincanStatementContext.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tincanStatementContext.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TincanStatementContextWrapper)) {
			return false;
		}

		TincanStatementContextWrapper tincanStatementContextWrapper = (TincanStatementContextWrapper)obj;

		if (Validator.equals(_tincanStatementContext,
					tincanStatementContextWrapper._tincanStatementContext)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TincanStatementContext getWrappedTincanStatementContext() {
		return _tincanStatementContext;
	}

	@Override
	public TincanStatementContext getWrappedModel() {
		return _tincanStatementContext;
	}

	@Override
	public void resetOriginalValues() {
		_tincanStatementContext.resetOriginalValues();
	}

	private TincanStatementContext _tincanStatementContext;
}
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
 * This class is a wrapper for {@link TincanStatementAttachment}.
 * </p>
 *
 * @author wzgong
 * @see TincanStatementAttachment
 * @generated
 */
public class TincanStatementAttachmentWrapper
	implements TincanStatementAttachment,
		ModelWrapper<TincanStatementAttachment> {
	public TincanStatementAttachmentWrapper(
		TincanStatementAttachment tincanStatementAttachment) {
		_tincanStatementAttachment = tincanStatementAttachment;
	}

	@Override
	public Class<?> getModelClass() {
		return TincanStatementAttachment.class;
	}

	@Override
	public String getModelClassName() {
		return TincanStatementAttachment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("statementId", getStatementId());
		attributes.put("statementAttachmentId", getStatementAttachmentId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long statementId = (Long)attributes.get("statementId");

		if (statementId != null) {
			setStatementId(statementId);
		}

		Long statementAttachmentId = (Long)attributes.get(
				"statementAttachmentId");

		if (statementAttachmentId != null) {
			setStatementAttachmentId(statementAttachmentId);
		}
	}

	/**
	* Returns the primary key of this tincan statement attachment.
	*
	* @return the primary key of this tincan statement attachment
	*/
	@Override
	public long getPrimaryKey() {
		return _tincanStatementAttachment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tincan statement attachment.
	*
	* @param primaryKey the primary key of this tincan statement attachment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tincanStatementAttachment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tincan statement attachment.
	*
	* @return the ID of this tincan statement attachment
	*/
	@Override
	public long getId() {
		return _tincanStatementAttachment.getId();
	}

	/**
	* Sets the ID of this tincan statement attachment.
	*
	* @param id the ID of this tincan statement attachment
	*/
	@Override
	public void setId(long id) {
		_tincanStatementAttachment.setId(id);
	}

	/**
	* Returns the statement ID of this tincan statement attachment.
	*
	* @return the statement ID of this tincan statement attachment
	*/
	@Override
	public long getStatementId() {
		return _tincanStatementAttachment.getStatementId();
	}

	/**
	* Sets the statement ID of this tincan statement attachment.
	*
	* @param statementId the statement ID of this tincan statement attachment
	*/
	@Override
	public void setStatementId(long statementId) {
		_tincanStatementAttachment.setStatementId(statementId);
	}

	/**
	* Returns the statement attachment ID of this tincan statement attachment.
	*
	* @return the statement attachment ID of this tincan statement attachment
	*/
	@Override
	public long getStatementAttachmentId() {
		return _tincanStatementAttachment.getStatementAttachmentId();
	}

	/**
	* Sets the statement attachment ID of this tincan statement attachment.
	*
	* @param statementAttachmentId the statement attachment ID of this tincan statement attachment
	*/
	@Override
	public void setStatementAttachmentId(long statementAttachmentId) {
		_tincanStatementAttachment.setStatementAttachmentId(statementAttachmentId);
	}

	@Override
	public boolean isNew() {
		return _tincanStatementAttachment.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tincanStatementAttachment.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tincanStatementAttachment.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tincanStatementAttachment.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tincanStatementAttachment.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tincanStatementAttachment.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tincanStatementAttachment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tincanStatementAttachment.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tincanStatementAttachment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tincanStatementAttachment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tincanStatementAttachment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TincanStatementAttachmentWrapper((TincanStatementAttachment)_tincanStatementAttachment.clone());
	}

	@Override
	public int compareTo(TincanStatementAttachment tincanStatementAttachment) {
		return _tincanStatementAttachment.compareTo(tincanStatementAttachment);
	}

	@Override
	public int hashCode() {
		return _tincanStatementAttachment.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TincanStatementAttachment> toCacheModel() {
		return _tincanStatementAttachment.toCacheModel();
	}

	@Override
	public TincanStatementAttachment toEscapedModel() {
		return new TincanStatementAttachmentWrapper(_tincanStatementAttachment.toEscapedModel());
	}

	@Override
	public TincanStatementAttachment toUnescapedModel() {
		return new TincanStatementAttachmentWrapper(_tincanStatementAttachment.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tincanStatementAttachment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tincanStatementAttachment.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tincanStatementAttachment.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TincanStatementAttachmentWrapper)) {
			return false;
		}

		TincanStatementAttachmentWrapper tincanStatementAttachmentWrapper = (TincanStatementAttachmentWrapper)obj;

		if (Validator.equals(_tincanStatementAttachment,
					tincanStatementAttachmentWrapper._tincanStatementAttachment)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TincanStatementAttachment getWrappedTincanStatementAttachment() {
		return _tincanStatementAttachment;
	}

	@Override
	public TincanStatementAttachment getWrappedModel() {
		return _tincanStatementAttachment;
	}

	@Override
	public void resetOriginalValues() {
		_tincanStatementAttachment.resetOriginalValues();
	}

	private TincanStatementAttachment _tincanStatementAttachment;
}
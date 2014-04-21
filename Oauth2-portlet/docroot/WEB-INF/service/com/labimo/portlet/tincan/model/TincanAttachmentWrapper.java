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
 * This class is a wrapper for {@link TincanAttachment}.
 * </p>
 *
 * @author wzgong
 * @see TincanAttachment
 * @generated
 */
public class TincanAttachmentWrapper implements TincanAttachment,
	ModelWrapper<TincanAttachment> {
	public TincanAttachmentWrapper(TincanAttachment tincanAttachment) {
		_tincanAttachment = tincanAttachment;
	}

	@Override
	public Class<?> getModelClass() {
		return TincanAttachment.class;
	}

	@Override
	public String getModelClassName() {
		return TincanAttachment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("usageType", getUsageType());
		attributes.put("contentType", getContentType());
		attributes.put("length", getLength());
		attributes.put("sha2", getSha2());
		attributes.put("fileUrl", getFileUrl());
		attributes.put("payload", getPayload());
		attributes.put("display", getDisplay());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String usageType = (String)attributes.get("usageType");

		if (usageType != null) {
			setUsageType(usageType);
		}

		String contentType = (String)attributes.get("contentType");

		if (contentType != null) {
			setContentType(contentType);
		}

		Long length = (Long)attributes.get("length");

		if (length != null) {
			setLength(length);
		}

		Long sha2 = (Long)attributes.get("sha2");

		if (sha2 != null) {
			setSha2(sha2);
		}

		String fileUrl = (String)attributes.get("fileUrl");

		if (fileUrl != null) {
			setFileUrl(fileUrl);
		}

		String payload = (String)attributes.get("payload");

		if (payload != null) {
			setPayload(payload);
		}

		String display = (String)attributes.get("display");

		if (display != null) {
			setDisplay(display);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this tincan attachment.
	*
	* @return the primary key of this tincan attachment
	*/
	@Override
	public long getPrimaryKey() {
		return _tincanAttachment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tincan attachment.
	*
	* @param primaryKey the primary key of this tincan attachment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tincanAttachment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tincan attachment.
	*
	* @return the ID of this tincan attachment
	*/
	@Override
	public long getId() {
		return _tincanAttachment.getId();
	}

	/**
	* Sets the ID of this tincan attachment.
	*
	* @param id the ID of this tincan attachment
	*/
	@Override
	public void setId(long id) {
		_tincanAttachment.setId(id);
	}

	/**
	* Returns the usage type of this tincan attachment.
	*
	* @return the usage type of this tincan attachment
	*/
	@Override
	public java.lang.String getUsageType() {
		return _tincanAttachment.getUsageType();
	}

	/**
	* Sets the usage type of this tincan attachment.
	*
	* @param usageType the usage type of this tincan attachment
	*/
	@Override
	public void setUsageType(java.lang.String usageType) {
		_tincanAttachment.setUsageType(usageType);
	}

	/**
	* Returns the content type of this tincan attachment.
	*
	* @return the content type of this tincan attachment
	*/
	@Override
	public java.lang.String getContentType() {
		return _tincanAttachment.getContentType();
	}

	/**
	* Sets the content type of this tincan attachment.
	*
	* @param contentType the content type of this tincan attachment
	*/
	@Override
	public void setContentType(java.lang.String contentType) {
		_tincanAttachment.setContentType(contentType);
	}

	/**
	* Returns the length of this tincan attachment.
	*
	* @return the length of this tincan attachment
	*/
	@Override
	public long getLength() {
		return _tincanAttachment.getLength();
	}

	/**
	* Sets the length of this tincan attachment.
	*
	* @param length the length of this tincan attachment
	*/
	@Override
	public void setLength(long length) {
		_tincanAttachment.setLength(length);
	}

	/**
	* Returns the sha2 of this tincan attachment.
	*
	* @return the sha2 of this tincan attachment
	*/
	@Override
	public long getSha2() {
		return _tincanAttachment.getSha2();
	}

	/**
	* Sets the sha2 of this tincan attachment.
	*
	* @param sha2 the sha2 of this tincan attachment
	*/
	@Override
	public void setSha2(long sha2) {
		_tincanAttachment.setSha2(sha2);
	}

	/**
	* Returns the file url of this tincan attachment.
	*
	* @return the file url of this tincan attachment
	*/
	@Override
	public java.lang.String getFileUrl() {
		return _tincanAttachment.getFileUrl();
	}

	/**
	* Sets the file url of this tincan attachment.
	*
	* @param fileUrl the file url of this tincan attachment
	*/
	@Override
	public void setFileUrl(java.lang.String fileUrl) {
		_tincanAttachment.setFileUrl(fileUrl);
	}

	/**
	* Returns the payload of this tincan attachment.
	*
	* @return the payload of this tincan attachment
	*/
	@Override
	public java.lang.String getPayload() {
		return _tincanAttachment.getPayload();
	}

	/**
	* Sets the payload of this tincan attachment.
	*
	* @param payload the payload of this tincan attachment
	*/
	@Override
	public void setPayload(java.lang.String payload) {
		_tincanAttachment.setPayload(payload);
	}

	/**
	* Returns the display of this tincan attachment.
	*
	* @return the display of this tincan attachment
	*/
	@Override
	public java.lang.String getDisplay() {
		return _tincanAttachment.getDisplay();
	}

	/**
	* Sets the display of this tincan attachment.
	*
	* @param display the display of this tincan attachment
	*/
	@Override
	public void setDisplay(java.lang.String display) {
		_tincanAttachment.setDisplay(display);
	}

	/**
	* Returns the description of this tincan attachment.
	*
	* @return the description of this tincan attachment
	*/
	@Override
	public java.lang.String getDescription() {
		return _tincanAttachment.getDescription();
	}

	/**
	* Sets the description of this tincan attachment.
	*
	* @param description the description of this tincan attachment
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_tincanAttachment.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _tincanAttachment.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tincanAttachment.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tincanAttachment.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tincanAttachment.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tincanAttachment.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tincanAttachment.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tincanAttachment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tincanAttachment.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tincanAttachment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tincanAttachment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tincanAttachment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TincanAttachmentWrapper((TincanAttachment)_tincanAttachment.clone());
	}

	@Override
	public int compareTo(TincanAttachment tincanAttachment) {
		return _tincanAttachment.compareTo(tincanAttachment);
	}

	@Override
	public int hashCode() {
		return _tincanAttachment.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TincanAttachment> toCacheModel() {
		return _tincanAttachment.toCacheModel();
	}

	@Override
	public TincanAttachment toEscapedModel() {
		return new TincanAttachmentWrapper(_tincanAttachment.toEscapedModel());
	}

	@Override
	public TincanAttachment toUnescapedModel() {
		return new TincanAttachmentWrapper(_tincanAttachment.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tincanAttachment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tincanAttachment.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tincanAttachment.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TincanAttachmentWrapper)) {
			return false;
		}

		TincanAttachmentWrapper tincanAttachmentWrapper = (TincanAttachmentWrapper)obj;

		if (Validator.equals(_tincanAttachment,
					tincanAttachmentWrapper._tincanAttachment)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TincanAttachment getWrappedTincanAttachment() {
		return _tincanAttachment;
	}

	@Override
	public TincanAttachment getWrappedModel() {
		return _tincanAttachment;
	}

	@Override
	public void resetOriginalValues() {
		_tincanAttachment.resetOriginalValues();
	}

	private TincanAttachment _tincanAttachment;
}
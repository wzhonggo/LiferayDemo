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

package com.labimo.portlet.tincan.model.impl;

import com.labimo.portlet.tincan.model.TincanAttachment;
import com.labimo.portlet.tincan.model.TincanAttachmentModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TincanAttachment service. Represents a row in the &quot;labimo_TincanAttachment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.labimo.portlet.tincan.model.TincanAttachmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TincanAttachmentImpl}.
 * </p>
 *
 * @author wzgong
 * @see TincanAttachmentImpl
 * @see com.labimo.portlet.tincan.model.TincanAttachment
 * @see com.labimo.portlet.tincan.model.TincanAttachmentModel
 * @generated
 */
public class TincanAttachmentModelImpl extends BaseModelImpl<TincanAttachment>
	implements TincanAttachmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tincan attachment model instance should use the {@link com.labimo.portlet.tincan.model.TincanAttachment} interface instead.
	 */
	public static final String TABLE_NAME = "labimo_TincanAttachment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "usageType", Types.VARCHAR },
			{ "contentType", Types.VARCHAR },
			{ "length", Types.BIGINT },
			{ "sha2", Types.BIGINT },
			{ "fileUrl", Types.VARCHAR },
			{ "payload", Types.VARCHAR },
			{ "display", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table labimo_TincanAttachment (id_ LONG not null primary key,usageType VARCHAR(75) null,contentType VARCHAR(75) null,length LONG,sha2 LONG,fileUrl VARCHAR(75) null,payload VARCHAR(75) null,display VARCHAR(75) null,description VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table labimo_TincanAttachment";
	public static final String ORDER_BY_JPQL = " ORDER BY tincanAttachment.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY labimo_TincanAttachment.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.labimo.portlet.tincan.model.TincanAttachment"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.labimo.portlet.tincan.model.TincanAttachment"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.labimo.portlet.tincan.model.TincanAttachment"));

	public TincanAttachmentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public String getUsageType() {
		if (_usageType == null) {
			return StringPool.BLANK;
		}
		else {
			return _usageType;
		}
	}

	@Override
	public void setUsageType(String usageType) {
		_usageType = usageType;
	}

	@Override
	public String getContentType() {
		if (_contentType == null) {
			return StringPool.BLANK;
		}
		else {
			return _contentType;
		}
	}

	@Override
	public void setContentType(String contentType) {
		_contentType = contentType;
	}

	@Override
	public long getLength() {
		return _length;
	}

	@Override
	public void setLength(long length) {
		_length = length;
	}

	@Override
	public long getSha2() {
		return _sha2;
	}

	@Override
	public void setSha2(long sha2) {
		_sha2 = sha2;
	}

	@Override
	public String getFileUrl() {
		if (_fileUrl == null) {
			return StringPool.BLANK;
		}
		else {
			return _fileUrl;
		}
	}

	@Override
	public void setFileUrl(String fileUrl) {
		_fileUrl = fileUrl;
	}

	@Override
	public String getPayload() {
		if (_payload == null) {
			return StringPool.BLANK;
		}
		else {
			return _payload;
		}
	}

	@Override
	public void setPayload(String payload) {
		_payload = payload;
	}

	@Override
	public String getDisplay() {
		if (_display == null) {
			return StringPool.BLANK;
		}
		else {
			return _display;
		}
	}

	@Override
	public void setDisplay(String display) {
		_display = display;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TincanAttachment.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TincanAttachment toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TincanAttachment)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TincanAttachmentImpl tincanAttachmentImpl = new TincanAttachmentImpl();

		tincanAttachmentImpl.setId(getId());
		tincanAttachmentImpl.setUsageType(getUsageType());
		tincanAttachmentImpl.setContentType(getContentType());
		tincanAttachmentImpl.setLength(getLength());
		tincanAttachmentImpl.setSha2(getSha2());
		tincanAttachmentImpl.setFileUrl(getFileUrl());
		tincanAttachmentImpl.setPayload(getPayload());
		tincanAttachmentImpl.setDisplay(getDisplay());
		tincanAttachmentImpl.setDescription(getDescription());

		tincanAttachmentImpl.resetOriginalValues();

		return tincanAttachmentImpl;
	}

	@Override
	public int compareTo(TincanAttachment tincanAttachment) {
		long primaryKey = tincanAttachment.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TincanAttachment)) {
			return false;
		}

		TincanAttachment tincanAttachment = (TincanAttachment)obj;

		long primaryKey = tincanAttachment.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<TincanAttachment> toCacheModel() {
		TincanAttachmentCacheModel tincanAttachmentCacheModel = new TincanAttachmentCacheModel();

		tincanAttachmentCacheModel.id = getId();

		tincanAttachmentCacheModel.usageType = getUsageType();

		String usageType = tincanAttachmentCacheModel.usageType;

		if ((usageType != null) && (usageType.length() == 0)) {
			tincanAttachmentCacheModel.usageType = null;
		}

		tincanAttachmentCacheModel.contentType = getContentType();

		String contentType = tincanAttachmentCacheModel.contentType;

		if ((contentType != null) && (contentType.length() == 0)) {
			tincanAttachmentCacheModel.contentType = null;
		}

		tincanAttachmentCacheModel.length = getLength();

		tincanAttachmentCacheModel.sha2 = getSha2();

		tincanAttachmentCacheModel.fileUrl = getFileUrl();

		String fileUrl = tincanAttachmentCacheModel.fileUrl;

		if ((fileUrl != null) && (fileUrl.length() == 0)) {
			tincanAttachmentCacheModel.fileUrl = null;
		}

		tincanAttachmentCacheModel.payload = getPayload();

		String payload = tincanAttachmentCacheModel.payload;

		if ((payload != null) && (payload.length() == 0)) {
			tincanAttachmentCacheModel.payload = null;
		}

		tincanAttachmentCacheModel.display = getDisplay();

		String display = tincanAttachmentCacheModel.display;

		if ((display != null) && (display.length() == 0)) {
			tincanAttachmentCacheModel.display = null;
		}

		tincanAttachmentCacheModel.description = getDescription();

		String description = tincanAttachmentCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			tincanAttachmentCacheModel.description = null;
		}

		return tincanAttachmentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", usageType=");
		sb.append(getUsageType());
		sb.append(", contentType=");
		sb.append(getContentType());
		sb.append(", length=");
		sb.append(getLength());
		sb.append(", sha2=");
		sb.append(getSha2());
		sb.append(", fileUrl=");
		sb.append(getFileUrl());
		sb.append(", payload=");
		sb.append(getPayload());
		sb.append(", display=");
		sb.append(getDisplay());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.TincanAttachment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usageType</column-name><column-value><![CDATA[");
		sb.append(getUsageType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contentType</column-name><column-value><![CDATA[");
		sb.append(getContentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>length</column-name><column-value><![CDATA[");
		sb.append(getLength());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sha2</column-name><column-value><![CDATA[");
		sb.append(getSha2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileUrl</column-name><column-value><![CDATA[");
		sb.append(getFileUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>payload</column-name><column-value><![CDATA[");
		sb.append(getPayload());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>display</column-name><column-value><![CDATA[");
		sb.append(getDisplay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TincanAttachment.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TincanAttachment.class
		};
	private long _id;
	private String _usageType;
	private String _contentType;
	private long _length;
	private long _sha2;
	private String _fileUrl;
	private String _payload;
	private String _display;
	private String _description;
	private TincanAttachment _escapedModel;
}
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

import com.labimo.portlet.tincan.service.ClpSerializer;
import com.labimo.portlet.tincan.service.TincanAttachmentLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wzgong
 */
public class TincanAttachmentClp extends BaseModelImpl<TincanAttachment>
	implements TincanAttachment {
	public TincanAttachmentClp() {
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

		if (_tincanAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tincanAttachmentRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUsageType() {
		return _usageType;
	}

	@Override
	public void setUsageType(String usageType) {
		_usageType = usageType;

		if (_tincanAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setUsageType", String.class);

				method.invoke(_tincanAttachmentRemoteModel, usageType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContentType() {
		return _contentType;
	}

	@Override
	public void setContentType(String contentType) {
		_contentType = contentType;

		if (_tincanAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setContentType", String.class);

				method.invoke(_tincanAttachmentRemoteModel, contentType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLength() {
		return _length;
	}

	@Override
	public void setLength(long length) {
		_length = length;

		if (_tincanAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setLength", long.class);

				method.invoke(_tincanAttachmentRemoteModel, length);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSha2() {
		return _sha2;
	}

	@Override
	public void setSha2(long sha2) {
		_sha2 = sha2;

		if (_tincanAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setSha2", long.class);

				method.invoke(_tincanAttachmentRemoteModel, sha2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFileUrl() {
		return _fileUrl;
	}

	@Override
	public void setFileUrl(String fileUrl) {
		_fileUrl = fileUrl;

		if (_tincanAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setFileUrl", String.class);

				method.invoke(_tincanAttachmentRemoteModel, fileUrl);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPayload() {
		return _payload;
	}

	@Override
	public void setPayload(String payload) {
		_payload = payload;

		if (_tincanAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setPayload", String.class);

				method.invoke(_tincanAttachmentRemoteModel, payload);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDisplay() {
		return _display;
	}

	@Override
	public void setDisplay(String display) {
		_display = display;

		if (_tincanAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setDisplay", String.class);

				method.invoke(_tincanAttachmentRemoteModel, display);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_tincanAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_tincanAttachmentRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTincanAttachmentRemoteModel() {
		return _tincanAttachmentRemoteModel;
	}

	public void setTincanAttachmentRemoteModel(
		BaseModel<?> tincanAttachmentRemoteModel) {
		_tincanAttachmentRemoteModel = tincanAttachmentRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _tincanAttachmentRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_tincanAttachmentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TincanAttachmentLocalServiceUtil.addTincanAttachment(this);
		}
		else {
			TincanAttachmentLocalServiceUtil.updateTincanAttachment(this);
		}
	}

	@Override
	public TincanAttachment toEscapedModel() {
		return (TincanAttachment)ProxyUtil.newProxyInstance(TincanAttachment.class.getClassLoader(),
			new Class[] { TincanAttachment.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TincanAttachmentClp clone = new TincanAttachmentClp();

		clone.setId(getId());
		clone.setUsageType(getUsageType());
		clone.setContentType(getContentType());
		clone.setLength(getLength());
		clone.setSha2(getSha2());
		clone.setFileUrl(getFileUrl());
		clone.setPayload(getPayload());
		clone.setDisplay(getDisplay());
		clone.setDescription(getDescription());

		return clone;
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

		if (!(obj instanceof TincanAttachmentClp)) {
			return false;
		}

		TincanAttachmentClp tincanAttachment = (TincanAttachmentClp)obj;

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

	private long _id;
	private String _usageType;
	private String _contentType;
	private long _length;
	private long _sha2;
	private String _fileUrl;
	private String _payload;
	private String _display;
	private String _description;
	private BaseModel<?> _tincanAttachmentRemoteModel;
}
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
import com.labimo.portlet.tincan.service.TincanStatementAttachmentLocalServiceUtil;

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
public class TincanStatementAttachmentClp extends BaseModelImpl<TincanStatementAttachment>
	implements TincanStatementAttachment {
	public TincanStatementAttachmentClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tincanStatementAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tincanStatementAttachmentRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStatementId() {
		return _statementId;
	}

	@Override
	public void setStatementId(long statementId) {
		_statementId = statementId;

		if (_tincanStatementAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setStatementId", long.class);

				method.invoke(_tincanStatementAttachmentRemoteModel, statementId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStatementAttachmentId() {
		return _statementAttachmentId;
	}

	@Override
	public void setStatementAttachmentId(long statementAttachmentId) {
		_statementAttachmentId = statementAttachmentId;

		if (_tincanStatementAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setStatementAttachmentId",
						long.class);

				method.invoke(_tincanStatementAttachmentRemoteModel,
					statementAttachmentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTincanStatementAttachmentRemoteModel() {
		return _tincanStatementAttachmentRemoteModel;
	}

	public void setTincanStatementAttachmentRemoteModel(
		BaseModel<?> tincanStatementAttachmentRemoteModel) {
		_tincanStatementAttachmentRemoteModel = tincanStatementAttachmentRemoteModel;
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

		Class<?> remoteModelClass = _tincanStatementAttachmentRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tincanStatementAttachmentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TincanStatementAttachmentLocalServiceUtil.addTincanStatementAttachment(this);
		}
		else {
			TincanStatementAttachmentLocalServiceUtil.updateTincanStatementAttachment(this);
		}
	}

	@Override
	public TincanStatementAttachment toEscapedModel() {
		return (TincanStatementAttachment)ProxyUtil.newProxyInstance(TincanStatementAttachment.class.getClassLoader(),
			new Class[] { TincanStatementAttachment.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TincanStatementAttachmentClp clone = new TincanStatementAttachmentClp();

		clone.setId(getId());
		clone.setStatementId(getStatementId());
		clone.setStatementAttachmentId(getStatementAttachmentId());

		return clone;
	}

	@Override
	public int compareTo(TincanStatementAttachment tincanStatementAttachment) {
		long primaryKey = tincanStatementAttachment.getPrimaryKey();

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

		if (!(obj instanceof TincanStatementAttachmentClp)) {
			return false;
		}

		TincanStatementAttachmentClp tincanStatementAttachment = (TincanStatementAttachmentClp)obj;

		long primaryKey = tincanStatementAttachment.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", statementId=");
		sb.append(getStatementId());
		sb.append(", statementAttachmentId=");
		sb.append(getStatementAttachmentId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.TincanStatementAttachment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statementId</column-name><column-value><![CDATA[");
		sb.append(getStatementId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statementAttachmentId</column-name><column-value><![CDATA[");
		sb.append(getStatementAttachmentId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _statementId;
	private long _statementAttachmentId;
	private BaseModel<?> _tincanStatementAttachmentRemoteModel;
}
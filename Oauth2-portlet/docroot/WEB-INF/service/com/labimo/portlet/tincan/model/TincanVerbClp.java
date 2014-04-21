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
import com.labimo.portlet.tincan.service.TincanVerbLocalServiceUtil;

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
public class TincanVerbClp extends BaseModelImpl<TincanVerb>
	implements TincanVerb {
	public TincanVerbClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tincanVerbRemoteModel != null) {
			try {
				Class<?> clazz = _tincanVerbRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tincanVerbRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVerbId() {
		return _verbId;
	}

	@Override
	public void setVerbId(String verbId) {
		_verbId = verbId;

		if (_tincanVerbRemoteModel != null) {
			try {
				Class<?> clazz = _tincanVerbRemoteModel.getClass();

				Method method = clazz.getMethod("setVerbId", String.class);

				method.invoke(_tincanVerbRemoteModel, verbId);
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

		if (_tincanVerbRemoteModel != null) {
			try {
				Class<?> clazz = _tincanVerbRemoteModel.getClass();

				Method method = clazz.getMethod("setDisplay", String.class);

				method.invoke(_tincanVerbRemoteModel, display);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTincanVerbRemoteModel() {
		return _tincanVerbRemoteModel;
	}

	public void setTincanVerbRemoteModel(BaseModel<?> tincanVerbRemoteModel) {
		_tincanVerbRemoteModel = tincanVerbRemoteModel;
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

		Class<?> remoteModelClass = _tincanVerbRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tincanVerbRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TincanVerbLocalServiceUtil.addTincanVerb(this);
		}
		else {
			TincanVerbLocalServiceUtil.updateTincanVerb(this);
		}
	}

	@Override
	public TincanVerb toEscapedModel() {
		return (TincanVerb)ProxyUtil.newProxyInstance(TincanVerb.class.getClassLoader(),
			new Class[] { TincanVerb.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TincanVerbClp clone = new TincanVerbClp();

		clone.setId(getId());
		clone.setVerbId(getVerbId());
		clone.setDisplay(getDisplay());

		return clone;
	}

	@Override
	public int compareTo(TincanVerb tincanVerb) {
		long primaryKey = tincanVerb.getPrimaryKey();

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

		if (!(obj instanceof TincanVerbClp)) {
			return false;
		}

		TincanVerbClp tincanVerb = (TincanVerbClp)obj;

		long primaryKey = tincanVerb.getPrimaryKey();

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
		sb.append(", verbId=");
		sb.append(getVerbId());
		sb.append(", display=");
		sb.append(getDisplay());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.TincanVerb");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>verbId</column-name><column-value><![CDATA[");
		sb.append(getVerbId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>display</column-name><column-value><![CDATA[");
		sb.append(getDisplay());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _verbId;
	private String _display;
	private BaseModel<?> _tincanVerbRemoteModel;
}
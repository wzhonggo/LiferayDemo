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
import com.labimo.portlet.tincan.service.LiferayTincanManifestActLocalServiceUtil;

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
public class LiferayTincanManifestActClp extends BaseModelImpl<LiferayTincanManifestAct>
	implements LiferayTincanManifestAct {
	public LiferayTincanManifestActClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LiferayTincanManifestAct.class;
	}

	@Override
	public String getModelClassName() {
		return LiferayTincanManifestAct.class.getName();
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
		attributes.put("activityId", getActivityId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("launch", getLaunch());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String activityId = (String)attributes.get("activityId");

		if (activityId != null) {
			setActivityId(activityId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String launch = (String)attributes.get("launch");

		if (launch != null) {
			setLaunch(launch);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_liferayTincanManifestActRemoteModel != null) {
			try {
				Class<?> clazz = _liferayTincanManifestActRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_liferayTincanManifestActRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getActivityId() {
		return _activityId;
	}

	@Override
	public void setActivityId(String activityId) {
		_activityId = activityId;

		if (_liferayTincanManifestActRemoteModel != null) {
			try {
				Class<?> clazz = _liferayTincanManifestActRemoteModel.getClass();

				Method method = clazz.getMethod("setActivityId", String.class);

				method.invoke(_liferayTincanManifestActRemoteModel, activityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_liferayTincanManifestActRemoteModel != null) {
			try {
				Class<?> clazz = _liferayTincanManifestActRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_liferayTincanManifestActRemoteModel, name);
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

		if (_liferayTincanManifestActRemoteModel != null) {
			try {
				Class<?> clazz = _liferayTincanManifestActRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_liferayTincanManifestActRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLaunch() {
		return _launch;
	}

	@Override
	public void setLaunch(String launch) {
		_launch = launch;

		if (_liferayTincanManifestActRemoteModel != null) {
			try {
				Class<?> clazz = _liferayTincanManifestActRemoteModel.getClass();

				Method method = clazz.getMethod("setLaunch", String.class);

				method.invoke(_liferayTincanManifestActRemoteModel, launch);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLiferayTincanManifestActRemoteModel() {
		return _liferayTincanManifestActRemoteModel;
	}

	public void setLiferayTincanManifestActRemoteModel(
		BaseModel<?> liferayTincanManifestActRemoteModel) {
		_liferayTincanManifestActRemoteModel = liferayTincanManifestActRemoteModel;
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

		Class<?> remoteModelClass = _liferayTincanManifestActRemoteModel.getClass();

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

		Object returnValue = method.invoke(_liferayTincanManifestActRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LiferayTincanManifestActLocalServiceUtil.addLiferayTincanManifestAct(this);
		}
		else {
			LiferayTincanManifestActLocalServiceUtil.updateLiferayTincanManifestAct(this);
		}
	}

	@Override
	public LiferayTincanManifestAct toEscapedModel() {
		return (LiferayTincanManifestAct)ProxyUtil.newProxyInstance(LiferayTincanManifestAct.class.getClassLoader(),
			new Class[] { LiferayTincanManifestAct.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LiferayTincanManifestActClp clone = new LiferayTincanManifestActClp();

		clone.setId(getId());
		clone.setActivityId(getActivityId());
		clone.setName(getName());
		clone.setDescription(getDescription());
		clone.setLaunch(getLaunch());

		return clone;
	}

	@Override
	public int compareTo(LiferayTincanManifestAct liferayTincanManifestAct) {
		long primaryKey = liferayTincanManifestAct.getPrimaryKey();

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

		if (!(obj instanceof LiferayTincanManifestActClp)) {
			return false;
		}

		LiferayTincanManifestActClp liferayTincanManifestAct = (LiferayTincanManifestActClp)obj;

		long primaryKey = liferayTincanManifestAct.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", activityId=");
		sb.append(getActivityId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", launch=");
		sb.append(getLaunch());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.LiferayTincanManifestAct");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>activityId</column-name><column-value><![CDATA[");
		sb.append(getActivityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>launch</column-name><column-value><![CDATA[");
		sb.append(getLaunch());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _activityId;
	private String _name;
	private String _description;
	private String _launch;
	private BaseModel<?> _liferayTincanManifestActRemoteModel;
}
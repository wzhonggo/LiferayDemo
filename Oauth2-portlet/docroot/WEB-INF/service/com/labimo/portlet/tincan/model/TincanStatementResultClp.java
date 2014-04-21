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
import com.labimo.portlet.tincan.service.TincanStatementResultLocalServiceUtil;

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
public class TincanStatementResultClp extends BaseModelImpl<TincanStatementResult>
	implements TincanStatementResult {
	public TincanStatementResultClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TincanStatementResult.class;
	}

	@Override
	public String getModelClassName() {
		return TincanStatementResult.class.getName();
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
		attributes.put("success", getSuccess());
		attributes.put("completion", getCompletion());
		attributes.put("response", getResponse());
		attributes.put("duration", getDuration());
		attributes.put("extension", getExtension());
		attributes.put("scoreScaled", getScoreScaled());
		attributes.put("scoreRaw", getScoreRaw());
		attributes.put("scoreMin", getScoreMin());
		attributes.put("scoreMax", getScoreMax());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Boolean success = (Boolean)attributes.get("success");

		if (success != null) {
			setSuccess(success);
		}

		Boolean completion = (Boolean)attributes.get("completion");

		if (completion != null) {
			setCompletion(completion);
		}

		String response = (String)attributes.get("response");

		if (response != null) {
			setResponse(response);
		}

		String duration = (String)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}

		String extension = (String)attributes.get("extension");

		if (extension != null) {
			setExtension(extension);
		}

		Double scoreScaled = (Double)attributes.get("scoreScaled");

		if (scoreScaled != null) {
			setScoreScaled(scoreScaled);
		}

		Double scoreRaw = (Double)attributes.get("scoreRaw");

		if (scoreRaw != null) {
			setScoreRaw(scoreRaw);
		}

		Double scoreMin = (Double)attributes.get("scoreMin");

		if (scoreMin != null) {
			setScoreMin(scoreMin);
		}

		Double scoreMax = (Double)attributes.get("scoreMax");

		if (scoreMax != null) {
			setScoreMax(scoreMax);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tincanStatementResultRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementResultRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tincanStatementResultRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getSuccess() {
		return _success;
	}

	@Override
	public boolean isSuccess() {
		return _success;
	}

	@Override
	public void setSuccess(boolean success) {
		_success = success;

		if (_tincanStatementResultRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementResultRemoteModel.getClass();

				Method method = clazz.getMethod("setSuccess", boolean.class);

				method.invoke(_tincanStatementResultRemoteModel, success);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getCompletion() {
		return _completion;
	}

	@Override
	public boolean isCompletion() {
		return _completion;
	}

	@Override
	public void setCompletion(boolean completion) {
		_completion = completion;

		if (_tincanStatementResultRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementResultRemoteModel.getClass();

				Method method = clazz.getMethod("setCompletion", boolean.class);

				method.invoke(_tincanStatementResultRemoteModel, completion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResponse() {
		return _response;
	}

	@Override
	public void setResponse(String response) {
		_response = response;

		if (_tincanStatementResultRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementResultRemoteModel.getClass();

				Method method = clazz.getMethod("setResponse", String.class);

				method.invoke(_tincanStatementResultRemoteModel, response);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDuration() {
		return _duration;
	}

	@Override
	public void setDuration(String duration) {
		_duration = duration;

		if (_tincanStatementResultRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementResultRemoteModel.getClass();

				Method method = clazz.getMethod("setDuration", String.class);

				method.invoke(_tincanStatementResultRemoteModel, duration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExtension() {
		return _extension;
	}

	@Override
	public void setExtension(String extension) {
		_extension = extension;

		if (_tincanStatementResultRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementResultRemoteModel.getClass();

				Method method = clazz.getMethod("setExtension", String.class);

				method.invoke(_tincanStatementResultRemoteModel, extension);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getScoreScaled() {
		return _scoreScaled;
	}

	@Override
	public void setScoreScaled(double scoreScaled) {
		_scoreScaled = scoreScaled;

		if (_tincanStatementResultRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementResultRemoteModel.getClass();

				Method method = clazz.getMethod("setScoreScaled", double.class);

				method.invoke(_tincanStatementResultRemoteModel, scoreScaled);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getScoreRaw() {
		return _scoreRaw;
	}

	@Override
	public void setScoreRaw(double scoreRaw) {
		_scoreRaw = scoreRaw;

		if (_tincanStatementResultRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementResultRemoteModel.getClass();

				Method method = clazz.getMethod("setScoreRaw", double.class);

				method.invoke(_tincanStatementResultRemoteModel, scoreRaw);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getScoreMin() {
		return _scoreMin;
	}

	@Override
	public void setScoreMin(double scoreMin) {
		_scoreMin = scoreMin;

		if (_tincanStatementResultRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementResultRemoteModel.getClass();

				Method method = clazz.getMethod("setScoreMin", double.class);

				method.invoke(_tincanStatementResultRemoteModel, scoreMin);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getScoreMax() {
		return _scoreMax;
	}

	@Override
	public void setScoreMax(double scoreMax) {
		_scoreMax = scoreMax;

		if (_tincanStatementResultRemoteModel != null) {
			try {
				Class<?> clazz = _tincanStatementResultRemoteModel.getClass();

				Method method = clazz.getMethod("setScoreMax", double.class);

				method.invoke(_tincanStatementResultRemoteModel, scoreMax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTincanStatementResultRemoteModel() {
		return _tincanStatementResultRemoteModel;
	}

	public void setTincanStatementResultRemoteModel(
		BaseModel<?> tincanStatementResultRemoteModel) {
		_tincanStatementResultRemoteModel = tincanStatementResultRemoteModel;
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

		Class<?> remoteModelClass = _tincanStatementResultRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tincanStatementResultRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TincanStatementResultLocalServiceUtil.addTincanStatementResult(this);
		}
		else {
			TincanStatementResultLocalServiceUtil.updateTincanStatementResult(this);
		}
	}

	@Override
	public TincanStatementResult toEscapedModel() {
		return (TincanStatementResult)ProxyUtil.newProxyInstance(TincanStatementResult.class.getClassLoader(),
			new Class[] { TincanStatementResult.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TincanStatementResultClp clone = new TincanStatementResultClp();

		clone.setId(getId());
		clone.setSuccess(getSuccess());
		clone.setCompletion(getCompletion());
		clone.setResponse(getResponse());
		clone.setDuration(getDuration());
		clone.setExtension(getExtension());
		clone.setScoreScaled(getScoreScaled());
		clone.setScoreRaw(getScoreRaw());
		clone.setScoreMin(getScoreMin());
		clone.setScoreMax(getScoreMax());

		return clone;
	}

	@Override
	public int compareTo(TincanStatementResult tincanStatementResult) {
		long primaryKey = tincanStatementResult.getPrimaryKey();

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

		if (!(obj instanceof TincanStatementResultClp)) {
			return false;
		}

		TincanStatementResultClp tincanStatementResult = (TincanStatementResultClp)obj;

		long primaryKey = tincanStatementResult.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", success=");
		sb.append(getSuccess());
		sb.append(", completion=");
		sb.append(getCompletion());
		sb.append(", response=");
		sb.append(getResponse());
		sb.append(", duration=");
		sb.append(getDuration());
		sb.append(", extension=");
		sb.append(getExtension());
		sb.append(", scoreScaled=");
		sb.append(getScoreScaled());
		sb.append(", scoreRaw=");
		sb.append(getScoreRaw());
		sb.append(", scoreMin=");
		sb.append(getScoreMin());
		sb.append(", scoreMax=");
		sb.append(getScoreMax());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.TincanStatementResult");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>success</column-name><column-value><![CDATA[");
		sb.append(getSuccess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>completion</column-name><column-value><![CDATA[");
		sb.append(getCompletion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>response</column-name><column-value><![CDATA[");
		sb.append(getResponse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duration</column-name><column-value><![CDATA[");
		sb.append(getDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extension</column-name><column-value><![CDATA[");
		sb.append(getExtension());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scoreScaled</column-name><column-value><![CDATA[");
		sb.append(getScoreScaled());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scoreRaw</column-name><column-value><![CDATA[");
		sb.append(getScoreRaw());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scoreMin</column-name><column-value><![CDATA[");
		sb.append(getScoreMin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scoreMax</column-name><column-value><![CDATA[");
		sb.append(getScoreMax());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private boolean _success;
	private boolean _completion;
	private String _response;
	private String _duration;
	private String _extension;
	private double _scoreScaled;
	private double _scoreRaw;
	private double _scoreMin;
	private double _scoreMax;
	private BaseModel<?> _tincanStatementResultRemoteModel;
}
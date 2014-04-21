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
 * This class is a wrapper for {@link TincanStatementResult}.
 * </p>
 *
 * @author wzgong
 * @see TincanStatementResult
 * @generated
 */
public class TincanStatementResultWrapper implements TincanStatementResult,
	ModelWrapper<TincanStatementResult> {
	public TincanStatementResultWrapper(
		TincanStatementResult tincanStatementResult) {
		_tincanStatementResult = tincanStatementResult;
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

	/**
	* Returns the primary key of this tincan statement result.
	*
	* @return the primary key of this tincan statement result
	*/
	@Override
	public long getPrimaryKey() {
		return _tincanStatementResult.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tincan statement result.
	*
	* @param primaryKey the primary key of this tincan statement result
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tincanStatementResult.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tincan statement result.
	*
	* @return the ID of this tincan statement result
	*/
	@Override
	public long getId() {
		return _tincanStatementResult.getId();
	}

	/**
	* Sets the ID of this tincan statement result.
	*
	* @param id the ID of this tincan statement result
	*/
	@Override
	public void setId(long id) {
		_tincanStatementResult.setId(id);
	}

	/**
	* Returns the success of this tincan statement result.
	*
	* @return the success of this tincan statement result
	*/
	@Override
	public boolean getSuccess() {
		return _tincanStatementResult.getSuccess();
	}

	/**
	* Returns <code>true</code> if this tincan statement result is success.
	*
	* @return <code>true</code> if this tincan statement result is success; <code>false</code> otherwise
	*/
	@Override
	public boolean isSuccess() {
		return _tincanStatementResult.isSuccess();
	}

	/**
	* Sets whether this tincan statement result is success.
	*
	* @param success the success of this tincan statement result
	*/
	@Override
	public void setSuccess(boolean success) {
		_tincanStatementResult.setSuccess(success);
	}

	/**
	* Returns the completion of this tincan statement result.
	*
	* @return the completion of this tincan statement result
	*/
	@Override
	public boolean getCompletion() {
		return _tincanStatementResult.getCompletion();
	}

	/**
	* Returns <code>true</code> if this tincan statement result is completion.
	*
	* @return <code>true</code> if this tincan statement result is completion; <code>false</code> otherwise
	*/
	@Override
	public boolean isCompletion() {
		return _tincanStatementResult.isCompletion();
	}

	/**
	* Sets whether this tincan statement result is completion.
	*
	* @param completion the completion of this tincan statement result
	*/
	@Override
	public void setCompletion(boolean completion) {
		_tincanStatementResult.setCompletion(completion);
	}

	/**
	* Returns the response of this tincan statement result.
	*
	* @return the response of this tincan statement result
	*/
	@Override
	public java.lang.String getResponse() {
		return _tincanStatementResult.getResponse();
	}

	/**
	* Sets the response of this tincan statement result.
	*
	* @param response the response of this tincan statement result
	*/
	@Override
	public void setResponse(java.lang.String response) {
		_tincanStatementResult.setResponse(response);
	}

	/**
	* Returns the duration of this tincan statement result.
	*
	* @return the duration of this tincan statement result
	*/
	@Override
	public java.lang.String getDuration() {
		return _tincanStatementResult.getDuration();
	}

	/**
	* Sets the duration of this tincan statement result.
	*
	* @param duration the duration of this tincan statement result
	*/
	@Override
	public void setDuration(java.lang.String duration) {
		_tincanStatementResult.setDuration(duration);
	}

	/**
	* Returns the extension of this tincan statement result.
	*
	* @return the extension of this tincan statement result
	*/
	@Override
	public java.lang.String getExtension() {
		return _tincanStatementResult.getExtension();
	}

	/**
	* Sets the extension of this tincan statement result.
	*
	* @param extension the extension of this tincan statement result
	*/
	@Override
	public void setExtension(java.lang.String extension) {
		_tincanStatementResult.setExtension(extension);
	}

	/**
	* Returns the score scaled of this tincan statement result.
	*
	* @return the score scaled of this tincan statement result
	*/
	@Override
	public double getScoreScaled() {
		return _tincanStatementResult.getScoreScaled();
	}

	/**
	* Sets the score scaled of this tincan statement result.
	*
	* @param scoreScaled the score scaled of this tincan statement result
	*/
	@Override
	public void setScoreScaled(double scoreScaled) {
		_tincanStatementResult.setScoreScaled(scoreScaled);
	}

	/**
	* Returns the score raw of this tincan statement result.
	*
	* @return the score raw of this tincan statement result
	*/
	@Override
	public double getScoreRaw() {
		return _tincanStatementResult.getScoreRaw();
	}

	/**
	* Sets the score raw of this tincan statement result.
	*
	* @param scoreRaw the score raw of this tincan statement result
	*/
	@Override
	public void setScoreRaw(double scoreRaw) {
		_tincanStatementResult.setScoreRaw(scoreRaw);
	}

	/**
	* Returns the score min of this tincan statement result.
	*
	* @return the score min of this tincan statement result
	*/
	@Override
	public double getScoreMin() {
		return _tincanStatementResult.getScoreMin();
	}

	/**
	* Sets the score min of this tincan statement result.
	*
	* @param scoreMin the score min of this tincan statement result
	*/
	@Override
	public void setScoreMin(double scoreMin) {
		_tincanStatementResult.setScoreMin(scoreMin);
	}

	/**
	* Returns the score max of this tincan statement result.
	*
	* @return the score max of this tincan statement result
	*/
	@Override
	public double getScoreMax() {
		return _tincanStatementResult.getScoreMax();
	}

	/**
	* Sets the score max of this tincan statement result.
	*
	* @param scoreMax the score max of this tincan statement result
	*/
	@Override
	public void setScoreMax(double scoreMax) {
		_tincanStatementResult.setScoreMax(scoreMax);
	}

	@Override
	public boolean isNew() {
		return _tincanStatementResult.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tincanStatementResult.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tincanStatementResult.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tincanStatementResult.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tincanStatementResult.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tincanStatementResult.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tincanStatementResult.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tincanStatementResult.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tincanStatementResult.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tincanStatementResult.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tincanStatementResult.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TincanStatementResultWrapper((TincanStatementResult)_tincanStatementResult.clone());
	}

	@Override
	public int compareTo(TincanStatementResult tincanStatementResult) {
		return _tincanStatementResult.compareTo(tincanStatementResult);
	}

	@Override
	public int hashCode() {
		return _tincanStatementResult.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TincanStatementResult> toCacheModel() {
		return _tincanStatementResult.toCacheModel();
	}

	@Override
	public TincanStatementResult toEscapedModel() {
		return new TincanStatementResultWrapper(_tincanStatementResult.toEscapedModel());
	}

	@Override
	public TincanStatementResult toUnescapedModel() {
		return new TincanStatementResultWrapper(_tincanStatementResult.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tincanStatementResult.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tincanStatementResult.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tincanStatementResult.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TincanStatementResultWrapper)) {
			return false;
		}

		TincanStatementResultWrapper tincanStatementResultWrapper = (TincanStatementResultWrapper)obj;

		if (Validator.equals(_tincanStatementResult,
					tincanStatementResultWrapper._tincanStatementResult)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TincanStatementResult getWrappedTincanStatementResult() {
		return _tincanStatementResult;
	}

	@Override
	public TincanStatementResult getWrappedModel() {
		return _tincanStatementResult;
	}

	@Override
	public void resetOriginalValues() {
		_tincanStatementResult.resetOriginalValues();
	}

	private TincanStatementResult _tincanStatementResult;
}
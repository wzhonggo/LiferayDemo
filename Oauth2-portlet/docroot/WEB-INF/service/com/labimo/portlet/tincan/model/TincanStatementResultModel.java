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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the TincanStatementResult service. Represents a row in the &quot;labimo_TincanStatementResult&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.labimo.portlet.tincan.model.impl.TincanStatementResultModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.labimo.portlet.tincan.model.impl.TincanStatementResultImpl}.
 * </p>
 *
 * @author wzgong
 * @see TincanStatementResult
 * @see com.labimo.portlet.tincan.model.impl.TincanStatementResultImpl
 * @see com.labimo.portlet.tincan.model.impl.TincanStatementResultModelImpl
 * @generated
 */
public interface TincanStatementResultModel extends BaseModel<TincanStatementResult> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tincan statement result model instance should use the {@link TincanStatementResult} interface instead.
	 */

	/**
	 * Returns the primary key of this tincan statement result.
	 *
	 * @return the primary key of this tincan statement result
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tincan statement result.
	 *
	 * @param primaryKey the primary key of this tincan statement result
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this tincan statement result.
	 *
	 * @return the ID of this tincan statement result
	 */
	public long getId();

	/**
	 * Sets the ID of this tincan statement result.
	 *
	 * @param id the ID of this tincan statement result
	 */
	public void setId(long id);

	/**
	 * Returns the success of this tincan statement result.
	 *
	 * @return the success of this tincan statement result
	 */
	public boolean getSuccess();

	/**
	 * Returns <code>true</code> if this tincan statement result is success.
	 *
	 * @return <code>true</code> if this tincan statement result is success; <code>false</code> otherwise
	 */
	public boolean isSuccess();

	/**
	 * Sets whether this tincan statement result is success.
	 *
	 * @param success the success of this tincan statement result
	 */
	public void setSuccess(boolean success);

	/**
	 * Returns the completion of this tincan statement result.
	 *
	 * @return the completion of this tincan statement result
	 */
	public boolean getCompletion();

	/**
	 * Returns <code>true</code> if this tincan statement result is completion.
	 *
	 * @return <code>true</code> if this tincan statement result is completion; <code>false</code> otherwise
	 */
	public boolean isCompletion();

	/**
	 * Sets whether this tincan statement result is completion.
	 *
	 * @param completion the completion of this tincan statement result
	 */
	public void setCompletion(boolean completion);

	/**
	 * Returns the response of this tincan statement result.
	 *
	 * @return the response of this tincan statement result
	 */
	@AutoEscape
	public String getResponse();

	/**
	 * Sets the response of this tincan statement result.
	 *
	 * @param response the response of this tincan statement result
	 */
	public void setResponse(String response);

	/**
	 * Returns the duration of this tincan statement result.
	 *
	 * @return the duration of this tincan statement result
	 */
	@AutoEscape
	public String getDuration();

	/**
	 * Sets the duration of this tincan statement result.
	 *
	 * @param duration the duration of this tincan statement result
	 */
	public void setDuration(String duration);

	/**
	 * Returns the extension of this tincan statement result.
	 *
	 * @return the extension of this tincan statement result
	 */
	@AutoEscape
	public String getExtension();

	/**
	 * Sets the extension of this tincan statement result.
	 *
	 * @param extension the extension of this tincan statement result
	 */
	public void setExtension(String extension);

	/**
	 * Returns the score scaled of this tincan statement result.
	 *
	 * @return the score scaled of this tincan statement result
	 */
	public double getScoreScaled();

	/**
	 * Sets the score scaled of this tincan statement result.
	 *
	 * @param scoreScaled the score scaled of this tincan statement result
	 */
	public void setScoreScaled(double scoreScaled);

	/**
	 * Returns the score raw of this tincan statement result.
	 *
	 * @return the score raw of this tincan statement result
	 */
	public double getScoreRaw();

	/**
	 * Sets the score raw of this tincan statement result.
	 *
	 * @param scoreRaw the score raw of this tincan statement result
	 */
	public void setScoreRaw(double scoreRaw);

	/**
	 * Returns the score min of this tincan statement result.
	 *
	 * @return the score min of this tincan statement result
	 */
	public double getScoreMin();

	/**
	 * Sets the score min of this tincan statement result.
	 *
	 * @param scoreMin the score min of this tincan statement result
	 */
	public void setScoreMin(double scoreMin);

	/**
	 * Returns the score max of this tincan statement result.
	 *
	 * @return the score max of this tincan statement result
	 */
	public double getScoreMax();

	/**
	 * Sets the score max of this tincan statement result.
	 *
	 * @param scoreMax the score max of this tincan statement result
	 */
	public void setScoreMax(double scoreMax);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(TincanStatementResult tincanStatementResult);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TincanStatementResult> toCacheModel();

	@Override
	public TincanStatementResult toEscapedModel();

	@Override
	public TincanStatementResult toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
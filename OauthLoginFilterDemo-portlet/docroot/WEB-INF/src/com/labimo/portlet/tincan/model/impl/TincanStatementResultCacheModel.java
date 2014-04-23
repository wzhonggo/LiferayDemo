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

import com.labimo.portlet.tincan.model.TincanStatementResult;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TincanStatementResult in entity cache.
 *
 * @author wzgong
 * @see TincanStatementResult
 * @generated
 */
public class TincanStatementResultCacheModel implements CacheModel<TincanStatementResult>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", success=");
		sb.append(success);
		sb.append(", completion=");
		sb.append(completion);
		sb.append(", response=");
		sb.append(response);
		sb.append(", duration=");
		sb.append(duration);
		sb.append(", extension=");
		sb.append(extension);
		sb.append(", scoreScaled=");
		sb.append(scoreScaled);
		sb.append(", scoreRaw=");
		sb.append(scoreRaw);
		sb.append(", scoreMin=");
		sb.append(scoreMin);
		sb.append(", scoreMax=");
		sb.append(scoreMax);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TincanStatementResult toEntityModel() {
		TincanStatementResultImpl tincanStatementResultImpl = new TincanStatementResultImpl();

		tincanStatementResultImpl.setId(id);
		tincanStatementResultImpl.setSuccess(success);
		tincanStatementResultImpl.setCompletion(completion);

		if (response == null) {
			tincanStatementResultImpl.setResponse(StringPool.BLANK);
		}
		else {
			tincanStatementResultImpl.setResponse(response);
		}

		if (duration == null) {
			tincanStatementResultImpl.setDuration(StringPool.BLANK);
		}
		else {
			tincanStatementResultImpl.setDuration(duration);
		}

		if (extension == null) {
			tincanStatementResultImpl.setExtension(StringPool.BLANK);
		}
		else {
			tincanStatementResultImpl.setExtension(extension);
		}

		tincanStatementResultImpl.setScoreScaled(scoreScaled);
		tincanStatementResultImpl.setScoreRaw(scoreRaw);
		tincanStatementResultImpl.setScoreMin(scoreMin);
		tincanStatementResultImpl.setScoreMax(scoreMax);

		tincanStatementResultImpl.resetOriginalValues();

		return tincanStatementResultImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		success = objectInput.readBoolean();
		completion = objectInput.readBoolean();
		response = objectInput.readUTF();
		duration = objectInput.readUTF();
		extension = objectInput.readUTF();
		scoreScaled = objectInput.readDouble();
		scoreRaw = objectInput.readDouble();
		scoreMin = objectInput.readDouble();
		scoreMax = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeBoolean(success);
		objectOutput.writeBoolean(completion);

		if (response == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(response);
		}

		if (duration == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(duration);
		}

		if (extension == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(extension);
		}

		objectOutput.writeDouble(scoreScaled);
		objectOutput.writeDouble(scoreRaw);
		objectOutput.writeDouble(scoreMin);
		objectOutput.writeDouble(scoreMax);
	}

	public long id;
	public boolean success;
	public boolean completion;
	public String response;
	public String duration;
	public String extension;
	public double scoreScaled;
	public double scoreRaw;
	public double scoreMin;
	public double scoreMax;
}
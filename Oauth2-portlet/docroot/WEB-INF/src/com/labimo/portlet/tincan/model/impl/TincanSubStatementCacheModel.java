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

import com.labimo.portlet.tincan.model.TincanSubStatement;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TincanSubStatement in entity cache.
 *
 * @author wzgong
 * @see TincanSubStatement
 * @generated
 */
public class TincanSubStatementCacheModel implements CacheModel<TincanSubStatement>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", agentId=");
		sb.append(agentId);
		sb.append(", activityId=");
		sb.append(activityId);
		sb.append(", resultId=");
		sb.append(resultId);
		sb.append(", contextId=");
		sb.append(contextId);
		sb.append(", verbId=");
		sb.append(verbId);
		sb.append(", timestamp=");
		sb.append(timestamp);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TincanSubStatement toEntityModel() {
		TincanSubStatementImpl tincanSubStatementImpl = new TincanSubStatementImpl();

		tincanSubStatementImpl.setId(id);
		tincanSubStatementImpl.setAgentId(agentId);
		tincanSubStatementImpl.setActivityId(activityId);
		tincanSubStatementImpl.setResultId(resultId);
		tincanSubStatementImpl.setContextId(contextId);
		tincanSubStatementImpl.setVerbId(verbId);

		if (timestamp == Long.MIN_VALUE) {
			tincanSubStatementImpl.setTimestamp(null);
		}
		else {
			tincanSubStatementImpl.setTimestamp(new Date(timestamp));
		}

		tincanSubStatementImpl.resetOriginalValues();

		return tincanSubStatementImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		agentId = objectInput.readLong();
		activityId = objectInput.readLong();
		resultId = objectInput.readLong();
		contextId = objectInput.readLong();
		verbId = objectInput.readLong();
		timestamp = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(agentId);
		objectOutput.writeLong(activityId);
		objectOutput.writeLong(resultId);
		objectOutput.writeLong(contextId);
		objectOutput.writeLong(verbId);
		objectOutput.writeLong(timestamp);
	}

	public long id;
	public long agentId;
	public long activityId;
	public long resultId;
	public long contextId;
	public long verbId;
	public long timestamp;
}
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

import com.labimo.portlet.tincan.model.TincanStatement;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TincanStatement in entity cache.
 *
 * @author wzgong
 * @see TincanStatement
 * @generated
 */
public class TincanStatementCacheModel implements CacheModel<TincanStatement>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", statementId=");
		sb.append(statementId);
		sb.append(", subStatementId=");
		sb.append(subStatementId);
		sb.append(", agentId=");
		sb.append(agentId);
		sb.append(", contextId=");
		sb.append(contextId);
		sb.append(", activityId=");
		sb.append(activityId);
		sb.append(", resultId=");
		sb.append(resultId);
		sb.append(", authorityId=");
		sb.append(authorityId);
		sb.append(", timestamp=");
		sb.append(timestamp);
		sb.append(", stored=");
		sb.append(stored);
		sb.append(", version=");
		sb.append(version);
		sb.append(", verbId=");
		sb.append(verbId);
		sb.append(", voided=");
		sb.append(voided);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TincanStatement toEntityModel() {
		TincanStatementImpl tincanStatementImpl = new TincanStatementImpl();

		tincanStatementImpl.setId(id);

		if (statementId == null) {
			tincanStatementImpl.setStatementId(StringPool.BLANK);
		}
		else {
			tincanStatementImpl.setStatementId(statementId);
		}

		tincanStatementImpl.setSubStatementId(subStatementId);
		tincanStatementImpl.setAgentId(agentId);
		tincanStatementImpl.setContextId(contextId);
		tincanStatementImpl.setActivityId(activityId);
		tincanStatementImpl.setResultId(resultId);
		tincanStatementImpl.setAuthorityId(authorityId);

		if (timestamp == Long.MIN_VALUE) {
			tincanStatementImpl.setTimestamp(null);
		}
		else {
			tincanStatementImpl.setTimestamp(new Date(timestamp));
		}

		if (stored == Long.MIN_VALUE) {
			tincanStatementImpl.setStored(null);
		}
		else {
			tincanStatementImpl.setStored(new Date(stored));
		}

		if (version == null) {
			tincanStatementImpl.setVersion(StringPool.BLANK);
		}
		else {
			tincanStatementImpl.setVersion(version);
		}

		tincanStatementImpl.setVerbId(verbId);
		tincanStatementImpl.setVoided(voided);

		tincanStatementImpl.resetOriginalValues();

		return tincanStatementImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		statementId = objectInput.readUTF();
		subStatementId = objectInput.readLong();
		agentId = objectInput.readLong();
		contextId = objectInput.readLong();
		activityId = objectInput.readLong();
		resultId = objectInput.readLong();
		authorityId = objectInput.readLong();
		timestamp = objectInput.readLong();
		stored = objectInput.readLong();
		version = objectInput.readUTF();
		verbId = objectInput.readLong();
		voided = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (statementId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statementId);
		}

		objectOutput.writeLong(subStatementId);
		objectOutput.writeLong(agentId);
		objectOutput.writeLong(contextId);
		objectOutput.writeLong(activityId);
		objectOutput.writeLong(resultId);
		objectOutput.writeLong(authorityId);
		objectOutput.writeLong(timestamp);
		objectOutput.writeLong(stored);

		if (version == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(version);
		}

		objectOutput.writeLong(verbId);
		objectOutput.writeBoolean(voided);
	}

	public long id;
	public String statementId;
	public long subStatementId;
	public long agentId;
	public long contextId;
	public long activityId;
	public long resultId;
	public long authorityId;
	public long timestamp;
	public long stored;
	public String version;
	public long verbId;
	public boolean voided;
}
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

import com.labimo.portlet.tincan.model.TincanActivityState;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TincanActivityState in entity cache.
 *
 * @author wzgong
 * @see TincanActivityState
 * @generated
 */
public class TincanActivityStateCacheModel implements CacheModel<TincanActivityState>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", stateId=");
		sb.append(stateId);
		sb.append(", state=");
		sb.append(state);
		sb.append(", jsonState=");
		sb.append(jsonState);
		sb.append(", agentId=");
		sb.append(agentId);
		sb.append(", activityId=");
		sb.append(activityId);
		sb.append(", registration=");
		sb.append(registration);
		sb.append(", etag=");
		sb.append(etag);
		sb.append(", updated=");
		sb.append(updated);
		sb.append(", contentType=");
		sb.append(contentType);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TincanActivityState toEntityModel() {
		TincanActivityStateImpl tincanActivityStateImpl = new TincanActivityStateImpl();

		tincanActivityStateImpl.setId(id);

		if (stateId == null) {
			tincanActivityStateImpl.setStateId(StringPool.BLANK);
		}
		else {
			tincanActivityStateImpl.setStateId(stateId);
		}

		if (state == null) {
			tincanActivityStateImpl.setState(StringPool.BLANK);
		}
		else {
			tincanActivityStateImpl.setState(state);
		}

		if (jsonState == null) {
			tincanActivityStateImpl.setJsonState(StringPool.BLANK);
		}
		else {
			tincanActivityStateImpl.setJsonState(jsonState);
		}

		tincanActivityStateImpl.setAgentId(agentId);
		tincanActivityStateImpl.setActivityId(activityId);

		if (registration == null) {
			tincanActivityStateImpl.setRegistration(StringPool.BLANK);
		}
		else {
			tincanActivityStateImpl.setRegistration(registration);
		}

		if (etag == null) {
			tincanActivityStateImpl.setEtag(StringPool.BLANK);
		}
		else {
			tincanActivityStateImpl.setEtag(etag);
		}

		if (updated == Long.MIN_VALUE) {
			tincanActivityStateImpl.setUpdated(null);
		}
		else {
			tincanActivityStateImpl.setUpdated(new Date(updated));
		}

		if (contentType == null) {
			tincanActivityStateImpl.setContentType(StringPool.BLANK);
		}
		else {
			tincanActivityStateImpl.setContentType(contentType);
		}

		tincanActivityStateImpl.resetOriginalValues();

		return tincanActivityStateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		stateId = objectInput.readUTF();
		state = objectInput.readUTF();
		jsonState = objectInput.readUTF();
		agentId = objectInput.readLong();
		activityId = objectInput.readLong();
		registration = objectInput.readUTF();
		etag = objectInput.readUTF();
		updated = objectInput.readLong();
		contentType = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (stateId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stateId);
		}

		if (state == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (jsonState == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(jsonState);
		}

		objectOutput.writeLong(agentId);
		objectOutput.writeLong(activityId);

		if (registration == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registration);
		}

		if (etag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(etag);
		}

		objectOutput.writeLong(updated);

		if (contentType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contentType);
		}
	}

	public long id;
	public String stateId;
	public String state;
	public String jsonState;
	public long agentId;
	public long activityId;
	public String registration;
	public String etag;
	public long updated;
	public String contentType;
}
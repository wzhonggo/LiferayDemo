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

import com.labimo.portlet.tincan.model.TincanAgentProfile;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TincanAgentProfile in entity cache.
 *
 * @author wzgong
 * @see TincanAgentProfile
 * @generated
 */
public class TincanAgentProfileCacheModel implements CacheModel<TincanAgentProfile>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", profileId=");
		sb.append(profileId);
		sb.append(", updated=");
		sb.append(updated);
		sb.append(", agentId=");
		sb.append(agentId);
		sb.append(", profile=");
		sb.append(profile);
		sb.append(", json_profile=");
		sb.append(json_profile);
		sb.append(", content_type=");
		sb.append(content_type);
		sb.append(", etag=");
		sb.append(etag);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TincanAgentProfile toEntityModel() {
		TincanAgentProfileImpl tincanAgentProfileImpl = new TincanAgentProfileImpl();

		tincanAgentProfileImpl.setId(id);

		if (profileId == null) {
			tincanAgentProfileImpl.setProfileId(StringPool.BLANK);
		}
		else {
			tincanAgentProfileImpl.setProfileId(profileId);
		}

		if (updated == Long.MIN_VALUE) {
			tincanAgentProfileImpl.setUpdated(null);
		}
		else {
			tincanAgentProfileImpl.setUpdated(new Date(updated));
		}

		tincanAgentProfileImpl.setAgentId(agentId);

		if (profile == null) {
			tincanAgentProfileImpl.setProfile(StringPool.BLANK);
		}
		else {
			tincanAgentProfileImpl.setProfile(profile);
		}

		if (json_profile == null) {
			tincanAgentProfileImpl.setJson_profile(StringPool.BLANK);
		}
		else {
			tincanAgentProfileImpl.setJson_profile(json_profile);
		}

		if (content_type == null) {
			tincanAgentProfileImpl.setContent_type(StringPool.BLANK);
		}
		else {
			tincanAgentProfileImpl.setContent_type(content_type);
		}

		if (etag == null) {
			tincanAgentProfileImpl.setEtag(StringPool.BLANK);
		}
		else {
			tincanAgentProfileImpl.setEtag(etag);
		}

		tincanAgentProfileImpl.resetOriginalValues();

		return tincanAgentProfileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		profileId = objectInput.readUTF();
		updated = objectInput.readLong();
		agentId = objectInput.readLong();
		profile = objectInput.readUTF();
		json_profile = objectInput.readUTF();
		content_type = objectInput.readUTF();
		etag = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (profileId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(profileId);
		}

		objectOutput.writeLong(updated);
		objectOutput.writeLong(agentId);

		if (profile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(profile);
		}

		if (json_profile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(json_profile);
		}

		if (content_type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content_type);
		}

		if (etag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(etag);
		}
	}

	public long id;
	public String profileId;
	public long updated;
	public long agentId;
	public String profile;
	public String json_profile;
	public String content_type;
	public String etag;
}
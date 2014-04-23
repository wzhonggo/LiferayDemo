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

import com.labimo.portlet.tincan.model.TincanActivityProfile;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TincanActivityProfile in entity cache.
 *
 * @author wzgong
 * @see TincanActivityProfile
 * @generated
 */
public class TincanActivityProfileCacheModel implements CacheModel<TincanActivityProfile>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", profileId=");
		sb.append(profileId);
		sb.append(", activityId=");
		sb.append(activityId);
		sb.append(", jsonProfile=");
		sb.append(jsonProfile);
		sb.append(", profile=");
		sb.append(profile);
		sb.append(", updated=");
		sb.append(updated);
		sb.append(", content_type=");
		sb.append(content_type);
		sb.append(", etag=");
		sb.append(etag);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TincanActivityProfile toEntityModel() {
		TincanActivityProfileImpl tincanActivityProfileImpl = new TincanActivityProfileImpl();

		tincanActivityProfileImpl.setId(id);

		if (profileId == null) {
			tincanActivityProfileImpl.setProfileId(StringPool.BLANK);
		}
		else {
			tincanActivityProfileImpl.setProfileId(profileId);
		}

		if (activityId == null) {
			tincanActivityProfileImpl.setActivityId(StringPool.BLANK);
		}
		else {
			tincanActivityProfileImpl.setActivityId(activityId);
		}

		if (jsonProfile == null) {
			tincanActivityProfileImpl.setJsonProfile(StringPool.BLANK);
		}
		else {
			tincanActivityProfileImpl.setJsonProfile(jsonProfile);
		}

		if (profile == null) {
			tincanActivityProfileImpl.setProfile(StringPool.BLANK);
		}
		else {
			tincanActivityProfileImpl.setProfile(profile);
		}

		if (updated == Long.MIN_VALUE) {
			tincanActivityProfileImpl.setUpdated(null);
		}
		else {
			tincanActivityProfileImpl.setUpdated(new Date(updated));
		}

		if (content_type == null) {
			tincanActivityProfileImpl.setContent_type(StringPool.BLANK);
		}
		else {
			tincanActivityProfileImpl.setContent_type(content_type);
		}

		if (etag == null) {
			tincanActivityProfileImpl.setEtag(StringPool.BLANK);
		}
		else {
			tincanActivityProfileImpl.setEtag(etag);
		}

		tincanActivityProfileImpl.resetOriginalValues();

		return tincanActivityProfileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		profileId = objectInput.readUTF();
		activityId = objectInput.readUTF();
		jsonProfile = objectInput.readUTF();
		profile = objectInput.readUTF();
		updated = objectInput.readLong();
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

		if (activityId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityId);
		}

		if (jsonProfile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(jsonProfile);
		}

		if (profile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(profile);
		}

		objectOutput.writeLong(updated);

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
	public String activityId;
	public String jsonProfile;
	public String profile;
	public long updated;
	public String content_type;
	public String etag;
}
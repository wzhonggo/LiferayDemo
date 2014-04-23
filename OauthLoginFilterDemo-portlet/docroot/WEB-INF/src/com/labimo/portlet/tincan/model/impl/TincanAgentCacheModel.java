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

import com.labimo.portlet.tincan.model.TincanAgent;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TincanAgent in entity cache.
 *
 * @author wzgong
 * @see TincanAgent
 * @generated
 */
public class TincanAgentCacheModel implements CacheModel<TincanAgent>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", objectType=");
		sb.append(objectType);
		sb.append(", name=");
		sb.append(name);
		sb.append(", mbox=");
		sb.append(mbox);
		sb.append(", mbox_sha1sum=");
		sb.append(mbox_sha1sum);
		sb.append(", openID=");
		sb.append(openID);
		sb.append(", oauth_identifier=");
		sb.append(oauth_identifier);
		sb.append(", canonical_version=");
		sb.append(canonical_version);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TincanAgent toEntityModel() {
		TincanAgentImpl tincanAgentImpl = new TincanAgentImpl();

		tincanAgentImpl.setId(id);

		if (objectType == null) {
			tincanAgentImpl.setObjectType(StringPool.BLANK);
		}
		else {
			tincanAgentImpl.setObjectType(objectType);
		}

		if (name == null) {
			tincanAgentImpl.setName(StringPool.BLANK);
		}
		else {
			tincanAgentImpl.setName(name);
		}

		if (mbox == null) {
			tincanAgentImpl.setMbox(StringPool.BLANK);
		}
		else {
			tincanAgentImpl.setMbox(mbox);
		}

		if (mbox_sha1sum == null) {
			tincanAgentImpl.setMbox_sha1sum(StringPool.BLANK);
		}
		else {
			tincanAgentImpl.setMbox_sha1sum(mbox_sha1sum);
		}

		if (openID == null) {
			tincanAgentImpl.setOpenID(StringPool.BLANK);
		}
		else {
			tincanAgentImpl.setOpenID(openID);
		}

		if (oauth_identifier == null) {
			tincanAgentImpl.setOauth_identifier(StringPool.BLANK);
		}
		else {
			tincanAgentImpl.setOauth_identifier(oauth_identifier);
		}

		tincanAgentImpl.setCanonical_version(canonical_version);

		tincanAgentImpl.resetOriginalValues();

		return tincanAgentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		objectType = objectInput.readUTF();
		name = objectInput.readUTF();
		mbox = objectInput.readUTF();
		mbox_sha1sum = objectInput.readUTF();
		openID = objectInput.readUTF();
		oauth_identifier = objectInput.readUTF();
		canonical_version = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (objectType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(objectType);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (mbox == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mbox);
		}

		if (mbox_sha1sum == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mbox_sha1sum);
		}

		if (openID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(openID);
		}

		if (oauth_identifier == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(oauth_identifier);
		}

		objectOutput.writeBoolean(canonical_version);
	}

	public long id;
	public String objectType;
	public String name;
	public String mbox;
	public String mbox_sha1sum;
	public String openID;
	public String oauth_identifier;
	public boolean canonical_version;
}
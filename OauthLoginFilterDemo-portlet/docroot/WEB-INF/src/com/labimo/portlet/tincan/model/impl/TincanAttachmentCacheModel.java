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

import com.labimo.portlet.tincan.model.TincanAttachment;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TincanAttachment in entity cache.
 *
 * @author wzgong
 * @see TincanAttachment
 * @generated
 */
public class TincanAttachmentCacheModel implements CacheModel<TincanAttachment>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", usageType=");
		sb.append(usageType);
		sb.append(", contentType=");
		sb.append(contentType);
		sb.append(", length=");
		sb.append(length);
		sb.append(", sha2=");
		sb.append(sha2);
		sb.append(", fileUrl=");
		sb.append(fileUrl);
		sb.append(", payload=");
		sb.append(payload);
		sb.append(", display=");
		sb.append(display);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TincanAttachment toEntityModel() {
		TincanAttachmentImpl tincanAttachmentImpl = new TincanAttachmentImpl();

		tincanAttachmentImpl.setId(id);

		if (usageType == null) {
			tincanAttachmentImpl.setUsageType(StringPool.BLANK);
		}
		else {
			tincanAttachmentImpl.setUsageType(usageType);
		}

		if (contentType == null) {
			tincanAttachmentImpl.setContentType(StringPool.BLANK);
		}
		else {
			tincanAttachmentImpl.setContentType(contentType);
		}

		tincanAttachmentImpl.setLength(length);
		tincanAttachmentImpl.setSha2(sha2);

		if (fileUrl == null) {
			tincanAttachmentImpl.setFileUrl(StringPool.BLANK);
		}
		else {
			tincanAttachmentImpl.setFileUrl(fileUrl);
		}

		if (payload == null) {
			tincanAttachmentImpl.setPayload(StringPool.BLANK);
		}
		else {
			tincanAttachmentImpl.setPayload(payload);
		}

		if (display == null) {
			tincanAttachmentImpl.setDisplay(StringPool.BLANK);
		}
		else {
			tincanAttachmentImpl.setDisplay(display);
		}

		if (description == null) {
			tincanAttachmentImpl.setDescription(StringPool.BLANK);
		}
		else {
			tincanAttachmentImpl.setDescription(description);
		}

		tincanAttachmentImpl.resetOriginalValues();

		return tincanAttachmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		usageType = objectInput.readUTF();
		contentType = objectInput.readUTF();
		length = objectInput.readLong();
		sha2 = objectInput.readLong();
		fileUrl = objectInput.readUTF();
		payload = objectInput.readUTF();
		display = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (usageType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(usageType);
		}

		if (contentType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contentType);
		}

		objectOutput.writeLong(length);
		objectOutput.writeLong(sha2);

		if (fileUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileUrl);
		}

		if (payload == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(payload);
		}

		if (display == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(display);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long id;
	public String usageType;
	public String contentType;
	public long length;
	public long sha2;
	public String fileUrl;
	public String payload;
	public String display;
	public String description;
}
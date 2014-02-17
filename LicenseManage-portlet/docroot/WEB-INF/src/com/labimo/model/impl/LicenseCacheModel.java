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

package com.labimo.model.impl;

import com.labimo.model.License;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing License in entity cache.
 *
 * @author wzgong
 * @see License
 * @generated
 */
public class LicenseCacheModel implements CacheModel<License>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{licenseUuid=");
		sb.append(licenseUuid);
		sb.append(", hardwareUuid=");
		sb.append(hardwareUuid);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", content=");
		sb.append(content);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public License toEntityModel() {
		LicenseImpl licenseImpl = new LicenseImpl();

		if (licenseUuid == null) {
			licenseImpl.setLicenseUuid(StringPool.BLANK);
		}
		else {
			licenseImpl.setLicenseUuid(licenseUuid);
		}

		if (hardwareUuid == null) {
			licenseImpl.setHardwareUuid(StringPool.BLANK);
		}
		else {
			licenseImpl.setHardwareUuid(hardwareUuid);
		}

		licenseImpl.setUserId(userId);

		if (content == null) {
			licenseImpl.setContent(StringPool.BLANK);
		}
		else {
			licenseImpl.setContent(content);
		}

		if (createDate == Long.MIN_VALUE) {
			licenseImpl.setCreateDate(null);
		}
		else {
			licenseImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			licenseImpl.setModifiedDate(null);
		}
		else {
			licenseImpl.setModifiedDate(new Date(modifiedDate));
		}

		licenseImpl.resetOriginalValues();

		return licenseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		licenseUuid = objectInput.readUTF();
		hardwareUuid = objectInput.readUTF();
		userId = objectInput.readLong();
		content = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (licenseUuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(licenseUuid);
		}

		if (hardwareUuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hardwareUuid);
		}

		objectOutput.writeLong(userId);

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String licenseUuid;
	public String hardwareUuid;
	public long userId;
	public String content;
	public long createDate;
	public long modifiedDate;
}
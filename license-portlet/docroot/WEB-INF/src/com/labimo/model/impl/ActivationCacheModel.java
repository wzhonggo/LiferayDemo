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

import com.labimo.model.Activation;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Activation in entity cache.
 *
 * @author wzgong
 * @see Activation
 * @generated
 */
public class ActivationCacheModel implements CacheModel<Activation>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{activationId=");
		sb.append(activationId);
		sb.append(", hardwareUuid=");
		sb.append(hardwareUuid);
		sb.append(", licenseUuid=");
		sb.append(licenseUuid);
		sb.append(", createTime=");
		sb.append(createTime);
		sb.append(", valid=");
		sb.append(valid);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Activation toEntityModel() {
		ActivationImpl activationImpl = new ActivationImpl();

		if (activationId == null) {
			activationImpl.setActivationId(StringPool.BLANK);
		}
		else {
			activationImpl.setActivationId(activationId);
		}

		if (hardwareUuid == null) {
			activationImpl.setHardwareUuid(StringPool.BLANK);
		}
		else {
			activationImpl.setHardwareUuid(hardwareUuid);
		}

		if (licenseUuid == null) {
			activationImpl.setLicenseUuid(StringPool.BLANK);
		}
		else {
			activationImpl.setLicenseUuid(licenseUuid);
		}

		if (createTime == Long.MIN_VALUE) {
			activationImpl.setCreateTime(null);
		}
		else {
			activationImpl.setCreateTime(new Date(createTime));
		}

		activationImpl.setValid(valid);

		activationImpl.resetOriginalValues();

		return activationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		activationId = objectInput.readUTF();
		hardwareUuid = objectInput.readUTF();
		licenseUuid = objectInput.readUTF();
		createTime = objectInput.readLong();
		valid = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (activationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activationId);
		}

		if (hardwareUuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hardwareUuid);
		}

		if (licenseUuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(licenseUuid);
		}

		objectOutput.writeLong(createTime);
		objectOutput.writeBoolean(valid);
	}

	public String activationId;
	public String hardwareUuid;
	public String licenseUuid;
	public long createTime;
	public boolean valid;
}
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

import com.labimo.portlet.tincan.model.LiferayUser;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LiferayUser in entity cache.
 *
 * @author wzgong
 * @see LiferayUser
 * @generated
 */
public class LiferayUserCacheModel implements CacheModel<LiferayUser>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", liferayUserId=");
		sb.append(liferayUserId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", preferredAudioLevel=");
		sb.append(preferredAudioLevel);
		sb.append(", preferredLanguage=");
		sb.append(preferredLanguage);
		sb.append(", preferredDeliverySpeed=");
		sb.append(preferredDeliverySpeed);
		sb.append(", preferredAudioCaptioning=");
		sb.append(preferredAudioCaptioning);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LiferayUser toEntityModel() {
		LiferayUserImpl liferayUserImpl = new LiferayUserImpl();

		liferayUserImpl.setId(id);
		liferayUserImpl.setLiferayUserId(liferayUserId);

		if (name == null) {
			liferayUserImpl.setName(StringPool.BLANK);
		}
		else {
			liferayUserImpl.setName(name);
		}

		liferayUserImpl.setPreferredAudioLevel(preferredAudioLevel);

		if (preferredLanguage == null) {
			liferayUserImpl.setPreferredLanguage(StringPool.BLANK);
		}
		else {
			liferayUserImpl.setPreferredLanguage(preferredLanguage);
		}

		liferayUserImpl.setPreferredDeliverySpeed(preferredDeliverySpeed);
		liferayUserImpl.setPreferredAudioCaptioning(preferredAudioCaptioning);

		liferayUserImpl.resetOriginalValues();

		return liferayUserImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		liferayUserId = objectInput.readLong();
		name = objectInput.readUTF();
		preferredAudioLevel = objectInput.readDouble();
		preferredLanguage = objectInput.readUTF();
		preferredDeliverySpeed = objectInput.readDouble();
		preferredAudioCaptioning = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(liferayUserId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeDouble(preferredAudioLevel);

		if (preferredLanguage == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(preferredLanguage);
		}

		objectOutput.writeDouble(preferredDeliverySpeed);
		objectOutput.writeLong(preferredAudioCaptioning);
	}

	public long id;
	public long liferayUserId;
	public String name;
	public double preferredAudioLevel;
	public String preferredLanguage;
	public double preferredDeliverySpeed;
	public long preferredAudioCaptioning;
}
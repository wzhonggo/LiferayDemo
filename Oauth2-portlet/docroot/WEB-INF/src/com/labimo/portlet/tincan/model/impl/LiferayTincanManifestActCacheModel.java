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

import com.labimo.portlet.tincan.model.LiferayTincanManifestAct;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LiferayTincanManifestAct in entity cache.
 *
 * @author wzgong
 * @see LiferayTincanManifestAct
 * @generated
 */
public class LiferayTincanManifestActCacheModel implements CacheModel<LiferayTincanManifestAct>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", activityId=");
		sb.append(activityId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", launch=");
		sb.append(launch);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LiferayTincanManifestAct toEntityModel() {
		LiferayTincanManifestActImpl liferayTincanManifestActImpl = new LiferayTincanManifestActImpl();

		liferayTincanManifestActImpl.setId(id);

		if (activityId == null) {
			liferayTincanManifestActImpl.setActivityId(StringPool.BLANK);
		}
		else {
			liferayTincanManifestActImpl.setActivityId(activityId);
		}

		if (name == null) {
			liferayTincanManifestActImpl.setName(StringPool.BLANK);
		}
		else {
			liferayTincanManifestActImpl.setName(name);
		}

		if (description == null) {
			liferayTincanManifestActImpl.setDescription(StringPool.BLANK);
		}
		else {
			liferayTincanManifestActImpl.setDescription(description);
		}

		if (launch == null) {
			liferayTincanManifestActImpl.setLaunch(StringPool.BLANK);
		}
		else {
			liferayTincanManifestActImpl.setLaunch(launch);
		}

		liferayTincanManifestActImpl.resetOriginalValues();

		return liferayTincanManifestActImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		activityId = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		launch = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (activityId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityId);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (launch == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(launch);
		}
	}

	public long id;
	public String activityId;
	public String name;
	public String description;
	public String launch;
}
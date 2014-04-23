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

import com.labimo.portlet.tincan.model.TincanVerb;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TincanVerb in entity cache.
 *
 * @author wzgong
 * @see TincanVerb
 * @generated
 */
public class TincanVerbCacheModel implements CacheModel<TincanVerb>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", verbId=");
		sb.append(verbId);
		sb.append(", display=");
		sb.append(display);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TincanVerb toEntityModel() {
		TincanVerbImpl tincanVerbImpl = new TincanVerbImpl();

		tincanVerbImpl.setId(id);

		if (verbId == null) {
			tincanVerbImpl.setVerbId(StringPool.BLANK);
		}
		else {
			tincanVerbImpl.setVerbId(verbId);
		}

		if (display == null) {
			tincanVerbImpl.setDisplay(StringPool.BLANK);
		}
		else {
			tincanVerbImpl.setDisplay(display);
		}

		tincanVerbImpl.resetOriginalValues();

		return tincanVerbImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		verbId = objectInput.readUTF();
		display = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (verbId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(verbId);
		}

		if (display == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(display);
		}
	}

	public long id;
	public String verbId;
	public String display;
}
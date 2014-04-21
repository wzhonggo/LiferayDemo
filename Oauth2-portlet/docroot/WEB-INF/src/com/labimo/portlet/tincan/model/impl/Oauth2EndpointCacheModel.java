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

import com.labimo.portlet.tincan.model.Oauth2Endpoint;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Oauth2Endpoint in entity cache.
 *
 * @author wzgong
 * @see Oauth2Endpoint
 * @generated
 */
public class Oauth2EndpointCacheModel implements CacheModel<Oauth2Endpoint>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", liferayUserId=");
		sb.append(liferayUserId);
		sb.append(", oauthType=");
		sb.append(oauthType);
		sb.append(", isPublic=");
		sb.append(isPublic);
		sb.append(", guestAccess=");
		sb.append(guestAccess);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Oauth2Endpoint toEntityModel() {
		Oauth2EndpointImpl oauth2EndpointImpl = new Oauth2EndpointImpl();

		oauth2EndpointImpl.setId(id);
		oauth2EndpointImpl.setLiferayUserId(liferayUserId);

		if (oauthType == null) {
			oauth2EndpointImpl.setOauthType(StringPool.BLANK);
		}
		else {
			oauth2EndpointImpl.setOauthType(oauthType);
		}

		oauth2EndpointImpl.setIsPublic(isPublic);
		oauth2EndpointImpl.setGuestAccess(guestAccess);

		oauth2EndpointImpl.resetOriginalValues();

		return oauth2EndpointImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		liferayUserId = objectInput.readLong();
		oauthType = objectInput.readUTF();
		isPublic = objectInput.readBoolean();
		guestAccess = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(liferayUserId);

		if (oauthType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(oauthType);
		}

		objectOutput.writeBoolean(isPublic);
		objectOutput.writeBoolean(guestAccess);
	}

	public long id;
	public long liferayUserId;
	public String oauthType;
	public boolean isPublic;
	public boolean guestAccess;
}
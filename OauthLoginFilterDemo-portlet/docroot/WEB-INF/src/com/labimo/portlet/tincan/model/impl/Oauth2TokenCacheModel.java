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

import com.labimo.portlet.tincan.model.Oauth2Token;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Oauth2Token in entity cache.
 *
 * @author wzgong
 * @see Oauth2Token
 * @generated
 */
public class Oauth2TokenCacheModel implements CacheModel<Oauth2Token>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", code=");
		sb.append(code);
		sb.append(", token=");
		sb.append(token);
		sb.append(", refreshToken=");
		sb.append(refreshToken);
		sb.append(", clientId=");
		sb.append(clientId);
		sb.append(", expiredIn=");
		sb.append(expiredIn);
		sb.append(", liferayUserId=");
		sb.append(liferayUserId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Oauth2Token toEntityModel() {
		Oauth2TokenImpl oauth2TokenImpl = new Oauth2TokenImpl();

		oauth2TokenImpl.setId(id);

		if (code == null) {
			oauth2TokenImpl.setCode(StringPool.BLANK);
		}
		else {
			oauth2TokenImpl.setCode(code);
		}

		if (token == null) {
			oauth2TokenImpl.setToken(StringPool.BLANK);
		}
		else {
			oauth2TokenImpl.setToken(token);
		}

		if (refreshToken == null) {
			oauth2TokenImpl.setRefreshToken(StringPool.BLANK);
		}
		else {
			oauth2TokenImpl.setRefreshToken(refreshToken);
		}

		if (clientId == null) {
			oauth2TokenImpl.setClientId(StringPool.BLANK);
		}
		else {
			oauth2TokenImpl.setClientId(clientId);
		}

		oauth2TokenImpl.setExpiredIn(expiredIn);
		oauth2TokenImpl.setLiferayUserId(liferayUserId);

		oauth2TokenImpl.resetOriginalValues();

		return oauth2TokenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		code = objectInput.readUTF();
		token = objectInput.readUTF();
		refreshToken = objectInput.readUTF();
		clientId = objectInput.readUTF();
		expiredIn = objectInput.readLong();
		liferayUserId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (token == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(token);
		}

		if (refreshToken == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(refreshToken);
		}

		if (clientId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(clientId);
		}

		objectOutput.writeLong(expiredIn);
		objectOutput.writeLong(liferayUserId);
	}

	public long id;
	public String code;
	public String token;
	public String refreshToken;
	public String clientId;
	public long expiredIn;
	public long liferayUserId;
}
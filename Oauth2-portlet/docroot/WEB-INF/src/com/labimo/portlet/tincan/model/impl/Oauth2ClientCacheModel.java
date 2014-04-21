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

import com.labimo.portlet.tincan.model.Oauth2Client;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Oauth2Client in entity cache.
 *
 * @author wzgong
 * @see Oauth2Client
 * @generated
 */
public class Oauth2ClientCacheModel implements CacheModel<Oauth2Client>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", secret=");
		sb.append(secret);
		sb.append(", url=");
		sb.append(url);
		sb.append(", redirectUrl=");
		sb.append(redirectUrl);
		sb.append(", scope=");
		sb.append(scope);
		sb.append(", iconUrl=");
		sb.append(iconUrl);
		sb.append(", liferayUserId=");
		sb.append(liferayUserId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Oauth2Client toEntityModel() {
		Oauth2ClientImpl oauth2ClientImpl = new Oauth2ClientImpl();

		if (id == null) {
			oauth2ClientImpl.setId(StringPool.BLANK);
		}
		else {
			oauth2ClientImpl.setId(id);
		}

		if (name == null) {
			oauth2ClientImpl.setName(StringPool.BLANK);
		}
		else {
			oauth2ClientImpl.setName(name);
		}

		if (description == null) {
			oauth2ClientImpl.setDescription(StringPool.BLANK);
		}
		else {
			oauth2ClientImpl.setDescription(description);
		}

		if (secret == null) {
			oauth2ClientImpl.setSecret(StringPool.BLANK);
		}
		else {
			oauth2ClientImpl.setSecret(secret);
		}

		if (url == null) {
			oauth2ClientImpl.setUrl(StringPool.BLANK);
		}
		else {
			oauth2ClientImpl.setUrl(url);
		}

		if (redirectUrl == null) {
			oauth2ClientImpl.setRedirectUrl(StringPool.BLANK);
		}
		else {
			oauth2ClientImpl.setRedirectUrl(redirectUrl);
		}

		if (scope == null) {
			oauth2ClientImpl.setScope(StringPool.BLANK);
		}
		else {
			oauth2ClientImpl.setScope(scope);
		}

		if (iconUrl == null) {
			oauth2ClientImpl.setIconUrl(StringPool.BLANK);
		}
		else {
			oauth2ClientImpl.setIconUrl(iconUrl);
		}

		oauth2ClientImpl.setLiferayUserId(liferayUserId);

		oauth2ClientImpl.resetOriginalValues();

		return oauth2ClientImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		secret = objectInput.readUTF();
		url = objectInput.readUTF();
		redirectUrl = objectInput.readUTF();
		scope = objectInput.readUTF();
		iconUrl = objectInput.readUTF();
		liferayUserId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (id == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(id);
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

		if (secret == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secret);
		}

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		if (redirectUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(redirectUrl);
		}

		if (scope == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(scope);
		}

		if (iconUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(iconUrl);
		}

		objectOutput.writeLong(liferayUserId);
	}

	public String id;
	public String name;
	public String description;
	public String secret;
	public String url;
	public String redirectUrl;
	public String scope;
	public String iconUrl;
	public long liferayUserId;
}
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

import com.labimo.portlet.tincan.model.TincanStatementContext;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TincanStatementContext in entity cache.
 *
 * @author wzgong
 * @see TincanStatementContext
 * @generated
 */
public class TincanStatementContextCacheModel implements CacheModel<TincanStatementContext>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", registration=");
		sb.append(registration);
		sb.append(", instructorId=");
		sb.append(instructorId);
		sb.append(", teamId=");
		sb.append(teamId);
		sb.append(", contextActivitiesId=");
		sb.append(contextActivitiesId);
		sb.append(", revision=");
		sb.append(revision);
		sb.append(", platform=");
		sb.append(platform);
		sb.append(", language=");
		sb.append(language);
		sb.append(", statement=");
		sb.append(statement);
		sb.append(", extensions=");
		sb.append(extensions);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TincanStatementContext toEntityModel() {
		TincanStatementContextImpl tincanStatementContextImpl = new TincanStatementContextImpl();

		tincanStatementContextImpl.setId(id);

		if (registration == null) {
			tincanStatementContextImpl.setRegistration(StringPool.BLANK);
		}
		else {
			tincanStatementContextImpl.setRegistration(registration);
		}

		tincanStatementContextImpl.setInstructorId(instructorId);
		tincanStatementContextImpl.setTeamId(teamId);
		tincanStatementContextImpl.setContextActivitiesId(contextActivitiesId);

		if (revision == null) {
			tincanStatementContextImpl.setRevision(StringPool.BLANK);
		}
		else {
			tincanStatementContextImpl.setRevision(revision);
		}

		if (platform == null) {
			tincanStatementContextImpl.setPlatform(StringPool.BLANK);
		}
		else {
			tincanStatementContextImpl.setPlatform(platform);
		}

		if (language == null) {
			tincanStatementContextImpl.setLanguage(StringPool.BLANK);
		}
		else {
			tincanStatementContextImpl.setLanguage(language);
		}

		if (statement == null) {
			tincanStatementContextImpl.setStatement(StringPool.BLANK);
		}
		else {
			tincanStatementContextImpl.setStatement(statement);
		}

		if (extensions == null) {
			tincanStatementContextImpl.setExtensions(StringPool.BLANK);
		}
		else {
			tincanStatementContextImpl.setExtensions(extensions);
		}

		tincanStatementContextImpl.resetOriginalValues();

		return tincanStatementContextImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		registration = objectInput.readUTF();
		instructorId = objectInput.readLong();
		teamId = objectInput.readLong();
		contextActivitiesId = objectInput.readLong();
		revision = objectInput.readUTF();
		platform = objectInput.readUTF();
		language = objectInput.readUTF();
		statement = objectInput.readUTF();
		extensions = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (registration == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registration);
		}

		objectOutput.writeLong(instructorId);
		objectOutput.writeLong(teamId);
		objectOutput.writeLong(contextActivitiesId);

		if (revision == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(revision);
		}

		if (platform == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(platform);
		}

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}

		if (statement == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statement);
		}

		if (extensions == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(extensions);
		}
	}

	public long id;
	public String registration;
	public long instructorId;
	public long teamId;
	public long contextActivitiesId;
	public String revision;
	public String platform;
	public String language;
	public String statement;
	public String extensions;
}
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

import com.labimo.portlet.tincan.model.TincanStatementAttachment;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TincanStatementAttachment in entity cache.
 *
 * @author wzgong
 * @see TincanStatementAttachment
 * @generated
 */
public class TincanStatementAttachmentCacheModel implements CacheModel<TincanStatementAttachment>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", statementId=");
		sb.append(statementId);
		sb.append(", statementAttachmentId=");
		sb.append(statementAttachmentId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TincanStatementAttachment toEntityModel() {
		TincanStatementAttachmentImpl tincanStatementAttachmentImpl = new TincanStatementAttachmentImpl();

		tincanStatementAttachmentImpl.setId(id);
		tincanStatementAttachmentImpl.setStatementId(statementId);
		tincanStatementAttachmentImpl.setStatementAttachmentId(statementAttachmentId);

		tincanStatementAttachmentImpl.resetOriginalValues();

		return tincanStatementAttachmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		statementId = objectInput.readLong();
		statementAttachmentId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(statementId);
		objectOutput.writeLong(statementAttachmentId);
	}

	public long id;
	public long statementId;
	public long statementAttachmentId;
}
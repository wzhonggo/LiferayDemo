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

import com.labimo.portlet.tincan.model.TincanActivity;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TincanActivity in entity cache.
 *
 * @author wzgong
 * @see TincanActivity
 * @generated
 */
public class TincanActivityCacheModel implements CacheModel<TincanActivity>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(id);
		sb.append(", activityId=");
		sb.append(activityId);
		sb.append(", objectType=");
		sb.append(objectType);
		sb.append(", activityDefinitionName=");
		sb.append(activityDefinitionName);
		sb.append(", activityDefinitionDescription=");
		sb.append(activityDefinitionDescription);
		sb.append(", activityDefinitionType=");
		sb.append(activityDefinitionType);
		sb.append(", activityDefinitionMoreInfo=");
		sb.append(activityDefinitionMoreInfo);
		sb.append(", activityDefinitionInteractionType=");
		sb.append(activityDefinitionInteractionType);
		sb.append(", activityDefinitionExtensions=");
		sb.append(activityDefinitionExtensions);
		sb.append(", activityDefinitionCrpanswers=");
		sb.append(activityDefinitionCrpanswers);
		sb.append(", activityDefinitionChoices=");
		sb.append(activityDefinitionChoices);
		sb.append(", activityDefinitionScales=");
		sb.append(activityDefinitionScales);
		sb.append(", activityDefinitionSources=");
		sb.append(activityDefinitionSources);
		sb.append(", activityDefinitionTargets=");
		sb.append(activityDefinitionTargets);
		sb.append(", activityDefinitionSteps=");
		sb.append(activityDefinitionSteps);
		sb.append(", authoritative=");
		sb.append(authoritative);
		sb.append(", canonical_version=");
		sb.append(canonical_version);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TincanActivity toEntityModel() {
		TincanActivityImpl tincanActivityImpl = new TincanActivityImpl();

		tincanActivityImpl.setId(id);

		if (activityId == null) {
			tincanActivityImpl.setActivityId(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setActivityId(activityId);
		}

		if (objectType == null) {
			tincanActivityImpl.setObjectType(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setObjectType(objectType);
		}

		if (activityDefinitionName == null) {
			tincanActivityImpl.setActivityDefinitionName(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setActivityDefinitionName(activityDefinitionName);
		}

		if (activityDefinitionDescription == null) {
			tincanActivityImpl.setActivityDefinitionDescription(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setActivityDefinitionDescription(activityDefinitionDescription);
		}

		if (activityDefinitionType == null) {
			tincanActivityImpl.setActivityDefinitionType(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setActivityDefinitionType(activityDefinitionType);
		}

		if (activityDefinitionMoreInfo == null) {
			tincanActivityImpl.setActivityDefinitionMoreInfo(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setActivityDefinitionMoreInfo(activityDefinitionMoreInfo);
		}

		if (activityDefinitionInteractionType == null) {
			tincanActivityImpl.setActivityDefinitionInteractionType(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setActivityDefinitionInteractionType(activityDefinitionInteractionType);
		}

		if (activityDefinitionExtensions == null) {
			tincanActivityImpl.setActivityDefinitionExtensions(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setActivityDefinitionExtensions(activityDefinitionExtensions);
		}

		if (activityDefinitionCrpanswers == null) {
			tincanActivityImpl.setActivityDefinitionCrpanswers(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setActivityDefinitionCrpanswers(activityDefinitionCrpanswers);
		}

		if (activityDefinitionChoices == null) {
			tincanActivityImpl.setActivityDefinitionChoices(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setActivityDefinitionChoices(activityDefinitionChoices);
		}

		if (activityDefinitionScales == null) {
			tincanActivityImpl.setActivityDefinitionScales(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setActivityDefinitionScales(activityDefinitionScales);
		}

		if (activityDefinitionSources == null) {
			tincanActivityImpl.setActivityDefinitionSources(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setActivityDefinitionSources(activityDefinitionSources);
		}

		if (activityDefinitionTargets == null) {
			tincanActivityImpl.setActivityDefinitionTargets(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setActivityDefinitionTargets(activityDefinitionTargets);
		}

		if (activityDefinitionSteps == null) {
			tincanActivityImpl.setActivityDefinitionSteps(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setActivityDefinitionSteps(activityDefinitionSteps);
		}

		if (authoritative == null) {
			tincanActivityImpl.setAuthoritative(StringPool.BLANK);
		}
		else {
			tincanActivityImpl.setAuthoritative(authoritative);
		}

		tincanActivityImpl.setCanonical_version(canonical_version);

		tincanActivityImpl.resetOriginalValues();

		return tincanActivityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		activityId = objectInput.readUTF();
		objectType = objectInput.readUTF();
		activityDefinitionName = objectInput.readUTF();
		activityDefinitionDescription = objectInput.readUTF();
		activityDefinitionType = objectInput.readUTF();
		activityDefinitionMoreInfo = objectInput.readUTF();
		activityDefinitionInteractionType = objectInput.readUTF();
		activityDefinitionExtensions = objectInput.readUTF();
		activityDefinitionCrpanswers = objectInput.readUTF();
		activityDefinitionChoices = objectInput.readUTF();
		activityDefinitionScales = objectInput.readUTF();
		activityDefinitionSources = objectInput.readUTF();
		activityDefinitionTargets = objectInput.readUTF();
		activityDefinitionSteps = objectInput.readUTF();
		authoritative = objectInput.readUTF();
		canonical_version = objectInput.readBoolean();
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

		if (objectType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(objectType);
		}

		if (activityDefinitionName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityDefinitionName);
		}

		if (activityDefinitionDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityDefinitionDescription);
		}

		if (activityDefinitionType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityDefinitionType);
		}

		if (activityDefinitionMoreInfo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityDefinitionMoreInfo);
		}

		if (activityDefinitionInteractionType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityDefinitionInteractionType);
		}

		if (activityDefinitionExtensions == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityDefinitionExtensions);
		}

		if (activityDefinitionCrpanswers == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityDefinitionCrpanswers);
		}

		if (activityDefinitionChoices == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityDefinitionChoices);
		}

		if (activityDefinitionScales == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityDefinitionScales);
		}

		if (activityDefinitionSources == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityDefinitionSources);
		}

		if (activityDefinitionTargets == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityDefinitionTargets);
		}

		if (activityDefinitionSteps == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(activityDefinitionSteps);
		}

		if (authoritative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(authoritative);
		}

		objectOutput.writeBoolean(canonical_version);
	}

	public long id;
	public String activityId;
	public String objectType;
	public String activityDefinitionName;
	public String activityDefinitionDescription;
	public String activityDefinitionType;
	public String activityDefinitionMoreInfo;
	public String activityDefinitionInteractionType;
	public String activityDefinitionExtensions;
	public String activityDefinitionCrpanswers;
	public String activityDefinitionChoices;
	public String activityDefinitionScales;
	public String activityDefinitionSources;
	public String activityDefinitionTargets;
	public String activityDefinitionSteps;
	public String authoritative;
	public boolean canonical_version;
}
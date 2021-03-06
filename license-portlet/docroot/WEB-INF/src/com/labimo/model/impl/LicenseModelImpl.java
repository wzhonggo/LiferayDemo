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

import com.labimo.model.License;
import com.labimo.model.LicenseModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the License service. Represents a row in the &quot;labimo_License&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.labimo.model.LicenseModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LicenseImpl}.
 * </p>
 *
 * @author wzgong
 * @see LicenseImpl
 * @see com.labimo.model.License
 * @see com.labimo.model.LicenseModel
 * @generated
 */
public class LicenseModelImpl extends BaseModelImpl<License>
	implements LicenseModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a license model instance should use the {@link com.labimo.model.License} interface instead.
	 */
	public static final String TABLE_NAME = "labimo_License";
	public static final Object[][] TABLE_COLUMNS = {
			{ "licenseUuid", Types.VARCHAR },
			{ "userId", Types.BIGINT },
			{ "issueDate", Types.TIMESTAMP },
			{ "validDate", Types.TIMESTAMP },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "productId", Types.BIGINT },
			{ "valid", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table labimo_License (licenseUuid VARCHAR(75) not null primary key,userId LONG,issueDate DATE null,validDate DATE null,createDate DATE null,modifiedDate DATE null,productId LONG,valid BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table labimo_License";
	public static final String ORDER_BY_JPQL = " ORDER BY license.licenseUuid ASC";
	public static final String ORDER_BY_SQL = " ORDER BY labimo_License.licenseUuid ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.labimo.model.License"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.labimo.model.License"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.labimo.model.License"));

	public LicenseModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _licenseUuid;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setLicenseUuid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _licenseUuid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return License.class;
	}

	@Override
	public String getModelClassName() {
		return License.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("licenseUuid", getLicenseUuid());
		attributes.put("userId", getUserId());
		attributes.put("issueDate", getIssueDate());
		attributes.put("validDate", getValidDate());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("productId", getProductId());
		attributes.put("valid", getValid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String licenseUuid = (String)attributes.get("licenseUuid");

		if (licenseUuid != null) {
			setLicenseUuid(licenseUuid);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}

		Date validDate = (Date)attributes.get("validDate");

		if (validDate != null) {
			setValidDate(validDate);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
		}

		Boolean valid = (Boolean)attributes.get("valid");

		if (valid != null) {
			setValid(valid);
		}
	}

	@Override
	public String getLicenseUuid() {
		if (_licenseUuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _licenseUuid;
		}
	}

	@Override
	public void setLicenseUuid(String licenseUuid) {
		_licenseUuid = licenseUuid;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public Date getIssueDate() {
		return _issueDate;
	}

	@Override
	public void setIssueDate(Date issueDate) {
		_issueDate = issueDate;
	}

	@Override
	public Date getValidDate() {
		return _validDate;
	}

	@Override
	public void setValidDate(Date validDate) {
		_validDate = validDate;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public long getProductId() {
		return _productId;
	}

	@Override
	public void setProductId(long productId) {
		_productId = productId;
	}

	@Override
	public boolean getValid() {
		return _valid;
	}

	@Override
	public boolean isValid() {
		return _valid;
	}

	@Override
	public void setValid(boolean valid) {
		_valid = valid;
	}

	@Override
	public License toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (License)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LicenseImpl licenseImpl = new LicenseImpl();

		licenseImpl.setLicenseUuid(getLicenseUuid());
		licenseImpl.setUserId(getUserId());
		licenseImpl.setIssueDate(getIssueDate());
		licenseImpl.setValidDate(getValidDate());
		licenseImpl.setCreateDate(getCreateDate());
		licenseImpl.setModifiedDate(getModifiedDate());
		licenseImpl.setProductId(getProductId());
		licenseImpl.setValid(getValid());

		licenseImpl.resetOriginalValues();

		return licenseImpl;
	}

	@Override
	public int compareTo(License license) {
		String primaryKey = license.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof License)) {
			return false;
		}

		License license = (License)obj;

		String primaryKey = license.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<License> toCacheModel() {
		LicenseCacheModel licenseCacheModel = new LicenseCacheModel();

		licenseCacheModel.licenseUuid = getLicenseUuid();

		String licenseUuid = licenseCacheModel.licenseUuid;

		if ((licenseUuid != null) && (licenseUuid.length() == 0)) {
			licenseCacheModel.licenseUuid = null;
		}

		licenseCacheModel.userId = getUserId();

		Date issueDate = getIssueDate();

		if (issueDate != null) {
			licenseCacheModel.issueDate = issueDate.getTime();
		}
		else {
			licenseCacheModel.issueDate = Long.MIN_VALUE;
		}

		Date validDate = getValidDate();

		if (validDate != null) {
			licenseCacheModel.validDate = validDate.getTime();
		}
		else {
			licenseCacheModel.validDate = Long.MIN_VALUE;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			licenseCacheModel.createDate = createDate.getTime();
		}
		else {
			licenseCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			licenseCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			licenseCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		licenseCacheModel.productId = getProductId();

		licenseCacheModel.valid = getValid();

		return licenseCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{licenseUuid=");
		sb.append(getLicenseUuid());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", issueDate=");
		sb.append(getIssueDate());
		sb.append(", validDate=");
		sb.append(getValidDate());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", productId=");
		sb.append(getProductId());
		sb.append(", valid=");
		sb.append(getValid());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.labimo.model.License");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>licenseUuid</column-name><column-value><![CDATA[");
		sb.append(getLicenseUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueDate</column-name><column-value><![CDATA[");
		sb.append(getIssueDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validDate</column-name><column-value><![CDATA[");
		sb.append(getValidDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productId</column-name><column-value><![CDATA[");
		sb.append(getProductId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>valid</column-name><column-value><![CDATA[");
		sb.append(getValid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = License.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			License.class
		};
	private String _licenseUuid;
	private long _userId;
	private String _userUuid;
	private Date _issueDate;
	private Date _validDate;
	private Date _createDate;
	private Date _modifiedDate;
	private long _productId;
	private boolean _valid;
	private License _escapedModel;
}
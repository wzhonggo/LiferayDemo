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
import com.labimo.portlet.tincan.model.Oauth2ClientModel;

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

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Oauth2Client service. Represents a row in the &quot;labimo_Oauth2Client&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.labimo.portlet.tincan.model.Oauth2ClientModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Oauth2ClientImpl}.
 * </p>
 *
 * @author wzgong
 * @see Oauth2ClientImpl
 * @see com.labimo.portlet.tincan.model.Oauth2Client
 * @see com.labimo.portlet.tincan.model.Oauth2ClientModel
 * @generated
 */
public class Oauth2ClientModelImpl extends BaseModelImpl<Oauth2Client>
	implements Oauth2ClientModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a oauth2 client model instance should use the {@link com.labimo.portlet.tincan.model.Oauth2Client} interface instead.
	 */
	public static final String TABLE_NAME = "labimo_Oauth2Client";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.VARCHAR },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "secret", Types.VARCHAR },
			{ "url", Types.VARCHAR },
			{ "redirectUrl", Types.VARCHAR },
			{ "scope", Types.VARCHAR },
			{ "iconUrl", Types.VARCHAR },
			{ "liferayUserId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table labimo_Oauth2Client (id_ VARCHAR(75) not null primary key,name VARCHAR(75) null,description VARCHAR(75) null,secret VARCHAR(75) null,url VARCHAR(75) null,redirectUrl VARCHAR(75) null,scope VARCHAR(75) null,iconUrl VARCHAR(75) null,liferayUserId LONG)";
	public static final String TABLE_SQL_DROP = "drop table labimo_Oauth2Client";
	public static final String ORDER_BY_JPQL = " ORDER BY oauth2Client.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY labimo_Oauth2Client.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.labimo.portlet.tincan.model.Oauth2Client"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.labimo.portlet.tincan.model.Oauth2Client"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.labimo.portlet.tincan.model.Oauth2Client"));

	public Oauth2ClientModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return Oauth2Client.class;
	}

	@Override
	public String getModelClassName() {
		return Oauth2Client.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("secret", getSecret());
		attributes.put("url", getUrl());
		attributes.put("redirectUrl", getRedirectUrl());
		attributes.put("scope", getScope());
		attributes.put("iconUrl", getIconUrl());
		attributes.put("liferayUserId", getLiferayUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String id = (String)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String secret = (String)attributes.get("secret");

		if (secret != null) {
			setSecret(secret);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String redirectUrl = (String)attributes.get("redirectUrl");

		if (redirectUrl != null) {
			setRedirectUrl(redirectUrl);
		}

		String scope = (String)attributes.get("scope");

		if (scope != null) {
			setScope(scope);
		}

		String iconUrl = (String)attributes.get("iconUrl");

		if (iconUrl != null) {
			setIconUrl(iconUrl);
		}

		Long liferayUserId = (Long)attributes.get("liferayUserId");

		if (liferayUserId != null) {
			setLiferayUserId(liferayUserId);
		}
	}

	@Override
	public String getId() {
		if (_id == null) {
			return StringPool.BLANK;
		}
		else {
			return _id;
		}
	}

	@Override
	public void setId(String id) {
		_id = id;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public String getSecret() {
		if (_secret == null) {
			return StringPool.BLANK;
		}
		else {
			return _secret;
		}
	}

	@Override
	public void setSecret(String secret) {
		_secret = secret;
	}

	@Override
	public String getUrl() {
		if (_url == null) {
			return StringPool.BLANK;
		}
		else {
			return _url;
		}
	}

	@Override
	public void setUrl(String url) {
		_url = url;
	}

	@Override
	public String getRedirectUrl() {
		if (_redirectUrl == null) {
			return StringPool.BLANK;
		}
		else {
			return _redirectUrl;
		}
	}

	@Override
	public void setRedirectUrl(String redirectUrl) {
		_redirectUrl = redirectUrl;
	}

	@Override
	public String getScope() {
		if (_scope == null) {
			return StringPool.BLANK;
		}
		else {
			return _scope;
		}
	}

	@Override
	public void setScope(String scope) {
		_scope = scope;
	}

	@Override
	public String getIconUrl() {
		if (_iconUrl == null) {
			return StringPool.BLANK;
		}
		else {
			return _iconUrl;
		}
	}

	@Override
	public void setIconUrl(String iconUrl) {
		_iconUrl = iconUrl;
	}

	@Override
	public long getLiferayUserId() {
		return _liferayUserId;
	}

	@Override
	public void setLiferayUserId(long liferayUserId) {
		_liferayUserId = liferayUserId;
	}

	@Override
	public String getLiferayUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getLiferayUserId(), "uuid",
			_liferayUserUuid);
	}

	@Override
	public void setLiferayUserUuid(String liferayUserUuid) {
		_liferayUserUuid = liferayUserUuid;
	}

	@Override
	public Oauth2Client toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Oauth2Client)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		Oauth2ClientImpl oauth2ClientImpl = new Oauth2ClientImpl();

		oauth2ClientImpl.setId(getId());
		oauth2ClientImpl.setName(getName());
		oauth2ClientImpl.setDescription(getDescription());
		oauth2ClientImpl.setSecret(getSecret());
		oauth2ClientImpl.setUrl(getUrl());
		oauth2ClientImpl.setRedirectUrl(getRedirectUrl());
		oauth2ClientImpl.setScope(getScope());
		oauth2ClientImpl.setIconUrl(getIconUrl());
		oauth2ClientImpl.setLiferayUserId(getLiferayUserId());

		oauth2ClientImpl.resetOriginalValues();

		return oauth2ClientImpl;
	}

	@Override
	public int compareTo(Oauth2Client oauth2Client) {
		String primaryKey = oauth2Client.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Oauth2Client)) {
			return false;
		}

		Oauth2Client oauth2Client = (Oauth2Client)obj;

		String primaryKey = oauth2Client.getPrimaryKey();

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
	public CacheModel<Oauth2Client> toCacheModel() {
		Oauth2ClientCacheModel oauth2ClientCacheModel = new Oauth2ClientCacheModel();

		oauth2ClientCacheModel.id = getId();

		String id = oauth2ClientCacheModel.id;

		if ((id != null) && (id.length() == 0)) {
			oauth2ClientCacheModel.id = null;
		}

		oauth2ClientCacheModel.name = getName();

		String name = oauth2ClientCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			oauth2ClientCacheModel.name = null;
		}

		oauth2ClientCacheModel.description = getDescription();

		String description = oauth2ClientCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			oauth2ClientCacheModel.description = null;
		}

		oauth2ClientCacheModel.secret = getSecret();

		String secret = oauth2ClientCacheModel.secret;

		if ((secret != null) && (secret.length() == 0)) {
			oauth2ClientCacheModel.secret = null;
		}

		oauth2ClientCacheModel.url = getUrl();

		String url = oauth2ClientCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			oauth2ClientCacheModel.url = null;
		}

		oauth2ClientCacheModel.redirectUrl = getRedirectUrl();

		String redirectUrl = oauth2ClientCacheModel.redirectUrl;

		if ((redirectUrl != null) && (redirectUrl.length() == 0)) {
			oauth2ClientCacheModel.redirectUrl = null;
		}

		oauth2ClientCacheModel.scope = getScope();

		String scope = oauth2ClientCacheModel.scope;

		if ((scope != null) && (scope.length() == 0)) {
			oauth2ClientCacheModel.scope = null;
		}

		oauth2ClientCacheModel.iconUrl = getIconUrl();

		String iconUrl = oauth2ClientCacheModel.iconUrl;

		if ((iconUrl != null) && (iconUrl.length() == 0)) {
			oauth2ClientCacheModel.iconUrl = null;
		}

		oauth2ClientCacheModel.liferayUserId = getLiferayUserId();

		return oauth2ClientCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", secret=");
		sb.append(getSecret());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", redirectUrl=");
		sb.append(getRedirectUrl());
		sb.append(", scope=");
		sb.append(getScope());
		sb.append(", iconUrl=");
		sb.append(getIconUrl());
		sb.append(", liferayUserId=");
		sb.append(getLiferayUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.labimo.portlet.tincan.model.Oauth2Client");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>secret</column-name><column-value><![CDATA[");
		sb.append(getSecret());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>redirectUrl</column-name><column-value><![CDATA[");
		sb.append(getRedirectUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scope</column-name><column-value><![CDATA[");
		sb.append(getScope());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>iconUrl</column-name><column-value><![CDATA[");
		sb.append(getIconUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>liferayUserId</column-name><column-value><![CDATA[");
		sb.append(getLiferayUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Oauth2Client.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Oauth2Client.class
		};
	private String _id;
	private String _name;
	private String _description;
	private String _secret;
	private String _url;
	private String _redirectUrl;
	private String _scope;
	private String _iconUrl;
	private long _liferayUserId;
	private String _liferayUserUuid;
	private Oauth2Client _escapedModel;
}
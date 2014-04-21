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

package com.labimo.portlet.tincan.service.persistence;

import com.labimo.portlet.tincan.model.Oauth2Client;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the oauth2 client service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see Oauth2ClientPersistenceImpl
 * @see Oauth2ClientUtil
 * @generated
 */
public interface Oauth2ClientPersistence extends BasePersistence<Oauth2Client> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Oauth2ClientUtil} to access the oauth2 client persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the oauth2 client in the entity cache if it is enabled.
	*
	* @param oauth2Client the oauth2 client
	*/
	public void cacheResult(
		com.labimo.portlet.tincan.model.Oauth2Client oauth2Client);

	/**
	* Caches the oauth2 clients in the entity cache if it is enabled.
	*
	* @param oauth2Clients the oauth2 clients
	*/
	public void cacheResult(
		java.util.List<com.labimo.portlet.tincan.model.Oauth2Client> oauth2Clients);

	/**
	* Creates a new oauth2 client with the primary key. Does not add the oauth2 client to the database.
	*
	* @param id the primary key for the new oauth2 client
	* @return the new oauth2 client
	*/
	public com.labimo.portlet.tincan.model.Oauth2Client create(
		java.lang.String id);

	/**
	* Removes the oauth2 client with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the oauth2 client
	* @return the oauth2 client that was removed
	* @throws com.labimo.portlet.tincan.NoSuchOauth2ClientException if a oauth2 client with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.Oauth2Client remove(
		java.lang.String id)
		throws com.labimo.portlet.tincan.NoSuchOauth2ClientException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.labimo.portlet.tincan.model.Oauth2Client updateImpl(
		com.labimo.portlet.tincan.model.Oauth2Client oauth2Client)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the oauth2 client with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchOauth2ClientException} if it could not be found.
	*
	* @param id the primary key of the oauth2 client
	* @return the oauth2 client
	* @throws com.labimo.portlet.tincan.NoSuchOauth2ClientException if a oauth2 client with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.Oauth2Client findByPrimaryKey(
		java.lang.String id)
		throws com.labimo.portlet.tincan.NoSuchOauth2ClientException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the oauth2 client with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the oauth2 client
	* @return the oauth2 client, or <code>null</code> if a oauth2 client with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.Oauth2Client fetchByPrimaryKey(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the oauth2 clients.
	*
	* @return the oauth2 clients
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.Oauth2Client> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the oauth2 clients.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2ClientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oauth2 clients
	* @param end the upper bound of the range of oauth2 clients (not inclusive)
	* @return the range of oauth2 clients
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.Oauth2Client> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the oauth2 clients.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2ClientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oauth2 clients
	* @param end the upper bound of the range of oauth2 clients (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of oauth2 clients
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.Oauth2Client> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the oauth2 clients from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of oauth2 clients.
	*
	* @return the number of oauth2 clients
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
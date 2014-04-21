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

import com.labimo.portlet.tincan.model.LiferayUser;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the liferay user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see LiferayUserPersistenceImpl
 * @see LiferayUserUtil
 * @generated
 */
public interface LiferayUserPersistence extends BasePersistence<LiferayUser> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LiferayUserUtil} to access the liferay user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the liferay user in the entity cache if it is enabled.
	*
	* @param liferayUser the liferay user
	*/
	public void cacheResult(
		com.labimo.portlet.tincan.model.LiferayUser liferayUser);

	/**
	* Caches the liferay users in the entity cache if it is enabled.
	*
	* @param liferayUsers the liferay users
	*/
	public void cacheResult(
		java.util.List<com.labimo.portlet.tincan.model.LiferayUser> liferayUsers);

	/**
	* Creates a new liferay user with the primary key. Does not add the liferay user to the database.
	*
	* @param id the primary key for the new liferay user
	* @return the new liferay user
	*/
	public com.labimo.portlet.tincan.model.LiferayUser create(long id);

	/**
	* Removes the liferay user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the liferay user
	* @return the liferay user that was removed
	* @throws com.labimo.portlet.tincan.NoSuchLiferayUserException if a liferay user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.LiferayUser remove(long id)
		throws com.labimo.portlet.tincan.NoSuchLiferayUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.labimo.portlet.tincan.model.LiferayUser updateImpl(
		com.labimo.portlet.tincan.model.LiferayUser liferayUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the liferay user with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchLiferayUserException} if it could not be found.
	*
	* @param id the primary key of the liferay user
	* @return the liferay user
	* @throws com.labimo.portlet.tincan.NoSuchLiferayUserException if a liferay user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.LiferayUser findByPrimaryKey(long id)
		throws com.labimo.portlet.tincan.NoSuchLiferayUserException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the liferay user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the liferay user
	* @return the liferay user, or <code>null</code> if a liferay user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.LiferayUser fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the liferay users.
	*
	* @return the liferay users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.LiferayUser> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the liferay users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.LiferayUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of liferay users
	* @param end the upper bound of the range of liferay users (not inclusive)
	* @return the range of liferay users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.LiferayUser> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the liferay users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.LiferayUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of liferay users
	* @param end the upper bound of the range of liferay users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of liferay users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.LiferayUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the liferay users from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of liferay users.
	*
	* @return the number of liferay users
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
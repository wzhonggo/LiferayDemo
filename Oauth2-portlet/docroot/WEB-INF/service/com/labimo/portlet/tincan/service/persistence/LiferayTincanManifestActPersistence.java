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

import com.labimo.portlet.tincan.model.LiferayTincanManifestAct;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the liferay tincan manifest act service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see LiferayTincanManifestActPersistenceImpl
 * @see LiferayTincanManifestActUtil
 * @generated
 */
public interface LiferayTincanManifestActPersistence extends BasePersistence<LiferayTincanManifestAct> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LiferayTincanManifestActUtil} to access the liferay tincan manifest act persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the liferay tincan manifest act in the entity cache if it is enabled.
	*
	* @param liferayTincanManifestAct the liferay tincan manifest act
	*/
	public void cacheResult(
		com.labimo.portlet.tincan.model.LiferayTincanManifestAct liferayTincanManifestAct);

	/**
	* Caches the liferay tincan manifest acts in the entity cache if it is enabled.
	*
	* @param liferayTincanManifestActs the liferay tincan manifest acts
	*/
	public void cacheResult(
		java.util.List<com.labimo.portlet.tincan.model.LiferayTincanManifestAct> liferayTincanManifestActs);

	/**
	* Creates a new liferay tincan manifest act with the primary key. Does not add the liferay tincan manifest act to the database.
	*
	* @param id the primary key for the new liferay tincan manifest act
	* @return the new liferay tincan manifest act
	*/
	public com.labimo.portlet.tincan.model.LiferayTincanManifestAct create(
		long id);

	/**
	* Removes the liferay tincan manifest act with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the liferay tincan manifest act
	* @return the liferay tincan manifest act that was removed
	* @throws com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException if a liferay tincan manifest act with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.LiferayTincanManifestAct remove(
		long id)
		throws com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.labimo.portlet.tincan.model.LiferayTincanManifestAct updateImpl(
		com.labimo.portlet.tincan.model.LiferayTincanManifestAct liferayTincanManifestAct)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the liferay tincan manifest act with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException} if it could not be found.
	*
	* @param id the primary key of the liferay tincan manifest act
	* @return the liferay tincan manifest act
	* @throws com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException if a liferay tincan manifest act with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.LiferayTincanManifestAct findByPrimaryKey(
		long id)
		throws com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the liferay tincan manifest act with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the liferay tincan manifest act
	* @return the liferay tincan manifest act, or <code>null</code> if a liferay tincan manifest act with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.LiferayTincanManifestAct fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the liferay tincan manifest acts.
	*
	* @return the liferay tincan manifest acts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.LiferayTincanManifestAct> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the liferay tincan manifest acts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.LiferayTincanManifestActModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of liferay tincan manifest acts
	* @param end the upper bound of the range of liferay tincan manifest acts (not inclusive)
	* @return the range of liferay tincan manifest acts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.LiferayTincanManifestAct> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the liferay tincan manifest acts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.LiferayTincanManifestActModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of liferay tincan manifest acts
	* @param end the upper bound of the range of liferay tincan manifest acts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of liferay tincan manifest acts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.LiferayTincanManifestAct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the liferay tincan manifest acts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of liferay tincan manifest acts.
	*
	* @return the number of liferay tincan manifest acts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
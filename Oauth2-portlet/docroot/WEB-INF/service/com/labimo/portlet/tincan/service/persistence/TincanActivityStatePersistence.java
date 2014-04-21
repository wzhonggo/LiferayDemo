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

import com.labimo.portlet.tincan.model.TincanActivityState;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the tincan activity state service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanActivityStatePersistenceImpl
 * @see TincanActivityStateUtil
 * @generated
 */
public interface TincanActivityStatePersistence extends BasePersistence<TincanActivityState> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TincanActivityStateUtil} to access the tincan activity state persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tincan activity state in the entity cache if it is enabled.
	*
	* @param tincanActivityState the tincan activity state
	*/
	public void cacheResult(
		com.labimo.portlet.tincan.model.TincanActivityState tincanActivityState);

	/**
	* Caches the tincan activity states in the entity cache if it is enabled.
	*
	* @param tincanActivityStates the tincan activity states
	*/
	public void cacheResult(
		java.util.List<com.labimo.portlet.tincan.model.TincanActivityState> tincanActivityStates);

	/**
	* Creates a new tincan activity state with the primary key. Does not add the tincan activity state to the database.
	*
	* @param id the primary key for the new tincan activity state
	* @return the new tincan activity state
	*/
	public com.labimo.portlet.tincan.model.TincanActivityState create(long id);

	/**
	* Removes the tincan activity state with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan activity state
	* @return the tincan activity state that was removed
	* @throws com.labimo.portlet.tincan.NoSuchTincanActivityStateException if a tincan activity state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanActivityState remove(long id)
		throws com.labimo.portlet.tincan.NoSuchTincanActivityStateException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.labimo.portlet.tincan.model.TincanActivityState updateImpl(
		com.labimo.portlet.tincan.model.TincanActivityState tincanActivityState)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tincan activity state with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanActivityStateException} if it could not be found.
	*
	* @param id the primary key of the tincan activity state
	* @return the tincan activity state
	* @throws com.labimo.portlet.tincan.NoSuchTincanActivityStateException if a tincan activity state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanActivityState findByPrimaryKey(
		long id)
		throws com.labimo.portlet.tincan.NoSuchTincanActivityStateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tincan activity state with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tincan activity state
	* @return the tincan activity state, or <code>null</code> if a tincan activity state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanActivityState fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tincan activity states.
	*
	* @return the tincan activity states
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanActivityState> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tincan activity states.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanActivityStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan activity states
	* @param end the upper bound of the range of tincan activity states (not inclusive)
	* @return the range of tincan activity states
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanActivityState> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tincan activity states.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanActivityStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan activity states
	* @param end the upper bound of the range of tincan activity states (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tincan activity states
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanActivityState> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tincan activity states from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tincan activity states.
	*
	* @return the number of tincan activity states
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
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

import com.labimo.portlet.tincan.model.TincanStatement;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the tincan statement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanStatementPersistenceImpl
 * @see TincanStatementUtil
 * @generated
 */
public interface TincanStatementPersistence extends BasePersistence<TincanStatement> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TincanStatementUtil} to access the tincan statement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tincan statement in the entity cache if it is enabled.
	*
	* @param tincanStatement the tincan statement
	*/
	public void cacheResult(
		com.labimo.portlet.tincan.model.TincanStatement tincanStatement);

	/**
	* Caches the tincan statements in the entity cache if it is enabled.
	*
	* @param tincanStatements the tincan statements
	*/
	public void cacheResult(
		java.util.List<com.labimo.portlet.tincan.model.TincanStatement> tincanStatements);

	/**
	* Creates a new tincan statement with the primary key. Does not add the tincan statement to the database.
	*
	* @param id the primary key for the new tincan statement
	* @return the new tincan statement
	*/
	public com.labimo.portlet.tincan.model.TincanStatement create(long id);

	/**
	* Removes the tincan statement with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan statement
	* @return the tincan statement that was removed
	* @throws com.labimo.portlet.tincan.NoSuchTincanStatementException if a tincan statement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanStatement remove(long id)
		throws com.labimo.portlet.tincan.NoSuchTincanStatementException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.labimo.portlet.tincan.model.TincanStatement updateImpl(
		com.labimo.portlet.tincan.model.TincanStatement tincanStatement)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tincan statement with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanStatementException} if it could not be found.
	*
	* @param id the primary key of the tincan statement
	* @return the tincan statement
	* @throws com.labimo.portlet.tincan.NoSuchTincanStatementException if a tincan statement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanStatement findByPrimaryKey(
		long id)
		throws com.labimo.portlet.tincan.NoSuchTincanStatementException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tincan statement with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tincan statement
	* @return the tincan statement, or <code>null</code> if a tincan statement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanStatement fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tincan statements.
	*
	* @return the tincan statements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanStatement> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tincan statements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan statements
	* @param end the upper bound of the range of tincan statements (not inclusive)
	* @return the range of tincan statements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanStatement> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tincan statements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan statements
	* @param end the upper bound of the range of tincan statements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tincan statements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanStatement> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tincan statements from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tincan statements.
	*
	* @return the number of tincan statements
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
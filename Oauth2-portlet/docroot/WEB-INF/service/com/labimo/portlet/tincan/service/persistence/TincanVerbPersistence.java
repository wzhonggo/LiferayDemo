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

import com.labimo.portlet.tincan.model.TincanVerb;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the tincan verb service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanVerbPersistenceImpl
 * @see TincanVerbUtil
 * @generated
 */
public interface TincanVerbPersistence extends BasePersistence<TincanVerb> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TincanVerbUtil} to access the tincan verb persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tincan verb in the entity cache if it is enabled.
	*
	* @param tincanVerb the tincan verb
	*/
	public void cacheResult(
		com.labimo.portlet.tincan.model.TincanVerb tincanVerb);

	/**
	* Caches the tincan verbs in the entity cache if it is enabled.
	*
	* @param tincanVerbs the tincan verbs
	*/
	public void cacheResult(
		java.util.List<com.labimo.portlet.tincan.model.TincanVerb> tincanVerbs);

	/**
	* Creates a new tincan verb with the primary key. Does not add the tincan verb to the database.
	*
	* @param id the primary key for the new tincan verb
	* @return the new tincan verb
	*/
	public com.labimo.portlet.tincan.model.TincanVerb create(long id);

	/**
	* Removes the tincan verb with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan verb
	* @return the tincan verb that was removed
	* @throws com.labimo.portlet.tincan.NoSuchTincanVerbException if a tincan verb with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanVerb remove(long id)
		throws com.labimo.portlet.tincan.NoSuchTincanVerbException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.labimo.portlet.tincan.model.TincanVerb updateImpl(
		com.labimo.portlet.tincan.model.TincanVerb tincanVerb)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tincan verb with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanVerbException} if it could not be found.
	*
	* @param id the primary key of the tincan verb
	* @return the tincan verb
	* @throws com.labimo.portlet.tincan.NoSuchTincanVerbException if a tincan verb with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanVerb findByPrimaryKey(long id)
		throws com.labimo.portlet.tincan.NoSuchTincanVerbException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tincan verb with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tincan verb
	* @return the tincan verb, or <code>null</code> if a tincan verb with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanVerb fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tincan verbs.
	*
	* @return the tincan verbs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanVerb> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tincan verbs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanVerbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan verbs
	* @param end the upper bound of the range of tincan verbs (not inclusive)
	* @return the range of tincan verbs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanVerb> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tincan verbs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanVerbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan verbs
	* @param end the upper bound of the range of tincan verbs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tincan verbs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanVerb> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tincan verbs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tincan verbs.
	*
	* @return the number of tincan verbs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
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

import com.labimo.portlet.tincan.model.TincanAgent;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the tincan agent service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanAgentPersistenceImpl
 * @see TincanAgentUtil
 * @generated
 */
public interface TincanAgentPersistence extends BasePersistence<TincanAgent> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TincanAgentUtil} to access the tincan agent persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tincan agent in the entity cache if it is enabled.
	*
	* @param tincanAgent the tincan agent
	*/
	public void cacheResult(
		com.labimo.portlet.tincan.model.TincanAgent tincanAgent);

	/**
	* Caches the tincan agents in the entity cache if it is enabled.
	*
	* @param tincanAgents the tincan agents
	*/
	public void cacheResult(
		java.util.List<com.labimo.portlet.tincan.model.TincanAgent> tincanAgents);

	/**
	* Creates a new tincan agent with the primary key. Does not add the tincan agent to the database.
	*
	* @param id the primary key for the new tincan agent
	* @return the new tincan agent
	*/
	public com.labimo.portlet.tincan.model.TincanAgent create(long id);

	/**
	* Removes the tincan agent with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan agent
	* @return the tincan agent that was removed
	* @throws com.labimo.portlet.tincan.NoSuchTincanAgentException if a tincan agent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanAgent remove(long id)
		throws com.labimo.portlet.tincan.NoSuchTincanAgentException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.labimo.portlet.tincan.model.TincanAgent updateImpl(
		com.labimo.portlet.tincan.model.TincanAgent tincanAgent)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tincan agent with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanAgentException} if it could not be found.
	*
	* @param id the primary key of the tincan agent
	* @return the tincan agent
	* @throws com.labimo.portlet.tincan.NoSuchTincanAgentException if a tincan agent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanAgent findByPrimaryKey(long id)
		throws com.labimo.portlet.tincan.NoSuchTincanAgentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tincan agent with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tincan agent
	* @return the tincan agent, or <code>null</code> if a tincan agent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanAgent fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tincan agents.
	*
	* @return the tincan agents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanAgent> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tincan agents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan agents
	* @param end the upper bound of the range of tincan agents (not inclusive)
	* @return the range of tincan agents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanAgent> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tincan agents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan agents
	* @param end the upper bound of the range of tincan agents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tincan agents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanAgent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tincan agents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tincan agents.
	*
	* @return the number of tincan agents
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
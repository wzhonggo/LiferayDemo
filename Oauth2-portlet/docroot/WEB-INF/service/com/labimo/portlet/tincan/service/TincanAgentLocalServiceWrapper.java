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

package com.labimo.portlet.tincan.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TincanAgentLocalService}.
 *
 * @author wzgong
 * @see TincanAgentLocalService
 * @generated
 */
public class TincanAgentLocalServiceWrapper implements TincanAgentLocalService,
	ServiceWrapper<TincanAgentLocalService> {
	public TincanAgentLocalServiceWrapper(
		TincanAgentLocalService tincanAgentLocalService) {
		_tincanAgentLocalService = tincanAgentLocalService;
	}

	/**
	* Adds the tincan agent to the database. Also notifies the appropriate model listeners.
	*
	* @param tincanAgent the tincan agent
	* @return the tincan agent that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanAgent addTincanAgent(
		com.labimo.portlet.tincan.model.TincanAgent tincanAgent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAgentLocalService.addTincanAgent(tincanAgent);
	}

	/**
	* Creates a new tincan agent with the primary key. Does not add the tincan agent to the database.
	*
	* @param id the primary key for the new tincan agent
	* @return the new tincan agent
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanAgent createTincanAgent(
		long id) {
		return _tincanAgentLocalService.createTincanAgent(id);
	}

	/**
	* Deletes the tincan agent with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan agent
	* @return the tincan agent that was removed
	* @throws PortalException if a tincan agent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanAgent deleteTincanAgent(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanAgentLocalService.deleteTincanAgent(id);
	}

	/**
	* Deletes the tincan agent from the database. Also notifies the appropriate model listeners.
	*
	* @param tincanAgent the tincan agent
	* @return the tincan agent that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanAgent deleteTincanAgent(
		com.labimo.portlet.tincan.model.TincanAgent tincanAgent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAgentLocalService.deleteTincanAgent(tincanAgent);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tincanAgentLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAgentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAgentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAgentLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAgentLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAgentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.labimo.portlet.tincan.model.TincanAgent fetchTincanAgent(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAgentLocalService.fetchTincanAgent(id);
	}

	/**
	* Returns the tincan agent with the primary key.
	*
	* @param id the primary key of the tincan agent
	* @return the tincan agent
	* @throws PortalException if a tincan agent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanAgent getTincanAgent(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanAgentLocalService.getTincanAgent(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanAgentLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.labimo.portlet.tincan.model.TincanAgent> getTincanAgents(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAgentLocalService.getTincanAgents(start, end);
	}

	/**
	* Returns the number of tincan agents.
	*
	* @return the number of tincan agents
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTincanAgentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAgentLocalService.getTincanAgentsCount();
	}

	/**
	* Updates the tincan agent in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tincanAgent the tincan agent
	* @return the tincan agent that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanAgent updateTincanAgent(
		com.labimo.portlet.tincan.model.TincanAgent tincanAgent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAgentLocalService.updateTincanAgent(tincanAgent);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tincanAgentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tincanAgentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tincanAgentLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TincanAgentLocalService getWrappedTincanAgentLocalService() {
		return _tincanAgentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTincanAgentLocalService(
		TincanAgentLocalService tincanAgentLocalService) {
		_tincanAgentLocalService = tincanAgentLocalService;
	}

	@Override
	public TincanAgentLocalService getWrappedService() {
		return _tincanAgentLocalService;
	}

	@Override
	public void setWrappedService(
		TincanAgentLocalService tincanAgentLocalService) {
		_tincanAgentLocalService = tincanAgentLocalService;
	}

	private TincanAgentLocalService _tincanAgentLocalService;
}
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
 * Provides a wrapper for {@link TincanActivityStateLocalService}.
 *
 * @author wzgong
 * @see TincanActivityStateLocalService
 * @generated
 */
public class TincanActivityStateLocalServiceWrapper
	implements TincanActivityStateLocalService,
		ServiceWrapper<TincanActivityStateLocalService> {
	public TincanActivityStateLocalServiceWrapper(
		TincanActivityStateLocalService tincanActivityStateLocalService) {
		_tincanActivityStateLocalService = tincanActivityStateLocalService;
	}

	/**
	* Adds the tincan activity state to the database. Also notifies the appropriate model listeners.
	*
	* @param tincanActivityState the tincan activity state
	* @return the tincan activity state that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanActivityState addTincanActivityState(
		com.labimo.portlet.tincan.model.TincanActivityState tincanActivityState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanActivityStateLocalService.addTincanActivityState(tincanActivityState);
	}

	/**
	* Creates a new tincan activity state with the primary key. Does not add the tincan activity state to the database.
	*
	* @param id the primary key for the new tincan activity state
	* @return the new tincan activity state
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanActivityState createTincanActivityState(
		long id) {
		return _tincanActivityStateLocalService.createTincanActivityState(id);
	}

	/**
	* Deletes the tincan activity state with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan activity state
	* @return the tincan activity state that was removed
	* @throws PortalException if a tincan activity state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanActivityState deleteTincanActivityState(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanActivityStateLocalService.deleteTincanActivityState(id);
	}

	/**
	* Deletes the tincan activity state from the database. Also notifies the appropriate model listeners.
	*
	* @param tincanActivityState the tincan activity state
	* @return the tincan activity state that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanActivityState deleteTincanActivityState(
		com.labimo.portlet.tincan.model.TincanActivityState tincanActivityState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanActivityStateLocalService.deleteTincanActivityState(tincanActivityState);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tincanActivityStateLocalService.dynamicQuery();
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
		return _tincanActivityStateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanActivityStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tincanActivityStateLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanActivityStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tincanActivityStateLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _tincanActivityStateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tincanActivityStateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.labimo.portlet.tincan.model.TincanActivityState fetchTincanActivityState(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanActivityStateLocalService.fetchTincanActivityState(id);
	}

	/**
	* Returns the tincan activity state with the primary key.
	*
	* @param id the primary key of the tincan activity state
	* @return the tincan activity state
	* @throws PortalException if a tincan activity state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanActivityState getTincanActivityState(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanActivityStateLocalService.getTincanActivityState(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanActivityStateLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.labimo.portlet.tincan.model.TincanActivityState> getTincanActivityStates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanActivityStateLocalService.getTincanActivityStates(start,
			end);
	}

	/**
	* Returns the number of tincan activity states.
	*
	* @return the number of tincan activity states
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTincanActivityStatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanActivityStateLocalService.getTincanActivityStatesCount();
	}

	/**
	* Updates the tincan activity state in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tincanActivityState the tincan activity state
	* @return the tincan activity state that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanActivityState updateTincanActivityState(
		com.labimo.portlet.tincan.model.TincanActivityState tincanActivityState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanActivityStateLocalService.updateTincanActivityState(tincanActivityState);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tincanActivityStateLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tincanActivityStateLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tincanActivityStateLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TincanActivityStateLocalService getWrappedTincanActivityStateLocalService() {
		return _tincanActivityStateLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTincanActivityStateLocalService(
		TincanActivityStateLocalService tincanActivityStateLocalService) {
		_tincanActivityStateLocalService = tincanActivityStateLocalService;
	}

	@Override
	public TincanActivityStateLocalService getWrappedService() {
		return _tincanActivityStateLocalService;
	}

	@Override
	public void setWrappedService(
		TincanActivityStateLocalService tincanActivityStateLocalService) {
		_tincanActivityStateLocalService = tincanActivityStateLocalService;
	}

	private TincanActivityStateLocalService _tincanActivityStateLocalService;
}
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
 * Provides a wrapper for {@link TincanStatementResultLocalService}.
 *
 * @author wzgong
 * @see TincanStatementResultLocalService
 * @generated
 */
public class TincanStatementResultLocalServiceWrapper
	implements TincanStatementResultLocalService,
		ServiceWrapper<TincanStatementResultLocalService> {
	public TincanStatementResultLocalServiceWrapper(
		TincanStatementResultLocalService tincanStatementResultLocalService) {
		_tincanStatementResultLocalService = tincanStatementResultLocalService;
	}

	/**
	* Adds the tincan statement result to the database. Also notifies the appropriate model listeners.
	*
	* @param tincanStatementResult the tincan statement result
	* @return the tincan statement result that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatementResult addTincanStatementResult(
		com.labimo.portlet.tincan.model.TincanStatementResult tincanStatementResult)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementResultLocalService.addTincanStatementResult(tincanStatementResult);
	}

	/**
	* Creates a new tincan statement result with the primary key. Does not add the tincan statement result to the database.
	*
	* @param id the primary key for the new tincan statement result
	* @return the new tincan statement result
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatementResult createTincanStatementResult(
		long id) {
		return _tincanStatementResultLocalService.createTincanStatementResult(id);
	}

	/**
	* Deletes the tincan statement result with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan statement result
	* @return the tincan statement result that was removed
	* @throws PortalException if a tincan statement result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatementResult deleteTincanStatementResult(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementResultLocalService.deleteTincanStatementResult(id);
	}

	/**
	* Deletes the tincan statement result from the database. Also notifies the appropriate model listeners.
	*
	* @param tincanStatementResult the tincan statement result
	* @return the tincan statement result that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatementResult deleteTincanStatementResult(
		com.labimo.portlet.tincan.model.TincanStatementResult tincanStatementResult)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementResultLocalService.deleteTincanStatementResult(tincanStatementResult);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tincanStatementResultLocalService.dynamicQuery();
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
		return _tincanStatementResultLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tincanStatementResultLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tincanStatementResultLocalService.dynamicQuery(dynamicQuery,
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
		return _tincanStatementResultLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tincanStatementResultLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.labimo.portlet.tincan.model.TincanStatementResult fetchTincanStatementResult(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementResultLocalService.fetchTincanStatementResult(id);
	}

	/**
	* Returns the tincan statement result with the primary key.
	*
	* @param id the primary key of the tincan statement result
	* @return the tincan statement result
	* @throws PortalException if a tincan statement result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatementResult getTincanStatementResult(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementResultLocalService.getTincanStatementResult(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementResultLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tincan statement results.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan statement results
	* @param end the upper bound of the range of tincan statement results (not inclusive)
	* @return the range of tincan statement results
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.labimo.portlet.tincan.model.TincanStatementResult> getTincanStatementResults(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementResultLocalService.getTincanStatementResults(start,
			end);
	}

	/**
	* Returns the number of tincan statement results.
	*
	* @return the number of tincan statement results
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTincanStatementResultsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementResultLocalService.getTincanStatementResultsCount();
	}

	/**
	* Updates the tincan statement result in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tincanStatementResult the tincan statement result
	* @return the tincan statement result that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatementResult updateTincanStatementResult(
		com.labimo.portlet.tincan.model.TincanStatementResult tincanStatementResult)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementResultLocalService.updateTincanStatementResult(tincanStatementResult);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tincanStatementResultLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tincanStatementResultLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tincanStatementResultLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TincanStatementResultLocalService getWrappedTincanStatementResultLocalService() {
		return _tincanStatementResultLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTincanStatementResultLocalService(
		TincanStatementResultLocalService tincanStatementResultLocalService) {
		_tincanStatementResultLocalService = tincanStatementResultLocalService;
	}

	@Override
	public TincanStatementResultLocalService getWrappedService() {
		return _tincanStatementResultLocalService;
	}

	@Override
	public void setWrappedService(
		TincanStatementResultLocalService tincanStatementResultLocalService) {
		_tincanStatementResultLocalService = tincanStatementResultLocalService;
	}

	private TincanStatementResultLocalService _tincanStatementResultLocalService;
}
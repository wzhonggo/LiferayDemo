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
 * Provides a wrapper for {@link TincanStatementLocalService}.
 *
 * @author wzgong
 * @see TincanStatementLocalService
 * @generated
 */
public class TincanStatementLocalServiceWrapper
	implements TincanStatementLocalService,
		ServiceWrapper<TincanStatementLocalService> {
	public TincanStatementLocalServiceWrapper(
		TincanStatementLocalService tincanStatementLocalService) {
		_tincanStatementLocalService = tincanStatementLocalService;
	}

	/**
	* Adds the tincan statement to the database. Also notifies the appropriate model listeners.
	*
	* @param tincanStatement the tincan statement
	* @return the tincan statement that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatement addTincanStatement(
		com.labimo.portlet.tincan.model.TincanStatement tincanStatement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementLocalService.addTincanStatement(tincanStatement);
	}

	/**
	* Creates a new tincan statement with the primary key. Does not add the tincan statement to the database.
	*
	* @param id the primary key for the new tincan statement
	* @return the new tincan statement
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatement createTincanStatement(
		long id) {
		return _tincanStatementLocalService.createTincanStatement(id);
	}

	/**
	* Deletes the tincan statement with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan statement
	* @return the tincan statement that was removed
	* @throws PortalException if a tincan statement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatement deleteTincanStatement(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementLocalService.deleteTincanStatement(id);
	}

	/**
	* Deletes the tincan statement from the database. Also notifies the appropriate model listeners.
	*
	* @param tincanStatement the tincan statement
	* @return the tincan statement that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatement deleteTincanStatement(
		com.labimo.portlet.tincan.model.TincanStatement tincanStatement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementLocalService.deleteTincanStatement(tincanStatement);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tincanStatementLocalService.dynamicQuery();
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
		return _tincanStatementLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tincanStatementLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tincanStatementLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _tincanStatementLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tincanStatementLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.labimo.portlet.tincan.model.TincanStatement fetchTincanStatement(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementLocalService.fetchTincanStatement(id);
	}

	/**
	* Returns the tincan statement with the primary key.
	*
	* @param id the primary key of the tincan statement
	* @return the tincan statement
	* @throws PortalException if a tincan statement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatement getTincanStatement(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementLocalService.getTincanStatement(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.labimo.portlet.tincan.model.TincanStatement> getTincanStatements(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementLocalService.getTincanStatements(start, end);
	}

	/**
	* Returns the number of tincan statements.
	*
	* @return the number of tincan statements
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTincanStatementsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementLocalService.getTincanStatementsCount();
	}

	/**
	* Updates the tincan statement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tincanStatement the tincan statement
	* @return the tincan statement that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatement updateTincanStatement(
		com.labimo.portlet.tincan.model.TincanStatement tincanStatement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementLocalService.updateTincanStatement(tincanStatement);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tincanStatementLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tincanStatementLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tincanStatementLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TincanStatementLocalService getWrappedTincanStatementLocalService() {
		return _tincanStatementLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTincanStatementLocalService(
		TincanStatementLocalService tincanStatementLocalService) {
		_tincanStatementLocalService = tincanStatementLocalService;
	}

	@Override
	public TincanStatementLocalService getWrappedService() {
		return _tincanStatementLocalService;
	}

	@Override
	public void setWrappedService(
		TincanStatementLocalService tincanStatementLocalService) {
		_tincanStatementLocalService = tincanStatementLocalService;
	}

	private TincanStatementLocalService _tincanStatementLocalService;
}
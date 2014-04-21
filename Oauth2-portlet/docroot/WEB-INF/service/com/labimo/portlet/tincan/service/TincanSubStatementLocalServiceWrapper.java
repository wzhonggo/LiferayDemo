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
 * Provides a wrapper for {@link TincanSubStatementLocalService}.
 *
 * @author wzgong
 * @see TincanSubStatementLocalService
 * @generated
 */
public class TincanSubStatementLocalServiceWrapper
	implements TincanSubStatementLocalService,
		ServiceWrapper<TincanSubStatementLocalService> {
	public TincanSubStatementLocalServiceWrapper(
		TincanSubStatementLocalService tincanSubStatementLocalService) {
		_tincanSubStatementLocalService = tincanSubStatementLocalService;
	}

	/**
	* Adds the tincan sub statement to the database. Also notifies the appropriate model listeners.
	*
	* @param tincanSubStatement the tincan sub statement
	* @return the tincan sub statement that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanSubStatement addTincanSubStatement(
		com.labimo.portlet.tincan.model.TincanSubStatement tincanSubStatement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanSubStatementLocalService.addTincanSubStatement(tincanSubStatement);
	}

	/**
	* Creates a new tincan sub statement with the primary key. Does not add the tincan sub statement to the database.
	*
	* @param id the primary key for the new tincan sub statement
	* @return the new tincan sub statement
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanSubStatement createTincanSubStatement(
		long id) {
		return _tincanSubStatementLocalService.createTincanSubStatement(id);
	}

	/**
	* Deletes the tincan sub statement with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan sub statement
	* @return the tincan sub statement that was removed
	* @throws PortalException if a tincan sub statement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanSubStatement deleteTincanSubStatement(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanSubStatementLocalService.deleteTincanSubStatement(id);
	}

	/**
	* Deletes the tincan sub statement from the database. Also notifies the appropriate model listeners.
	*
	* @param tincanSubStatement the tincan sub statement
	* @return the tincan sub statement that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanSubStatement deleteTincanSubStatement(
		com.labimo.portlet.tincan.model.TincanSubStatement tincanSubStatement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanSubStatementLocalService.deleteTincanSubStatement(tincanSubStatement);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tincanSubStatementLocalService.dynamicQuery();
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
		return _tincanSubStatementLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanSubStatementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tincanSubStatementLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanSubStatementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tincanSubStatementLocalService.dynamicQuery(dynamicQuery,
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
		return _tincanSubStatementLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tincanSubStatementLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.labimo.portlet.tincan.model.TincanSubStatement fetchTincanSubStatement(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanSubStatementLocalService.fetchTincanSubStatement(id);
	}

	/**
	* Returns the tincan sub statement with the primary key.
	*
	* @param id the primary key of the tincan sub statement
	* @return the tincan sub statement
	* @throws PortalException if a tincan sub statement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanSubStatement getTincanSubStatement(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanSubStatementLocalService.getTincanSubStatement(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanSubStatementLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tincan sub statements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanSubStatementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan sub statements
	* @param end the upper bound of the range of tincan sub statements (not inclusive)
	* @return the range of tincan sub statements
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.labimo.portlet.tincan.model.TincanSubStatement> getTincanSubStatements(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanSubStatementLocalService.getTincanSubStatements(start, end);
	}

	/**
	* Returns the number of tincan sub statements.
	*
	* @return the number of tincan sub statements
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTincanSubStatementsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanSubStatementLocalService.getTincanSubStatementsCount();
	}

	/**
	* Updates the tincan sub statement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tincanSubStatement the tincan sub statement
	* @return the tincan sub statement that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanSubStatement updateTincanSubStatement(
		com.labimo.portlet.tincan.model.TincanSubStatement tincanSubStatement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanSubStatementLocalService.updateTincanSubStatement(tincanSubStatement);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tincanSubStatementLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tincanSubStatementLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tincanSubStatementLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TincanSubStatementLocalService getWrappedTincanSubStatementLocalService() {
		return _tincanSubStatementLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTincanSubStatementLocalService(
		TincanSubStatementLocalService tincanSubStatementLocalService) {
		_tincanSubStatementLocalService = tincanSubStatementLocalService;
	}

	@Override
	public TincanSubStatementLocalService getWrappedService() {
		return _tincanSubStatementLocalService;
	}

	@Override
	public void setWrappedService(
		TincanSubStatementLocalService tincanSubStatementLocalService) {
		_tincanSubStatementLocalService = tincanSubStatementLocalService;
	}

	private TincanSubStatementLocalService _tincanSubStatementLocalService;
}
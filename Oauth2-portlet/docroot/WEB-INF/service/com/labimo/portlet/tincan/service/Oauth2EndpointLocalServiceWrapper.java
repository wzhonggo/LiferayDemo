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
 * Provides a wrapper for {@link Oauth2EndpointLocalService}.
 *
 * @author wzgong
 * @see Oauth2EndpointLocalService
 * @generated
 */
public class Oauth2EndpointLocalServiceWrapper
	implements Oauth2EndpointLocalService,
		ServiceWrapper<Oauth2EndpointLocalService> {
	public Oauth2EndpointLocalServiceWrapper(
		Oauth2EndpointLocalService oauth2EndpointLocalService) {
		_oauth2EndpointLocalService = oauth2EndpointLocalService;
	}

	/**
	* Adds the oauth2 endpoint to the database. Also notifies the appropriate model listeners.
	*
	* @param oauth2Endpoint the oauth2 endpoint
	* @return the oauth2 endpoint that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Endpoint addOauth2Endpoint(
		com.labimo.portlet.tincan.model.Oauth2Endpoint oauth2Endpoint)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2EndpointLocalService.addOauth2Endpoint(oauth2Endpoint);
	}

	/**
	* Creates a new oauth2 endpoint with the primary key. Does not add the oauth2 endpoint to the database.
	*
	* @param id the primary key for the new oauth2 endpoint
	* @return the new oauth2 endpoint
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Endpoint createOauth2Endpoint(
		long id) {
		return _oauth2EndpointLocalService.createOauth2Endpoint(id);
	}

	/**
	* Deletes the oauth2 endpoint with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the oauth2 endpoint
	* @return the oauth2 endpoint that was removed
	* @throws PortalException if a oauth2 endpoint with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Endpoint deleteOauth2Endpoint(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oauth2EndpointLocalService.deleteOauth2Endpoint(id);
	}

	/**
	* Deletes the oauth2 endpoint from the database. Also notifies the appropriate model listeners.
	*
	* @param oauth2Endpoint the oauth2 endpoint
	* @return the oauth2 endpoint that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Endpoint deleteOauth2Endpoint(
		com.labimo.portlet.tincan.model.Oauth2Endpoint oauth2Endpoint)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2EndpointLocalService.deleteOauth2Endpoint(oauth2Endpoint);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _oauth2EndpointLocalService.dynamicQuery();
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
		return _oauth2EndpointLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2EndpointModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _oauth2EndpointLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2EndpointModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _oauth2EndpointLocalService.dynamicQuery(dynamicQuery, start,
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
		return _oauth2EndpointLocalService.dynamicQueryCount(dynamicQuery);
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
		return _oauth2EndpointLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.labimo.portlet.tincan.model.Oauth2Endpoint fetchOauth2Endpoint(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2EndpointLocalService.fetchOauth2Endpoint(id);
	}

	/**
	* Returns the oauth2 endpoint with the primary key.
	*
	* @param id the primary key of the oauth2 endpoint
	* @return the oauth2 endpoint
	* @throws PortalException if a oauth2 endpoint with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Endpoint getOauth2Endpoint(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oauth2EndpointLocalService.getOauth2Endpoint(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oauth2EndpointLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the oauth2 endpoints.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2EndpointModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oauth2 endpoints
	* @param end the upper bound of the range of oauth2 endpoints (not inclusive)
	* @return the range of oauth2 endpoints
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.labimo.portlet.tincan.model.Oauth2Endpoint> getOauth2Endpoints(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2EndpointLocalService.getOauth2Endpoints(start, end);
	}

	/**
	* Returns the number of oauth2 endpoints.
	*
	* @return the number of oauth2 endpoints
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOauth2EndpointsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2EndpointLocalService.getOauth2EndpointsCount();
	}

	/**
	* Updates the oauth2 endpoint in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oauth2Endpoint the oauth2 endpoint
	* @return the oauth2 endpoint that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Endpoint updateOauth2Endpoint(
		com.labimo.portlet.tincan.model.Oauth2Endpoint oauth2Endpoint)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2EndpointLocalService.updateOauth2Endpoint(oauth2Endpoint);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _oauth2EndpointLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_oauth2EndpointLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _oauth2EndpointLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Oauth2EndpointLocalService getWrappedOauth2EndpointLocalService() {
		return _oauth2EndpointLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOauth2EndpointLocalService(
		Oauth2EndpointLocalService oauth2EndpointLocalService) {
		_oauth2EndpointLocalService = oauth2EndpointLocalService;
	}

	@Override
	public Oauth2EndpointLocalService getWrappedService() {
		return _oauth2EndpointLocalService;
	}

	@Override
	public void setWrappedService(
		Oauth2EndpointLocalService oauth2EndpointLocalService) {
		_oauth2EndpointLocalService = oauth2EndpointLocalService;
	}

	private Oauth2EndpointLocalService _oauth2EndpointLocalService;
}
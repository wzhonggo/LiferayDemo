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
 * Provides a wrapper for {@link Oauth2ClientLocalService}.
 *
 * @author wzgong
 * @see Oauth2ClientLocalService
 * @generated
 */
public class Oauth2ClientLocalServiceWrapper implements Oauth2ClientLocalService,
	ServiceWrapper<Oauth2ClientLocalService> {
	public Oauth2ClientLocalServiceWrapper(
		Oauth2ClientLocalService oauth2ClientLocalService) {
		_oauth2ClientLocalService = oauth2ClientLocalService;
	}

	/**
	* Adds the oauth2 client to the database. Also notifies the appropriate model listeners.
	*
	* @param oauth2Client the oauth2 client
	* @return the oauth2 client that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Client addOauth2Client(
		com.labimo.portlet.tincan.model.Oauth2Client oauth2Client)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2ClientLocalService.addOauth2Client(oauth2Client);
	}

	/**
	* Creates a new oauth2 client with the primary key. Does not add the oauth2 client to the database.
	*
	* @param id the primary key for the new oauth2 client
	* @return the new oauth2 client
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Client createOauth2Client(
		java.lang.String id) {
		return _oauth2ClientLocalService.createOauth2Client(id);
	}

	/**
	* Deletes the oauth2 client with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the oauth2 client
	* @return the oauth2 client that was removed
	* @throws PortalException if a oauth2 client with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Client deleteOauth2Client(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oauth2ClientLocalService.deleteOauth2Client(id);
	}

	/**
	* Deletes the oauth2 client from the database. Also notifies the appropriate model listeners.
	*
	* @param oauth2Client the oauth2 client
	* @return the oauth2 client that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Client deleteOauth2Client(
		com.labimo.portlet.tincan.model.Oauth2Client oauth2Client)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2ClientLocalService.deleteOauth2Client(oauth2Client);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _oauth2ClientLocalService.dynamicQuery();
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
		return _oauth2ClientLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2ClientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _oauth2ClientLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2ClientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _oauth2ClientLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _oauth2ClientLocalService.dynamicQueryCount(dynamicQuery);
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
		return _oauth2ClientLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.labimo.portlet.tincan.model.Oauth2Client fetchOauth2Client(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2ClientLocalService.fetchOauth2Client(id);
	}

	/**
	* Returns the oauth2 client with the primary key.
	*
	* @param id the primary key of the oauth2 client
	* @return the oauth2 client
	* @throws PortalException if a oauth2 client with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Client getOauth2Client(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oauth2ClientLocalService.getOauth2Client(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oauth2ClientLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the oauth2 clients.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2ClientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oauth2 clients
	* @param end the upper bound of the range of oauth2 clients (not inclusive)
	* @return the range of oauth2 clients
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.labimo.portlet.tincan.model.Oauth2Client> getOauth2Clients(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2ClientLocalService.getOauth2Clients(start, end);
	}

	/**
	* Returns the number of oauth2 clients.
	*
	* @return the number of oauth2 clients
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOauth2ClientsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2ClientLocalService.getOauth2ClientsCount();
	}

	/**
	* Updates the oauth2 client in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oauth2Client the oauth2 client
	* @return the oauth2 client that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Client updateOauth2Client(
		com.labimo.portlet.tincan.model.Oauth2Client oauth2Client)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2ClientLocalService.updateOauth2Client(oauth2Client);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _oauth2ClientLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_oauth2ClientLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _oauth2ClientLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Oauth2ClientLocalService getWrappedOauth2ClientLocalService() {
		return _oauth2ClientLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOauth2ClientLocalService(
		Oauth2ClientLocalService oauth2ClientLocalService) {
		_oauth2ClientLocalService = oauth2ClientLocalService;
	}

	@Override
	public Oauth2ClientLocalService getWrappedService() {
		return _oauth2ClientLocalService;
	}

	@Override
	public void setWrappedService(
		Oauth2ClientLocalService oauth2ClientLocalService) {
		_oauth2ClientLocalService = oauth2ClientLocalService;
	}

	private Oauth2ClientLocalService _oauth2ClientLocalService;
}
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
 * Provides a wrapper for {@link Oauth2TokenLocalService}.
 *
 * @author wzgong
 * @see Oauth2TokenLocalService
 * @generated
 */
public class Oauth2TokenLocalServiceWrapper implements Oauth2TokenLocalService,
	ServiceWrapper<Oauth2TokenLocalService> {
	public Oauth2TokenLocalServiceWrapper(
		Oauth2TokenLocalService oauth2TokenLocalService) {
		_oauth2TokenLocalService = oauth2TokenLocalService;
	}

	/**
	* Adds the oauth2 token to the database. Also notifies the appropriate model listeners.
	*
	* @param oauth2Token the oauth2 token
	* @return the oauth2 token that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Token addOauth2Token(
		com.labimo.portlet.tincan.model.Oauth2Token oauth2Token)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2TokenLocalService.addOauth2Token(oauth2Token);
	}

	/**
	* Creates a new oauth2 token with the primary key. Does not add the oauth2 token to the database.
	*
	* @param id the primary key for the new oauth2 token
	* @return the new oauth2 token
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Token createOauth2Token(
		long id) {
		return _oauth2TokenLocalService.createOauth2Token(id);
	}

	/**
	* Deletes the oauth2 token with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the oauth2 token
	* @return the oauth2 token that was removed
	* @throws PortalException if a oauth2 token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Token deleteOauth2Token(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oauth2TokenLocalService.deleteOauth2Token(id);
	}

	/**
	* Deletes the oauth2 token from the database. Also notifies the appropriate model listeners.
	*
	* @param oauth2Token the oauth2 token
	* @return the oauth2 token that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Token deleteOauth2Token(
		com.labimo.portlet.tincan.model.Oauth2Token oauth2Token)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2TokenLocalService.deleteOauth2Token(oauth2Token);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _oauth2TokenLocalService.dynamicQuery();
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
		return _oauth2TokenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2TokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _oauth2TokenLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2TokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _oauth2TokenLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _oauth2TokenLocalService.dynamicQueryCount(dynamicQuery);
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
		return _oauth2TokenLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.labimo.portlet.tincan.model.Oauth2Token fetchOauth2Token(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2TokenLocalService.fetchOauth2Token(id);
	}

	/**
	* Returns the oauth2 token with the primary key.
	*
	* @param id the primary key of the oauth2 token
	* @return the oauth2 token
	* @throws PortalException if a oauth2 token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Token getOauth2Token(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oauth2TokenLocalService.getOauth2Token(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oauth2TokenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the oauth2 tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2TokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oauth2 tokens
	* @param end the upper bound of the range of oauth2 tokens (not inclusive)
	* @return the range of oauth2 tokens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.labimo.portlet.tincan.model.Oauth2Token> getOauth2Tokens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2TokenLocalService.getOauth2Tokens(start, end);
	}

	/**
	* Returns the number of oauth2 tokens.
	*
	* @return the number of oauth2 tokens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOauth2TokensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2TokenLocalService.getOauth2TokensCount();
	}

	/**
	* Updates the oauth2 token in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oauth2Token the oauth2 token
	* @return the oauth2 token that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.Oauth2Token updateOauth2Token(
		com.labimo.portlet.tincan.model.Oauth2Token oauth2Token)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oauth2TokenLocalService.updateOauth2Token(oauth2Token);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _oauth2TokenLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_oauth2TokenLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _oauth2TokenLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Oauth2TokenLocalService getWrappedOauth2TokenLocalService() {
		return _oauth2TokenLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOauth2TokenLocalService(
		Oauth2TokenLocalService oauth2TokenLocalService) {
		_oauth2TokenLocalService = oauth2TokenLocalService;
	}

	@Override
	public Oauth2TokenLocalService getWrappedService() {
		return _oauth2TokenLocalService;
	}

	@Override
	public void setWrappedService(
		Oauth2TokenLocalService oauth2TokenLocalService) {
		_oauth2TokenLocalService = oauth2TokenLocalService;
	}

	private Oauth2TokenLocalService _oauth2TokenLocalService;
}
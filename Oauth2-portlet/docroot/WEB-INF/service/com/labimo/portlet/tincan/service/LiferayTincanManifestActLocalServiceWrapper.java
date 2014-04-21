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
 * Provides a wrapper for {@link LiferayTincanManifestActLocalService}.
 *
 * @author wzgong
 * @see LiferayTincanManifestActLocalService
 * @generated
 */
public class LiferayTincanManifestActLocalServiceWrapper
	implements LiferayTincanManifestActLocalService,
		ServiceWrapper<LiferayTincanManifestActLocalService> {
	public LiferayTincanManifestActLocalServiceWrapper(
		LiferayTincanManifestActLocalService liferayTincanManifestActLocalService) {
		_liferayTincanManifestActLocalService = liferayTincanManifestActLocalService;
	}

	/**
	* Adds the liferay tincan manifest act to the database. Also notifies the appropriate model listeners.
	*
	* @param liferayTincanManifestAct the liferay tincan manifest act
	* @return the liferay tincan manifest act that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.LiferayTincanManifestAct addLiferayTincanManifestAct(
		com.labimo.portlet.tincan.model.LiferayTincanManifestAct liferayTincanManifestAct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _liferayTincanManifestActLocalService.addLiferayTincanManifestAct(liferayTincanManifestAct);
	}

	/**
	* Creates a new liferay tincan manifest act with the primary key. Does not add the liferay tincan manifest act to the database.
	*
	* @param id the primary key for the new liferay tincan manifest act
	* @return the new liferay tincan manifest act
	*/
	@Override
	public com.labimo.portlet.tincan.model.LiferayTincanManifestAct createLiferayTincanManifestAct(
		long id) {
		return _liferayTincanManifestActLocalService.createLiferayTincanManifestAct(id);
	}

	/**
	* Deletes the liferay tincan manifest act with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the liferay tincan manifest act
	* @return the liferay tincan manifest act that was removed
	* @throws PortalException if a liferay tincan manifest act with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.LiferayTincanManifestAct deleteLiferayTincanManifestAct(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _liferayTincanManifestActLocalService.deleteLiferayTincanManifestAct(id);
	}

	/**
	* Deletes the liferay tincan manifest act from the database. Also notifies the appropriate model listeners.
	*
	* @param liferayTincanManifestAct the liferay tincan manifest act
	* @return the liferay tincan manifest act that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.LiferayTincanManifestAct deleteLiferayTincanManifestAct(
		com.labimo.portlet.tincan.model.LiferayTincanManifestAct liferayTincanManifestAct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _liferayTincanManifestActLocalService.deleteLiferayTincanManifestAct(liferayTincanManifestAct);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _liferayTincanManifestActLocalService.dynamicQuery();
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
		return _liferayTincanManifestActLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.LiferayTincanManifestActModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _liferayTincanManifestActLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.LiferayTincanManifestActModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _liferayTincanManifestActLocalService.dynamicQuery(dynamicQuery,
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
		return _liferayTincanManifestActLocalService.dynamicQueryCount(dynamicQuery);
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
		return _liferayTincanManifestActLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.labimo.portlet.tincan.model.LiferayTincanManifestAct fetchLiferayTincanManifestAct(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _liferayTincanManifestActLocalService.fetchLiferayTincanManifestAct(id);
	}

	/**
	* Returns the liferay tincan manifest act with the primary key.
	*
	* @param id the primary key of the liferay tincan manifest act
	* @return the liferay tincan manifest act
	* @throws PortalException if a liferay tincan manifest act with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.LiferayTincanManifestAct getLiferayTincanManifestAct(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _liferayTincanManifestActLocalService.getLiferayTincanManifestAct(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _liferayTincanManifestActLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the liferay tincan manifest acts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.LiferayTincanManifestActModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of liferay tincan manifest acts
	* @param end the upper bound of the range of liferay tincan manifest acts (not inclusive)
	* @return the range of liferay tincan manifest acts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.labimo.portlet.tincan.model.LiferayTincanManifestAct> getLiferayTincanManifestActs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _liferayTincanManifestActLocalService.getLiferayTincanManifestActs(start,
			end);
	}

	/**
	* Returns the number of liferay tincan manifest acts.
	*
	* @return the number of liferay tincan manifest acts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLiferayTincanManifestActsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _liferayTincanManifestActLocalService.getLiferayTincanManifestActsCount();
	}

	/**
	* Updates the liferay tincan manifest act in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param liferayTincanManifestAct the liferay tincan manifest act
	* @return the liferay tincan manifest act that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.LiferayTincanManifestAct updateLiferayTincanManifestAct(
		com.labimo.portlet.tincan.model.LiferayTincanManifestAct liferayTincanManifestAct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _liferayTincanManifestActLocalService.updateLiferayTincanManifestAct(liferayTincanManifestAct);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _liferayTincanManifestActLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_liferayTincanManifestActLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _liferayTincanManifestActLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LiferayTincanManifestActLocalService getWrappedLiferayTincanManifestActLocalService() {
		return _liferayTincanManifestActLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLiferayTincanManifestActLocalService(
		LiferayTincanManifestActLocalService liferayTincanManifestActLocalService) {
		_liferayTincanManifestActLocalService = liferayTincanManifestActLocalService;
	}

	@Override
	public LiferayTincanManifestActLocalService getWrappedService() {
		return _liferayTincanManifestActLocalService;
	}

	@Override
	public void setWrappedService(
		LiferayTincanManifestActLocalService liferayTincanManifestActLocalService) {
		_liferayTincanManifestActLocalService = liferayTincanManifestActLocalService;
	}

	private LiferayTincanManifestActLocalService _liferayTincanManifestActLocalService;
}
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

import com.labimo.portlet.tincan.model.LiferayTincanManifestAct;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the liferay tincan manifest act service. This utility wraps {@link LiferayTincanManifestActPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see LiferayTincanManifestActPersistence
 * @see LiferayTincanManifestActPersistenceImpl
 * @generated
 */
public class LiferayTincanManifestActUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(
		LiferayTincanManifestAct liferayTincanManifestAct) {
		getPersistence().clearCache(liferayTincanManifestAct);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LiferayTincanManifestAct> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LiferayTincanManifestAct> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LiferayTincanManifestAct> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LiferayTincanManifestAct update(
		LiferayTincanManifestAct liferayTincanManifestAct)
		throws SystemException {
		return getPersistence().update(liferayTincanManifestAct);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LiferayTincanManifestAct update(
		LiferayTincanManifestAct liferayTincanManifestAct,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(liferayTincanManifestAct, serviceContext);
	}

	/**
	* Caches the liferay tincan manifest act in the entity cache if it is enabled.
	*
	* @param liferayTincanManifestAct the liferay tincan manifest act
	*/
	public static void cacheResult(
		com.labimo.portlet.tincan.model.LiferayTincanManifestAct liferayTincanManifestAct) {
		getPersistence().cacheResult(liferayTincanManifestAct);
	}

	/**
	* Caches the liferay tincan manifest acts in the entity cache if it is enabled.
	*
	* @param liferayTincanManifestActs the liferay tincan manifest acts
	*/
	public static void cacheResult(
		java.util.List<com.labimo.portlet.tincan.model.LiferayTincanManifestAct> liferayTincanManifestActs) {
		getPersistence().cacheResult(liferayTincanManifestActs);
	}

	/**
	* Creates a new liferay tincan manifest act with the primary key. Does not add the liferay tincan manifest act to the database.
	*
	* @param id the primary key for the new liferay tincan manifest act
	* @return the new liferay tincan manifest act
	*/
	public static com.labimo.portlet.tincan.model.LiferayTincanManifestAct create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the liferay tincan manifest act with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the liferay tincan manifest act
	* @return the liferay tincan manifest act that was removed
	* @throws com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException if a liferay tincan manifest act with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.portlet.tincan.model.LiferayTincanManifestAct remove(
		long id)
		throws com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.labimo.portlet.tincan.model.LiferayTincanManifestAct updateImpl(
		com.labimo.portlet.tincan.model.LiferayTincanManifestAct liferayTincanManifestAct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(liferayTincanManifestAct);
	}

	/**
	* Returns the liferay tincan manifest act with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException} if it could not be found.
	*
	* @param id the primary key of the liferay tincan manifest act
	* @return the liferay tincan manifest act
	* @throws com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException if a liferay tincan manifest act with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.portlet.tincan.model.LiferayTincanManifestAct findByPrimaryKey(
		long id)
		throws com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the liferay tincan manifest act with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the liferay tincan manifest act
	* @return the liferay tincan manifest act, or <code>null</code> if a liferay tincan manifest act with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.portlet.tincan.model.LiferayTincanManifestAct fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the liferay tincan manifest acts.
	*
	* @return the liferay tincan manifest acts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.labimo.portlet.tincan.model.LiferayTincanManifestAct> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.labimo.portlet.tincan.model.LiferayTincanManifestAct> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the liferay tincan manifest acts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.LiferayTincanManifestActModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of liferay tincan manifest acts
	* @param end the upper bound of the range of liferay tincan manifest acts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of liferay tincan manifest acts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.labimo.portlet.tincan.model.LiferayTincanManifestAct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the liferay tincan manifest acts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of liferay tincan manifest acts.
	*
	* @return the number of liferay tincan manifest acts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LiferayTincanManifestActPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LiferayTincanManifestActPersistence)PortletBeanLocatorUtil.locate(com.labimo.portlet.tincan.service.ClpSerializer.getServletContextName(),
					LiferayTincanManifestActPersistence.class.getName());

			ReferenceRegistry.registerReference(LiferayTincanManifestActUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LiferayTincanManifestActPersistence persistence) {
	}

	private static LiferayTincanManifestActPersistence _persistence;
}
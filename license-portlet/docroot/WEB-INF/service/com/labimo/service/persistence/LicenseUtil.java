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

package com.labimo.service.persistence;

import com.labimo.model.License;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the license service. This utility wraps {@link LicensePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see LicensePersistence
 * @see LicensePersistenceImpl
 * @generated
 */
public class LicenseUtil {
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
	public static void clearCache(License license) {
		getPersistence().clearCache(license);
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
	public static List<License> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<License> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<License> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static License update(License license) throws SystemException {
		return getPersistence().update(license);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static License update(License license, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(license, serviceContext);
	}

	/**
	* Caches the license in the entity cache if it is enabled.
	*
	* @param license the license
	*/
	public static void cacheResult(com.labimo.model.License license) {
		getPersistence().cacheResult(license);
	}

	/**
	* Caches the licenses in the entity cache if it is enabled.
	*
	* @param licenses the licenses
	*/
	public static void cacheResult(
		java.util.List<com.labimo.model.License> licenses) {
		getPersistence().cacheResult(licenses);
	}

	/**
	* Creates a new license with the primary key. Does not add the license to the database.
	*
	* @param licenseUuid the primary key for the new license
	* @return the new license
	*/
	public static com.labimo.model.License create(java.lang.String licenseUuid) {
		return getPersistence().create(licenseUuid);
	}

	/**
	* Removes the license with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param licenseUuid the primary key of the license
	* @return the license that was removed
	* @throws com.labimo.NoSuchLicenseException if a license with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.model.License remove(java.lang.String licenseUuid)
		throws com.labimo.NoSuchLicenseException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(licenseUuid);
	}

	public static com.labimo.model.License updateImpl(
		com.labimo.model.License license)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(license);
	}

	/**
	* Returns the license with the primary key or throws a {@link com.labimo.NoSuchLicenseException} if it could not be found.
	*
	* @param licenseUuid the primary key of the license
	* @return the license
	* @throws com.labimo.NoSuchLicenseException if a license with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.model.License findByPrimaryKey(
		java.lang.String licenseUuid)
		throws com.labimo.NoSuchLicenseException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(licenseUuid);
	}

	/**
	* Returns the license with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param licenseUuid the primary key of the license
	* @return the license, or <code>null</code> if a license with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.model.License fetchByPrimaryKey(
		java.lang.String licenseUuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(licenseUuid);
	}

	/**
	* Returns all the licenses.
	*
	* @return the licenses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.labimo.model.License> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the licenses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.model.impl.LicenseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of licenses
	* @param end the upper bound of the range of licenses (not inclusive)
	* @return the range of licenses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.labimo.model.License> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the licenses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.model.impl.LicenseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of licenses
	* @param end the upper bound of the range of licenses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of licenses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.labimo.model.License> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the licenses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of licenses.
	*
	* @return the number of licenses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LicensePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LicensePersistence)PortletBeanLocatorUtil.locate(com.labimo.service.ClpSerializer.getServletContextName(),
					LicensePersistence.class.getName());

			ReferenceRegistry.registerReference(LicenseUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LicensePersistence persistence) {
	}

	private static LicensePersistence _persistence;
}
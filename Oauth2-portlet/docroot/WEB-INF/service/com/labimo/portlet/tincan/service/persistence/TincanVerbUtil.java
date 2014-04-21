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

import com.labimo.portlet.tincan.model.TincanVerb;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the tincan verb service. This utility wraps {@link TincanVerbPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanVerbPersistence
 * @see TincanVerbPersistenceImpl
 * @generated
 */
public class TincanVerbUtil {
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
	public static void clearCache(TincanVerb tincanVerb) {
		getPersistence().clearCache(tincanVerb);
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
	public static List<TincanVerb> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TincanVerb> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TincanVerb> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TincanVerb update(TincanVerb tincanVerb)
		throws SystemException {
		return getPersistence().update(tincanVerb);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TincanVerb update(TincanVerb tincanVerb,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tincanVerb, serviceContext);
	}

	/**
	* Caches the tincan verb in the entity cache if it is enabled.
	*
	* @param tincanVerb the tincan verb
	*/
	public static void cacheResult(
		com.labimo.portlet.tincan.model.TincanVerb tincanVerb) {
		getPersistence().cacheResult(tincanVerb);
	}

	/**
	* Caches the tincan verbs in the entity cache if it is enabled.
	*
	* @param tincanVerbs the tincan verbs
	*/
	public static void cacheResult(
		java.util.List<com.labimo.portlet.tincan.model.TincanVerb> tincanVerbs) {
		getPersistence().cacheResult(tincanVerbs);
	}

	/**
	* Creates a new tincan verb with the primary key. Does not add the tincan verb to the database.
	*
	* @param id the primary key for the new tincan verb
	* @return the new tincan verb
	*/
	public static com.labimo.portlet.tincan.model.TincanVerb create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tincan verb with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan verb
	* @return the tincan verb that was removed
	* @throws com.labimo.portlet.tincan.NoSuchTincanVerbException if a tincan verb with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.portlet.tincan.model.TincanVerb remove(long id)
		throws com.labimo.portlet.tincan.NoSuchTincanVerbException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.labimo.portlet.tincan.model.TincanVerb updateImpl(
		com.labimo.portlet.tincan.model.TincanVerb tincanVerb)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tincanVerb);
	}

	/**
	* Returns the tincan verb with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanVerbException} if it could not be found.
	*
	* @param id the primary key of the tincan verb
	* @return the tincan verb
	* @throws com.labimo.portlet.tincan.NoSuchTincanVerbException if a tincan verb with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.portlet.tincan.model.TincanVerb findByPrimaryKey(
		long id)
		throws com.labimo.portlet.tincan.NoSuchTincanVerbException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tincan verb with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tincan verb
	* @return the tincan verb, or <code>null</code> if a tincan verb with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.portlet.tincan.model.TincanVerb fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tincan verbs.
	*
	* @return the tincan verbs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.labimo.portlet.tincan.model.TincanVerb> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tincan verbs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanVerbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan verbs
	* @param end the upper bound of the range of tincan verbs (not inclusive)
	* @return the range of tincan verbs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.labimo.portlet.tincan.model.TincanVerb> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tincan verbs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanVerbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan verbs
	* @param end the upper bound of the range of tincan verbs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tincan verbs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.labimo.portlet.tincan.model.TincanVerb> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tincan verbs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tincan verbs.
	*
	* @return the number of tincan verbs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TincanVerbPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TincanVerbPersistence)PortletBeanLocatorUtil.locate(com.labimo.portlet.tincan.service.ClpSerializer.getServletContextName(),
					TincanVerbPersistence.class.getName());

			ReferenceRegistry.registerReference(TincanVerbUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TincanVerbPersistence persistence) {
	}

	private static TincanVerbPersistence _persistence;
}
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

import com.labimo.portlet.tincan.model.Oauth2Token;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the oauth2 token service. This utility wraps {@link Oauth2TokenPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see Oauth2TokenPersistence
 * @see Oauth2TokenPersistenceImpl
 * @generated
 */
public class Oauth2TokenUtil {
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
	public static void clearCache(Oauth2Token oauth2Token) {
		getPersistence().clearCache(oauth2Token);
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
	public static List<Oauth2Token> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Oauth2Token> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Oauth2Token> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Oauth2Token update(Oauth2Token oauth2Token)
		throws SystemException {
		return getPersistence().update(oauth2Token);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Oauth2Token update(Oauth2Token oauth2Token,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(oauth2Token, serviceContext);
	}

	/**
	* Caches the oauth2 token in the entity cache if it is enabled.
	*
	* @param oauth2Token the oauth2 token
	*/
	public static void cacheResult(
		com.labimo.portlet.tincan.model.Oauth2Token oauth2Token) {
		getPersistence().cacheResult(oauth2Token);
	}

	/**
	* Caches the oauth2 tokens in the entity cache if it is enabled.
	*
	* @param oauth2Tokens the oauth2 tokens
	*/
	public static void cacheResult(
		java.util.List<com.labimo.portlet.tincan.model.Oauth2Token> oauth2Tokens) {
		getPersistence().cacheResult(oauth2Tokens);
	}

	/**
	* Creates a new oauth2 token with the primary key. Does not add the oauth2 token to the database.
	*
	* @param id the primary key for the new oauth2 token
	* @return the new oauth2 token
	*/
	public static com.labimo.portlet.tincan.model.Oauth2Token create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the oauth2 token with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the oauth2 token
	* @return the oauth2 token that was removed
	* @throws com.labimo.portlet.tincan.NoSuchOauth2TokenException if a oauth2 token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.portlet.tincan.model.Oauth2Token remove(long id)
		throws com.labimo.portlet.tincan.NoSuchOauth2TokenException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.labimo.portlet.tincan.model.Oauth2Token updateImpl(
		com.labimo.portlet.tincan.model.Oauth2Token oauth2Token)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(oauth2Token);
	}

	/**
	* Returns the oauth2 token with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchOauth2TokenException} if it could not be found.
	*
	* @param id the primary key of the oauth2 token
	* @return the oauth2 token
	* @throws com.labimo.portlet.tincan.NoSuchOauth2TokenException if a oauth2 token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.portlet.tincan.model.Oauth2Token findByPrimaryKey(
		long id)
		throws com.labimo.portlet.tincan.NoSuchOauth2TokenException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the oauth2 token with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the oauth2 token
	* @return the oauth2 token, or <code>null</code> if a oauth2 token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.portlet.tincan.model.Oauth2Token fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the oauth2 tokens.
	*
	* @return the oauth2 tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.labimo.portlet.tincan.model.Oauth2Token> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.labimo.portlet.tincan.model.Oauth2Token> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the oauth2 tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2TokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oauth2 tokens
	* @param end the upper bound of the range of oauth2 tokens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of oauth2 tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.labimo.portlet.tincan.model.Oauth2Token> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the oauth2 tokens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of oauth2 tokens.
	*
	* @return the number of oauth2 tokens
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static Oauth2TokenPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (Oauth2TokenPersistence)PortletBeanLocatorUtil.locate(com.labimo.portlet.tincan.service.ClpSerializer.getServletContextName(),
					Oauth2TokenPersistence.class.getName());

			ReferenceRegistry.registerReference(Oauth2TokenUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(Oauth2TokenPersistence persistence) {
	}

	private static Oauth2TokenPersistence _persistence;
}
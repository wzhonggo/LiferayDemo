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

import com.labimo.portlet.tincan.model.TincanStatementAttachment;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the tincan statement attachment service. This utility wraps {@link TincanStatementAttachmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanStatementAttachmentPersistence
 * @see TincanStatementAttachmentPersistenceImpl
 * @generated
 */
public class TincanStatementAttachmentUtil {
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
		TincanStatementAttachment tincanStatementAttachment) {
		getPersistence().clearCache(tincanStatementAttachment);
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
	public static List<TincanStatementAttachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TincanStatementAttachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TincanStatementAttachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TincanStatementAttachment update(
		TincanStatementAttachment tincanStatementAttachment)
		throws SystemException {
		return getPersistence().update(tincanStatementAttachment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TincanStatementAttachment update(
		TincanStatementAttachment tincanStatementAttachment,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tincanStatementAttachment, serviceContext);
	}

	/**
	* Caches the tincan statement attachment in the entity cache if it is enabled.
	*
	* @param tincanStatementAttachment the tincan statement attachment
	*/
	public static void cacheResult(
		com.labimo.portlet.tincan.model.TincanStatementAttachment tincanStatementAttachment) {
		getPersistence().cacheResult(tincanStatementAttachment);
	}

	/**
	* Caches the tincan statement attachments in the entity cache if it is enabled.
	*
	* @param tincanStatementAttachments the tincan statement attachments
	*/
	public static void cacheResult(
		java.util.List<com.labimo.portlet.tincan.model.TincanStatementAttachment> tincanStatementAttachments) {
		getPersistence().cacheResult(tincanStatementAttachments);
	}

	/**
	* Creates a new tincan statement attachment with the primary key. Does not add the tincan statement attachment to the database.
	*
	* @param id the primary key for the new tincan statement attachment
	* @return the new tincan statement attachment
	*/
	public static com.labimo.portlet.tincan.model.TincanStatementAttachment create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tincan statement attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan statement attachment
	* @return the tincan statement attachment that was removed
	* @throws com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException if a tincan statement attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.portlet.tincan.model.TincanStatementAttachment remove(
		long id)
		throws com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.labimo.portlet.tincan.model.TincanStatementAttachment updateImpl(
		com.labimo.portlet.tincan.model.TincanStatementAttachment tincanStatementAttachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tincanStatementAttachment);
	}

	/**
	* Returns the tincan statement attachment with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException} if it could not be found.
	*
	* @param id the primary key of the tincan statement attachment
	* @return the tincan statement attachment
	* @throws com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException if a tincan statement attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.portlet.tincan.model.TincanStatementAttachment findByPrimaryKey(
		long id)
		throws com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tincan statement attachment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tincan statement attachment
	* @return the tincan statement attachment, or <code>null</code> if a tincan statement attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.labimo.portlet.tincan.model.TincanStatementAttachment fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tincan statement attachments.
	*
	* @return the tincan statement attachments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.labimo.portlet.tincan.model.TincanStatementAttachment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tincan statement attachments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan statement attachments
	* @param end the upper bound of the range of tincan statement attachments (not inclusive)
	* @return the range of tincan statement attachments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.labimo.portlet.tincan.model.TincanStatementAttachment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tincan statement attachments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan statement attachments
	* @param end the upper bound of the range of tincan statement attachments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tincan statement attachments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.labimo.portlet.tincan.model.TincanStatementAttachment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tincan statement attachments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tincan statement attachments.
	*
	* @return the number of tincan statement attachments
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TincanStatementAttachmentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TincanStatementAttachmentPersistence)PortletBeanLocatorUtil.locate(com.labimo.portlet.tincan.service.ClpSerializer.getServletContextName(),
					TincanStatementAttachmentPersistence.class.getName());

			ReferenceRegistry.registerReference(TincanStatementAttachmentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TincanStatementAttachmentPersistence persistence) {
	}

	private static TincanStatementAttachmentPersistence _persistence;
}
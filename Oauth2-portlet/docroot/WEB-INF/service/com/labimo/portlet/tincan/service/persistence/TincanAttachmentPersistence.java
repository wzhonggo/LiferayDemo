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

import com.labimo.portlet.tincan.model.TincanAttachment;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the tincan attachment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanAttachmentPersistenceImpl
 * @see TincanAttachmentUtil
 * @generated
 */
public interface TincanAttachmentPersistence extends BasePersistence<TincanAttachment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TincanAttachmentUtil} to access the tincan attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tincan attachment in the entity cache if it is enabled.
	*
	* @param tincanAttachment the tincan attachment
	*/
	public void cacheResult(
		com.labimo.portlet.tincan.model.TincanAttachment tincanAttachment);

	/**
	* Caches the tincan attachments in the entity cache if it is enabled.
	*
	* @param tincanAttachments the tincan attachments
	*/
	public void cacheResult(
		java.util.List<com.labimo.portlet.tincan.model.TincanAttachment> tincanAttachments);

	/**
	* Creates a new tincan attachment with the primary key. Does not add the tincan attachment to the database.
	*
	* @param id the primary key for the new tincan attachment
	* @return the new tincan attachment
	*/
	public com.labimo.portlet.tincan.model.TincanAttachment create(long id);

	/**
	* Removes the tincan attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan attachment
	* @return the tincan attachment that was removed
	* @throws com.labimo.portlet.tincan.NoSuchTincanAttachmentException if a tincan attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanAttachment remove(long id)
		throws com.labimo.portlet.tincan.NoSuchTincanAttachmentException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.labimo.portlet.tincan.model.TincanAttachment updateImpl(
		com.labimo.portlet.tincan.model.TincanAttachment tincanAttachment)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tincan attachment with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanAttachmentException} if it could not be found.
	*
	* @param id the primary key of the tincan attachment
	* @return the tincan attachment
	* @throws com.labimo.portlet.tincan.NoSuchTincanAttachmentException if a tincan attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanAttachment findByPrimaryKey(
		long id)
		throws com.labimo.portlet.tincan.NoSuchTincanAttachmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tincan attachment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tincan attachment
	* @return the tincan attachment, or <code>null</code> if a tincan attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanAttachment fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tincan attachments.
	*
	* @return the tincan attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanAttachment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tincan attachments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan attachments
	* @param end the upper bound of the range of tincan attachments (not inclusive)
	* @return the range of tincan attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanAttachment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tincan attachments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tincan attachments
	* @param end the upper bound of the range of tincan attachments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tincan attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanAttachment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tincan attachments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tincan attachments.
	*
	* @return the number of tincan attachments
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
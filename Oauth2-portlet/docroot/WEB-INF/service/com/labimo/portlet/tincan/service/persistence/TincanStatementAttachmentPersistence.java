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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the tincan statement attachment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanStatementAttachmentPersistenceImpl
 * @see TincanStatementAttachmentUtil
 * @generated
 */
public interface TincanStatementAttachmentPersistence extends BasePersistence<TincanStatementAttachment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TincanStatementAttachmentUtil} to access the tincan statement attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tincan statement attachment in the entity cache if it is enabled.
	*
	* @param tincanStatementAttachment the tincan statement attachment
	*/
	public void cacheResult(
		com.labimo.portlet.tincan.model.TincanStatementAttachment tincanStatementAttachment);

	/**
	* Caches the tincan statement attachments in the entity cache if it is enabled.
	*
	* @param tincanStatementAttachments the tincan statement attachments
	*/
	public void cacheResult(
		java.util.List<com.labimo.portlet.tincan.model.TincanStatementAttachment> tincanStatementAttachments);

	/**
	* Creates a new tincan statement attachment with the primary key. Does not add the tincan statement attachment to the database.
	*
	* @param id the primary key for the new tincan statement attachment
	* @return the new tincan statement attachment
	*/
	public com.labimo.portlet.tincan.model.TincanStatementAttachment create(
		long id);

	/**
	* Removes the tincan statement attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan statement attachment
	* @return the tincan statement attachment that was removed
	* @throws com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException if a tincan statement attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanStatementAttachment remove(
		long id)
		throws com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.labimo.portlet.tincan.model.TincanStatementAttachment updateImpl(
		com.labimo.portlet.tincan.model.TincanStatementAttachment tincanStatementAttachment)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tincan statement attachment with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException} if it could not be found.
	*
	* @param id the primary key of the tincan statement attachment
	* @return the tincan statement attachment
	* @throws com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException if a tincan statement attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanStatementAttachment findByPrimaryKey(
		long id)
		throws com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tincan statement attachment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tincan statement attachment
	* @return the tincan statement attachment, or <code>null</code> if a tincan statement attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.portlet.tincan.model.TincanStatementAttachment fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tincan statement attachments.
	*
	* @return the tincan statement attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.portlet.tincan.model.TincanStatementAttachment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.labimo.portlet.tincan.model.TincanStatementAttachment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.labimo.portlet.tincan.model.TincanStatementAttachment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tincan statement attachments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tincan statement attachments.
	*
	* @return the number of tincan statement attachments
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
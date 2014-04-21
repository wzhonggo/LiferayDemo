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
 * Provides a wrapper for {@link TincanAttachmentLocalService}.
 *
 * @author wzgong
 * @see TincanAttachmentLocalService
 * @generated
 */
public class TincanAttachmentLocalServiceWrapper
	implements TincanAttachmentLocalService,
		ServiceWrapper<TincanAttachmentLocalService> {
	public TincanAttachmentLocalServiceWrapper(
		TincanAttachmentLocalService tincanAttachmentLocalService) {
		_tincanAttachmentLocalService = tincanAttachmentLocalService;
	}

	/**
	* Adds the tincan attachment to the database. Also notifies the appropriate model listeners.
	*
	* @param tincanAttachment the tincan attachment
	* @return the tincan attachment that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanAttachment addTincanAttachment(
		com.labimo.portlet.tincan.model.TincanAttachment tincanAttachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAttachmentLocalService.addTincanAttachment(tincanAttachment);
	}

	/**
	* Creates a new tincan attachment with the primary key. Does not add the tincan attachment to the database.
	*
	* @param id the primary key for the new tincan attachment
	* @return the new tincan attachment
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanAttachment createTincanAttachment(
		long id) {
		return _tincanAttachmentLocalService.createTincanAttachment(id);
	}

	/**
	* Deletes the tincan attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan attachment
	* @return the tincan attachment that was removed
	* @throws PortalException if a tincan attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanAttachment deleteTincanAttachment(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanAttachmentLocalService.deleteTincanAttachment(id);
	}

	/**
	* Deletes the tincan attachment from the database. Also notifies the appropriate model listeners.
	*
	* @param tincanAttachment the tincan attachment
	* @return the tincan attachment that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanAttachment deleteTincanAttachment(
		com.labimo.portlet.tincan.model.TincanAttachment tincanAttachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAttachmentLocalService.deleteTincanAttachment(tincanAttachment);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tincanAttachmentLocalService.dynamicQuery();
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
		return _tincanAttachmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tincanAttachmentLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tincanAttachmentLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _tincanAttachmentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tincanAttachmentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.labimo.portlet.tincan.model.TincanAttachment fetchTincanAttachment(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAttachmentLocalService.fetchTincanAttachment(id);
	}

	/**
	* Returns the tincan attachment with the primary key.
	*
	* @param id the primary key of the tincan attachment
	* @return the tincan attachment
	* @throws PortalException if a tincan attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanAttachment getTincanAttachment(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanAttachmentLocalService.getTincanAttachment(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanAttachmentLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.labimo.portlet.tincan.model.TincanAttachment> getTincanAttachments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAttachmentLocalService.getTincanAttachments(start, end);
	}

	/**
	* Returns the number of tincan attachments.
	*
	* @return the number of tincan attachments
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTincanAttachmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAttachmentLocalService.getTincanAttachmentsCount();
	}

	/**
	* Updates the tincan attachment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tincanAttachment the tincan attachment
	* @return the tincan attachment that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanAttachment updateTincanAttachment(
		com.labimo.portlet.tincan.model.TincanAttachment tincanAttachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanAttachmentLocalService.updateTincanAttachment(tincanAttachment);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tincanAttachmentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tincanAttachmentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tincanAttachmentLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TincanAttachmentLocalService getWrappedTincanAttachmentLocalService() {
		return _tincanAttachmentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTincanAttachmentLocalService(
		TincanAttachmentLocalService tincanAttachmentLocalService) {
		_tincanAttachmentLocalService = tincanAttachmentLocalService;
	}

	@Override
	public TincanAttachmentLocalService getWrappedService() {
		return _tincanAttachmentLocalService;
	}

	@Override
	public void setWrappedService(
		TincanAttachmentLocalService tincanAttachmentLocalService) {
		_tincanAttachmentLocalService = tincanAttachmentLocalService;
	}

	private TincanAttachmentLocalService _tincanAttachmentLocalService;
}
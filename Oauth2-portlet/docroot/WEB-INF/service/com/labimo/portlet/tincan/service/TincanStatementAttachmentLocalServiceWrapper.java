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
 * Provides a wrapper for {@link TincanStatementAttachmentLocalService}.
 *
 * @author wzgong
 * @see TincanStatementAttachmentLocalService
 * @generated
 */
public class TincanStatementAttachmentLocalServiceWrapper
	implements TincanStatementAttachmentLocalService,
		ServiceWrapper<TincanStatementAttachmentLocalService> {
	public TincanStatementAttachmentLocalServiceWrapper(
		TincanStatementAttachmentLocalService tincanStatementAttachmentLocalService) {
		_tincanStatementAttachmentLocalService = tincanStatementAttachmentLocalService;
	}

	/**
	* Adds the tincan statement attachment to the database. Also notifies the appropriate model listeners.
	*
	* @param tincanStatementAttachment the tincan statement attachment
	* @return the tincan statement attachment that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatementAttachment addTincanStatementAttachment(
		com.labimo.portlet.tincan.model.TincanStatementAttachment tincanStatementAttachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementAttachmentLocalService.addTincanStatementAttachment(tincanStatementAttachment);
	}

	/**
	* Creates a new tincan statement attachment with the primary key. Does not add the tincan statement attachment to the database.
	*
	* @param id the primary key for the new tincan statement attachment
	* @return the new tincan statement attachment
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatementAttachment createTincanStatementAttachment(
		long id) {
		return _tincanStatementAttachmentLocalService.createTincanStatementAttachment(id);
	}

	/**
	* Deletes the tincan statement attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tincan statement attachment
	* @return the tincan statement attachment that was removed
	* @throws PortalException if a tincan statement attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatementAttachment deleteTincanStatementAttachment(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementAttachmentLocalService.deleteTincanStatementAttachment(id);
	}

	/**
	* Deletes the tincan statement attachment from the database. Also notifies the appropriate model listeners.
	*
	* @param tincanStatementAttachment the tincan statement attachment
	* @return the tincan statement attachment that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatementAttachment deleteTincanStatementAttachment(
		com.labimo.portlet.tincan.model.TincanStatementAttachment tincanStatementAttachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementAttachmentLocalService.deleteTincanStatementAttachment(tincanStatementAttachment);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tincanStatementAttachmentLocalService.dynamicQuery();
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
		return _tincanStatementAttachmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tincanStatementAttachmentLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tincanStatementAttachmentLocalService.dynamicQuery(dynamicQuery,
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
		return _tincanStatementAttachmentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tincanStatementAttachmentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.labimo.portlet.tincan.model.TincanStatementAttachment fetchTincanStatementAttachment(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementAttachmentLocalService.fetchTincanStatementAttachment(id);
	}

	/**
	* Returns the tincan statement attachment with the primary key.
	*
	* @param id the primary key of the tincan statement attachment
	* @return the tincan statement attachment
	* @throws PortalException if a tincan statement attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatementAttachment getTincanStatementAttachment(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementAttachmentLocalService.getTincanStatementAttachment(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementAttachmentLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.labimo.portlet.tincan.model.TincanStatementAttachment> getTincanStatementAttachments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementAttachmentLocalService.getTincanStatementAttachments(start,
			end);
	}

	/**
	* Returns the number of tincan statement attachments.
	*
	* @return the number of tincan statement attachments
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTincanStatementAttachmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementAttachmentLocalService.getTincanStatementAttachmentsCount();
	}

	/**
	* Updates the tincan statement attachment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tincanStatementAttachment the tincan statement attachment
	* @return the tincan statement attachment that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.labimo.portlet.tincan.model.TincanStatementAttachment updateTincanStatementAttachment(
		com.labimo.portlet.tincan.model.TincanStatementAttachment tincanStatementAttachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tincanStatementAttachmentLocalService.updateTincanStatementAttachment(tincanStatementAttachment);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tincanStatementAttachmentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tincanStatementAttachmentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tincanStatementAttachmentLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TincanStatementAttachmentLocalService getWrappedTincanStatementAttachmentLocalService() {
		return _tincanStatementAttachmentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTincanStatementAttachmentLocalService(
		TincanStatementAttachmentLocalService tincanStatementAttachmentLocalService) {
		_tincanStatementAttachmentLocalService = tincanStatementAttachmentLocalService;
	}

	@Override
	public TincanStatementAttachmentLocalService getWrappedService() {
		return _tincanStatementAttachmentLocalService;
	}

	@Override
	public void setWrappedService(
		TincanStatementAttachmentLocalService tincanStatementAttachmentLocalService) {
		_tincanStatementAttachmentLocalService = tincanStatementAttachmentLocalService;
	}

	private TincanStatementAttachmentLocalService _tincanStatementAttachmentLocalService;
}
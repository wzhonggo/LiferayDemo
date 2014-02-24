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

import com.labimo.model.Activation;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the activation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see ActivationPersistenceImpl
 * @see ActivationUtil
 * @generated
 */
public interface ActivationPersistence extends BasePersistence<Activation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ActivationUtil} to access the activation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the activation in the entity cache if it is enabled.
	*
	* @param activation the activation
	*/
	public void cacheResult(com.labimo.model.Activation activation);

	/**
	* Caches the activations in the entity cache if it is enabled.
	*
	* @param activations the activations
	*/
	public void cacheResult(
		java.util.List<com.labimo.model.Activation> activations);

	/**
	* Creates a new activation with the primary key. Does not add the activation to the database.
	*
	* @param activationId the primary key for the new activation
	* @return the new activation
	*/
	public com.labimo.model.Activation create(java.lang.String activationId);

	/**
	* Removes the activation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param activationId the primary key of the activation
	* @return the activation that was removed
	* @throws com.labimo.NoSuchActivationException if a activation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.model.Activation remove(java.lang.String activationId)
		throws com.labimo.NoSuchActivationException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.labimo.model.Activation updateImpl(
		com.labimo.model.Activation activation)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the activation with the primary key or throws a {@link com.labimo.NoSuchActivationException} if it could not be found.
	*
	* @param activationId the primary key of the activation
	* @return the activation
	* @throws com.labimo.NoSuchActivationException if a activation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.model.Activation findByPrimaryKey(
		java.lang.String activationId)
		throws com.labimo.NoSuchActivationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the activation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param activationId the primary key of the activation
	* @return the activation, or <code>null</code> if a activation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.labimo.model.Activation fetchByPrimaryKey(
		java.lang.String activationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the activations.
	*
	* @return the activations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.model.Activation> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the activations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.model.impl.ActivationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of activations
	* @param end the upper bound of the range of activations (not inclusive)
	* @return the range of activations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.model.Activation> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the activations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.model.impl.ActivationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of activations
	* @param end the upper bound of the range of activations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of activations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.labimo.model.Activation> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the activations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of activations.
	*
	* @return the number of activations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
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

package com.labimo.service.base;

import com.labimo.model.Activation;

import com.labimo.service.ActivationLocalService;
import com.labimo.service.persistence.ActivationPersistence;
import com.labimo.service.persistence.LicensePersistence;
import com.labimo.service.persistence.ProductPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the activation local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.labimo.service.impl.ActivationLocalServiceImpl}.
 * </p>
 *
 * @author wzgong
 * @see com.labimo.service.impl.ActivationLocalServiceImpl
 * @see com.labimo.service.ActivationLocalServiceUtil
 * @generated
 */
public abstract class ActivationLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements ActivationLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.labimo.service.ActivationLocalServiceUtil} to access the activation local service.
	 */

	/**
	 * Adds the activation to the database. Also notifies the appropriate model listeners.
	 *
	 * @param activation the activation
	 * @return the activation that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Activation addActivation(Activation activation)
		throws SystemException {
		activation.setNew(true);

		return activationPersistence.update(activation);
	}

	/**
	 * Creates a new activation with the primary key. Does not add the activation to the database.
	 *
	 * @param activationId the primary key for the new activation
	 * @return the new activation
	 */
	@Override
	public Activation createActivation(String activationId) {
		return activationPersistence.create(activationId);
	}

	/**
	 * Deletes the activation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param activationId the primary key of the activation
	 * @return the activation that was removed
	 * @throws PortalException if a activation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Activation deleteActivation(String activationId)
		throws PortalException, SystemException {
		return activationPersistence.remove(activationId);
	}

	/**
	 * Deletes the activation from the database. Also notifies the appropriate model listeners.
	 *
	 * @param activation the activation
	 * @return the activation that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Activation deleteActivation(Activation activation)
		throws SystemException {
		return activationPersistence.remove(activation);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Activation.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return activationPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.model.impl.ActivationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return activationPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.model.impl.ActivationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return activationPersistence.findWithDynamicQuery(dynamicQuery, start,
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return activationPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return activationPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public Activation fetchActivation(String activationId)
		throws SystemException {
		return activationPersistence.fetchByPrimaryKey(activationId);
	}

	/**
	 * Returns the activation with the primary key.
	 *
	 * @param activationId the primary key of the activation
	 * @return the activation
	 * @throws PortalException if a activation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Activation getActivation(String activationId)
		throws PortalException, SystemException {
		return activationPersistence.findByPrimaryKey(activationId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return activationPersistence.findByPrimaryKey(primaryKeyObj);
	}

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
	@Override
	public List<Activation> getActivations(int start, int end)
		throws SystemException {
		return activationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of activations.
	 *
	 * @return the number of activations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getActivationsCount() throws SystemException {
		return activationPersistence.countAll();
	}

	/**
	 * Updates the activation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param activation the activation
	 * @return the activation that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Activation updateActivation(Activation activation)
		throws SystemException {
		return activationPersistence.update(activation);
	}

	/**
	 * Returns the activation local service.
	 *
	 * @return the activation local service
	 */
	public com.labimo.service.ActivationLocalService getActivationLocalService() {
		return activationLocalService;
	}

	/**
	 * Sets the activation local service.
	 *
	 * @param activationLocalService the activation local service
	 */
	public void setActivationLocalService(
		com.labimo.service.ActivationLocalService activationLocalService) {
		this.activationLocalService = activationLocalService;
	}

	/**
	 * Returns the activation persistence.
	 *
	 * @return the activation persistence
	 */
	public ActivationPersistence getActivationPersistence() {
		return activationPersistence;
	}

	/**
	 * Sets the activation persistence.
	 *
	 * @param activationPersistence the activation persistence
	 */
	public void setActivationPersistence(
		ActivationPersistence activationPersistence) {
		this.activationPersistence = activationPersistence;
	}

	/**
	 * Returns the license local service.
	 *
	 * @return the license local service
	 */
	public com.labimo.service.LicenseLocalService getLicenseLocalService() {
		return licenseLocalService;
	}

	/**
	 * Sets the license local service.
	 *
	 * @param licenseLocalService the license local service
	 */
	public void setLicenseLocalService(
		com.labimo.service.LicenseLocalService licenseLocalService) {
		this.licenseLocalService = licenseLocalService;
	}

	/**
	 * Returns the license persistence.
	 *
	 * @return the license persistence
	 */
	public LicensePersistence getLicensePersistence() {
		return licensePersistence;
	}

	/**
	 * Sets the license persistence.
	 *
	 * @param licensePersistence the license persistence
	 */
	public void setLicensePersistence(LicensePersistence licensePersistence) {
		this.licensePersistence = licensePersistence;
	}

	/**
	 * Returns the product local service.
	 *
	 * @return the product local service
	 */
	public com.labimo.service.ProductLocalService getProductLocalService() {
		return productLocalService;
	}

	/**
	 * Sets the product local service.
	 *
	 * @param productLocalService the product local service
	 */
	public void setProductLocalService(
		com.labimo.service.ProductLocalService productLocalService) {
		this.productLocalService = productLocalService;
	}

	/**
	 * Returns the product persistence.
	 *
	 * @return the product persistence
	 */
	public ProductPersistence getProductPersistence() {
		return productPersistence;
	}

	/**
	 * Sets the product persistence.
	 *
	 * @param productPersistence the product persistence
	 */
	public void setProductPersistence(ProductPersistence productPersistence) {
		this.productPersistence = productPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.labimo.model.Activation",
			activationLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.labimo.model.Activation");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Activation.class;
	}

	protected String getModelClassName() {
		return Activation.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = activationPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.labimo.service.ActivationLocalService.class)
	protected com.labimo.service.ActivationLocalService activationLocalService;
	@BeanReference(type = ActivationPersistence.class)
	protected ActivationPersistence activationPersistence;
	@BeanReference(type = com.labimo.service.LicenseLocalService.class)
	protected com.labimo.service.LicenseLocalService licenseLocalService;
	@BeanReference(type = LicensePersistence.class)
	protected LicensePersistence licensePersistence;
	@BeanReference(type = com.labimo.service.ProductLocalService.class)
	protected com.labimo.service.ProductLocalService productLocalService;
	@BeanReference(type = ProductPersistence.class)
	protected ProductPersistence productPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private ActivationLocalServiceClpInvoker _clpInvoker = new ActivationLocalServiceClpInvoker();
}
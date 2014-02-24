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

import com.labimo.NoSuchActivationException;

import com.labimo.model.Activation;
import com.labimo.model.impl.ActivationImpl;
import com.labimo.model.impl.ActivationModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the activation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see ActivationPersistence
 * @see ActivationUtil
 * @generated
 */
public class ActivationPersistenceImpl extends BasePersistenceImpl<Activation>
	implements ActivationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ActivationUtil} to access the activation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ActivationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ActivationModelImpl.ENTITY_CACHE_ENABLED,
			ActivationModelImpl.FINDER_CACHE_ENABLED, ActivationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ActivationModelImpl.ENTITY_CACHE_ENABLED,
			ActivationModelImpl.FINDER_CACHE_ENABLED, ActivationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ActivationModelImpl.ENTITY_CACHE_ENABLED,
			ActivationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ActivationPersistenceImpl() {
		setModelClass(Activation.class);
	}

	/**
	 * Caches the activation in the entity cache if it is enabled.
	 *
	 * @param activation the activation
	 */
	@Override
	public void cacheResult(Activation activation) {
		EntityCacheUtil.putResult(ActivationModelImpl.ENTITY_CACHE_ENABLED,
			ActivationImpl.class, activation.getPrimaryKey(), activation);

		activation.resetOriginalValues();
	}

	/**
	 * Caches the activations in the entity cache if it is enabled.
	 *
	 * @param activations the activations
	 */
	@Override
	public void cacheResult(List<Activation> activations) {
		for (Activation activation : activations) {
			if (EntityCacheUtil.getResult(
						ActivationModelImpl.ENTITY_CACHE_ENABLED,
						ActivationImpl.class, activation.getPrimaryKey()) == null) {
				cacheResult(activation);
			}
			else {
				activation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all activations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ActivationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ActivationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the activation.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Activation activation) {
		EntityCacheUtil.removeResult(ActivationModelImpl.ENTITY_CACHE_ENABLED,
			ActivationImpl.class, activation.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Activation> activations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Activation activation : activations) {
			EntityCacheUtil.removeResult(ActivationModelImpl.ENTITY_CACHE_ENABLED,
				ActivationImpl.class, activation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new activation with the primary key. Does not add the activation to the database.
	 *
	 * @param activationId the primary key for the new activation
	 * @return the new activation
	 */
	@Override
	public Activation create(String activationId) {
		Activation activation = new ActivationImpl();

		activation.setNew(true);
		activation.setPrimaryKey(activationId);

		return activation;
	}

	/**
	 * Removes the activation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param activationId the primary key of the activation
	 * @return the activation that was removed
	 * @throws com.labimo.NoSuchActivationException if a activation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Activation remove(String activationId)
		throws NoSuchActivationException, SystemException {
		return remove((Serializable)activationId);
	}

	/**
	 * Removes the activation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the activation
	 * @return the activation that was removed
	 * @throws com.labimo.NoSuchActivationException if a activation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Activation remove(Serializable primaryKey)
		throws NoSuchActivationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Activation activation = (Activation)session.get(ActivationImpl.class,
					primaryKey);

			if (activation == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchActivationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(activation);
		}
		catch (NoSuchActivationException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Activation removeImpl(Activation activation)
		throws SystemException {
		activation = toUnwrappedModel(activation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(activation)) {
				activation = (Activation)session.get(ActivationImpl.class,
						activation.getPrimaryKeyObj());
			}

			if (activation != null) {
				session.delete(activation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (activation != null) {
			clearCache(activation);
		}

		return activation;
	}

	@Override
	public Activation updateImpl(com.labimo.model.Activation activation)
		throws SystemException {
		activation = toUnwrappedModel(activation);

		boolean isNew = activation.isNew();

		Session session = null;

		try {
			session = openSession();

			if (activation.isNew()) {
				session.save(activation);

				activation.setNew(false);
			}
			else {
				session.merge(activation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ActivationModelImpl.ENTITY_CACHE_ENABLED,
			ActivationImpl.class, activation.getPrimaryKey(), activation);

		return activation;
	}

	protected Activation toUnwrappedModel(Activation activation) {
		if (activation instanceof ActivationImpl) {
			return activation;
		}

		ActivationImpl activationImpl = new ActivationImpl();

		activationImpl.setNew(activation.isNew());
		activationImpl.setPrimaryKey(activation.getPrimaryKey());

		activationImpl.setActivationId(activation.getActivationId());
		activationImpl.setHardwareUuid(activation.getHardwareUuid());
		activationImpl.setLicenseUuid(activation.getLicenseUuid());
		activationImpl.setCreateTime(activation.getCreateTime());
		activationImpl.setValid(activation.isValid());

		return activationImpl;
	}

	/**
	 * Returns the activation with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the activation
	 * @return the activation
	 * @throws com.labimo.NoSuchActivationException if a activation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Activation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchActivationException, SystemException {
		Activation activation = fetchByPrimaryKey(primaryKey);

		if (activation == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchActivationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return activation;
	}

	/**
	 * Returns the activation with the primary key or throws a {@link com.labimo.NoSuchActivationException} if it could not be found.
	 *
	 * @param activationId the primary key of the activation
	 * @return the activation
	 * @throws com.labimo.NoSuchActivationException if a activation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Activation findByPrimaryKey(String activationId)
		throws NoSuchActivationException, SystemException {
		return findByPrimaryKey((Serializable)activationId);
	}

	/**
	 * Returns the activation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the activation
	 * @return the activation, or <code>null</code> if a activation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Activation fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Activation activation = (Activation)EntityCacheUtil.getResult(ActivationModelImpl.ENTITY_CACHE_ENABLED,
				ActivationImpl.class, primaryKey);

		if (activation == _nullActivation) {
			return null;
		}

		if (activation == null) {
			Session session = null;

			try {
				session = openSession();

				activation = (Activation)session.get(ActivationImpl.class,
						primaryKey);

				if (activation != null) {
					cacheResult(activation);
				}
				else {
					EntityCacheUtil.putResult(ActivationModelImpl.ENTITY_CACHE_ENABLED,
						ActivationImpl.class, primaryKey, _nullActivation);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ActivationModelImpl.ENTITY_CACHE_ENABLED,
					ActivationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return activation;
	}

	/**
	 * Returns the activation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param activationId the primary key of the activation
	 * @return the activation, or <code>null</code> if a activation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Activation fetchByPrimaryKey(String activationId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)activationId);
	}

	/**
	 * Returns all the activations.
	 *
	 * @return the activations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Activation> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Activation> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Activation> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Activation> list = (List<Activation>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACTIVATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACTIVATION;

				if (pagination) {
					sql = sql.concat(ActivationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Activation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Activation>(list);
				}
				else {
					list = (List<Activation>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the activations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Activation activation : findAll()) {
			remove(activation);
		}
	}

	/**
	 * Returns the number of activations.
	 *
	 * @return the number of activations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ACTIVATION);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the activation persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.model.Activation")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Activation>> listenersList = new ArrayList<ModelListener<Activation>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Activation>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ActivationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ACTIVATION = "SELECT activation FROM Activation activation";
	private static final String _SQL_COUNT_ACTIVATION = "SELECT COUNT(activation) FROM Activation activation";
	private static final String _ORDER_BY_ENTITY_ALIAS = "activation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Activation exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ActivationPersistenceImpl.class);
	private static Activation _nullActivation = new ActivationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Activation> toCacheModel() {
				return _nullActivationCacheModel;
			}
		};

	private static CacheModel<Activation> _nullActivationCacheModel = new CacheModel<Activation>() {
			@Override
			public Activation toEntityModel() {
				return _nullActivation;
			}
		};
}
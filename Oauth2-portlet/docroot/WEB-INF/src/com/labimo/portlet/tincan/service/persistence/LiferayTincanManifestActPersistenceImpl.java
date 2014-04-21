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

import com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException;
import com.labimo.portlet.tincan.model.LiferayTincanManifestAct;
import com.labimo.portlet.tincan.model.impl.LiferayTincanManifestActImpl;
import com.labimo.portlet.tincan.model.impl.LiferayTincanManifestActModelImpl;

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
import com.liferay.portal.kernel.util.SetUtil;
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
import java.util.Set;

/**
 * The persistence implementation for the liferay tincan manifest act service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see LiferayTincanManifestActPersistence
 * @see LiferayTincanManifestActUtil
 * @generated
 */
public class LiferayTincanManifestActPersistenceImpl extends BasePersistenceImpl<LiferayTincanManifestAct>
	implements LiferayTincanManifestActPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LiferayTincanManifestActUtil} to access the liferay tincan manifest act persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LiferayTincanManifestActImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LiferayTincanManifestActModelImpl.ENTITY_CACHE_ENABLED,
			LiferayTincanManifestActModelImpl.FINDER_CACHE_ENABLED,
			LiferayTincanManifestActImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LiferayTincanManifestActModelImpl.ENTITY_CACHE_ENABLED,
			LiferayTincanManifestActModelImpl.FINDER_CACHE_ENABLED,
			LiferayTincanManifestActImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LiferayTincanManifestActModelImpl.ENTITY_CACHE_ENABLED,
			LiferayTincanManifestActModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LiferayTincanManifestActPersistenceImpl() {
		setModelClass(LiferayTincanManifestAct.class);
	}

	/**
	 * Caches the liferay tincan manifest act in the entity cache if it is enabled.
	 *
	 * @param liferayTincanManifestAct the liferay tincan manifest act
	 */
	@Override
	public void cacheResult(LiferayTincanManifestAct liferayTincanManifestAct) {
		EntityCacheUtil.putResult(LiferayTincanManifestActModelImpl.ENTITY_CACHE_ENABLED,
			LiferayTincanManifestActImpl.class,
			liferayTincanManifestAct.getPrimaryKey(), liferayTincanManifestAct);

		liferayTincanManifestAct.resetOriginalValues();
	}

	/**
	 * Caches the liferay tincan manifest acts in the entity cache if it is enabled.
	 *
	 * @param liferayTincanManifestActs the liferay tincan manifest acts
	 */
	@Override
	public void cacheResult(
		List<LiferayTincanManifestAct> liferayTincanManifestActs) {
		for (LiferayTincanManifestAct liferayTincanManifestAct : liferayTincanManifestActs) {
			if (EntityCacheUtil.getResult(
						LiferayTincanManifestActModelImpl.ENTITY_CACHE_ENABLED,
						LiferayTincanManifestActImpl.class,
						liferayTincanManifestAct.getPrimaryKey()) == null) {
				cacheResult(liferayTincanManifestAct);
			}
			else {
				liferayTincanManifestAct.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all liferay tincan manifest acts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LiferayTincanManifestActImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LiferayTincanManifestActImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the liferay tincan manifest act.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LiferayTincanManifestAct liferayTincanManifestAct) {
		EntityCacheUtil.removeResult(LiferayTincanManifestActModelImpl.ENTITY_CACHE_ENABLED,
			LiferayTincanManifestActImpl.class,
			liferayTincanManifestAct.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<LiferayTincanManifestAct> liferayTincanManifestActs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LiferayTincanManifestAct liferayTincanManifestAct : liferayTincanManifestActs) {
			EntityCacheUtil.removeResult(LiferayTincanManifestActModelImpl.ENTITY_CACHE_ENABLED,
				LiferayTincanManifestActImpl.class,
				liferayTincanManifestAct.getPrimaryKey());
		}
	}

	/**
	 * Creates a new liferay tincan manifest act with the primary key. Does not add the liferay tincan manifest act to the database.
	 *
	 * @param id the primary key for the new liferay tincan manifest act
	 * @return the new liferay tincan manifest act
	 */
	@Override
	public LiferayTincanManifestAct create(long id) {
		LiferayTincanManifestAct liferayTincanManifestAct = new LiferayTincanManifestActImpl();

		liferayTincanManifestAct.setNew(true);
		liferayTincanManifestAct.setPrimaryKey(id);

		return liferayTincanManifestAct;
	}

	/**
	 * Removes the liferay tincan manifest act with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the liferay tincan manifest act
	 * @return the liferay tincan manifest act that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException if a liferay tincan manifest act with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayTincanManifestAct remove(long id)
		throws NoSuchLiferayTincanManifestActException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the liferay tincan manifest act with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the liferay tincan manifest act
	 * @return the liferay tincan manifest act that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException if a liferay tincan manifest act with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayTincanManifestAct remove(Serializable primaryKey)
		throws NoSuchLiferayTincanManifestActException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LiferayTincanManifestAct liferayTincanManifestAct = (LiferayTincanManifestAct)session.get(LiferayTincanManifestActImpl.class,
					primaryKey);

			if (liferayTincanManifestAct == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLiferayTincanManifestActException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(liferayTincanManifestAct);
		}
		catch (NoSuchLiferayTincanManifestActException nsee) {
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
	protected LiferayTincanManifestAct removeImpl(
		LiferayTincanManifestAct liferayTincanManifestAct)
		throws SystemException {
		liferayTincanManifestAct = toUnwrappedModel(liferayTincanManifestAct);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(liferayTincanManifestAct)) {
				liferayTincanManifestAct = (LiferayTincanManifestAct)session.get(LiferayTincanManifestActImpl.class,
						liferayTincanManifestAct.getPrimaryKeyObj());
			}

			if (liferayTincanManifestAct != null) {
				session.delete(liferayTincanManifestAct);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (liferayTincanManifestAct != null) {
			clearCache(liferayTincanManifestAct);
		}

		return liferayTincanManifestAct;
	}

	@Override
	public LiferayTincanManifestAct updateImpl(
		com.labimo.portlet.tincan.model.LiferayTincanManifestAct liferayTincanManifestAct)
		throws SystemException {
		liferayTincanManifestAct = toUnwrappedModel(liferayTincanManifestAct);

		boolean isNew = liferayTincanManifestAct.isNew();

		Session session = null;

		try {
			session = openSession();

			if (liferayTincanManifestAct.isNew()) {
				session.save(liferayTincanManifestAct);

				liferayTincanManifestAct.setNew(false);
			}
			else {
				session.merge(liferayTincanManifestAct);
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

		EntityCacheUtil.putResult(LiferayTincanManifestActModelImpl.ENTITY_CACHE_ENABLED,
			LiferayTincanManifestActImpl.class,
			liferayTincanManifestAct.getPrimaryKey(), liferayTincanManifestAct);

		return liferayTincanManifestAct;
	}

	protected LiferayTincanManifestAct toUnwrappedModel(
		LiferayTincanManifestAct liferayTincanManifestAct) {
		if (liferayTincanManifestAct instanceof LiferayTincanManifestActImpl) {
			return liferayTincanManifestAct;
		}

		LiferayTincanManifestActImpl liferayTincanManifestActImpl = new LiferayTincanManifestActImpl();

		liferayTincanManifestActImpl.setNew(liferayTincanManifestAct.isNew());
		liferayTincanManifestActImpl.setPrimaryKey(liferayTincanManifestAct.getPrimaryKey());

		liferayTincanManifestActImpl.setId(liferayTincanManifestAct.getId());
		liferayTincanManifestActImpl.setActivityId(liferayTincanManifestAct.getActivityId());
		liferayTincanManifestActImpl.setName(liferayTincanManifestAct.getName());
		liferayTincanManifestActImpl.setDescription(liferayTincanManifestAct.getDescription());
		liferayTincanManifestActImpl.setLaunch(liferayTincanManifestAct.getLaunch());

		return liferayTincanManifestActImpl;
	}

	/**
	 * Returns the liferay tincan manifest act with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the liferay tincan manifest act
	 * @return the liferay tincan manifest act
	 * @throws com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException if a liferay tincan manifest act with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayTincanManifestAct findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLiferayTincanManifestActException, SystemException {
		LiferayTincanManifestAct liferayTincanManifestAct = fetchByPrimaryKey(primaryKey);

		if (liferayTincanManifestAct == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLiferayTincanManifestActException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return liferayTincanManifestAct;
	}

	/**
	 * Returns the liferay tincan manifest act with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException} if it could not be found.
	 *
	 * @param id the primary key of the liferay tincan manifest act
	 * @return the liferay tincan manifest act
	 * @throws com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException if a liferay tincan manifest act with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayTincanManifestAct findByPrimaryKey(long id)
		throws NoSuchLiferayTincanManifestActException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the liferay tincan manifest act with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the liferay tincan manifest act
	 * @return the liferay tincan manifest act, or <code>null</code> if a liferay tincan manifest act with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayTincanManifestAct fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LiferayTincanManifestAct liferayTincanManifestAct = (LiferayTincanManifestAct)EntityCacheUtil.getResult(LiferayTincanManifestActModelImpl.ENTITY_CACHE_ENABLED,
				LiferayTincanManifestActImpl.class, primaryKey);

		if (liferayTincanManifestAct == _nullLiferayTincanManifestAct) {
			return null;
		}

		if (liferayTincanManifestAct == null) {
			Session session = null;

			try {
				session = openSession();

				liferayTincanManifestAct = (LiferayTincanManifestAct)session.get(LiferayTincanManifestActImpl.class,
						primaryKey);

				if (liferayTincanManifestAct != null) {
					cacheResult(liferayTincanManifestAct);
				}
				else {
					EntityCacheUtil.putResult(LiferayTincanManifestActModelImpl.ENTITY_CACHE_ENABLED,
						LiferayTincanManifestActImpl.class, primaryKey,
						_nullLiferayTincanManifestAct);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LiferayTincanManifestActModelImpl.ENTITY_CACHE_ENABLED,
					LiferayTincanManifestActImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return liferayTincanManifestAct;
	}

	/**
	 * Returns the liferay tincan manifest act with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the liferay tincan manifest act
	 * @return the liferay tincan manifest act, or <code>null</code> if a liferay tincan manifest act with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayTincanManifestAct fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the liferay tincan manifest acts.
	 *
	 * @return the liferay tincan manifest acts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LiferayTincanManifestAct> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the liferay tincan manifest acts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.LiferayTincanManifestActModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of liferay tincan manifest acts
	 * @param end the upper bound of the range of liferay tincan manifest acts (not inclusive)
	 * @return the range of liferay tincan manifest acts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LiferayTincanManifestAct> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the liferay tincan manifest acts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.LiferayTincanManifestActModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of liferay tincan manifest acts
	 * @param end the upper bound of the range of liferay tincan manifest acts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of liferay tincan manifest acts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LiferayTincanManifestAct> findAll(int start, int end,
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

		List<LiferayTincanManifestAct> list = (List<LiferayTincanManifestAct>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LIFERAYTINCANMANIFESTACT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LIFERAYTINCANMANIFESTACT;

				if (pagination) {
					sql = sql.concat(LiferayTincanManifestActModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LiferayTincanManifestAct>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LiferayTincanManifestAct>(list);
				}
				else {
					list = (List<LiferayTincanManifestAct>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the liferay tincan manifest acts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LiferayTincanManifestAct liferayTincanManifestAct : findAll()) {
			remove(liferayTincanManifestAct);
		}
	}

	/**
	 * Returns the number of liferay tincan manifest acts.
	 *
	 * @return the number of liferay tincan manifest acts
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

				Query q = session.createQuery(_SQL_COUNT_LIFERAYTINCANMANIFESTACT);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the liferay tincan manifest act persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.LiferayTincanManifestAct")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LiferayTincanManifestAct>> listenersList = new ArrayList<ModelListener<LiferayTincanManifestAct>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LiferayTincanManifestAct>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LiferayTincanManifestActImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LIFERAYTINCANMANIFESTACT = "SELECT liferayTincanManifestAct FROM LiferayTincanManifestAct liferayTincanManifestAct";
	private static final String _SQL_COUNT_LIFERAYTINCANMANIFESTACT = "SELECT COUNT(liferayTincanManifestAct) FROM LiferayTincanManifestAct liferayTincanManifestAct";
	private static final String _ORDER_BY_ENTITY_ALIAS = "liferayTincanManifestAct.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LiferayTincanManifestAct exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LiferayTincanManifestActPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static LiferayTincanManifestAct _nullLiferayTincanManifestAct = new LiferayTincanManifestActImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LiferayTincanManifestAct> toCacheModel() {
				return _nullLiferayTincanManifestActCacheModel;
			}
		};

	private static CacheModel<LiferayTincanManifestAct> _nullLiferayTincanManifestActCacheModel =
		new CacheModel<LiferayTincanManifestAct>() {
			@Override
			public LiferayTincanManifestAct toEntityModel() {
				return _nullLiferayTincanManifestAct;
			}
		};
}
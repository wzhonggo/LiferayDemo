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

import com.labimo.portlet.tincan.NoSuchTincanActivityException;
import com.labimo.portlet.tincan.model.TincanActivity;
import com.labimo.portlet.tincan.model.impl.TincanActivityImpl;
import com.labimo.portlet.tincan.model.impl.TincanActivityModelImpl;

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
 * The persistence implementation for the tincan activity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanActivityPersistence
 * @see TincanActivityUtil
 * @generated
 */
public class TincanActivityPersistenceImpl extends BasePersistenceImpl<TincanActivity>
	implements TincanActivityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TincanActivityUtil} to access the tincan activity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TincanActivityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TincanActivityModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityModelImpl.FINDER_CACHE_ENABLED,
			TincanActivityImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TincanActivityModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityModelImpl.FINDER_CACHE_ENABLED,
			TincanActivityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TincanActivityModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TincanActivityPersistenceImpl() {
		setModelClass(TincanActivity.class);
	}

	/**
	 * Caches the tincan activity in the entity cache if it is enabled.
	 *
	 * @param tincanActivity the tincan activity
	 */
	@Override
	public void cacheResult(TincanActivity tincanActivity) {
		EntityCacheUtil.putResult(TincanActivityModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityImpl.class, tincanActivity.getPrimaryKey(),
			tincanActivity);

		tincanActivity.resetOriginalValues();
	}

	/**
	 * Caches the tincan activities in the entity cache if it is enabled.
	 *
	 * @param tincanActivities the tincan activities
	 */
	@Override
	public void cacheResult(List<TincanActivity> tincanActivities) {
		for (TincanActivity tincanActivity : tincanActivities) {
			if (EntityCacheUtil.getResult(
						TincanActivityModelImpl.ENTITY_CACHE_ENABLED,
						TincanActivityImpl.class, tincanActivity.getPrimaryKey()) == null) {
				cacheResult(tincanActivity);
			}
			else {
				tincanActivity.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tincan activities.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TincanActivityImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TincanActivityImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tincan activity.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TincanActivity tincanActivity) {
		EntityCacheUtil.removeResult(TincanActivityModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityImpl.class, tincanActivity.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TincanActivity> tincanActivities) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TincanActivity tincanActivity : tincanActivities) {
			EntityCacheUtil.removeResult(TincanActivityModelImpl.ENTITY_CACHE_ENABLED,
				TincanActivityImpl.class, tincanActivity.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tincan activity with the primary key. Does not add the tincan activity to the database.
	 *
	 * @param id the primary key for the new tincan activity
	 * @return the new tincan activity
	 */
	@Override
	public TincanActivity create(long id) {
		TincanActivity tincanActivity = new TincanActivityImpl();

		tincanActivity.setNew(true);
		tincanActivity.setPrimaryKey(id);

		return tincanActivity;
	}

	/**
	 * Removes the tincan activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tincan activity
	 * @return the tincan activity that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanActivityException if a tincan activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivity remove(long id)
		throws NoSuchTincanActivityException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tincan activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tincan activity
	 * @return the tincan activity that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanActivityException if a tincan activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivity remove(Serializable primaryKey)
		throws NoSuchTincanActivityException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TincanActivity tincanActivity = (TincanActivity)session.get(TincanActivityImpl.class,
					primaryKey);

			if (tincanActivity == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTincanActivityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tincanActivity);
		}
		catch (NoSuchTincanActivityException nsee) {
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
	protected TincanActivity removeImpl(TincanActivity tincanActivity)
		throws SystemException {
		tincanActivity = toUnwrappedModel(tincanActivity);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tincanActivity)) {
				tincanActivity = (TincanActivity)session.get(TincanActivityImpl.class,
						tincanActivity.getPrimaryKeyObj());
			}

			if (tincanActivity != null) {
				session.delete(tincanActivity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tincanActivity != null) {
			clearCache(tincanActivity);
		}

		return tincanActivity;
	}

	@Override
	public TincanActivity updateImpl(
		com.labimo.portlet.tincan.model.TincanActivity tincanActivity)
		throws SystemException {
		tincanActivity = toUnwrappedModel(tincanActivity);

		boolean isNew = tincanActivity.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tincanActivity.isNew()) {
				session.save(tincanActivity);

				tincanActivity.setNew(false);
			}
			else {
				session.merge(tincanActivity);
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

		EntityCacheUtil.putResult(TincanActivityModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityImpl.class, tincanActivity.getPrimaryKey(),
			tincanActivity);

		return tincanActivity;
	}

	protected TincanActivity toUnwrappedModel(TincanActivity tincanActivity) {
		if (tincanActivity instanceof TincanActivityImpl) {
			return tincanActivity;
		}

		TincanActivityImpl tincanActivityImpl = new TincanActivityImpl();

		tincanActivityImpl.setNew(tincanActivity.isNew());
		tincanActivityImpl.setPrimaryKey(tincanActivity.getPrimaryKey());

		tincanActivityImpl.setId(tincanActivity.getId());
		tincanActivityImpl.setActivityId(tincanActivity.getActivityId());
		tincanActivityImpl.setObjectType(tincanActivity.getObjectType());
		tincanActivityImpl.setActivityDefinitionName(tincanActivity.getActivityDefinitionName());
		tincanActivityImpl.setActivityDefinitionDescription(tincanActivity.getActivityDefinitionDescription());
		tincanActivityImpl.setActivityDefinitionType(tincanActivity.getActivityDefinitionType());
		tincanActivityImpl.setActivityDefinitionMoreInfo(tincanActivity.getActivityDefinitionMoreInfo());
		tincanActivityImpl.setActivityDefinitionInteractionType(tincanActivity.getActivityDefinitionInteractionType());
		tincanActivityImpl.setActivityDefinitionExtensions(tincanActivity.getActivityDefinitionExtensions());
		tincanActivityImpl.setActivityDefinitionCrpanswers(tincanActivity.getActivityDefinitionCrpanswers());
		tincanActivityImpl.setActivityDefinitionChoices(tincanActivity.getActivityDefinitionChoices());
		tincanActivityImpl.setActivityDefinitionScales(tincanActivity.getActivityDefinitionScales());
		tincanActivityImpl.setActivityDefinitionSources(tincanActivity.getActivityDefinitionSources());
		tincanActivityImpl.setActivityDefinitionTargets(tincanActivity.getActivityDefinitionTargets());
		tincanActivityImpl.setActivityDefinitionSteps(tincanActivity.getActivityDefinitionSteps());
		tincanActivityImpl.setAuthoritative(tincanActivity.getAuthoritative());
		tincanActivityImpl.setCanonical_version(tincanActivity.isCanonical_version());

		return tincanActivityImpl;
	}

	/**
	 * Returns the tincan activity with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan activity
	 * @return the tincan activity
	 * @throws com.labimo.portlet.tincan.NoSuchTincanActivityException if a tincan activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTincanActivityException, SystemException {
		TincanActivity tincanActivity = fetchByPrimaryKey(primaryKey);

		if (tincanActivity == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTincanActivityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tincanActivity;
	}

	/**
	 * Returns the tincan activity with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanActivityException} if it could not be found.
	 *
	 * @param id the primary key of the tincan activity
	 * @return the tincan activity
	 * @throws com.labimo.portlet.tincan.NoSuchTincanActivityException if a tincan activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivity findByPrimaryKey(long id)
		throws NoSuchTincanActivityException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tincan activity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan activity
	 * @return the tincan activity, or <code>null</code> if a tincan activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivity fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TincanActivity tincanActivity = (TincanActivity)EntityCacheUtil.getResult(TincanActivityModelImpl.ENTITY_CACHE_ENABLED,
				TincanActivityImpl.class, primaryKey);

		if (tincanActivity == _nullTincanActivity) {
			return null;
		}

		if (tincanActivity == null) {
			Session session = null;

			try {
				session = openSession();

				tincanActivity = (TincanActivity)session.get(TincanActivityImpl.class,
						primaryKey);

				if (tincanActivity != null) {
					cacheResult(tincanActivity);
				}
				else {
					EntityCacheUtil.putResult(TincanActivityModelImpl.ENTITY_CACHE_ENABLED,
						TincanActivityImpl.class, primaryKey,
						_nullTincanActivity);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TincanActivityModelImpl.ENTITY_CACHE_ENABLED,
					TincanActivityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tincanActivity;
	}

	/**
	 * Returns the tincan activity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tincan activity
	 * @return the tincan activity, or <code>null</code> if a tincan activity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivity fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tincan activities.
	 *
	 * @return the tincan activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanActivity> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tincan activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan activities
	 * @param end the upper bound of the range of tincan activities (not inclusive)
	 * @return the range of tincan activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanActivity> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tincan activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanActivityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan activities
	 * @param end the upper bound of the range of tincan activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tincan activities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanActivity> findAll(int start, int end,
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

		List<TincanActivity> list = (List<TincanActivity>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TINCANACTIVITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TINCANACTIVITY;

				if (pagination) {
					sql = sql.concat(TincanActivityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TincanActivity>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TincanActivity>(list);
				}
				else {
					list = (List<TincanActivity>)QueryUtil.list(q,
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
	 * Removes all the tincan activities from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TincanActivity tincanActivity : findAll()) {
			remove(tincanActivity);
		}
	}

	/**
	 * Returns the number of tincan activities.
	 *
	 * @return the number of tincan activities
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

				Query q = session.createQuery(_SQL_COUNT_TINCANACTIVITY);

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
	 * Initializes the tincan activity persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.TincanActivity")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TincanActivity>> listenersList = new ArrayList<ModelListener<TincanActivity>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TincanActivity>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TincanActivityImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TINCANACTIVITY = "SELECT tincanActivity FROM TincanActivity tincanActivity";
	private static final String _SQL_COUNT_TINCANACTIVITY = "SELECT COUNT(tincanActivity) FROM TincanActivity tincanActivity";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tincanActivity.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TincanActivity exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TincanActivityPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static TincanActivity _nullTincanActivity = new TincanActivityImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TincanActivity> toCacheModel() {
				return _nullTincanActivityCacheModel;
			}
		};

	private static CacheModel<TincanActivity> _nullTincanActivityCacheModel = new CacheModel<TincanActivity>() {
			@Override
			public TincanActivity toEntityModel() {
				return _nullTincanActivity;
			}
		};
}
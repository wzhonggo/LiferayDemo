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

import com.labimo.portlet.tincan.NoSuchTincanActivityStateException;
import com.labimo.portlet.tincan.model.TincanActivityState;
import com.labimo.portlet.tincan.model.impl.TincanActivityStateImpl;
import com.labimo.portlet.tincan.model.impl.TincanActivityStateModelImpl;

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
 * The persistence implementation for the tincan activity state service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanActivityStatePersistence
 * @see TincanActivityStateUtil
 * @generated
 */
public class TincanActivityStatePersistenceImpl extends BasePersistenceImpl<TincanActivityState>
	implements TincanActivityStatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TincanActivityStateUtil} to access the tincan activity state persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TincanActivityStateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TincanActivityStateModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityStateModelImpl.FINDER_CACHE_ENABLED,
			TincanActivityStateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TincanActivityStateModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityStateModelImpl.FINDER_CACHE_ENABLED,
			TincanActivityStateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TincanActivityStateModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityStateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TincanActivityStatePersistenceImpl() {
		setModelClass(TincanActivityState.class);
	}

	/**
	 * Caches the tincan activity state in the entity cache if it is enabled.
	 *
	 * @param tincanActivityState the tincan activity state
	 */
	@Override
	public void cacheResult(TincanActivityState tincanActivityState) {
		EntityCacheUtil.putResult(TincanActivityStateModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityStateImpl.class, tincanActivityState.getPrimaryKey(),
			tincanActivityState);

		tincanActivityState.resetOriginalValues();
	}

	/**
	 * Caches the tincan activity states in the entity cache if it is enabled.
	 *
	 * @param tincanActivityStates the tincan activity states
	 */
	@Override
	public void cacheResult(List<TincanActivityState> tincanActivityStates) {
		for (TincanActivityState tincanActivityState : tincanActivityStates) {
			if (EntityCacheUtil.getResult(
						TincanActivityStateModelImpl.ENTITY_CACHE_ENABLED,
						TincanActivityStateImpl.class,
						tincanActivityState.getPrimaryKey()) == null) {
				cacheResult(tincanActivityState);
			}
			else {
				tincanActivityState.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tincan activity states.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TincanActivityStateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TincanActivityStateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tincan activity state.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TincanActivityState tincanActivityState) {
		EntityCacheUtil.removeResult(TincanActivityStateModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityStateImpl.class, tincanActivityState.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TincanActivityState> tincanActivityStates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TincanActivityState tincanActivityState : tincanActivityStates) {
			EntityCacheUtil.removeResult(TincanActivityStateModelImpl.ENTITY_CACHE_ENABLED,
				TincanActivityStateImpl.class,
				tincanActivityState.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tincan activity state with the primary key. Does not add the tincan activity state to the database.
	 *
	 * @param id the primary key for the new tincan activity state
	 * @return the new tincan activity state
	 */
	@Override
	public TincanActivityState create(long id) {
		TincanActivityState tincanActivityState = new TincanActivityStateImpl();

		tincanActivityState.setNew(true);
		tincanActivityState.setPrimaryKey(id);

		return tincanActivityState;
	}

	/**
	 * Removes the tincan activity state with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tincan activity state
	 * @return the tincan activity state that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanActivityStateException if a tincan activity state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivityState remove(long id)
		throws NoSuchTincanActivityStateException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tincan activity state with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tincan activity state
	 * @return the tincan activity state that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanActivityStateException if a tincan activity state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivityState remove(Serializable primaryKey)
		throws NoSuchTincanActivityStateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TincanActivityState tincanActivityState = (TincanActivityState)session.get(TincanActivityStateImpl.class,
					primaryKey);

			if (tincanActivityState == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTincanActivityStateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tincanActivityState);
		}
		catch (NoSuchTincanActivityStateException nsee) {
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
	protected TincanActivityState removeImpl(
		TincanActivityState tincanActivityState) throws SystemException {
		tincanActivityState = toUnwrappedModel(tincanActivityState);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tincanActivityState)) {
				tincanActivityState = (TincanActivityState)session.get(TincanActivityStateImpl.class,
						tincanActivityState.getPrimaryKeyObj());
			}

			if (tincanActivityState != null) {
				session.delete(tincanActivityState);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tincanActivityState != null) {
			clearCache(tincanActivityState);
		}

		return tincanActivityState;
	}

	@Override
	public TincanActivityState updateImpl(
		com.labimo.portlet.tincan.model.TincanActivityState tincanActivityState)
		throws SystemException {
		tincanActivityState = toUnwrappedModel(tincanActivityState);

		boolean isNew = tincanActivityState.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tincanActivityState.isNew()) {
				session.save(tincanActivityState);

				tincanActivityState.setNew(false);
			}
			else {
				session.merge(tincanActivityState);
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

		EntityCacheUtil.putResult(TincanActivityStateModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityStateImpl.class, tincanActivityState.getPrimaryKey(),
			tincanActivityState);

		return tincanActivityState;
	}

	protected TincanActivityState toUnwrappedModel(
		TincanActivityState tincanActivityState) {
		if (tincanActivityState instanceof TincanActivityStateImpl) {
			return tincanActivityState;
		}

		TincanActivityStateImpl tincanActivityStateImpl = new TincanActivityStateImpl();

		tincanActivityStateImpl.setNew(tincanActivityState.isNew());
		tincanActivityStateImpl.setPrimaryKey(tincanActivityState.getPrimaryKey());

		tincanActivityStateImpl.setId(tincanActivityState.getId());
		tincanActivityStateImpl.setStateId(tincanActivityState.getStateId());
		tincanActivityStateImpl.setState(tincanActivityState.getState());
		tincanActivityStateImpl.setJsonState(tincanActivityState.getJsonState());
		tincanActivityStateImpl.setAgentId(tincanActivityState.getAgentId());
		tincanActivityStateImpl.setActivityId(tincanActivityState.getActivityId());
		tincanActivityStateImpl.setRegistration(tincanActivityState.getRegistration());
		tincanActivityStateImpl.setEtag(tincanActivityState.getEtag());
		tincanActivityStateImpl.setUpdated(tincanActivityState.getUpdated());
		tincanActivityStateImpl.setContentType(tincanActivityState.getContentType());

		return tincanActivityStateImpl;
	}

	/**
	 * Returns the tincan activity state with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan activity state
	 * @return the tincan activity state
	 * @throws com.labimo.portlet.tincan.NoSuchTincanActivityStateException if a tincan activity state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivityState findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTincanActivityStateException, SystemException {
		TincanActivityState tincanActivityState = fetchByPrimaryKey(primaryKey);

		if (tincanActivityState == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTincanActivityStateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tincanActivityState;
	}

	/**
	 * Returns the tincan activity state with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanActivityStateException} if it could not be found.
	 *
	 * @param id the primary key of the tincan activity state
	 * @return the tincan activity state
	 * @throws com.labimo.portlet.tincan.NoSuchTincanActivityStateException if a tincan activity state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivityState findByPrimaryKey(long id)
		throws NoSuchTincanActivityStateException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tincan activity state with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan activity state
	 * @return the tincan activity state, or <code>null</code> if a tincan activity state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivityState fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TincanActivityState tincanActivityState = (TincanActivityState)EntityCacheUtil.getResult(TincanActivityStateModelImpl.ENTITY_CACHE_ENABLED,
				TincanActivityStateImpl.class, primaryKey);

		if (tincanActivityState == _nullTincanActivityState) {
			return null;
		}

		if (tincanActivityState == null) {
			Session session = null;

			try {
				session = openSession();

				tincanActivityState = (TincanActivityState)session.get(TincanActivityStateImpl.class,
						primaryKey);

				if (tincanActivityState != null) {
					cacheResult(tincanActivityState);
				}
				else {
					EntityCacheUtil.putResult(TincanActivityStateModelImpl.ENTITY_CACHE_ENABLED,
						TincanActivityStateImpl.class, primaryKey,
						_nullTincanActivityState);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TincanActivityStateModelImpl.ENTITY_CACHE_ENABLED,
					TincanActivityStateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tincanActivityState;
	}

	/**
	 * Returns the tincan activity state with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tincan activity state
	 * @return the tincan activity state, or <code>null</code> if a tincan activity state with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivityState fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tincan activity states.
	 *
	 * @return the tincan activity states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanActivityState> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tincan activity states.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanActivityStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan activity states
	 * @param end the upper bound of the range of tincan activity states (not inclusive)
	 * @return the range of tincan activity states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanActivityState> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tincan activity states.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanActivityStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan activity states
	 * @param end the upper bound of the range of tincan activity states (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tincan activity states
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanActivityState> findAll(int start, int end,
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

		List<TincanActivityState> list = (List<TincanActivityState>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TINCANACTIVITYSTATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TINCANACTIVITYSTATE;

				if (pagination) {
					sql = sql.concat(TincanActivityStateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TincanActivityState>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TincanActivityState>(list);
				}
				else {
					list = (List<TincanActivityState>)QueryUtil.list(q,
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
	 * Removes all the tincan activity states from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TincanActivityState tincanActivityState : findAll()) {
			remove(tincanActivityState);
		}
	}

	/**
	 * Returns the number of tincan activity states.
	 *
	 * @return the number of tincan activity states
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

				Query q = session.createQuery(_SQL_COUNT_TINCANACTIVITYSTATE);

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
	 * Initializes the tincan activity state persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.TincanActivityState")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TincanActivityState>> listenersList = new ArrayList<ModelListener<TincanActivityState>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TincanActivityState>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TincanActivityStateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TINCANACTIVITYSTATE = "SELECT tincanActivityState FROM TincanActivityState tincanActivityState";
	private static final String _SQL_COUNT_TINCANACTIVITYSTATE = "SELECT COUNT(tincanActivityState) FROM TincanActivityState tincanActivityState";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tincanActivityState.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TincanActivityState exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TincanActivityStatePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "state"
			});
	private static TincanActivityState _nullTincanActivityState = new TincanActivityStateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TincanActivityState> toCacheModel() {
				return _nullTincanActivityStateCacheModel;
			}
		};

	private static CacheModel<TincanActivityState> _nullTincanActivityStateCacheModel =
		new CacheModel<TincanActivityState>() {
			@Override
			public TincanActivityState toEntityModel() {
				return _nullTincanActivityState;
			}
		};
}
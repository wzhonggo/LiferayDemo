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

import com.labimo.portlet.tincan.NoSuchTincanStatementResultException;
import com.labimo.portlet.tincan.model.TincanStatementResult;
import com.labimo.portlet.tincan.model.impl.TincanStatementResultImpl;
import com.labimo.portlet.tincan.model.impl.TincanStatementResultModelImpl;

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
 * The persistence implementation for the tincan statement result service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanStatementResultPersistence
 * @see TincanStatementResultUtil
 * @generated
 */
public class TincanStatementResultPersistenceImpl extends BasePersistenceImpl<TincanStatementResult>
	implements TincanStatementResultPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TincanStatementResultUtil} to access the tincan statement result persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TincanStatementResultImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TincanStatementResultModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementResultModelImpl.FINDER_CACHE_ENABLED,
			TincanStatementResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TincanStatementResultModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementResultModelImpl.FINDER_CACHE_ENABLED,
			TincanStatementResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TincanStatementResultModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementResultModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TincanStatementResultPersistenceImpl() {
		setModelClass(TincanStatementResult.class);
	}

	/**
	 * Caches the tincan statement result in the entity cache if it is enabled.
	 *
	 * @param tincanStatementResult the tincan statement result
	 */
	@Override
	public void cacheResult(TincanStatementResult tincanStatementResult) {
		EntityCacheUtil.putResult(TincanStatementResultModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementResultImpl.class,
			tincanStatementResult.getPrimaryKey(), tincanStatementResult);

		tincanStatementResult.resetOriginalValues();
	}

	/**
	 * Caches the tincan statement results in the entity cache if it is enabled.
	 *
	 * @param tincanStatementResults the tincan statement results
	 */
	@Override
	public void cacheResult(List<TincanStatementResult> tincanStatementResults) {
		for (TincanStatementResult tincanStatementResult : tincanStatementResults) {
			if (EntityCacheUtil.getResult(
						TincanStatementResultModelImpl.ENTITY_CACHE_ENABLED,
						TincanStatementResultImpl.class,
						tincanStatementResult.getPrimaryKey()) == null) {
				cacheResult(tincanStatementResult);
			}
			else {
				tincanStatementResult.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tincan statement results.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TincanStatementResultImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TincanStatementResultImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tincan statement result.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TincanStatementResult tincanStatementResult) {
		EntityCacheUtil.removeResult(TincanStatementResultModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementResultImpl.class,
			tincanStatementResult.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TincanStatementResult> tincanStatementResults) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TincanStatementResult tincanStatementResult : tincanStatementResults) {
			EntityCacheUtil.removeResult(TincanStatementResultModelImpl.ENTITY_CACHE_ENABLED,
				TincanStatementResultImpl.class,
				tincanStatementResult.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tincan statement result with the primary key. Does not add the tincan statement result to the database.
	 *
	 * @param id the primary key for the new tincan statement result
	 * @return the new tincan statement result
	 */
	@Override
	public TincanStatementResult create(long id) {
		TincanStatementResult tincanStatementResult = new TincanStatementResultImpl();

		tincanStatementResult.setNew(true);
		tincanStatementResult.setPrimaryKey(id);

		return tincanStatementResult;
	}

	/**
	 * Removes the tincan statement result with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tincan statement result
	 * @return the tincan statement result that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementResultException if a tincan statement result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementResult remove(long id)
		throws NoSuchTincanStatementResultException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tincan statement result with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tincan statement result
	 * @return the tincan statement result that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementResultException if a tincan statement result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementResult remove(Serializable primaryKey)
		throws NoSuchTincanStatementResultException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TincanStatementResult tincanStatementResult = (TincanStatementResult)session.get(TincanStatementResultImpl.class,
					primaryKey);

			if (tincanStatementResult == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTincanStatementResultException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tincanStatementResult);
		}
		catch (NoSuchTincanStatementResultException nsee) {
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
	protected TincanStatementResult removeImpl(
		TincanStatementResult tincanStatementResult) throws SystemException {
		tincanStatementResult = toUnwrappedModel(tincanStatementResult);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tincanStatementResult)) {
				tincanStatementResult = (TincanStatementResult)session.get(TincanStatementResultImpl.class,
						tincanStatementResult.getPrimaryKeyObj());
			}

			if (tincanStatementResult != null) {
				session.delete(tincanStatementResult);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tincanStatementResult != null) {
			clearCache(tincanStatementResult);
		}

		return tincanStatementResult;
	}

	@Override
	public TincanStatementResult updateImpl(
		com.labimo.portlet.tincan.model.TincanStatementResult tincanStatementResult)
		throws SystemException {
		tincanStatementResult = toUnwrappedModel(tincanStatementResult);

		boolean isNew = tincanStatementResult.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tincanStatementResult.isNew()) {
				session.save(tincanStatementResult);

				tincanStatementResult.setNew(false);
			}
			else {
				session.merge(tincanStatementResult);
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

		EntityCacheUtil.putResult(TincanStatementResultModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementResultImpl.class,
			tincanStatementResult.getPrimaryKey(), tincanStatementResult);

		return tincanStatementResult;
	}

	protected TincanStatementResult toUnwrappedModel(
		TincanStatementResult tincanStatementResult) {
		if (tincanStatementResult instanceof TincanStatementResultImpl) {
			return tincanStatementResult;
		}

		TincanStatementResultImpl tincanStatementResultImpl = new TincanStatementResultImpl();

		tincanStatementResultImpl.setNew(tincanStatementResult.isNew());
		tincanStatementResultImpl.setPrimaryKey(tincanStatementResult.getPrimaryKey());

		tincanStatementResultImpl.setId(tincanStatementResult.getId());
		tincanStatementResultImpl.setSuccess(tincanStatementResult.isSuccess());
		tincanStatementResultImpl.setCompletion(tincanStatementResult.isCompletion());
		tincanStatementResultImpl.setResponse(tincanStatementResult.getResponse());
		tincanStatementResultImpl.setDuration(tincanStatementResult.getDuration());
		tincanStatementResultImpl.setExtension(tincanStatementResult.getExtension());
		tincanStatementResultImpl.setScoreScaled(tincanStatementResult.getScoreScaled());
		tincanStatementResultImpl.setScoreRaw(tincanStatementResult.getScoreRaw());
		tincanStatementResultImpl.setScoreMin(tincanStatementResult.getScoreMin());
		tincanStatementResultImpl.setScoreMax(tincanStatementResult.getScoreMax());

		return tincanStatementResultImpl;
	}

	/**
	 * Returns the tincan statement result with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan statement result
	 * @return the tincan statement result
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementResultException if a tincan statement result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementResult findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTincanStatementResultException, SystemException {
		TincanStatementResult tincanStatementResult = fetchByPrimaryKey(primaryKey);

		if (tincanStatementResult == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTincanStatementResultException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tincanStatementResult;
	}

	/**
	 * Returns the tincan statement result with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanStatementResultException} if it could not be found.
	 *
	 * @param id the primary key of the tincan statement result
	 * @return the tincan statement result
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementResultException if a tincan statement result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementResult findByPrimaryKey(long id)
		throws NoSuchTincanStatementResultException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tincan statement result with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan statement result
	 * @return the tincan statement result, or <code>null</code> if a tincan statement result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementResult fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TincanStatementResult tincanStatementResult = (TincanStatementResult)EntityCacheUtil.getResult(TincanStatementResultModelImpl.ENTITY_CACHE_ENABLED,
				TincanStatementResultImpl.class, primaryKey);

		if (tincanStatementResult == _nullTincanStatementResult) {
			return null;
		}

		if (tincanStatementResult == null) {
			Session session = null;

			try {
				session = openSession();

				tincanStatementResult = (TincanStatementResult)session.get(TincanStatementResultImpl.class,
						primaryKey);

				if (tincanStatementResult != null) {
					cacheResult(tincanStatementResult);
				}
				else {
					EntityCacheUtil.putResult(TincanStatementResultModelImpl.ENTITY_CACHE_ENABLED,
						TincanStatementResultImpl.class, primaryKey,
						_nullTincanStatementResult);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TincanStatementResultModelImpl.ENTITY_CACHE_ENABLED,
					TincanStatementResultImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tincanStatementResult;
	}

	/**
	 * Returns the tincan statement result with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tincan statement result
	 * @return the tincan statement result, or <code>null</code> if a tincan statement result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementResult fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tincan statement results.
	 *
	 * @return the tincan statement results
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanStatementResult> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tincan statement results.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan statement results
	 * @param end the upper bound of the range of tincan statement results (not inclusive)
	 * @return the range of tincan statement results
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanStatementResult> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tincan statement results.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan statement results
	 * @param end the upper bound of the range of tincan statement results (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tincan statement results
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanStatementResult> findAll(int start, int end,
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

		List<TincanStatementResult> list = (List<TincanStatementResult>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TINCANSTATEMENTRESULT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TINCANSTATEMENTRESULT;

				if (pagination) {
					sql = sql.concat(TincanStatementResultModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TincanStatementResult>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TincanStatementResult>(list);
				}
				else {
					list = (List<TincanStatementResult>)QueryUtil.list(q,
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
	 * Removes all the tincan statement results from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TincanStatementResult tincanStatementResult : findAll()) {
			remove(tincanStatementResult);
		}
	}

	/**
	 * Returns the number of tincan statement results.
	 *
	 * @return the number of tincan statement results
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

				Query q = session.createQuery(_SQL_COUNT_TINCANSTATEMENTRESULT);

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
	 * Initializes the tincan statement result persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.TincanStatementResult")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TincanStatementResult>> listenersList = new ArrayList<ModelListener<TincanStatementResult>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TincanStatementResult>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TincanStatementResultImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TINCANSTATEMENTRESULT = "SELECT tincanStatementResult FROM TincanStatementResult tincanStatementResult";
	private static final String _SQL_COUNT_TINCANSTATEMENTRESULT = "SELECT COUNT(tincanStatementResult) FROM TincanStatementResult tincanStatementResult";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tincanStatementResult.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TincanStatementResult exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TincanStatementResultPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static TincanStatementResult _nullTincanStatementResult = new TincanStatementResultImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TincanStatementResult> toCacheModel() {
				return _nullTincanStatementResultCacheModel;
			}
		};

	private static CacheModel<TincanStatementResult> _nullTincanStatementResultCacheModel =
		new CacheModel<TincanStatementResult>() {
			@Override
			public TincanStatementResult toEntityModel() {
				return _nullTincanStatementResult;
			}
		};
}
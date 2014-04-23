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

import com.labimo.portlet.tincan.NoSuchTincanStatementContextException;
import com.labimo.portlet.tincan.model.TincanStatementContext;
import com.labimo.portlet.tincan.model.impl.TincanStatementContextImpl;
import com.labimo.portlet.tincan.model.impl.TincanStatementContextModelImpl;

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
 * The persistence implementation for the tincan statement context service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanStatementContextPersistence
 * @see TincanStatementContextUtil
 * @generated
 */
public class TincanStatementContextPersistenceImpl extends BasePersistenceImpl<TincanStatementContext>
	implements TincanStatementContextPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TincanStatementContextUtil} to access the tincan statement context persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TincanStatementContextImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TincanStatementContextModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementContextModelImpl.FINDER_CACHE_ENABLED,
			TincanStatementContextImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TincanStatementContextModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementContextModelImpl.FINDER_CACHE_ENABLED,
			TincanStatementContextImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TincanStatementContextModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementContextModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TincanStatementContextPersistenceImpl() {
		setModelClass(TincanStatementContext.class);
	}

	/**
	 * Caches the tincan statement context in the entity cache if it is enabled.
	 *
	 * @param tincanStatementContext the tincan statement context
	 */
	@Override
	public void cacheResult(TincanStatementContext tincanStatementContext) {
		EntityCacheUtil.putResult(TincanStatementContextModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementContextImpl.class,
			tincanStatementContext.getPrimaryKey(), tincanStatementContext);

		tincanStatementContext.resetOriginalValues();
	}

	/**
	 * Caches the tincan statement contexts in the entity cache if it is enabled.
	 *
	 * @param tincanStatementContexts the tincan statement contexts
	 */
	@Override
	public void cacheResult(
		List<TincanStatementContext> tincanStatementContexts) {
		for (TincanStatementContext tincanStatementContext : tincanStatementContexts) {
			if (EntityCacheUtil.getResult(
						TincanStatementContextModelImpl.ENTITY_CACHE_ENABLED,
						TincanStatementContextImpl.class,
						tincanStatementContext.getPrimaryKey()) == null) {
				cacheResult(tincanStatementContext);
			}
			else {
				tincanStatementContext.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tincan statement contexts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TincanStatementContextImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TincanStatementContextImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tincan statement context.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TincanStatementContext tincanStatementContext) {
		EntityCacheUtil.removeResult(TincanStatementContextModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementContextImpl.class,
			tincanStatementContext.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TincanStatementContext> tincanStatementContexts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TincanStatementContext tincanStatementContext : tincanStatementContexts) {
			EntityCacheUtil.removeResult(TincanStatementContextModelImpl.ENTITY_CACHE_ENABLED,
				TincanStatementContextImpl.class,
				tincanStatementContext.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tincan statement context with the primary key. Does not add the tincan statement context to the database.
	 *
	 * @param id the primary key for the new tincan statement context
	 * @return the new tincan statement context
	 */
	@Override
	public TincanStatementContext create(long id) {
		TincanStatementContext tincanStatementContext = new TincanStatementContextImpl();

		tincanStatementContext.setNew(true);
		tincanStatementContext.setPrimaryKey(id);

		return tincanStatementContext;
	}

	/**
	 * Removes the tincan statement context with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tincan statement context
	 * @return the tincan statement context that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementContextException if a tincan statement context with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementContext remove(long id)
		throws NoSuchTincanStatementContextException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tincan statement context with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tincan statement context
	 * @return the tincan statement context that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementContextException if a tincan statement context with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementContext remove(Serializable primaryKey)
		throws NoSuchTincanStatementContextException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TincanStatementContext tincanStatementContext = (TincanStatementContext)session.get(TincanStatementContextImpl.class,
					primaryKey);

			if (tincanStatementContext == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTincanStatementContextException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tincanStatementContext);
		}
		catch (NoSuchTincanStatementContextException nsee) {
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
	protected TincanStatementContext removeImpl(
		TincanStatementContext tincanStatementContext)
		throws SystemException {
		tincanStatementContext = toUnwrappedModel(tincanStatementContext);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tincanStatementContext)) {
				tincanStatementContext = (TincanStatementContext)session.get(TincanStatementContextImpl.class,
						tincanStatementContext.getPrimaryKeyObj());
			}

			if (tincanStatementContext != null) {
				session.delete(tincanStatementContext);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tincanStatementContext != null) {
			clearCache(tincanStatementContext);
		}

		return tincanStatementContext;
	}

	@Override
	public TincanStatementContext updateImpl(
		com.labimo.portlet.tincan.model.TincanStatementContext tincanStatementContext)
		throws SystemException {
		tincanStatementContext = toUnwrappedModel(tincanStatementContext);

		boolean isNew = tincanStatementContext.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tincanStatementContext.isNew()) {
				session.save(tincanStatementContext);

				tincanStatementContext.setNew(false);
			}
			else {
				session.merge(tincanStatementContext);
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

		EntityCacheUtil.putResult(TincanStatementContextModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementContextImpl.class,
			tincanStatementContext.getPrimaryKey(), tincanStatementContext);

		return tincanStatementContext;
	}

	protected TincanStatementContext toUnwrappedModel(
		TincanStatementContext tincanStatementContext) {
		if (tincanStatementContext instanceof TincanStatementContextImpl) {
			return tincanStatementContext;
		}

		TincanStatementContextImpl tincanStatementContextImpl = new TincanStatementContextImpl();

		tincanStatementContextImpl.setNew(tincanStatementContext.isNew());
		tincanStatementContextImpl.setPrimaryKey(tincanStatementContext.getPrimaryKey());

		tincanStatementContextImpl.setId(tincanStatementContext.getId());
		tincanStatementContextImpl.setRegistration(tincanStatementContext.getRegistration());
		tincanStatementContextImpl.setInstructorId(tincanStatementContext.getInstructorId());
		tincanStatementContextImpl.setTeamId(tincanStatementContext.getTeamId());
		tincanStatementContextImpl.setContextActivitiesId(tincanStatementContext.getContextActivitiesId());
		tincanStatementContextImpl.setRevision(tincanStatementContext.getRevision());
		tincanStatementContextImpl.setPlatform(tincanStatementContext.getPlatform());
		tincanStatementContextImpl.setLanguage(tincanStatementContext.getLanguage());
		tincanStatementContextImpl.setStatement(tincanStatementContext.getStatement());
		tincanStatementContextImpl.setExtensions(tincanStatementContext.getExtensions());

		return tincanStatementContextImpl;
	}

	/**
	 * Returns the tincan statement context with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan statement context
	 * @return the tincan statement context
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementContextException if a tincan statement context with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementContext findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTincanStatementContextException, SystemException {
		TincanStatementContext tincanStatementContext = fetchByPrimaryKey(primaryKey);

		if (tincanStatementContext == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTincanStatementContextException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tincanStatementContext;
	}

	/**
	 * Returns the tincan statement context with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanStatementContextException} if it could not be found.
	 *
	 * @param id the primary key of the tincan statement context
	 * @return the tincan statement context
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementContextException if a tincan statement context with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementContext findByPrimaryKey(long id)
		throws NoSuchTincanStatementContextException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tincan statement context with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan statement context
	 * @return the tincan statement context, or <code>null</code> if a tincan statement context with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementContext fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TincanStatementContext tincanStatementContext = (TincanStatementContext)EntityCacheUtil.getResult(TincanStatementContextModelImpl.ENTITY_CACHE_ENABLED,
				TincanStatementContextImpl.class, primaryKey);

		if (tincanStatementContext == _nullTincanStatementContext) {
			return null;
		}

		if (tincanStatementContext == null) {
			Session session = null;

			try {
				session = openSession();

				tincanStatementContext = (TincanStatementContext)session.get(TincanStatementContextImpl.class,
						primaryKey);

				if (tincanStatementContext != null) {
					cacheResult(tincanStatementContext);
				}
				else {
					EntityCacheUtil.putResult(TincanStatementContextModelImpl.ENTITY_CACHE_ENABLED,
						TincanStatementContextImpl.class, primaryKey,
						_nullTincanStatementContext);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TincanStatementContextModelImpl.ENTITY_CACHE_ENABLED,
					TincanStatementContextImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tincanStatementContext;
	}

	/**
	 * Returns the tincan statement context with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tincan statement context
	 * @return the tincan statement context, or <code>null</code> if a tincan statement context with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementContext fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tincan statement contexts.
	 *
	 * @return the tincan statement contexts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanStatementContext> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tincan statement contexts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementContextModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan statement contexts
	 * @param end the upper bound of the range of tincan statement contexts (not inclusive)
	 * @return the range of tincan statement contexts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanStatementContext> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tincan statement contexts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementContextModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan statement contexts
	 * @param end the upper bound of the range of tincan statement contexts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tincan statement contexts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanStatementContext> findAll(int start, int end,
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

		List<TincanStatementContext> list = (List<TincanStatementContext>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TINCANSTATEMENTCONTEXT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TINCANSTATEMENTCONTEXT;

				if (pagination) {
					sql = sql.concat(TincanStatementContextModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TincanStatementContext>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TincanStatementContext>(list);
				}
				else {
					list = (List<TincanStatementContext>)QueryUtil.list(q,
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
	 * Removes all the tincan statement contexts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TincanStatementContext tincanStatementContext : findAll()) {
			remove(tincanStatementContext);
		}
	}

	/**
	 * Returns the number of tincan statement contexts.
	 *
	 * @return the number of tincan statement contexts
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

				Query q = session.createQuery(_SQL_COUNT_TINCANSTATEMENTCONTEXT);

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
	 * Initializes the tincan statement context persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.TincanStatementContext")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TincanStatementContext>> listenersList = new ArrayList<ModelListener<TincanStatementContext>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TincanStatementContext>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TincanStatementContextImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TINCANSTATEMENTCONTEXT = "SELECT tincanStatementContext FROM TincanStatementContext tincanStatementContext";
	private static final String _SQL_COUNT_TINCANSTATEMENTCONTEXT = "SELECT COUNT(tincanStatementContext) FROM TincanStatementContext tincanStatementContext";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tincanStatementContext.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TincanStatementContext exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TincanStatementContextPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static TincanStatementContext _nullTincanStatementContext = new TincanStatementContextImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TincanStatementContext> toCacheModel() {
				return _nullTincanStatementContextCacheModel;
			}
		};

	private static CacheModel<TincanStatementContext> _nullTincanStatementContextCacheModel =
		new CacheModel<TincanStatementContext>() {
			@Override
			public TincanStatementContext toEntityModel() {
				return _nullTincanStatementContext;
			}
		};
}
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

import com.labimo.portlet.tincan.NoSuchTincanSubStatementException;
import com.labimo.portlet.tincan.model.TincanSubStatement;
import com.labimo.portlet.tincan.model.impl.TincanSubStatementImpl;
import com.labimo.portlet.tincan.model.impl.TincanSubStatementModelImpl;

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
 * The persistence implementation for the tincan sub statement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanSubStatementPersistence
 * @see TincanSubStatementUtil
 * @generated
 */
public class TincanSubStatementPersistenceImpl extends BasePersistenceImpl<TincanSubStatement>
	implements TincanSubStatementPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TincanSubStatementUtil} to access the tincan sub statement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TincanSubStatementImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TincanSubStatementModelImpl.ENTITY_CACHE_ENABLED,
			TincanSubStatementModelImpl.FINDER_CACHE_ENABLED,
			TincanSubStatementImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TincanSubStatementModelImpl.ENTITY_CACHE_ENABLED,
			TincanSubStatementModelImpl.FINDER_CACHE_ENABLED,
			TincanSubStatementImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TincanSubStatementModelImpl.ENTITY_CACHE_ENABLED,
			TincanSubStatementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TincanSubStatementPersistenceImpl() {
		setModelClass(TincanSubStatement.class);
	}

	/**
	 * Caches the tincan sub statement in the entity cache if it is enabled.
	 *
	 * @param tincanSubStatement the tincan sub statement
	 */
	@Override
	public void cacheResult(TincanSubStatement tincanSubStatement) {
		EntityCacheUtil.putResult(TincanSubStatementModelImpl.ENTITY_CACHE_ENABLED,
			TincanSubStatementImpl.class, tincanSubStatement.getPrimaryKey(),
			tincanSubStatement);

		tincanSubStatement.resetOriginalValues();
	}

	/**
	 * Caches the tincan sub statements in the entity cache if it is enabled.
	 *
	 * @param tincanSubStatements the tincan sub statements
	 */
	@Override
	public void cacheResult(List<TincanSubStatement> tincanSubStatements) {
		for (TincanSubStatement tincanSubStatement : tincanSubStatements) {
			if (EntityCacheUtil.getResult(
						TincanSubStatementModelImpl.ENTITY_CACHE_ENABLED,
						TincanSubStatementImpl.class,
						tincanSubStatement.getPrimaryKey()) == null) {
				cacheResult(tincanSubStatement);
			}
			else {
				tincanSubStatement.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tincan sub statements.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TincanSubStatementImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TincanSubStatementImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tincan sub statement.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TincanSubStatement tincanSubStatement) {
		EntityCacheUtil.removeResult(TincanSubStatementModelImpl.ENTITY_CACHE_ENABLED,
			TincanSubStatementImpl.class, tincanSubStatement.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TincanSubStatement> tincanSubStatements) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TincanSubStatement tincanSubStatement : tincanSubStatements) {
			EntityCacheUtil.removeResult(TincanSubStatementModelImpl.ENTITY_CACHE_ENABLED,
				TincanSubStatementImpl.class, tincanSubStatement.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tincan sub statement with the primary key. Does not add the tincan sub statement to the database.
	 *
	 * @param id the primary key for the new tincan sub statement
	 * @return the new tincan sub statement
	 */
	@Override
	public TincanSubStatement create(long id) {
		TincanSubStatement tincanSubStatement = new TincanSubStatementImpl();

		tincanSubStatement.setNew(true);
		tincanSubStatement.setPrimaryKey(id);

		return tincanSubStatement;
	}

	/**
	 * Removes the tincan sub statement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tincan sub statement
	 * @return the tincan sub statement that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanSubStatementException if a tincan sub statement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanSubStatement remove(long id)
		throws NoSuchTincanSubStatementException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tincan sub statement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tincan sub statement
	 * @return the tincan sub statement that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanSubStatementException if a tincan sub statement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanSubStatement remove(Serializable primaryKey)
		throws NoSuchTincanSubStatementException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TincanSubStatement tincanSubStatement = (TincanSubStatement)session.get(TincanSubStatementImpl.class,
					primaryKey);

			if (tincanSubStatement == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTincanSubStatementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tincanSubStatement);
		}
		catch (NoSuchTincanSubStatementException nsee) {
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
	protected TincanSubStatement removeImpl(
		TincanSubStatement tincanSubStatement) throws SystemException {
		tincanSubStatement = toUnwrappedModel(tincanSubStatement);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tincanSubStatement)) {
				tincanSubStatement = (TincanSubStatement)session.get(TincanSubStatementImpl.class,
						tincanSubStatement.getPrimaryKeyObj());
			}

			if (tincanSubStatement != null) {
				session.delete(tincanSubStatement);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tincanSubStatement != null) {
			clearCache(tincanSubStatement);
		}

		return tincanSubStatement;
	}

	@Override
	public TincanSubStatement updateImpl(
		com.labimo.portlet.tincan.model.TincanSubStatement tincanSubStatement)
		throws SystemException {
		tincanSubStatement = toUnwrappedModel(tincanSubStatement);

		boolean isNew = tincanSubStatement.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tincanSubStatement.isNew()) {
				session.save(tincanSubStatement);

				tincanSubStatement.setNew(false);
			}
			else {
				session.merge(tincanSubStatement);
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

		EntityCacheUtil.putResult(TincanSubStatementModelImpl.ENTITY_CACHE_ENABLED,
			TincanSubStatementImpl.class, tincanSubStatement.getPrimaryKey(),
			tincanSubStatement);

		return tincanSubStatement;
	}

	protected TincanSubStatement toUnwrappedModel(
		TincanSubStatement tincanSubStatement) {
		if (tincanSubStatement instanceof TincanSubStatementImpl) {
			return tincanSubStatement;
		}

		TincanSubStatementImpl tincanSubStatementImpl = new TincanSubStatementImpl();

		tincanSubStatementImpl.setNew(tincanSubStatement.isNew());
		tincanSubStatementImpl.setPrimaryKey(tincanSubStatement.getPrimaryKey());

		tincanSubStatementImpl.setId(tincanSubStatement.getId());
		tincanSubStatementImpl.setAgentId(tincanSubStatement.getAgentId());
		tincanSubStatementImpl.setActivityId(tincanSubStatement.getActivityId());
		tincanSubStatementImpl.setResultId(tincanSubStatement.getResultId());
		tincanSubStatementImpl.setContextId(tincanSubStatement.getContextId());
		tincanSubStatementImpl.setVerbId(tincanSubStatement.getVerbId());
		tincanSubStatementImpl.setTimestamp(tincanSubStatement.getTimestamp());

		return tincanSubStatementImpl;
	}

	/**
	 * Returns the tincan sub statement with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan sub statement
	 * @return the tincan sub statement
	 * @throws com.labimo.portlet.tincan.NoSuchTincanSubStatementException if a tincan sub statement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanSubStatement findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTincanSubStatementException, SystemException {
		TincanSubStatement tincanSubStatement = fetchByPrimaryKey(primaryKey);

		if (tincanSubStatement == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTincanSubStatementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tincanSubStatement;
	}

	/**
	 * Returns the tincan sub statement with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanSubStatementException} if it could not be found.
	 *
	 * @param id the primary key of the tincan sub statement
	 * @return the tincan sub statement
	 * @throws com.labimo.portlet.tincan.NoSuchTincanSubStatementException if a tincan sub statement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanSubStatement findByPrimaryKey(long id)
		throws NoSuchTincanSubStatementException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tincan sub statement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan sub statement
	 * @return the tincan sub statement, or <code>null</code> if a tincan sub statement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanSubStatement fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TincanSubStatement tincanSubStatement = (TincanSubStatement)EntityCacheUtil.getResult(TincanSubStatementModelImpl.ENTITY_CACHE_ENABLED,
				TincanSubStatementImpl.class, primaryKey);

		if (tincanSubStatement == _nullTincanSubStatement) {
			return null;
		}

		if (tincanSubStatement == null) {
			Session session = null;

			try {
				session = openSession();

				tincanSubStatement = (TincanSubStatement)session.get(TincanSubStatementImpl.class,
						primaryKey);

				if (tincanSubStatement != null) {
					cacheResult(tincanSubStatement);
				}
				else {
					EntityCacheUtil.putResult(TincanSubStatementModelImpl.ENTITY_CACHE_ENABLED,
						TincanSubStatementImpl.class, primaryKey,
						_nullTincanSubStatement);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TincanSubStatementModelImpl.ENTITY_CACHE_ENABLED,
					TincanSubStatementImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tincanSubStatement;
	}

	/**
	 * Returns the tincan sub statement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tincan sub statement
	 * @return the tincan sub statement, or <code>null</code> if a tincan sub statement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanSubStatement fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tincan sub statements.
	 *
	 * @return the tincan sub statements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanSubStatement> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tincan sub statements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanSubStatementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan sub statements
	 * @param end the upper bound of the range of tincan sub statements (not inclusive)
	 * @return the range of tincan sub statements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanSubStatement> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tincan sub statements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanSubStatementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan sub statements
	 * @param end the upper bound of the range of tincan sub statements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tincan sub statements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanSubStatement> findAll(int start, int end,
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

		List<TincanSubStatement> list = (List<TincanSubStatement>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TINCANSUBSTATEMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TINCANSUBSTATEMENT;

				if (pagination) {
					sql = sql.concat(TincanSubStatementModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TincanSubStatement>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TincanSubStatement>(list);
				}
				else {
					list = (List<TincanSubStatement>)QueryUtil.list(q,
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
	 * Removes all the tincan sub statements from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TincanSubStatement tincanSubStatement : findAll()) {
			remove(tincanSubStatement);
		}
	}

	/**
	 * Returns the number of tincan sub statements.
	 *
	 * @return the number of tincan sub statements
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

				Query q = session.createQuery(_SQL_COUNT_TINCANSUBSTATEMENT);

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
	 * Initializes the tincan sub statement persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.TincanSubStatement")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TincanSubStatement>> listenersList = new ArrayList<ModelListener<TincanSubStatement>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TincanSubStatement>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TincanSubStatementImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TINCANSUBSTATEMENT = "SELECT tincanSubStatement FROM TincanSubStatement tincanSubStatement";
	private static final String _SQL_COUNT_TINCANSUBSTATEMENT = "SELECT COUNT(tincanSubStatement) FROM TincanSubStatement tincanSubStatement";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tincanSubStatement.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TincanSubStatement exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TincanSubStatementPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static TincanSubStatement _nullTincanSubStatement = new TincanSubStatementImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TincanSubStatement> toCacheModel() {
				return _nullTincanSubStatementCacheModel;
			}
		};

	private static CacheModel<TincanSubStatement> _nullTincanSubStatementCacheModel =
		new CacheModel<TincanSubStatement>() {
			@Override
			public TincanSubStatement toEntityModel() {
				return _nullTincanSubStatement;
			}
		};
}
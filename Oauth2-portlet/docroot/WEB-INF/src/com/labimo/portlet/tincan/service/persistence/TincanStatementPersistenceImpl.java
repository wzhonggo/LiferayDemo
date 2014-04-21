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

import com.labimo.portlet.tincan.NoSuchTincanStatementException;
import com.labimo.portlet.tincan.model.TincanStatement;
import com.labimo.portlet.tincan.model.impl.TincanStatementImpl;
import com.labimo.portlet.tincan.model.impl.TincanStatementModelImpl;

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
 * The persistence implementation for the tincan statement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanStatementPersistence
 * @see TincanStatementUtil
 * @generated
 */
public class TincanStatementPersistenceImpl extends BasePersistenceImpl<TincanStatement>
	implements TincanStatementPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TincanStatementUtil} to access the tincan statement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TincanStatementImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TincanStatementModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementModelImpl.FINDER_CACHE_ENABLED,
			TincanStatementImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TincanStatementModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementModelImpl.FINDER_CACHE_ENABLED,
			TincanStatementImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TincanStatementModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TincanStatementPersistenceImpl() {
		setModelClass(TincanStatement.class);
	}

	/**
	 * Caches the tincan statement in the entity cache if it is enabled.
	 *
	 * @param tincanStatement the tincan statement
	 */
	@Override
	public void cacheResult(TincanStatement tincanStatement) {
		EntityCacheUtil.putResult(TincanStatementModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementImpl.class, tincanStatement.getPrimaryKey(),
			tincanStatement);

		tincanStatement.resetOriginalValues();
	}

	/**
	 * Caches the tincan statements in the entity cache if it is enabled.
	 *
	 * @param tincanStatements the tincan statements
	 */
	@Override
	public void cacheResult(List<TincanStatement> tincanStatements) {
		for (TincanStatement tincanStatement : tincanStatements) {
			if (EntityCacheUtil.getResult(
						TincanStatementModelImpl.ENTITY_CACHE_ENABLED,
						TincanStatementImpl.class,
						tincanStatement.getPrimaryKey()) == null) {
				cacheResult(tincanStatement);
			}
			else {
				tincanStatement.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tincan statements.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TincanStatementImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TincanStatementImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tincan statement.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TincanStatement tincanStatement) {
		EntityCacheUtil.removeResult(TincanStatementModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementImpl.class, tincanStatement.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TincanStatement> tincanStatements) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TincanStatement tincanStatement : tincanStatements) {
			EntityCacheUtil.removeResult(TincanStatementModelImpl.ENTITY_CACHE_ENABLED,
				TincanStatementImpl.class, tincanStatement.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tincan statement with the primary key. Does not add the tincan statement to the database.
	 *
	 * @param id the primary key for the new tincan statement
	 * @return the new tincan statement
	 */
	@Override
	public TincanStatement create(long id) {
		TincanStatement tincanStatement = new TincanStatementImpl();

		tincanStatement.setNew(true);
		tincanStatement.setPrimaryKey(id);

		return tincanStatement;
	}

	/**
	 * Removes the tincan statement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tincan statement
	 * @return the tincan statement that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementException if a tincan statement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatement remove(long id)
		throws NoSuchTincanStatementException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tincan statement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tincan statement
	 * @return the tincan statement that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementException if a tincan statement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatement remove(Serializable primaryKey)
		throws NoSuchTincanStatementException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TincanStatement tincanStatement = (TincanStatement)session.get(TincanStatementImpl.class,
					primaryKey);

			if (tincanStatement == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTincanStatementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tincanStatement);
		}
		catch (NoSuchTincanStatementException nsee) {
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
	protected TincanStatement removeImpl(TincanStatement tincanStatement)
		throws SystemException {
		tincanStatement = toUnwrappedModel(tincanStatement);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tincanStatement)) {
				tincanStatement = (TincanStatement)session.get(TincanStatementImpl.class,
						tincanStatement.getPrimaryKeyObj());
			}

			if (tincanStatement != null) {
				session.delete(tincanStatement);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tincanStatement != null) {
			clearCache(tincanStatement);
		}

		return tincanStatement;
	}

	@Override
	public TincanStatement updateImpl(
		com.labimo.portlet.tincan.model.TincanStatement tincanStatement)
		throws SystemException {
		tincanStatement = toUnwrappedModel(tincanStatement);

		boolean isNew = tincanStatement.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tincanStatement.isNew()) {
				session.save(tincanStatement);

				tincanStatement.setNew(false);
			}
			else {
				session.merge(tincanStatement);
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

		EntityCacheUtil.putResult(TincanStatementModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementImpl.class, tincanStatement.getPrimaryKey(),
			tincanStatement);

		return tincanStatement;
	}

	protected TincanStatement toUnwrappedModel(TincanStatement tincanStatement) {
		if (tincanStatement instanceof TincanStatementImpl) {
			return tincanStatement;
		}

		TincanStatementImpl tincanStatementImpl = new TincanStatementImpl();

		tincanStatementImpl.setNew(tincanStatement.isNew());
		tincanStatementImpl.setPrimaryKey(tincanStatement.getPrimaryKey());

		tincanStatementImpl.setId(tincanStatement.getId());
		tincanStatementImpl.setStatementId(tincanStatement.getStatementId());
		tincanStatementImpl.setSubStatementId(tincanStatement.getSubStatementId());
		tincanStatementImpl.setAgentId(tincanStatement.getAgentId());
		tincanStatementImpl.setContextId(tincanStatement.getContextId());
		tincanStatementImpl.setActivityId(tincanStatement.getActivityId());
		tincanStatementImpl.setResultId(tincanStatement.getResultId());
		tincanStatementImpl.setAuthorityId(tincanStatement.getAuthorityId());
		tincanStatementImpl.setTimestamp(tincanStatement.getTimestamp());
		tincanStatementImpl.setStored(tincanStatement.getStored());
		tincanStatementImpl.setVersion(tincanStatement.getVersion());
		tincanStatementImpl.setVerbId(tincanStatement.getVerbId());
		tincanStatementImpl.setVoided(tincanStatement.isVoided());

		return tincanStatementImpl;
	}

	/**
	 * Returns the tincan statement with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan statement
	 * @return the tincan statement
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementException if a tincan statement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatement findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTincanStatementException, SystemException {
		TincanStatement tincanStatement = fetchByPrimaryKey(primaryKey);

		if (tincanStatement == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTincanStatementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tincanStatement;
	}

	/**
	 * Returns the tincan statement with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanStatementException} if it could not be found.
	 *
	 * @param id the primary key of the tincan statement
	 * @return the tincan statement
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementException if a tincan statement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatement findByPrimaryKey(long id)
		throws NoSuchTincanStatementException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tincan statement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan statement
	 * @return the tincan statement, or <code>null</code> if a tincan statement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatement fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TincanStatement tincanStatement = (TincanStatement)EntityCacheUtil.getResult(TincanStatementModelImpl.ENTITY_CACHE_ENABLED,
				TincanStatementImpl.class, primaryKey);

		if (tincanStatement == _nullTincanStatement) {
			return null;
		}

		if (tincanStatement == null) {
			Session session = null;

			try {
				session = openSession();

				tincanStatement = (TincanStatement)session.get(TincanStatementImpl.class,
						primaryKey);

				if (tincanStatement != null) {
					cacheResult(tincanStatement);
				}
				else {
					EntityCacheUtil.putResult(TincanStatementModelImpl.ENTITY_CACHE_ENABLED,
						TincanStatementImpl.class, primaryKey,
						_nullTincanStatement);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TincanStatementModelImpl.ENTITY_CACHE_ENABLED,
					TincanStatementImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tincanStatement;
	}

	/**
	 * Returns the tincan statement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tincan statement
	 * @return the tincan statement, or <code>null</code> if a tincan statement with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatement fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tincan statements.
	 *
	 * @return the tincan statements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanStatement> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tincan statements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan statements
	 * @param end the upper bound of the range of tincan statements (not inclusive)
	 * @return the range of tincan statements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanStatement> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tincan statements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan statements
	 * @param end the upper bound of the range of tincan statements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tincan statements
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanStatement> findAll(int start, int end,
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

		List<TincanStatement> list = (List<TincanStatement>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TINCANSTATEMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TINCANSTATEMENT;

				if (pagination) {
					sql = sql.concat(TincanStatementModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TincanStatement>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TincanStatement>(list);
				}
				else {
					list = (List<TincanStatement>)QueryUtil.list(q,
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
	 * Removes all the tincan statements from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TincanStatement tincanStatement : findAll()) {
			remove(tincanStatement);
		}
	}

	/**
	 * Returns the number of tincan statements.
	 *
	 * @return the number of tincan statements
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

				Query q = session.createQuery(_SQL_COUNT_TINCANSTATEMENT);

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
	 * Initializes the tincan statement persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.TincanStatement")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TincanStatement>> listenersList = new ArrayList<ModelListener<TincanStatement>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TincanStatement>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TincanStatementImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TINCANSTATEMENT = "SELECT tincanStatement FROM TincanStatement tincanStatement";
	private static final String _SQL_COUNT_TINCANSTATEMENT = "SELECT COUNT(tincanStatement) FROM TincanStatement tincanStatement";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tincanStatement.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TincanStatement exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TincanStatementPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static TincanStatement _nullTincanStatement = new TincanStatementImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TincanStatement> toCacheModel() {
				return _nullTincanStatementCacheModel;
			}
		};

	private static CacheModel<TincanStatement> _nullTincanStatementCacheModel = new CacheModel<TincanStatement>() {
			@Override
			public TincanStatement toEntityModel() {
				return _nullTincanStatement;
			}
		};
}
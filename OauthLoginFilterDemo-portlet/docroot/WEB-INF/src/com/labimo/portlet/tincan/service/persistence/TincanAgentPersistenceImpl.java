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

import com.labimo.portlet.tincan.NoSuchTincanAgentException;
import com.labimo.portlet.tincan.model.TincanAgent;
import com.labimo.portlet.tincan.model.impl.TincanAgentImpl;
import com.labimo.portlet.tincan.model.impl.TincanAgentModelImpl;

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
 * The persistence implementation for the tincan agent service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanAgentPersistence
 * @see TincanAgentUtil
 * @generated
 */
public class TincanAgentPersistenceImpl extends BasePersistenceImpl<TincanAgent>
	implements TincanAgentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TincanAgentUtil} to access the tincan agent persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TincanAgentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TincanAgentModelImpl.ENTITY_CACHE_ENABLED,
			TincanAgentModelImpl.FINDER_CACHE_ENABLED, TincanAgentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TincanAgentModelImpl.ENTITY_CACHE_ENABLED,
			TincanAgentModelImpl.FINDER_CACHE_ENABLED, TincanAgentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TincanAgentModelImpl.ENTITY_CACHE_ENABLED,
			TincanAgentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TincanAgentPersistenceImpl() {
		setModelClass(TincanAgent.class);
	}

	/**
	 * Caches the tincan agent in the entity cache if it is enabled.
	 *
	 * @param tincanAgent the tincan agent
	 */
	@Override
	public void cacheResult(TincanAgent tincanAgent) {
		EntityCacheUtil.putResult(TincanAgentModelImpl.ENTITY_CACHE_ENABLED,
			TincanAgentImpl.class, tincanAgent.getPrimaryKey(), tincanAgent);

		tincanAgent.resetOriginalValues();
	}

	/**
	 * Caches the tincan agents in the entity cache if it is enabled.
	 *
	 * @param tincanAgents the tincan agents
	 */
	@Override
	public void cacheResult(List<TincanAgent> tincanAgents) {
		for (TincanAgent tincanAgent : tincanAgents) {
			if (EntityCacheUtil.getResult(
						TincanAgentModelImpl.ENTITY_CACHE_ENABLED,
						TincanAgentImpl.class, tincanAgent.getPrimaryKey()) == null) {
				cacheResult(tincanAgent);
			}
			else {
				tincanAgent.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tincan agents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TincanAgentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TincanAgentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tincan agent.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TincanAgent tincanAgent) {
		EntityCacheUtil.removeResult(TincanAgentModelImpl.ENTITY_CACHE_ENABLED,
			TincanAgentImpl.class, tincanAgent.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TincanAgent> tincanAgents) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TincanAgent tincanAgent : tincanAgents) {
			EntityCacheUtil.removeResult(TincanAgentModelImpl.ENTITY_CACHE_ENABLED,
				TincanAgentImpl.class, tincanAgent.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tincan agent with the primary key. Does not add the tincan agent to the database.
	 *
	 * @param id the primary key for the new tincan agent
	 * @return the new tincan agent
	 */
	@Override
	public TincanAgent create(long id) {
		TincanAgent tincanAgent = new TincanAgentImpl();

		tincanAgent.setNew(true);
		tincanAgent.setPrimaryKey(id);

		return tincanAgent;
	}

	/**
	 * Removes the tincan agent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tincan agent
	 * @return the tincan agent that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanAgentException if a tincan agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAgent remove(long id)
		throws NoSuchTincanAgentException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tincan agent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tincan agent
	 * @return the tincan agent that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanAgentException if a tincan agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAgent remove(Serializable primaryKey)
		throws NoSuchTincanAgentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TincanAgent tincanAgent = (TincanAgent)session.get(TincanAgentImpl.class,
					primaryKey);

			if (tincanAgent == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTincanAgentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tincanAgent);
		}
		catch (NoSuchTincanAgentException nsee) {
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
	protected TincanAgent removeImpl(TincanAgent tincanAgent)
		throws SystemException {
		tincanAgent = toUnwrappedModel(tincanAgent);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tincanAgent)) {
				tincanAgent = (TincanAgent)session.get(TincanAgentImpl.class,
						tincanAgent.getPrimaryKeyObj());
			}

			if (tincanAgent != null) {
				session.delete(tincanAgent);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tincanAgent != null) {
			clearCache(tincanAgent);
		}

		return tincanAgent;
	}

	@Override
	public TincanAgent updateImpl(
		com.labimo.portlet.tincan.model.TincanAgent tincanAgent)
		throws SystemException {
		tincanAgent = toUnwrappedModel(tincanAgent);

		boolean isNew = tincanAgent.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tincanAgent.isNew()) {
				session.save(tincanAgent);

				tincanAgent.setNew(false);
			}
			else {
				session.merge(tincanAgent);
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

		EntityCacheUtil.putResult(TincanAgentModelImpl.ENTITY_CACHE_ENABLED,
			TincanAgentImpl.class, tincanAgent.getPrimaryKey(), tincanAgent);

		return tincanAgent;
	}

	protected TincanAgent toUnwrappedModel(TincanAgent tincanAgent) {
		if (tincanAgent instanceof TincanAgentImpl) {
			return tincanAgent;
		}

		TincanAgentImpl tincanAgentImpl = new TincanAgentImpl();

		tincanAgentImpl.setNew(tincanAgent.isNew());
		tincanAgentImpl.setPrimaryKey(tincanAgent.getPrimaryKey());

		tincanAgentImpl.setId(tincanAgent.getId());
		tincanAgentImpl.setObjectType(tincanAgent.getObjectType());
		tincanAgentImpl.setName(tincanAgent.getName());
		tincanAgentImpl.setMbox(tincanAgent.getMbox());
		tincanAgentImpl.setMbox_sha1sum(tincanAgent.getMbox_sha1sum());
		tincanAgentImpl.setOpenID(tincanAgent.getOpenID());
		tincanAgentImpl.setOauth_identifier(tincanAgent.getOauth_identifier());
		tincanAgentImpl.setCanonical_version(tincanAgent.isCanonical_version());

		return tincanAgentImpl;
	}

	/**
	 * Returns the tincan agent with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan agent
	 * @return the tincan agent
	 * @throws com.labimo.portlet.tincan.NoSuchTincanAgentException if a tincan agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAgent findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTincanAgentException, SystemException {
		TincanAgent tincanAgent = fetchByPrimaryKey(primaryKey);

		if (tincanAgent == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTincanAgentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tincanAgent;
	}

	/**
	 * Returns the tincan agent with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanAgentException} if it could not be found.
	 *
	 * @param id the primary key of the tincan agent
	 * @return the tincan agent
	 * @throws com.labimo.portlet.tincan.NoSuchTincanAgentException if a tincan agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAgent findByPrimaryKey(long id)
		throws NoSuchTincanAgentException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tincan agent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan agent
	 * @return the tincan agent, or <code>null</code> if a tincan agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAgent fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TincanAgent tincanAgent = (TincanAgent)EntityCacheUtil.getResult(TincanAgentModelImpl.ENTITY_CACHE_ENABLED,
				TincanAgentImpl.class, primaryKey);

		if (tincanAgent == _nullTincanAgent) {
			return null;
		}

		if (tincanAgent == null) {
			Session session = null;

			try {
				session = openSession();

				tincanAgent = (TincanAgent)session.get(TincanAgentImpl.class,
						primaryKey);

				if (tincanAgent != null) {
					cacheResult(tincanAgent);
				}
				else {
					EntityCacheUtil.putResult(TincanAgentModelImpl.ENTITY_CACHE_ENABLED,
						TincanAgentImpl.class, primaryKey, _nullTincanAgent);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TincanAgentModelImpl.ENTITY_CACHE_ENABLED,
					TincanAgentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tincanAgent;
	}

	/**
	 * Returns the tincan agent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tincan agent
	 * @return the tincan agent, or <code>null</code> if a tincan agent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAgent fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tincan agents.
	 *
	 * @return the tincan agents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanAgent> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tincan agents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan agents
	 * @param end the upper bound of the range of tincan agents (not inclusive)
	 * @return the range of tincan agents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanAgent> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tincan agents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanAgentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan agents
	 * @param end the upper bound of the range of tincan agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tincan agents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanAgent> findAll(int start, int end,
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

		List<TincanAgent> list = (List<TincanAgent>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TINCANAGENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TINCANAGENT;

				if (pagination) {
					sql = sql.concat(TincanAgentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TincanAgent>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TincanAgent>(list);
				}
				else {
					list = (List<TincanAgent>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the tincan agents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TincanAgent tincanAgent : findAll()) {
			remove(tincanAgent);
		}
	}

	/**
	 * Returns the number of tincan agents.
	 *
	 * @return the number of tincan agents
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

				Query q = session.createQuery(_SQL_COUNT_TINCANAGENT);

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
	 * Initializes the tincan agent persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.TincanAgent")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TincanAgent>> listenersList = new ArrayList<ModelListener<TincanAgent>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TincanAgent>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TincanAgentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TINCANAGENT = "SELECT tincanAgent FROM TincanAgent tincanAgent";
	private static final String _SQL_COUNT_TINCANAGENT = "SELECT COUNT(tincanAgent) FROM TincanAgent tincanAgent";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tincanAgent.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TincanAgent exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TincanAgentPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static TincanAgent _nullTincanAgent = new TincanAgentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TincanAgent> toCacheModel() {
				return _nullTincanAgentCacheModel;
			}
		};

	private static CacheModel<TincanAgent> _nullTincanAgentCacheModel = new CacheModel<TincanAgent>() {
			@Override
			public TincanAgent toEntityModel() {
				return _nullTincanAgent;
			}
		};
}
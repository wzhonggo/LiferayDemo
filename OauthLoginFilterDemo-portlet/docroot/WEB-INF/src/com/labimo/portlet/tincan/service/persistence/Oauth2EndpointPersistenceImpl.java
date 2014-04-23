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

import com.labimo.portlet.tincan.NoSuchOauth2EndpointException;
import com.labimo.portlet.tincan.model.Oauth2Endpoint;
import com.labimo.portlet.tincan.model.impl.Oauth2EndpointImpl;
import com.labimo.portlet.tincan.model.impl.Oauth2EndpointModelImpl;

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
 * The persistence implementation for the oauth2 endpoint service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see Oauth2EndpointPersistence
 * @see Oauth2EndpointUtil
 * @generated
 */
public class Oauth2EndpointPersistenceImpl extends BasePersistenceImpl<Oauth2Endpoint>
	implements Oauth2EndpointPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Oauth2EndpointUtil} to access the oauth2 endpoint persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Oauth2EndpointImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Oauth2EndpointModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2EndpointModelImpl.FINDER_CACHE_ENABLED,
			Oauth2EndpointImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Oauth2EndpointModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2EndpointModelImpl.FINDER_CACHE_ENABLED,
			Oauth2EndpointImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Oauth2EndpointModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2EndpointModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public Oauth2EndpointPersistenceImpl() {
		setModelClass(Oauth2Endpoint.class);
	}

	/**
	 * Caches the oauth2 endpoint in the entity cache if it is enabled.
	 *
	 * @param oauth2Endpoint the oauth2 endpoint
	 */
	@Override
	public void cacheResult(Oauth2Endpoint oauth2Endpoint) {
		EntityCacheUtil.putResult(Oauth2EndpointModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2EndpointImpl.class, oauth2Endpoint.getPrimaryKey(),
			oauth2Endpoint);

		oauth2Endpoint.resetOriginalValues();
	}

	/**
	 * Caches the oauth2 endpoints in the entity cache if it is enabled.
	 *
	 * @param oauth2Endpoints the oauth2 endpoints
	 */
	@Override
	public void cacheResult(List<Oauth2Endpoint> oauth2Endpoints) {
		for (Oauth2Endpoint oauth2Endpoint : oauth2Endpoints) {
			if (EntityCacheUtil.getResult(
						Oauth2EndpointModelImpl.ENTITY_CACHE_ENABLED,
						Oauth2EndpointImpl.class, oauth2Endpoint.getPrimaryKey()) == null) {
				cacheResult(oauth2Endpoint);
			}
			else {
				oauth2Endpoint.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all oauth2 endpoints.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(Oauth2EndpointImpl.class.getName());
		}

		EntityCacheUtil.clearCache(Oauth2EndpointImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the oauth2 endpoint.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Oauth2Endpoint oauth2Endpoint) {
		EntityCacheUtil.removeResult(Oauth2EndpointModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2EndpointImpl.class, oauth2Endpoint.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Oauth2Endpoint> oauth2Endpoints) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Oauth2Endpoint oauth2Endpoint : oauth2Endpoints) {
			EntityCacheUtil.removeResult(Oauth2EndpointModelImpl.ENTITY_CACHE_ENABLED,
				Oauth2EndpointImpl.class, oauth2Endpoint.getPrimaryKey());
		}
	}

	/**
	 * Creates a new oauth2 endpoint with the primary key. Does not add the oauth2 endpoint to the database.
	 *
	 * @param id the primary key for the new oauth2 endpoint
	 * @return the new oauth2 endpoint
	 */
	@Override
	public Oauth2Endpoint create(long id) {
		Oauth2Endpoint oauth2Endpoint = new Oauth2EndpointImpl();

		oauth2Endpoint.setNew(true);
		oauth2Endpoint.setPrimaryKey(id);

		return oauth2Endpoint;
	}

	/**
	 * Removes the oauth2 endpoint with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the oauth2 endpoint
	 * @return the oauth2 endpoint that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchOauth2EndpointException if a oauth2 endpoint with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Endpoint remove(long id)
		throws NoSuchOauth2EndpointException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the oauth2 endpoint with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the oauth2 endpoint
	 * @return the oauth2 endpoint that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchOauth2EndpointException if a oauth2 endpoint with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Endpoint remove(Serializable primaryKey)
		throws NoSuchOauth2EndpointException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Oauth2Endpoint oauth2Endpoint = (Oauth2Endpoint)session.get(Oauth2EndpointImpl.class,
					primaryKey);

			if (oauth2Endpoint == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOauth2EndpointException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oauth2Endpoint);
		}
		catch (NoSuchOauth2EndpointException nsee) {
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
	protected Oauth2Endpoint removeImpl(Oauth2Endpoint oauth2Endpoint)
		throws SystemException {
		oauth2Endpoint = toUnwrappedModel(oauth2Endpoint);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oauth2Endpoint)) {
				oauth2Endpoint = (Oauth2Endpoint)session.get(Oauth2EndpointImpl.class,
						oauth2Endpoint.getPrimaryKeyObj());
			}

			if (oauth2Endpoint != null) {
				session.delete(oauth2Endpoint);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oauth2Endpoint != null) {
			clearCache(oauth2Endpoint);
		}

		return oauth2Endpoint;
	}

	@Override
	public Oauth2Endpoint updateImpl(
		com.labimo.portlet.tincan.model.Oauth2Endpoint oauth2Endpoint)
		throws SystemException {
		oauth2Endpoint = toUnwrappedModel(oauth2Endpoint);

		boolean isNew = oauth2Endpoint.isNew();

		Session session = null;

		try {
			session = openSession();

			if (oauth2Endpoint.isNew()) {
				session.save(oauth2Endpoint);

				oauth2Endpoint.setNew(false);
			}
			else {
				session.merge(oauth2Endpoint);
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

		EntityCacheUtil.putResult(Oauth2EndpointModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2EndpointImpl.class, oauth2Endpoint.getPrimaryKey(),
			oauth2Endpoint);

		return oauth2Endpoint;
	}

	protected Oauth2Endpoint toUnwrappedModel(Oauth2Endpoint oauth2Endpoint) {
		if (oauth2Endpoint instanceof Oauth2EndpointImpl) {
			return oauth2Endpoint;
		}

		Oauth2EndpointImpl oauth2EndpointImpl = new Oauth2EndpointImpl();

		oauth2EndpointImpl.setNew(oauth2Endpoint.isNew());
		oauth2EndpointImpl.setPrimaryKey(oauth2Endpoint.getPrimaryKey());

		oauth2EndpointImpl.setId(oauth2Endpoint.getId());
		oauth2EndpointImpl.setLiferayUserId(oauth2Endpoint.getLiferayUserId());
		oauth2EndpointImpl.setOauthType(oauth2Endpoint.getOauthType());
		oauth2EndpointImpl.setIsPublic(oauth2Endpoint.isIsPublic());
		oauth2EndpointImpl.setGuestAccess(oauth2Endpoint.isGuestAccess());

		return oauth2EndpointImpl;
	}

	/**
	 * Returns the oauth2 endpoint with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the oauth2 endpoint
	 * @return the oauth2 endpoint
	 * @throws com.labimo.portlet.tincan.NoSuchOauth2EndpointException if a oauth2 endpoint with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Endpoint findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOauth2EndpointException, SystemException {
		Oauth2Endpoint oauth2Endpoint = fetchByPrimaryKey(primaryKey);

		if (oauth2Endpoint == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOauth2EndpointException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oauth2Endpoint;
	}

	/**
	 * Returns the oauth2 endpoint with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchOauth2EndpointException} if it could not be found.
	 *
	 * @param id the primary key of the oauth2 endpoint
	 * @return the oauth2 endpoint
	 * @throws com.labimo.portlet.tincan.NoSuchOauth2EndpointException if a oauth2 endpoint with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Endpoint findByPrimaryKey(long id)
		throws NoSuchOauth2EndpointException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the oauth2 endpoint with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the oauth2 endpoint
	 * @return the oauth2 endpoint, or <code>null</code> if a oauth2 endpoint with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Endpoint fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Oauth2Endpoint oauth2Endpoint = (Oauth2Endpoint)EntityCacheUtil.getResult(Oauth2EndpointModelImpl.ENTITY_CACHE_ENABLED,
				Oauth2EndpointImpl.class, primaryKey);

		if (oauth2Endpoint == _nullOauth2Endpoint) {
			return null;
		}

		if (oauth2Endpoint == null) {
			Session session = null;

			try {
				session = openSession();

				oauth2Endpoint = (Oauth2Endpoint)session.get(Oauth2EndpointImpl.class,
						primaryKey);

				if (oauth2Endpoint != null) {
					cacheResult(oauth2Endpoint);
				}
				else {
					EntityCacheUtil.putResult(Oauth2EndpointModelImpl.ENTITY_CACHE_ENABLED,
						Oauth2EndpointImpl.class, primaryKey,
						_nullOauth2Endpoint);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(Oauth2EndpointModelImpl.ENTITY_CACHE_ENABLED,
					Oauth2EndpointImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oauth2Endpoint;
	}

	/**
	 * Returns the oauth2 endpoint with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the oauth2 endpoint
	 * @return the oauth2 endpoint, or <code>null</code> if a oauth2 endpoint with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Endpoint fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the oauth2 endpoints.
	 *
	 * @return the oauth2 endpoints
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Oauth2Endpoint> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the oauth2 endpoints.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2EndpointModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oauth2 endpoints
	 * @param end the upper bound of the range of oauth2 endpoints (not inclusive)
	 * @return the range of oauth2 endpoints
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Oauth2Endpoint> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the oauth2 endpoints.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2EndpointModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oauth2 endpoints
	 * @param end the upper bound of the range of oauth2 endpoints (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of oauth2 endpoints
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Oauth2Endpoint> findAll(int start, int end,
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

		List<Oauth2Endpoint> list = (List<Oauth2Endpoint>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OAUTH2ENDPOINT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OAUTH2ENDPOINT;

				if (pagination) {
					sql = sql.concat(Oauth2EndpointModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Oauth2Endpoint>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Oauth2Endpoint>(list);
				}
				else {
					list = (List<Oauth2Endpoint>)QueryUtil.list(q,
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
	 * Removes all the oauth2 endpoints from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Oauth2Endpoint oauth2Endpoint : findAll()) {
			remove(oauth2Endpoint);
		}
	}

	/**
	 * Returns the number of oauth2 endpoints.
	 *
	 * @return the number of oauth2 endpoints
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

				Query q = session.createQuery(_SQL_COUNT_OAUTH2ENDPOINT);

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
	 * Initializes the oauth2 endpoint persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.Oauth2Endpoint")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Oauth2Endpoint>> listenersList = new ArrayList<ModelListener<Oauth2Endpoint>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Oauth2Endpoint>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(Oauth2EndpointImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OAUTH2ENDPOINT = "SELECT oauth2Endpoint FROM Oauth2Endpoint oauth2Endpoint";
	private static final String _SQL_COUNT_OAUTH2ENDPOINT = "SELECT COUNT(oauth2Endpoint) FROM Oauth2Endpoint oauth2Endpoint";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oauth2Endpoint.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Oauth2Endpoint exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(Oauth2EndpointPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static Oauth2Endpoint _nullOauth2Endpoint = new Oauth2EndpointImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Oauth2Endpoint> toCacheModel() {
				return _nullOauth2EndpointCacheModel;
			}
		};

	private static CacheModel<Oauth2Endpoint> _nullOauth2EndpointCacheModel = new CacheModel<Oauth2Endpoint>() {
			@Override
			public Oauth2Endpoint toEntityModel() {
				return _nullOauth2Endpoint;
			}
		};
}
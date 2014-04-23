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

import com.labimo.portlet.tincan.NoSuchOauth2ClientException;
import com.labimo.portlet.tincan.model.Oauth2Client;
import com.labimo.portlet.tincan.model.impl.Oauth2ClientImpl;
import com.labimo.portlet.tincan.model.impl.Oauth2ClientModelImpl;

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
 * The persistence implementation for the oauth2 client service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see Oauth2ClientPersistence
 * @see Oauth2ClientUtil
 * @generated
 */
public class Oauth2ClientPersistenceImpl extends BasePersistenceImpl<Oauth2Client>
	implements Oauth2ClientPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Oauth2ClientUtil} to access the oauth2 client persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Oauth2ClientImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Oauth2ClientModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2ClientModelImpl.FINDER_CACHE_ENABLED, Oauth2ClientImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Oauth2ClientModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2ClientModelImpl.FINDER_CACHE_ENABLED, Oauth2ClientImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Oauth2ClientModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2ClientModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public Oauth2ClientPersistenceImpl() {
		setModelClass(Oauth2Client.class);
	}

	/**
	 * Caches the oauth2 client in the entity cache if it is enabled.
	 *
	 * @param oauth2Client the oauth2 client
	 */
	@Override
	public void cacheResult(Oauth2Client oauth2Client) {
		EntityCacheUtil.putResult(Oauth2ClientModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2ClientImpl.class, oauth2Client.getPrimaryKey(), oauth2Client);

		oauth2Client.resetOriginalValues();
	}

	/**
	 * Caches the oauth2 clients in the entity cache if it is enabled.
	 *
	 * @param oauth2Clients the oauth2 clients
	 */
	@Override
	public void cacheResult(List<Oauth2Client> oauth2Clients) {
		for (Oauth2Client oauth2Client : oauth2Clients) {
			if (EntityCacheUtil.getResult(
						Oauth2ClientModelImpl.ENTITY_CACHE_ENABLED,
						Oauth2ClientImpl.class, oauth2Client.getPrimaryKey()) == null) {
				cacheResult(oauth2Client);
			}
			else {
				oauth2Client.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all oauth2 clients.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(Oauth2ClientImpl.class.getName());
		}

		EntityCacheUtil.clearCache(Oauth2ClientImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the oauth2 client.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Oauth2Client oauth2Client) {
		EntityCacheUtil.removeResult(Oauth2ClientModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2ClientImpl.class, oauth2Client.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Oauth2Client> oauth2Clients) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Oauth2Client oauth2Client : oauth2Clients) {
			EntityCacheUtil.removeResult(Oauth2ClientModelImpl.ENTITY_CACHE_ENABLED,
				Oauth2ClientImpl.class, oauth2Client.getPrimaryKey());
		}
	}

	/**
	 * Creates a new oauth2 client with the primary key. Does not add the oauth2 client to the database.
	 *
	 * @param id the primary key for the new oauth2 client
	 * @return the new oauth2 client
	 */
	@Override
	public Oauth2Client create(String id) {
		Oauth2Client oauth2Client = new Oauth2ClientImpl();

		oauth2Client.setNew(true);
		oauth2Client.setPrimaryKey(id);

		return oauth2Client;
	}

	/**
	 * Removes the oauth2 client with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the oauth2 client
	 * @return the oauth2 client that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchOauth2ClientException if a oauth2 client with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Client remove(String id)
		throws NoSuchOauth2ClientException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the oauth2 client with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the oauth2 client
	 * @return the oauth2 client that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchOauth2ClientException if a oauth2 client with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Client remove(Serializable primaryKey)
		throws NoSuchOauth2ClientException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Oauth2Client oauth2Client = (Oauth2Client)session.get(Oauth2ClientImpl.class,
					primaryKey);

			if (oauth2Client == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOauth2ClientException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oauth2Client);
		}
		catch (NoSuchOauth2ClientException nsee) {
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
	protected Oauth2Client removeImpl(Oauth2Client oauth2Client)
		throws SystemException {
		oauth2Client = toUnwrappedModel(oauth2Client);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oauth2Client)) {
				oauth2Client = (Oauth2Client)session.get(Oauth2ClientImpl.class,
						oauth2Client.getPrimaryKeyObj());
			}

			if (oauth2Client != null) {
				session.delete(oauth2Client);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oauth2Client != null) {
			clearCache(oauth2Client);
		}

		return oauth2Client;
	}

	@Override
	public Oauth2Client updateImpl(
		com.labimo.portlet.tincan.model.Oauth2Client oauth2Client)
		throws SystemException {
		oauth2Client = toUnwrappedModel(oauth2Client);

		boolean isNew = oauth2Client.isNew();

		Session session = null;

		try {
			session = openSession();

			if (oauth2Client.isNew()) {
				session.save(oauth2Client);

				oauth2Client.setNew(false);
			}
			else {
				session.merge(oauth2Client);
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

		EntityCacheUtil.putResult(Oauth2ClientModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2ClientImpl.class, oauth2Client.getPrimaryKey(), oauth2Client);

		return oauth2Client;
	}

	protected Oauth2Client toUnwrappedModel(Oauth2Client oauth2Client) {
		if (oauth2Client instanceof Oauth2ClientImpl) {
			return oauth2Client;
		}

		Oauth2ClientImpl oauth2ClientImpl = new Oauth2ClientImpl();

		oauth2ClientImpl.setNew(oauth2Client.isNew());
		oauth2ClientImpl.setPrimaryKey(oauth2Client.getPrimaryKey());

		oauth2ClientImpl.setId(oauth2Client.getId());
		oauth2ClientImpl.setName(oauth2Client.getName());
		oauth2ClientImpl.setDescription(oauth2Client.getDescription());
		oauth2ClientImpl.setSecret(oauth2Client.getSecret());
		oauth2ClientImpl.setUrl(oauth2Client.getUrl());
		oauth2ClientImpl.setRedirectUrl(oauth2Client.getRedirectUrl());
		oauth2ClientImpl.setScope(oauth2Client.getScope());
		oauth2ClientImpl.setIconUrl(oauth2Client.getIconUrl());
		oauth2ClientImpl.setLiferayUserId(oauth2Client.getLiferayUserId());

		return oauth2ClientImpl;
	}

	/**
	 * Returns the oauth2 client with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the oauth2 client
	 * @return the oauth2 client
	 * @throws com.labimo.portlet.tincan.NoSuchOauth2ClientException if a oauth2 client with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Client findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOauth2ClientException, SystemException {
		Oauth2Client oauth2Client = fetchByPrimaryKey(primaryKey);

		if (oauth2Client == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOauth2ClientException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oauth2Client;
	}

	/**
	 * Returns the oauth2 client with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchOauth2ClientException} if it could not be found.
	 *
	 * @param id the primary key of the oauth2 client
	 * @return the oauth2 client
	 * @throws com.labimo.portlet.tincan.NoSuchOauth2ClientException if a oauth2 client with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Client findByPrimaryKey(String id)
		throws NoSuchOauth2ClientException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the oauth2 client with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the oauth2 client
	 * @return the oauth2 client, or <code>null</code> if a oauth2 client with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Client fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Oauth2Client oauth2Client = (Oauth2Client)EntityCacheUtil.getResult(Oauth2ClientModelImpl.ENTITY_CACHE_ENABLED,
				Oauth2ClientImpl.class, primaryKey);

		if (oauth2Client == _nullOauth2Client) {
			return null;
		}

		if (oauth2Client == null) {
			Session session = null;

			try {
				session = openSession();

				oauth2Client = (Oauth2Client)session.get(Oauth2ClientImpl.class,
						primaryKey);

				if (oauth2Client != null) {
					cacheResult(oauth2Client);
				}
				else {
					EntityCacheUtil.putResult(Oauth2ClientModelImpl.ENTITY_CACHE_ENABLED,
						Oauth2ClientImpl.class, primaryKey, _nullOauth2Client);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(Oauth2ClientModelImpl.ENTITY_CACHE_ENABLED,
					Oauth2ClientImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oauth2Client;
	}

	/**
	 * Returns the oauth2 client with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the oauth2 client
	 * @return the oauth2 client, or <code>null</code> if a oauth2 client with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Client fetchByPrimaryKey(String id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the oauth2 clients.
	 *
	 * @return the oauth2 clients
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Oauth2Client> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the oauth2 clients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2ClientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oauth2 clients
	 * @param end the upper bound of the range of oauth2 clients (not inclusive)
	 * @return the range of oauth2 clients
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Oauth2Client> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the oauth2 clients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2ClientModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oauth2 clients
	 * @param end the upper bound of the range of oauth2 clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of oauth2 clients
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Oauth2Client> findAll(int start, int end,
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

		List<Oauth2Client> list = (List<Oauth2Client>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OAUTH2CLIENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OAUTH2CLIENT;

				if (pagination) {
					sql = sql.concat(Oauth2ClientModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Oauth2Client>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Oauth2Client>(list);
				}
				else {
					list = (List<Oauth2Client>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the oauth2 clients from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Oauth2Client oauth2Client : findAll()) {
			remove(oauth2Client);
		}
	}

	/**
	 * Returns the number of oauth2 clients.
	 *
	 * @return the number of oauth2 clients
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

				Query q = session.createQuery(_SQL_COUNT_OAUTH2CLIENT);

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
	 * Initializes the oauth2 client persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.Oauth2Client")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Oauth2Client>> listenersList = new ArrayList<ModelListener<Oauth2Client>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Oauth2Client>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(Oauth2ClientImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OAUTH2CLIENT = "SELECT oauth2Client FROM Oauth2Client oauth2Client";
	private static final String _SQL_COUNT_OAUTH2CLIENT = "SELECT COUNT(oauth2Client) FROM Oauth2Client oauth2Client";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oauth2Client.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Oauth2Client exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(Oauth2ClientPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static Oauth2Client _nullOauth2Client = new Oauth2ClientImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Oauth2Client> toCacheModel() {
				return _nullOauth2ClientCacheModel;
			}
		};

	private static CacheModel<Oauth2Client> _nullOauth2ClientCacheModel = new CacheModel<Oauth2Client>() {
			@Override
			public Oauth2Client toEntityModel() {
				return _nullOauth2Client;
			}
		};
}
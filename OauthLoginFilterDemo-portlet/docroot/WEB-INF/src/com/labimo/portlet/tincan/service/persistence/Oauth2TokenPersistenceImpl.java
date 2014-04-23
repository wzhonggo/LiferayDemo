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

import com.labimo.portlet.tincan.NoSuchOauth2TokenException;
import com.labimo.portlet.tincan.model.Oauth2Token;
import com.labimo.portlet.tincan.model.impl.Oauth2TokenImpl;
import com.labimo.portlet.tincan.model.impl.Oauth2TokenModelImpl;

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
 * The persistence implementation for the oauth2 token service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see Oauth2TokenPersistence
 * @see Oauth2TokenUtil
 * @generated
 */
public class Oauth2TokenPersistenceImpl extends BasePersistenceImpl<Oauth2Token>
	implements Oauth2TokenPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Oauth2TokenUtil} to access the oauth2 token persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Oauth2TokenImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Oauth2TokenModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2TokenModelImpl.FINDER_CACHE_ENABLED, Oauth2TokenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Oauth2TokenModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2TokenModelImpl.FINDER_CACHE_ENABLED, Oauth2TokenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Oauth2TokenModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2TokenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public Oauth2TokenPersistenceImpl() {
		setModelClass(Oauth2Token.class);
	}

	/**
	 * Caches the oauth2 token in the entity cache if it is enabled.
	 *
	 * @param oauth2Token the oauth2 token
	 */
	@Override
	public void cacheResult(Oauth2Token oauth2Token) {
		EntityCacheUtil.putResult(Oauth2TokenModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2TokenImpl.class, oauth2Token.getPrimaryKey(), oauth2Token);

		oauth2Token.resetOriginalValues();
	}

	/**
	 * Caches the oauth2 tokens in the entity cache if it is enabled.
	 *
	 * @param oauth2Tokens the oauth2 tokens
	 */
	@Override
	public void cacheResult(List<Oauth2Token> oauth2Tokens) {
		for (Oauth2Token oauth2Token : oauth2Tokens) {
			if (EntityCacheUtil.getResult(
						Oauth2TokenModelImpl.ENTITY_CACHE_ENABLED,
						Oauth2TokenImpl.class, oauth2Token.getPrimaryKey()) == null) {
				cacheResult(oauth2Token);
			}
			else {
				oauth2Token.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all oauth2 tokens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(Oauth2TokenImpl.class.getName());
		}

		EntityCacheUtil.clearCache(Oauth2TokenImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the oauth2 token.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Oauth2Token oauth2Token) {
		EntityCacheUtil.removeResult(Oauth2TokenModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2TokenImpl.class, oauth2Token.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Oauth2Token> oauth2Tokens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Oauth2Token oauth2Token : oauth2Tokens) {
			EntityCacheUtil.removeResult(Oauth2TokenModelImpl.ENTITY_CACHE_ENABLED,
				Oauth2TokenImpl.class, oauth2Token.getPrimaryKey());
		}
	}

	/**
	 * Creates a new oauth2 token with the primary key. Does not add the oauth2 token to the database.
	 *
	 * @param id the primary key for the new oauth2 token
	 * @return the new oauth2 token
	 */
	@Override
	public Oauth2Token create(long id) {
		Oauth2Token oauth2Token = new Oauth2TokenImpl();

		oauth2Token.setNew(true);
		oauth2Token.setPrimaryKey(id);

		return oauth2Token;
	}

	/**
	 * Removes the oauth2 token with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the oauth2 token
	 * @return the oauth2 token that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchOauth2TokenException if a oauth2 token with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Token remove(long id)
		throws NoSuchOauth2TokenException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the oauth2 token with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the oauth2 token
	 * @return the oauth2 token that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchOauth2TokenException if a oauth2 token with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Token remove(Serializable primaryKey)
		throws NoSuchOauth2TokenException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Oauth2Token oauth2Token = (Oauth2Token)session.get(Oauth2TokenImpl.class,
					primaryKey);

			if (oauth2Token == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOauth2TokenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oauth2Token);
		}
		catch (NoSuchOauth2TokenException nsee) {
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
	protected Oauth2Token removeImpl(Oauth2Token oauth2Token)
		throws SystemException {
		oauth2Token = toUnwrappedModel(oauth2Token);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oauth2Token)) {
				oauth2Token = (Oauth2Token)session.get(Oauth2TokenImpl.class,
						oauth2Token.getPrimaryKeyObj());
			}

			if (oauth2Token != null) {
				session.delete(oauth2Token);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oauth2Token != null) {
			clearCache(oauth2Token);
		}

		return oauth2Token;
	}

	@Override
	public Oauth2Token updateImpl(
		com.labimo.portlet.tincan.model.Oauth2Token oauth2Token)
		throws SystemException {
		oauth2Token = toUnwrappedModel(oauth2Token);

		boolean isNew = oauth2Token.isNew();

		Session session = null;

		try {
			session = openSession();

			if (oauth2Token.isNew()) {
				session.save(oauth2Token);

				oauth2Token.setNew(false);
			}
			else {
				session.merge(oauth2Token);
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

		EntityCacheUtil.putResult(Oauth2TokenModelImpl.ENTITY_CACHE_ENABLED,
			Oauth2TokenImpl.class, oauth2Token.getPrimaryKey(), oauth2Token);

		return oauth2Token;
	}

	protected Oauth2Token toUnwrappedModel(Oauth2Token oauth2Token) {
		if (oauth2Token instanceof Oauth2TokenImpl) {
			return oauth2Token;
		}

		Oauth2TokenImpl oauth2TokenImpl = new Oauth2TokenImpl();

		oauth2TokenImpl.setNew(oauth2Token.isNew());
		oauth2TokenImpl.setPrimaryKey(oauth2Token.getPrimaryKey());

		oauth2TokenImpl.setId(oauth2Token.getId());
		oauth2TokenImpl.setCode(oauth2Token.getCode());
		oauth2TokenImpl.setToken(oauth2Token.getToken());
		oauth2TokenImpl.setRefreshToken(oauth2Token.getRefreshToken());
		oauth2TokenImpl.setClientId(oauth2Token.getClientId());
		oauth2TokenImpl.setExpiredIn(oauth2Token.getExpiredIn());
		oauth2TokenImpl.setLiferayUserId(oauth2Token.getLiferayUserId());

		return oauth2TokenImpl;
	}

	/**
	 * Returns the oauth2 token with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the oauth2 token
	 * @return the oauth2 token
	 * @throws com.labimo.portlet.tincan.NoSuchOauth2TokenException if a oauth2 token with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Token findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOauth2TokenException, SystemException {
		Oauth2Token oauth2Token = fetchByPrimaryKey(primaryKey);

		if (oauth2Token == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOauth2TokenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oauth2Token;
	}

	/**
	 * Returns the oauth2 token with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchOauth2TokenException} if it could not be found.
	 *
	 * @param id the primary key of the oauth2 token
	 * @return the oauth2 token
	 * @throws com.labimo.portlet.tincan.NoSuchOauth2TokenException if a oauth2 token with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Token findByPrimaryKey(long id)
		throws NoSuchOauth2TokenException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the oauth2 token with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the oauth2 token
	 * @return the oauth2 token, or <code>null</code> if a oauth2 token with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Token fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Oauth2Token oauth2Token = (Oauth2Token)EntityCacheUtil.getResult(Oauth2TokenModelImpl.ENTITY_CACHE_ENABLED,
				Oauth2TokenImpl.class, primaryKey);

		if (oauth2Token == _nullOauth2Token) {
			return null;
		}

		if (oauth2Token == null) {
			Session session = null;

			try {
				session = openSession();

				oauth2Token = (Oauth2Token)session.get(Oauth2TokenImpl.class,
						primaryKey);

				if (oauth2Token != null) {
					cacheResult(oauth2Token);
				}
				else {
					EntityCacheUtil.putResult(Oauth2TokenModelImpl.ENTITY_CACHE_ENABLED,
						Oauth2TokenImpl.class, primaryKey, _nullOauth2Token);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(Oauth2TokenModelImpl.ENTITY_CACHE_ENABLED,
					Oauth2TokenImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oauth2Token;
	}

	/**
	 * Returns the oauth2 token with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the oauth2 token
	 * @return the oauth2 token, or <code>null</code> if a oauth2 token with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Oauth2Token fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the oauth2 tokens.
	 *
	 * @return the oauth2 tokens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Oauth2Token> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the oauth2 tokens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2TokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oauth2 tokens
	 * @param end the upper bound of the range of oauth2 tokens (not inclusive)
	 * @return the range of oauth2 tokens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Oauth2Token> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the oauth2 tokens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.Oauth2TokenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of oauth2 tokens
	 * @param end the upper bound of the range of oauth2 tokens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of oauth2 tokens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Oauth2Token> findAll(int start, int end,
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

		List<Oauth2Token> list = (List<Oauth2Token>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OAUTH2TOKEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OAUTH2TOKEN;

				if (pagination) {
					sql = sql.concat(Oauth2TokenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Oauth2Token>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Oauth2Token>(list);
				}
				else {
					list = (List<Oauth2Token>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the oauth2 tokens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Oauth2Token oauth2Token : findAll()) {
			remove(oauth2Token);
		}
	}

	/**
	 * Returns the number of oauth2 tokens.
	 *
	 * @return the number of oauth2 tokens
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

				Query q = session.createQuery(_SQL_COUNT_OAUTH2TOKEN);

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
	 * Initializes the oauth2 token persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.Oauth2Token")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Oauth2Token>> listenersList = new ArrayList<ModelListener<Oauth2Token>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Oauth2Token>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(Oauth2TokenImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OAUTH2TOKEN = "SELECT oauth2Token FROM Oauth2Token oauth2Token";
	private static final String _SQL_COUNT_OAUTH2TOKEN = "SELECT COUNT(oauth2Token) FROM Oauth2Token oauth2Token";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oauth2Token.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Oauth2Token exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(Oauth2TokenPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "code"
			});
	private static Oauth2Token _nullOauth2Token = new Oauth2TokenImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Oauth2Token> toCacheModel() {
				return _nullOauth2TokenCacheModel;
			}
		};

	private static CacheModel<Oauth2Token> _nullOauth2TokenCacheModel = new CacheModel<Oauth2Token>() {
			@Override
			public Oauth2Token toEntityModel() {
				return _nullOauth2Token;
			}
		};
}
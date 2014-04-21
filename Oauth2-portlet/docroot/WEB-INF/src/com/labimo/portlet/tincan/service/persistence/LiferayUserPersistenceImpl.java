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

import com.labimo.portlet.tincan.NoSuchLiferayUserException;
import com.labimo.portlet.tincan.model.LiferayUser;
import com.labimo.portlet.tincan.model.impl.LiferayUserImpl;
import com.labimo.portlet.tincan.model.impl.LiferayUserModelImpl;

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
 * The persistence implementation for the liferay user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see LiferayUserPersistence
 * @see LiferayUserUtil
 * @generated
 */
public class LiferayUserPersistenceImpl extends BasePersistenceImpl<LiferayUser>
	implements LiferayUserPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LiferayUserUtil} to access the liferay user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LiferayUserImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LiferayUserModelImpl.ENTITY_CACHE_ENABLED,
			LiferayUserModelImpl.FINDER_CACHE_ENABLED, LiferayUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LiferayUserModelImpl.ENTITY_CACHE_ENABLED,
			LiferayUserModelImpl.FINDER_CACHE_ENABLED, LiferayUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LiferayUserModelImpl.ENTITY_CACHE_ENABLED,
			LiferayUserModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LiferayUserPersistenceImpl() {
		setModelClass(LiferayUser.class);
	}

	/**
	 * Caches the liferay user in the entity cache if it is enabled.
	 *
	 * @param liferayUser the liferay user
	 */
	@Override
	public void cacheResult(LiferayUser liferayUser) {
		EntityCacheUtil.putResult(LiferayUserModelImpl.ENTITY_CACHE_ENABLED,
			LiferayUserImpl.class, liferayUser.getPrimaryKey(), liferayUser);

		liferayUser.resetOriginalValues();
	}

	/**
	 * Caches the liferay users in the entity cache if it is enabled.
	 *
	 * @param liferayUsers the liferay users
	 */
	@Override
	public void cacheResult(List<LiferayUser> liferayUsers) {
		for (LiferayUser liferayUser : liferayUsers) {
			if (EntityCacheUtil.getResult(
						LiferayUserModelImpl.ENTITY_CACHE_ENABLED,
						LiferayUserImpl.class, liferayUser.getPrimaryKey()) == null) {
				cacheResult(liferayUser);
			}
			else {
				liferayUser.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all liferay users.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LiferayUserImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LiferayUserImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the liferay user.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LiferayUser liferayUser) {
		EntityCacheUtil.removeResult(LiferayUserModelImpl.ENTITY_CACHE_ENABLED,
			LiferayUserImpl.class, liferayUser.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LiferayUser> liferayUsers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LiferayUser liferayUser : liferayUsers) {
			EntityCacheUtil.removeResult(LiferayUserModelImpl.ENTITY_CACHE_ENABLED,
				LiferayUserImpl.class, liferayUser.getPrimaryKey());
		}
	}

	/**
	 * Creates a new liferay user with the primary key. Does not add the liferay user to the database.
	 *
	 * @param id the primary key for the new liferay user
	 * @return the new liferay user
	 */
	@Override
	public LiferayUser create(long id) {
		LiferayUser liferayUser = new LiferayUserImpl();

		liferayUser.setNew(true);
		liferayUser.setPrimaryKey(id);

		return liferayUser;
	}

	/**
	 * Removes the liferay user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the liferay user
	 * @return the liferay user that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchLiferayUserException if a liferay user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayUser remove(long id)
		throws NoSuchLiferayUserException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the liferay user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the liferay user
	 * @return the liferay user that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchLiferayUserException if a liferay user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayUser remove(Serializable primaryKey)
		throws NoSuchLiferayUserException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LiferayUser liferayUser = (LiferayUser)session.get(LiferayUserImpl.class,
					primaryKey);

			if (liferayUser == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLiferayUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(liferayUser);
		}
		catch (NoSuchLiferayUserException nsee) {
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
	protected LiferayUser removeImpl(LiferayUser liferayUser)
		throws SystemException {
		liferayUser = toUnwrappedModel(liferayUser);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(liferayUser)) {
				liferayUser = (LiferayUser)session.get(LiferayUserImpl.class,
						liferayUser.getPrimaryKeyObj());
			}

			if (liferayUser != null) {
				session.delete(liferayUser);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (liferayUser != null) {
			clearCache(liferayUser);
		}

		return liferayUser;
	}

	@Override
	public LiferayUser updateImpl(
		com.labimo.portlet.tincan.model.LiferayUser liferayUser)
		throws SystemException {
		liferayUser = toUnwrappedModel(liferayUser);

		boolean isNew = liferayUser.isNew();

		Session session = null;

		try {
			session = openSession();

			if (liferayUser.isNew()) {
				session.save(liferayUser);

				liferayUser.setNew(false);
			}
			else {
				session.merge(liferayUser);
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

		EntityCacheUtil.putResult(LiferayUserModelImpl.ENTITY_CACHE_ENABLED,
			LiferayUserImpl.class, liferayUser.getPrimaryKey(), liferayUser);

		return liferayUser;
	}

	protected LiferayUser toUnwrappedModel(LiferayUser liferayUser) {
		if (liferayUser instanceof LiferayUserImpl) {
			return liferayUser;
		}

		LiferayUserImpl liferayUserImpl = new LiferayUserImpl();

		liferayUserImpl.setNew(liferayUser.isNew());
		liferayUserImpl.setPrimaryKey(liferayUser.getPrimaryKey());

		liferayUserImpl.setId(liferayUser.getId());
		liferayUserImpl.setLiferayUserId(liferayUser.getLiferayUserId());
		liferayUserImpl.setName(liferayUser.getName());
		liferayUserImpl.setPreferredAudioLevel(liferayUser.getPreferredAudioLevel());
		liferayUserImpl.setPreferredLanguage(liferayUser.getPreferredLanguage());
		liferayUserImpl.setPreferredDeliverySpeed(liferayUser.getPreferredDeliverySpeed());
		liferayUserImpl.setPreferredAudioCaptioning(liferayUser.getPreferredAudioCaptioning());

		return liferayUserImpl;
	}

	/**
	 * Returns the liferay user with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the liferay user
	 * @return the liferay user
	 * @throws com.labimo.portlet.tincan.NoSuchLiferayUserException if a liferay user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayUser findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLiferayUserException, SystemException {
		LiferayUser liferayUser = fetchByPrimaryKey(primaryKey);

		if (liferayUser == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLiferayUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return liferayUser;
	}

	/**
	 * Returns the liferay user with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchLiferayUserException} if it could not be found.
	 *
	 * @param id the primary key of the liferay user
	 * @return the liferay user
	 * @throws com.labimo.portlet.tincan.NoSuchLiferayUserException if a liferay user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayUser findByPrimaryKey(long id)
		throws NoSuchLiferayUserException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the liferay user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the liferay user
	 * @return the liferay user, or <code>null</code> if a liferay user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayUser fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LiferayUser liferayUser = (LiferayUser)EntityCacheUtil.getResult(LiferayUserModelImpl.ENTITY_CACHE_ENABLED,
				LiferayUserImpl.class, primaryKey);

		if (liferayUser == _nullLiferayUser) {
			return null;
		}

		if (liferayUser == null) {
			Session session = null;

			try {
				session = openSession();

				liferayUser = (LiferayUser)session.get(LiferayUserImpl.class,
						primaryKey);

				if (liferayUser != null) {
					cacheResult(liferayUser);
				}
				else {
					EntityCacheUtil.putResult(LiferayUserModelImpl.ENTITY_CACHE_ENABLED,
						LiferayUserImpl.class, primaryKey, _nullLiferayUser);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LiferayUserModelImpl.ENTITY_CACHE_ENABLED,
					LiferayUserImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return liferayUser;
	}

	/**
	 * Returns the liferay user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the liferay user
	 * @return the liferay user, or <code>null</code> if a liferay user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayUser fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the liferay users.
	 *
	 * @return the liferay users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LiferayUser> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the liferay users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.LiferayUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of liferay users
	 * @param end the upper bound of the range of liferay users (not inclusive)
	 * @return the range of liferay users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LiferayUser> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the liferay users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.LiferayUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of liferay users
	 * @param end the upper bound of the range of liferay users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of liferay users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LiferayUser> findAll(int start, int end,
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

		List<LiferayUser> list = (List<LiferayUser>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LIFERAYUSER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LIFERAYUSER;

				if (pagination) {
					sql = sql.concat(LiferayUserModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LiferayUser>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LiferayUser>(list);
				}
				else {
					list = (List<LiferayUser>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the liferay users from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LiferayUser liferayUser : findAll()) {
			remove(liferayUser);
		}
	}

	/**
	 * Returns the number of liferay users.
	 *
	 * @return the number of liferay users
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

				Query q = session.createQuery(_SQL_COUNT_LIFERAYUSER);

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
	 * Initializes the liferay user persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.LiferayUser")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LiferayUser>> listenersList = new ArrayList<ModelListener<LiferayUser>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LiferayUser>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LiferayUserImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LIFERAYUSER = "SELECT liferayUser FROM LiferayUser liferayUser";
	private static final String _SQL_COUNT_LIFERAYUSER = "SELECT COUNT(liferayUser) FROM LiferayUser liferayUser";
	private static final String _ORDER_BY_ENTITY_ALIAS = "liferayUser.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LiferayUser exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LiferayUserPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static LiferayUser _nullLiferayUser = new LiferayUserImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LiferayUser> toCacheModel() {
				return _nullLiferayUserCacheModel;
			}
		};

	private static CacheModel<LiferayUser> _nullLiferayUserCacheModel = new CacheModel<LiferayUser>() {
			@Override
			public LiferayUser toEntityModel() {
				return _nullLiferayUser;
			}
		};
}
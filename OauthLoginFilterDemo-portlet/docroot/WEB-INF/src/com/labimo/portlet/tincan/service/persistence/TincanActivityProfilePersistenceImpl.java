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

import com.labimo.portlet.tincan.NoSuchTincanActivityProfileException;
import com.labimo.portlet.tincan.model.TincanActivityProfile;
import com.labimo.portlet.tincan.model.impl.TincanActivityProfileImpl;
import com.labimo.portlet.tincan.model.impl.TincanActivityProfileModelImpl;

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
 * The persistence implementation for the tincan activity profile service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanActivityProfilePersistence
 * @see TincanActivityProfileUtil
 * @generated
 */
public class TincanActivityProfilePersistenceImpl extends BasePersistenceImpl<TincanActivityProfile>
	implements TincanActivityProfilePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TincanActivityProfileUtil} to access the tincan activity profile persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TincanActivityProfileImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TincanActivityProfileModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityProfileModelImpl.FINDER_CACHE_ENABLED,
			TincanActivityProfileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TincanActivityProfileModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityProfileModelImpl.FINDER_CACHE_ENABLED,
			TincanActivityProfileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TincanActivityProfileModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityProfileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TincanActivityProfilePersistenceImpl() {
		setModelClass(TincanActivityProfile.class);
	}

	/**
	 * Caches the tincan activity profile in the entity cache if it is enabled.
	 *
	 * @param tincanActivityProfile the tincan activity profile
	 */
	@Override
	public void cacheResult(TincanActivityProfile tincanActivityProfile) {
		EntityCacheUtil.putResult(TincanActivityProfileModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityProfileImpl.class,
			tincanActivityProfile.getPrimaryKey(), tincanActivityProfile);

		tincanActivityProfile.resetOriginalValues();
	}

	/**
	 * Caches the tincan activity profiles in the entity cache if it is enabled.
	 *
	 * @param tincanActivityProfiles the tincan activity profiles
	 */
	@Override
	public void cacheResult(List<TincanActivityProfile> tincanActivityProfiles) {
		for (TincanActivityProfile tincanActivityProfile : tincanActivityProfiles) {
			if (EntityCacheUtil.getResult(
						TincanActivityProfileModelImpl.ENTITY_CACHE_ENABLED,
						TincanActivityProfileImpl.class,
						tincanActivityProfile.getPrimaryKey()) == null) {
				cacheResult(tincanActivityProfile);
			}
			else {
				tincanActivityProfile.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tincan activity profiles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TincanActivityProfileImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TincanActivityProfileImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tincan activity profile.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TincanActivityProfile tincanActivityProfile) {
		EntityCacheUtil.removeResult(TincanActivityProfileModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityProfileImpl.class,
			tincanActivityProfile.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TincanActivityProfile> tincanActivityProfiles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TincanActivityProfile tincanActivityProfile : tincanActivityProfiles) {
			EntityCacheUtil.removeResult(TincanActivityProfileModelImpl.ENTITY_CACHE_ENABLED,
				TincanActivityProfileImpl.class,
				tincanActivityProfile.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tincan activity profile with the primary key. Does not add the tincan activity profile to the database.
	 *
	 * @param id the primary key for the new tincan activity profile
	 * @return the new tincan activity profile
	 */
	@Override
	public TincanActivityProfile create(long id) {
		TincanActivityProfile tincanActivityProfile = new TincanActivityProfileImpl();

		tincanActivityProfile.setNew(true);
		tincanActivityProfile.setPrimaryKey(id);

		return tincanActivityProfile;
	}

	/**
	 * Removes the tincan activity profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tincan activity profile
	 * @return the tincan activity profile that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanActivityProfileException if a tincan activity profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivityProfile remove(long id)
		throws NoSuchTincanActivityProfileException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tincan activity profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tincan activity profile
	 * @return the tincan activity profile that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanActivityProfileException if a tincan activity profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivityProfile remove(Serializable primaryKey)
		throws NoSuchTincanActivityProfileException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TincanActivityProfile tincanActivityProfile = (TincanActivityProfile)session.get(TincanActivityProfileImpl.class,
					primaryKey);

			if (tincanActivityProfile == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTincanActivityProfileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tincanActivityProfile);
		}
		catch (NoSuchTincanActivityProfileException nsee) {
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
	protected TincanActivityProfile removeImpl(
		TincanActivityProfile tincanActivityProfile) throws SystemException {
		tincanActivityProfile = toUnwrappedModel(tincanActivityProfile);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tincanActivityProfile)) {
				tincanActivityProfile = (TincanActivityProfile)session.get(TincanActivityProfileImpl.class,
						tincanActivityProfile.getPrimaryKeyObj());
			}

			if (tincanActivityProfile != null) {
				session.delete(tincanActivityProfile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tincanActivityProfile != null) {
			clearCache(tincanActivityProfile);
		}

		return tincanActivityProfile;
	}

	@Override
	public TincanActivityProfile updateImpl(
		com.labimo.portlet.tincan.model.TincanActivityProfile tincanActivityProfile)
		throws SystemException {
		tincanActivityProfile = toUnwrappedModel(tincanActivityProfile);

		boolean isNew = tincanActivityProfile.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tincanActivityProfile.isNew()) {
				session.save(tincanActivityProfile);

				tincanActivityProfile.setNew(false);
			}
			else {
				session.merge(tincanActivityProfile);
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

		EntityCacheUtil.putResult(TincanActivityProfileModelImpl.ENTITY_CACHE_ENABLED,
			TincanActivityProfileImpl.class,
			tincanActivityProfile.getPrimaryKey(), tincanActivityProfile);

		return tincanActivityProfile;
	}

	protected TincanActivityProfile toUnwrappedModel(
		TincanActivityProfile tincanActivityProfile) {
		if (tincanActivityProfile instanceof TincanActivityProfileImpl) {
			return tincanActivityProfile;
		}

		TincanActivityProfileImpl tincanActivityProfileImpl = new TincanActivityProfileImpl();

		tincanActivityProfileImpl.setNew(tincanActivityProfile.isNew());
		tincanActivityProfileImpl.setPrimaryKey(tincanActivityProfile.getPrimaryKey());

		tincanActivityProfileImpl.setId(tincanActivityProfile.getId());
		tincanActivityProfileImpl.setProfileId(tincanActivityProfile.getProfileId());
		tincanActivityProfileImpl.setActivityId(tincanActivityProfile.getActivityId());
		tincanActivityProfileImpl.setJsonProfile(tincanActivityProfile.getJsonProfile());
		tincanActivityProfileImpl.setProfile(tincanActivityProfile.getProfile());
		tincanActivityProfileImpl.setUpdated(tincanActivityProfile.getUpdated());
		tincanActivityProfileImpl.setContent_type(tincanActivityProfile.getContent_type());
		tincanActivityProfileImpl.setEtag(tincanActivityProfile.getEtag());

		return tincanActivityProfileImpl;
	}

	/**
	 * Returns the tincan activity profile with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan activity profile
	 * @return the tincan activity profile
	 * @throws com.labimo.portlet.tincan.NoSuchTincanActivityProfileException if a tincan activity profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivityProfile findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTincanActivityProfileException, SystemException {
		TincanActivityProfile tincanActivityProfile = fetchByPrimaryKey(primaryKey);

		if (tincanActivityProfile == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTincanActivityProfileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tincanActivityProfile;
	}

	/**
	 * Returns the tincan activity profile with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanActivityProfileException} if it could not be found.
	 *
	 * @param id the primary key of the tincan activity profile
	 * @return the tincan activity profile
	 * @throws com.labimo.portlet.tincan.NoSuchTincanActivityProfileException if a tincan activity profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivityProfile findByPrimaryKey(long id)
		throws NoSuchTincanActivityProfileException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tincan activity profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan activity profile
	 * @return the tincan activity profile, or <code>null</code> if a tincan activity profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivityProfile fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TincanActivityProfile tincanActivityProfile = (TincanActivityProfile)EntityCacheUtil.getResult(TincanActivityProfileModelImpl.ENTITY_CACHE_ENABLED,
				TincanActivityProfileImpl.class, primaryKey);

		if (tincanActivityProfile == _nullTincanActivityProfile) {
			return null;
		}

		if (tincanActivityProfile == null) {
			Session session = null;

			try {
				session = openSession();

				tincanActivityProfile = (TincanActivityProfile)session.get(TincanActivityProfileImpl.class,
						primaryKey);

				if (tincanActivityProfile != null) {
					cacheResult(tincanActivityProfile);
				}
				else {
					EntityCacheUtil.putResult(TincanActivityProfileModelImpl.ENTITY_CACHE_ENABLED,
						TincanActivityProfileImpl.class, primaryKey,
						_nullTincanActivityProfile);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TincanActivityProfileModelImpl.ENTITY_CACHE_ENABLED,
					TincanActivityProfileImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tincanActivityProfile;
	}

	/**
	 * Returns the tincan activity profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tincan activity profile
	 * @return the tincan activity profile, or <code>null</code> if a tincan activity profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanActivityProfile fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tincan activity profiles.
	 *
	 * @return the tincan activity profiles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanActivityProfile> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tincan activity profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanActivityProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan activity profiles
	 * @param end the upper bound of the range of tincan activity profiles (not inclusive)
	 * @return the range of tincan activity profiles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanActivityProfile> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tincan activity profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanActivityProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan activity profiles
	 * @param end the upper bound of the range of tincan activity profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tincan activity profiles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanActivityProfile> findAll(int start, int end,
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

		List<TincanActivityProfile> list = (List<TincanActivityProfile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TINCANACTIVITYPROFILE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TINCANACTIVITYPROFILE;

				if (pagination) {
					sql = sql.concat(TincanActivityProfileModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TincanActivityProfile>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TincanActivityProfile>(list);
				}
				else {
					list = (List<TincanActivityProfile>)QueryUtil.list(q,
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
	 * Removes all the tincan activity profiles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TincanActivityProfile tincanActivityProfile : findAll()) {
			remove(tincanActivityProfile);
		}
	}

	/**
	 * Returns the number of tincan activity profiles.
	 *
	 * @return the number of tincan activity profiles
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

				Query q = session.createQuery(_SQL_COUNT_TINCANACTIVITYPROFILE);

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
	 * Initializes the tincan activity profile persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.TincanActivityProfile")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TincanActivityProfile>> listenersList = new ArrayList<ModelListener<TincanActivityProfile>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TincanActivityProfile>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TincanActivityProfileImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TINCANACTIVITYPROFILE = "SELECT tincanActivityProfile FROM TincanActivityProfile tincanActivityProfile";
	private static final String _SQL_COUNT_TINCANACTIVITYPROFILE = "SELECT COUNT(tincanActivityProfile) FROM TincanActivityProfile tincanActivityProfile";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tincanActivityProfile.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TincanActivityProfile exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TincanActivityProfilePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static TincanActivityProfile _nullTincanActivityProfile = new TincanActivityProfileImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TincanActivityProfile> toCacheModel() {
				return _nullTincanActivityProfileCacheModel;
			}
		};

	private static CacheModel<TincanActivityProfile> _nullTincanActivityProfileCacheModel =
		new CacheModel<TincanActivityProfile>() {
			@Override
			public TincanActivityProfile toEntityModel() {
				return _nullTincanActivityProfile;
			}
		};
}
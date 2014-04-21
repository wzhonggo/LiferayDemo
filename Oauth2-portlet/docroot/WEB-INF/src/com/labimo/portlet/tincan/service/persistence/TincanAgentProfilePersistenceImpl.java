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

import com.labimo.portlet.tincan.NoSuchTincanAgentProfileException;
import com.labimo.portlet.tincan.model.TincanAgentProfile;
import com.labimo.portlet.tincan.model.impl.TincanAgentProfileImpl;
import com.labimo.portlet.tincan.model.impl.TincanAgentProfileModelImpl;

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
 * The persistence implementation for the tincan agent profile service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanAgentProfilePersistence
 * @see TincanAgentProfileUtil
 * @generated
 */
public class TincanAgentProfilePersistenceImpl extends BasePersistenceImpl<TincanAgentProfile>
	implements TincanAgentProfilePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TincanAgentProfileUtil} to access the tincan agent profile persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TincanAgentProfileImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TincanAgentProfileModelImpl.ENTITY_CACHE_ENABLED,
			TincanAgentProfileModelImpl.FINDER_CACHE_ENABLED,
			TincanAgentProfileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TincanAgentProfileModelImpl.ENTITY_CACHE_ENABLED,
			TincanAgentProfileModelImpl.FINDER_CACHE_ENABLED,
			TincanAgentProfileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TincanAgentProfileModelImpl.ENTITY_CACHE_ENABLED,
			TincanAgentProfileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TincanAgentProfilePersistenceImpl() {
		setModelClass(TincanAgentProfile.class);
	}

	/**
	 * Caches the tincan agent profile in the entity cache if it is enabled.
	 *
	 * @param tincanAgentProfile the tincan agent profile
	 */
	@Override
	public void cacheResult(TincanAgentProfile tincanAgentProfile) {
		EntityCacheUtil.putResult(TincanAgentProfileModelImpl.ENTITY_CACHE_ENABLED,
			TincanAgentProfileImpl.class, tincanAgentProfile.getPrimaryKey(),
			tincanAgentProfile);

		tincanAgentProfile.resetOriginalValues();
	}

	/**
	 * Caches the tincan agent profiles in the entity cache if it is enabled.
	 *
	 * @param tincanAgentProfiles the tincan agent profiles
	 */
	@Override
	public void cacheResult(List<TincanAgentProfile> tincanAgentProfiles) {
		for (TincanAgentProfile tincanAgentProfile : tincanAgentProfiles) {
			if (EntityCacheUtil.getResult(
						TincanAgentProfileModelImpl.ENTITY_CACHE_ENABLED,
						TincanAgentProfileImpl.class,
						tincanAgentProfile.getPrimaryKey()) == null) {
				cacheResult(tincanAgentProfile);
			}
			else {
				tincanAgentProfile.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tincan agent profiles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TincanAgentProfileImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TincanAgentProfileImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tincan agent profile.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TincanAgentProfile tincanAgentProfile) {
		EntityCacheUtil.removeResult(TincanAgentProfileModelImpl.ENTITY_CACHE_ENABLED,
			TincanAgentProfileImpl.class, tincanAgentProfile.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TincanAgentProfile> tincanAgentProfiles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TincanAgentProfile tincanAgentProfile : tincanAgentProfiles) {
			EntityCacheUtil.removeResult(TincanAgentProfileModelImpl.ENTITY_CACHE_ENABLED,
				TincanAgentProfileImpl.class, tincanAgentProfile.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tincan agent profile with the primary key. Does not add the tincan agent profile to the database.
	 *
	 * @param id the primary key for the new tincan agent profile
	 * @return the new tincan agent profile
	 */
	@Override
	public TincanAgentProfile create(long id) {
		TincanAgentProfile tincanAgentProfile = new TincanAgentProfileImpl();

		tincanAgentProfile.setNew(true);
		tincanAgentProfile.setPrimaryKey(id);

		return tincanAgentProfile;
	}

	/**
	 * Removes the tincan agent profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tincan agent profile
	 * @return the tincan agent profile that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanAgentProfileException if a tincan agent profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAgentProfile remove(long id)
		throws NoSuchTincanAgentProfileException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tincan agent profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tincan agent profile
	 * @return the tincan agent profile that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanAgentProfileException if a tincan agent profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAgentProfile remove(Serializable primaryKey)
		throws NoSuchTincanAgentProfileException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TincanAgentProfile tincanAgentProfile = (TincanAgentProfile)session.get(TincanAgentProfileImpl.class,
					primaryKey);

			if (tincanAgentProfile == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTincanAgentProfileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tincanAgentProfile);
		}
		catch (NoSuchTincanAgentProfileException nsee) {
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
	protected TincanAgentProfile removeImpl(
		TincanAgentProfile tincanAgentProfile) throws SystemException {
		tincanAgentProfile = toUnwrappedModel(tincanAgentProfile);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tincanAgentProfile)) {
				tincanAgentProfile = (TincanAgentProfile)session.get(TincanAgentProfileImpl.class,
						tincanAgentProfile.getPrimaryKeyObj());
			}

			if (tincanAgentProfile != null) {
				session.delete(tincanAgentProfile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tincanAgentProfile != null) {
			clearCache(tincanAgentProfile);
		}

		return tincanAgentProfile;
	}

	@Override
	public TincanAgentProfile updateImpl(
		com.labimo.portlet.tincan.model.TincanAgentProfile tincanAgentProfile)
		throws SystemException {
		tincanAgentProfile = toUnwrappedModel(tincanAgentProfile);

		boolean isNew = tincanAgentProfile.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tincanAgentProfile.isNew()) {
				session.save(tincanAgentProfile);

				tincanAgentProfile.setNew(false);
			}
			else {
				session.merge(tincanAgentProfile);
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

		EntityCacheUtil.putResult(TincanAgentProfileModelImpl.ENTITY_CACHE_ENABLED,
			TincanAgentProfileImpl.class, tincanAgentProfile.getPrimaryKey(),
			tincanAgentProfile);

		return tincanAgentProfile;
	}

	protected TincanAgentProfile toUnwrappedModel(
		TincanAgentProfile tincanAgentProfile) {
		if (tincanAgentProfile instanceof TincanAgentProfileImpl) {
			return tincanAgentProfile;
		}

		TincanAgentProfileImpl tincanAgentProfileImpl = new TincanAgentProfileImpl();

		tincanAgentProfileImpl.setNew(tincanAgentProfile.isNew());
		tincanAgentProfileImpl.setPrimaryKey(tincanAgentProfile.getPrimaryKey());

		tincanAgentProfileImpl.setId(tincanAgentProfile.getId());
		tincanAgentProfileImpl.setProfileId(tincanAgentProfile.getProfileId());
		tincanAgentProfileImpl.setUpdated(tincanAgentProfile.getUpdated());
		tincanAgentProfileImpl.setAgentId(tincanAgentProfile.getAgentId());
		tincanAgentProfileImpl.setProfile(tincanAgentProfile.getProfile());
		tincanAgentProfileImpl.setJson_profile(tincanAgentProfile.getJson_profile());
		tincanAgentProfileImpl.setContent_type(tincanAgentProfile.getContent_type());
		tincanAgentProfileImpl.setEtag(tincanAgentProfile.getEtag());

		return tincanAgentProfileImpl;
	}

	/**
	 * Returns the tincan agent profile with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan agent profile
	 * @return the tincan agent profile
	 * @throws com.labimo.portlet.tincan.NoSuchTincanAgentProfileException if a tincan agent profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAgentProfile findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTincanAgentProfileException, SystemException {
		TincanAgentProfile tincanAgentProfile = fetchByPrimaryKey(primaryKey);

		if (tincanAgentProfile == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTincanAgentProfileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tincanAgentProfile;
	}

	/**
	 * Returns the tincan agent profile with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanAgentProfileException} if it could not be found.
	 *
	 * @param id the primary key of the tincan agent profile
	 * @return the tincan agent profile
	 * @throws com.labimo.portlet.tincan.NoSuchTincanAgentProfileException if a tincan agent profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAgentProfile findByPrimaryKey(long id)
		throws NoSuchTincanAgentProfileException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tincan agent profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan agent profile
	 * @return the tincan agent profile, or <code>null</code> if a tincan agent profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAgentProfile fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TincanAgentProfile tincanAgentProfile = (TincanAgentProfile)EntityCacheUtil.getResult(TincanAgentProfileModelImpl.ENTITY_CACHE_ENABLED,
				TincanAgentProfileImpl.class, primaryKey);

		if (tincanAgentProfile == _nullTincanAgentProfile) {
			return null;
		}

		if (tincanAgentProfile == null) {
			Session session = null;

			try {
				session = openSession();

				tincanAgentProfile = (TincanAgentProfile)session.get(TincanAgentProfileImpl.class,
						primaryKey);

				if (tincanAgentProfile != null) {
					cacheResult(tincanAgentProfile);
				}
				else {
					EntityCacheUtil.putResult(TincanAgentProfileModelImpl.ENTITY_CACHE_ENABLED,
						TincanAgentProfileImpl.class, primaryKey,
						_nullTincanAgentProfile);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TincanAgentProfileModelImpl.ENTITY_CACHE_ENABLED,
					TincanAgentProfileImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tincanAgentProfile;
	}

	/**
	 * Returns the tincan agent profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tincan agent profile
	 * @return the tincan agent profile, or <code>null</code> if a tincan agent profile with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAgentProfile fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tincan agent profiles.
	 *
	 * @return the tincan agent profiles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanAgentProfile> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tincan agent profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanAgentProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan agent profiles
	 * @param end the upper bound of the range of tincan agent profiles (not inclusive)
	 * @return the range of tincan agent profiles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanAgentProfile> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tincan agent profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanAgentProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan agent profiles
	 * @param end the upper bound of the range of tincan agent profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tincan agent profiles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanAgentProfile> findAll(int start, int end,
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

		List<TincanAgentProfile> list = (List<TincanAgentProfile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TINCANAGENTPROFILE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TINCANAGENTPROFILE;

				if (pagination) {
					sql = sql.concat(TincanAgentProfileModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TincanAgentProfile>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TincanAgentProfile>(list);
				}
				else {
					list = (List<TincanAgentProfile>)QueryUtil.list(q,
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
	 * Removes all the tincan agent profiles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TincanAgentProfile tincanAgentProfile : findAll()) {
			remove(tincanAgentProfile);
		}
	}

	/**
	 * Returns the number of tincan agent profiles.
	 *
	 * @return the number of tincan agent profiles
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

				Query q = session.createQuery(_SQL_COUNT_TINCANAGENTPROFILE);

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
	 * Initializes the tincan agent profile persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.TincanAgentProfile")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TincanAgentProfile>> listenersList = new ArrayList<ModelListener<TincanAgentProfile>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TincanAgentProfile>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TincanAgentProfileImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TINCANAGENTPROFILE = "SELECT tincanAgentProfile FROM TincanAgentProfile tincanAgentProfile";
	private static final String _SQL_COUNT_TINCANAGENTPROFILE = "SELECT COUNT(tincanAgentProfile) FROM TincanAgentProfile tincanAgentProfile";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tincanAgentProfile.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TincanAgentProfile exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TincanAgentProfilePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static TincanAgentProfile _nullTincanAgentProfile = new TincanAgentProfileImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TincanAgentProfile> toCacheModel() {
				return _nullTincanAgentProfileCacheModel;
			}
		};

	private static CacheModel<TincanAgentProfile> _nullTincanAgentProfileCacheModel =
		new CacheModel<TincanAgentProfile>() {
			@Override
			public TincanAgentProfile toEntityModel() {
				return _nullTincanAgentProfile;
			}
		};
}
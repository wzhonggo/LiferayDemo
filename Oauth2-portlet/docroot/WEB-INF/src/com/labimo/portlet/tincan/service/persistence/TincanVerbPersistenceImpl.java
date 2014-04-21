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

import com.labimo.portlet.tincan.NoSuchTincanVerbException;
import com.labimo.portlet.tincan.model.TincanVerb;
import com.labimo.portlet.tincan.model.impl.TincanVerbImpl;
import com.labimo.portlet.tincan.model.impl.TincanVerbModelImpl;

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
 * The persistence implementation for the tincan verb service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanVerbPersistence
 * @see TincanVerbUtil
 * @generated
 */
public class TincanVerbPersistenceImpl extends BasePersistenceImpl<TincanVerb>
	implements TincanVerbPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TincanVerbUtil} to access the tincan verb persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TincanVerbImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TincanVerbModelImpl.ENTITY_CACHE_ENABLED,
			TincanVerbModelImpl.FINDER_CACHE_ENABLED, TincanVerbImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TincanVerbModelImpl.ENTITY_CACHE_ENABLED,
			TincanVerbModelImpl.FINDER_CACHE_ENABLED, TincanVerbImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TincanVerbModelImpl.ENTITY_CACHE_ENABLED,
			TincanVerbModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TincanVerbPersistenceImpl() {
		setModelClass(TincanVerb.class);
	}

	/**
	 * Caches the tincan verb in the entity cache if it is enabled.
	 *
	 * @param tincanVerb the tincan verb
	 */
	@Override
	public void cacheResult(TincanVerb tincanVerb) {
		EntityCacheUtil.putResult(TincanVerbModelImpl.ENTITY_CACHE_ENABLED,
			TincanVerbImpl.class, tincanVerb.getPrimaryKey(), tincanVerb);

		tincanVerb.resetOriginalValues();
	}

	/**
	 * Caches the tincan verbs in the entity cache if it is enabled.
	 *
	 * @param tincanVerbs the tincan verbs
	 */
	@Override
	public void cacheResult(List<TincanVerb> tincanVerbs) {
		for (TincanVerb tincanVerb : tincanVerbs) {
			if (EntityCacheUtil.getResult(
						TincanVerbModelImpl.ENTITY_CACHE_ENABLED,
						TincanVerbImpl.class, tincanVerb.getPrimaryKey()) == null) {
				cacheResult(tincanVerb);
			}
			else {
				tincanVerb.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tincan verbs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TincanVerbImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TincanVerbImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tincan verb.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TincanVerb tincanVerb) {
		EntityCacheUtil.removeResult(TincanVerbModelImpl.ENTITY_CACHE_ENABLED,
			TincanVerbImpl.class, tincanVerb.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TincanVerb> tincanVerbs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TincanVerb tincanVerb : tincanVerbs) {
			EntityCacheUtil.removeResult(TincanVerbModelImpl.ENTITY_CACHE_ENABLED,
				TincanVerbImpl.class, tincanVerb.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tincan verb with the primary key. Does not add the tincan verb to the database.
	 *
	 * @param id the primary key for the new tincan verb
	 * @return the new tincan verb
	 */
	@Override
	public TincanVerb create(long id) {
		TincanVerb tincanVerb = new TincanVerbImpl();

		tincanVerb.setNew(true);
		tincanVerb.setPrimaryKey(id);

		return tincanVerb;
	}

	/**
	 * Removes the tincan verb with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tincan verb
	 * @return the tincan verb that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanVerbException if a tincan verb with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanVerb remove(long id)
		throws NoSuchTincanVerbException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tincan verb with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tincan verb
	 * @return the tincan verb that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanVerbException if a tincan verb with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanVerb remove(Serializable primaryKey)
		throws NoSuchTincanVerbException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TincanVerb tincanVerb = (TincanVerb)session.get(TincanVerbImpl.class,
					primaryKey);

			if (tincanVerb == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTincanVerbException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tincanVerb);
		}
		catch (NoSuchTincanVerbException nsee) {
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
	protected TincanVerb removeImpl(TincanVerb tincanVerb)
		throws SystemException {
		tincanVerb = toUnwrappedModel(tincanVerb);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tincanVerb)) {
				tincanVerb = (TincanVerb)session.get(TincanVerbImpl.class,
						tincanVerb.getPrimaryKeyObj());
			}

			if (tincanVerb != null) {
				session.delete(tincanVerb);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tincanVerb != null) {
			clearCache(tincanVerb);
		}

		return tincanVerb;
	}

	@Override
	public TincanVerb updateImpl(
		com.labimo.portlet.tincan.model.TincanVerb tincanVerb)
		throws SystemException {
		tincanVerb = toUnwrappedModel(tincanVerb);

		boolean isNew = tincanVerb.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tincanVerb.isNew()) {
				session.save(tincanVerb);

				tincanVerb.setNew(false);
			}
			else {
				session.merge(tincanVerb);
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

		EntityCacheUtil.putResult(TincanVerbModelImpl.ENTITY_CACHE_ENABLED,
			TincanVerbImpl.class, tincanVerb.getPrimaryKey(), tincanVerb);

		return tincanVerb;
	}

	protected TincanVerb toUnwrappedModel(TincanVerb tincanVerb) {
		if (tincanVerb instanceof TincanVerbImpl) {
			return tincanVerb;
		}

		TincanVerbImpl tincanVerbImpl = new TincanVerbImpl();

		tincanVerbImpl.setNew(tincanVerb.isNew());
		tincanVerbImpl.setPrimaryKey(tincanVerb.getPrimaryKey());

		tincanVerbImpl.setId(tincanVerb.getId());
		tincanVerbImpl.setVerbId(tincanVerb.getVerbId());
		tincanVerbImpl.setDisplay(tincanVerb.getDisplay());

		return tincanVerbImpl;
	}

	/**
	 * Returns the tincan verb with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan verb
	 * @return the tincan verb
	 * @throws com.labimo.portlet.tincan.NoSuchTincanVerbException if a tincan verb with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanVerb findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTincanVerbException, SystemException {
		TincanVerb tincanVerb = fetchByPrimaryKey(primaryKey);

		if (tincanVerb == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTincanVerbException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tincanVerb;
	}

	/**
	 * Returns the tincan verb with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanVerbException} if it could not be found.
	 *
	 * @param id the primary key of the tincan verb
	 * @return the tincan verb
	 * @throws com.labimo.portlet.tincan.NoSuchTincanVerbException if a tincan verb with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanVerb findByPrimaryKey(long id)
		throws NoSuchTincanVerbException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tincan verb with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan verb
	 * @return the tincan verb, or <code>null</code> if a tincan verb with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanVerb fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TincanVerb tincanVerb = (TincanVerb)EntityCacheUtil.getResult(TincanVerbModelImpl.ENTITY_CACHE_ENABLED,
				TincanVerbImpl.class, primaryKey);

		if (tincanVerb == _nullTincanVerb) {
			return null;
		}

		if (tincanVerb == null) {
			Session session = null;

			try {
				session = openSession();

				tincanVerb = (TincanVerb)session.get(TincanVerbImpl.class,
						primaryKey);

				if (tincanVerb != null) {
					cacheResult(tincanVerb);
				}
				else {
					EntityCacheUtil.putResult(TincanVerbModelImpl.ENTITY_CACHE_ENABLED,
						TincanVerbImpl.class, primaryKey, _nullTincanVerb);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TincanVerbModelImpl.ENTITY_CACHE_ENABLED,
					TincanVerbImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tincanVerb;
	}

	/**
	 * Returns the tincan verb with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tincan verb
	 * @return the tincan verb, or <code>null</code> if a tincan verb with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanVerb fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tincan verbs.
	 *
	 * @return the tincan verbs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanVerb> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tincan verbs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanVerbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan verbs
	 * @param end the upper bound of the range of tincan verbs (not inclusive)
	 * @return the range of tincan verbs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanVerb> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tincan verbs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanVerbModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan verbs
	 * @param end the upper bound of the range of tincan verbs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tincan verbs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanVerb> findAll(int start, int end,
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

		List<TincanVerb> list = (List<TincanVerb>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TINCANVERB);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TINCANVERB;

				if (pagination) {
					sql = sql.concat(TincanVerbModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TincanVerb>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TincanVerb>(list);
				}
				else {
					list = (List<TincanVerb>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the tincan verbs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TincanVerb tincanVerb : findAll()) {
			remove(tincanVerb);
		}
	}

	/**
	 * Returns the number of tincan verbs.
	 *
	 * @return the number of tincan verbs
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

				Query q = session.createQuery(_SQL_COUNT_TINCANVERB);

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
	 * Initializes the tincan verb persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.TincanVerb")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TincanVerb>> listenersList = new ArrayList<ModelListener<TincanVerb>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TincanVerb>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TincanVerbImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TINCANVERB = "SELECT tincanVerb FROM TincanVerb tincanVerb";
	private static final String _SQL_COUNT_TINCANVERB = "SELECT COUNT(tincanVerb) FROM TincanVerb tincanVerb";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tincanVerb.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TincanVerb exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TincanVerbPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static TincanVerb _nullTincanVerb = new TincanVerbImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TincanVerb> toCacheModel() {
				return _nullTincanVerbCacheModel;
			}
		};

	private static CacheModel<TincanVerb> _nullTincanVerbCacheModel = new CacheModel<TincanVerb>() {
			@Override
			public TincanVerb toEntityModel() {
				return _nullTincanVerb;
			}
		};
}
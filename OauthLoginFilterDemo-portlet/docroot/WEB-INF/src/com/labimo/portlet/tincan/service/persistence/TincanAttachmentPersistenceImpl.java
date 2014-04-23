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

import com.labimo.portlet.tincan.NoSuchTincanAttachmentException;
import com.labimo.portlet.tincan.model.TincanAttachment;
import com.labimo.portlet.tincan.model.impl.TincanAttachmentImpl;
import com.labimo.portlet.tincan.model.impl.TincanAttachmentModelImpl;

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
 * The persistence implementation for the tincan attachment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanAttachmentPersistence
 * @see TincanAttachmentUtil
 * @generated
 */
public class TincanAttachmentPersistenceImpl extends BasePersistenceImpl<TincanAttachment>
	implements TincanAttachmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TincanAttachmentUtil} to access the tincan attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TincanAttachmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TincanAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			TincanAttachmentModelImpl.FINDER_CACHE_ENABLED,
			TincanAttachmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TincanAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			TincanAttachmentModelImpl.FINDER_CACHE_ENABLED,
			TincanAttachmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TincanAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			TincanAttachmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TincanAttachmentPersistenceImpl() {
		setModelClass(TincanAttachment.class);
	}

	/**
	 * Caches the tincan attachment in the entity cache if it is enabled.
	 *
	 * @param tincanAttachment the tincan attachment
	 */
	@Override
	public void cacheResult(TincanAttachment tincanAttachment) {
		EntityCacheUtil.putResult(TincanAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			TincanAttachmentImpl.class, tincanAttachment.getPrimaryKey(),
			tincanAttachment);

		tincanAttachment.resetOriginalValues();
	}

	/**
	 * Caches the tincan attachments in the entity cache if it is enabled.
	 *
	 * @param tincanAttachments the tincan attachments
	 */
	@Override
	public void cacheResult(List<TincanAttachment> tincanAttachments) {
		for (TincanAttachment tincanAttachment : tincanAttachments) {
			if (EntityCacheUtil.getResult(
						TincanAttachmentModelImpl.ENTITY_CACHE_ENABLED,
						TincanAttachmentImpl.class,
						tincanAttachment.getPrimaryKey()) == null) {
				cacheResult(tincanAttachment);
			}
			else {
				tincanAttachment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tincan attachments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TincanAttachmentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TincanAttachmentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tincan attachment.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TincanAttachment tincanAttachment) {
		EntityCacheUtil.removeResult(TincanAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			TincanAttachmentImpl.class, tincanAttachment.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TincanAttachment> tincanAttachments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TincanAttachment tincanAttachment : tincanAttachments) {
			EntityCacheUtil.removeResult(TincanAttachmentModelImpl.ENTITY_CACHE_ENABLED,
				TincanAttachmentImpl.class, tincanAttachment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tincan attachment with the primary key. Does not add the tincan attachment to the database.
	 *
	 * @param id the primary key for the new tincan attachment
	 * @return the new tincan attachment
	 */
	@Override
	public TincanAttachment create(long id) {
		TincanAttachment tincanAttachment = new TincanAttachmentImpl();

		tincanAttachment.setNew(true);
		tincanAttachment.setPrimaryKey(id);

		return tincanAttachment;
	}

	/**
	 * Removes the tincan attachment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tincan attachment
	 * @return the tincan attachment that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanAttachmentException if a tincan attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAttachment remove(long id)
		throws NoSuchTincanAttachmentException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tincan attachment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tincan attachment
	 * @return the tincan attachment that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanAttachmentException if a tincan attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAttachment remove(Serializable primaryKey)
		throws NoSuchTincanAttachmentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TincanAttachment tincanAttachment = (TincanAttachment)session.get(TincanAttachmentImpl.class,
					primaryKey);

			if (tincanAttachment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTincanAttachmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tincanAttachment);
		}
		catch (NoSuchTincanAttachmentException nsee) {
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
	protected TincanAttachment removeImpl(TincanAttachment tincanAttachment)
		throws SystemException {
		tincanAttachment = toUnwrappedModel(tincanAttachment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tincanAttachment)) {
				tincanAttachment = (TincanAttachment)session.get(TincanAttachmentImpl.class,
						tincanAttachment.getPrimaryKeyObj());
			}

			if (tincanAttachment != null) {
				session.delete(tincanAttachment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tincanAttachment != null) {
			clearCache(tincanAttachment);
		}

		return tincanAttachment;
	}

	@Override
	public TincanAttachment updateImpl(
		com.labimo.portlet.tincan.model.TincanAttachment tincanAttachment)
		throws SystemException {
		tincanAttachment = toUnwrappedModel(tincanAttachment);

		boolean isNew = tincanAttachment.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tincanAttachment.isNew()) {
				session.save(tincanAttachment);

				tincanAttachment.setNew(false);
			}
			else {
				session.merge(tincanAttachment);
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

		EntityCacheUtil.putResult(TincanAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			TincanAttachmentImpl.class, tincanAttachment.getPrimaryKey(),
			tincanAttachment);

		return tincanAttachment;
	}

	protected TincanAttachment toUnwrappedModel(
		TincanAttachment tincanAttachment) {
		if (tincanAttachment instanceof TincanAttachmentImpl) {
			return tincanAttachment;
		}

		TincanAttachmentImpl tincanAttachmentImpl = new TincanAttachmentImpl();

		tincanAttachmentImpl.setNew(tincanAttachment.isNew());
		tincanAttachmentImpl.setPrimaryKey(tincanAttachment.getPrimaryKey());

		tincanAttachmentImpl.setId(tincanAttachment.getId());
		tincanAttachmentImpl.setUsageType(tincanAttachment.getUsageType());
		tincanAttachmentImpl.setContentType(tincanAttachment.getContentType());
		tincanAttachmentImpl.setLength(tincanAttachment.getLength());
		tincanAttachmentImpl.setSha2(tincanAttachment.getSha2());
		tincanAttachmentImpl.setFileUrl(tincanAttachment.getFileUrl());
		tincanAttachmentImpl.setPayload(tincanAttachment.getPayload());
		tincanAttachmentImpl.setDisplay(tincanAttachment.getDisplay());
		tincanAttachmentImpl.setDescription(tincanAttachment.getDescription());

		return tincanAttachmentImpl;
	}

	/**
	 * Returns the tincan attachment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan attachment
	 * @return the tincan attachment
	 * @throws com.labimo.portlet.tincan.NoSuchTincanAttachmentException if a tincan attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAttachment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTincanAttachmentException, SystemException {
		TincanAttachment tincanAttachment = fetchByPrimaryKey(primaryKey);

		if (tincanAttachment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTincanAttachmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tincanAttachment;
	}

	/**
	 * Returns the tincan attachment with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanAttachmentException} if it could not be found.
	 *
	 * @param id the primary key of the tincan attachment
	 * @return the tincan attachment
	 * @throws com.labimo.portlet.tincan.NoSuchTincanAttachmentException if a tincan attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAttachment findByPrimaryKey(long id)
		throws NoSuchTincanAttachmentException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tincan attachment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan attachment
	 * @return the tincan attachment, or <code>null</code> if a tincan attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAttachment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TincanAttachment tincanAttachment = (TincanAttachment)EntityCacheUtil.getResult(TincanAttachmentModelImpl.ENTITY_CACHE_ENABLED,
				TincanAttachmentImpl.class, primaryKey);

		if (tincanAttachment == _nullTincanAttachment) {
			return null;
		}

		if (tincanAttachment == null) {
			Session session = null;

			try {
				session = openSession();

				tincanAttachment = (TincanAttachment)session.get(TincanAttachmentImpl.class,
						primaryKey);

				if (tincanAttachment != null) {
					cacheResult(tincanAttachment);
				}
				else {
					EntityCacheUtil.putResult(TincanAttachmentModelImpl.ENTITY_CACHE_ENABLED,
						TincanAttachmentImpl.class, primaryKey,
						_nullTincanAttachment);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TincanAttachmentModelImpl.ENTITY_CACHE_ENABLED,
					TincanAttachmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tincanAttachment;
	}

	/**
	 * Returns the tincan attachment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tincan attachment
	 * @return the tincan attachment, or <code>null</code> if a tincan attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanAttachment fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tincan attachments.
	 *
	 * @return the tincan attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanAttachment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tincan attachments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan attachments
	 * @param end the upper bound of the range of tincan attachments (not inclusive)
	 * @return the range of tincan attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanAttachment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tincan attachments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan attachments
	 * @param end the upper bound of the range of tincan attachments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tincan attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanAttachment> findAll(int start, int end,
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

		List<TincanAttachment> list = (List<TincanAttachment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TINCANATTACHMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TINCANATTACHMENT;

				if (pagination) {
					sql = sql.concat(TincanAttachmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TincanAttachment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TincanAttachment>(list);
				}
				else {
					list = (List<TincanAttachment>)QueryUtil.list(q,
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
	 * Removes all the tincan attachments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TincanAttachment tincanAttachment : findAll()) {
			remove(tincanAttachment);
		}
	}

	/**
	 * Returns the number of tincan attachments.
	 *
	 * @return the number of tincan attachments
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

				Query q = session.createQuery(_SQL_COUNT_TINCANATTACHMENT);

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
	 * Initializes the tincan attachment persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.TincanAttachment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TincanAttachment>> listenersList = new ArrayList<ModelListener<TincanAttachment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TincanAttachment>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TincanAttachmentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TINCANATTACHMENT = "SELECT tincanAttachment FROM TincanAttachment tincanAttachment";
	private static final String _SQL_COUNT_TINCANATTACHMENT = "SELECT COUNT(tincanAttachment) FROM TincanAttachment tincanAttachment";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tincanAttachment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TincanAttachment exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TincanAttachmentPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static TincanAttachment _nullTincanAttachment = new TincanAttachmentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TincanAttachment> toCacheModel() {
				return _nullTincanAttachmentCacheModel;
			}
		};

	private static CacheModel<TincanAttachment> _nullTincanAttachmentCacheModel = new CacheModel<TincanAttachment>() {
			@Override
			public TincanAttachment toEntityModel() {
				return _nullTincanAttachment;
			}
		};
}
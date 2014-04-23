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

import com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException;
import com.labimo.portlet.tincan.model.TincanStatementAttachment;
import com.labimo.portlet.tincan.model.impl.TincanStatementAttachmentImpl;
import com.labimo.portlet.tincan.model.impl.TincanStatementAttachmentModelImpl;

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
 * The persistence implementation for the tincan statement attachment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author wzgong
 * @see TincanStatementAttachmentPersistence
 * @see TincanStatementAttachmentUtil
 * @generated
 */
public class TincanStatementAttachmentPersistenceImpl
	extends BasePersistenceImpl<TincanStatementAttachment>
	implements TincanStatementAttachmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TincanStatementAttachmentUtil} to access the tincan statement attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TincanStatementAttachmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TincanStatementAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementAttachmentModelImpl.FINDER_CACHE_ENABLED,
			TincanStatementAttachmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TincanStatementAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementAttachmentModelImpl.FINDER_CACHE_ENABLED,
			TincanStatementAttachmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TincanStatementAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementAttachmentModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public TincanStatementAttachmentPersistenceImpl() {
		setModelClass(TincanStatementAttachment.class);
	}

	/**
	 * Caches the tincan statement attachment in the entity cache if it is enabled.
	 *
	 * @param tincanStatementAttachment the tincan statement attachment
	 */
	@Override
	public void cacheResult(TincanStatementAttachment tincanStatementAttachment) {
		EntityCacheUtil.putResult(TincanStatementAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementAttachmentImpl.class,
			tincanStatementAttachment.getPrimaryKey(), tincanStatementAttachment);

		tincanStatementAttachment.resetOriginalValues();
	}

	/**
	 * Caches the tincan statement attachments in the entity cache if it is enabled.
	 *
	 * @param tincanStatementAttachments the tincan statement attachments
	 */
	@Override
	public void cacheResult(
		List<TincanStatementAttachment> tincanStatementAttachments) {
		for (TincanStatementAttachment tincanStatementAttachment : tincanStatementAttachments) {
			if (EntityCacheUtil.getResult(
						TincanStatementAttachmentModelImpl.ENTITY_CACHE_ENABLED,
						TincanStatementAttachmentImpl.class,
						tincanStatementAttachment.getPrimaryKey()) == null) {
				cacheResult(tincanStatementAttachment);
			}
			else {
				tincanStatementAttachment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tincan statement attachments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TincanStatementAttachmentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TincanStatementAttachmentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tincan statement attachment.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TincanStatementAttachment tincanStatementAttachment) {
		EntityCacheUtil.removeResult(TincanStatementAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementAttachmentImpl.class,
			tincanStatementAttachment.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<TincanStatementAttachment> tincanStatementAttachments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TincanStatementAttachment tincanStatementAttachment : tincanStatementAttachments) {
			EntityCacheUtil.removeResult(TincanStatementAttachmentModelImpl.ENTITY_CACHE_ENABLED,
				TincanStatementAttachmentImpl.class,
				tincanStatementAttachment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tincan statement attachment with the primary key. Does not add the tincan statement attachment to the database.
	 *
	 * @param id the primary key for the new tincan statement attachment
	 * @return the new tincan statement attachment
	 */
	@Override
	public TincanStatementAttachment create(long id) {
		TincanStatementAttachment tincanStatementAttachment = new TincanStatementAttachmentImpl();

		tincanStatementAttachment.setNew(true);
		tincanStatementAttachment.setPrimaryKey(id);

		return tincanStatementAttachment;
	}

	/**
	 * Removes the tincan statement attachment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tincan statement attachment
	 * @return the tincan statement attachment that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException if a tincan statement attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementAttachment remove(long id)
		throws NoSuchTincanStatementAttachmentException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tincan statement attachment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tincan statement attachment
	 * @return the tincan statement attachment that was removed
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException if a tincan statement attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementAttachment remove(Serializable primaryKey)
		throws NoSuchTincanStatementAttachmentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TincanStatementAttachment tincanStatementAttachment = (TincanStatementAttachment)session.get(TincanStatementAttachmentImpl.class,
					primaryKey);

			if (tincanStatementAttachment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTincanStatementAttachmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tincanStatementAttachment);
		}
		catch (NoSuchTincanStatementAttachmentException nsee) {
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
	protected TincanStatementAttachment removeImpl(
		TincanStatementAttachment tincanStatementAttachment)
		throws SystemException {
		tincanStatementAttachment = toUnwrappedModel(tincanStatementAttachment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tincanStatementAttachment)) {
				tincanStatementAttachment = (TincanStatementAttachment)session.get(TincanStatementAttachmentImpl.class,
						tincanStatementAttachment.getPrimaryKeyObj());
			}

			if (tincanStatementAttachment != null) {
				session.delete(tincanStatementAttachment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tincanStatementAttachment != null) {
			clearCache(tincanStatementAttachment);
		}

		return tincanStatementAttachment;
	}

	@Override
	public TincanStatementAttachment updateImpl(
		com.labimo.portlet.tincan.model.TincanStatementAttachment tincanStatementAttachment)
		throws SystemException {
		tincanStatementAttachment = toUnwrappedModel(tincanStatementAttachment);

		boolean isNew = tincanStatementAttachment.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tincanStatementAttachment.isNew()) {
				session.save(tincanStatementAttachment);

				tincanStatementAttachment.setNew(false);
			}
			else {
				session.merge(tincanStatementAttachment);
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

		EntityCacheUtil.putResult(TincanStatementAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			TincanStatementAttachmentImpl.class,
			tincanStatementAttachment.getPrimaryKey(), tincanStatementAttachment);

		return tincanStatementAttachment;
	}

	protected TincanStatementAttachment toUnwrappedModel(
		TincanStatementAttachment tincanStatementAttachment) {
		if (tincanStatementAttachment instanceof TincanStatementAttachmentImpl) {
			return tincanStatementAttachment;
		}

		TincanStatementAttachmentImpl tincanStatementAttachmentImpl = new TincanStatementAttachmentImpl();

		tincanStatementAttachmentImpl.setNew(tincanStatementAttachment.isNew());
		tincanStatementAttachmentImpl.setPrimaryKey(tincanStatementAttachment.getPrimaryKey());

		tincanStatementAttachmentImpl.setId(tincanStatementAttachment.getId());
		tincanStatementAttachmentImpl.setStatementId(tincanStatementAttachment.getStatementId());
		tincanStatementAttachmentImpl.setStatementAttachmentId(tincanStatementAttachment.getStatementAttachmentId());

		return tincanStatementAttachmentImpl;
	}

	/**
	 * Returns the tincan statement attachment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan statement attachment
	 * @return the tincan statement attachment
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException if a tincan statement attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementAttachment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTincanStatementAttachmentException, SystemException {
		TincanStatementAttachment tincanStatementAttachment = fetchByPrimaryKey(primaryKey);

		if (tincanStatementAttachment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTincanStatementAttachmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tincanStatementAttachment;
	}

	/**
	 * Returns the tincan statement attachment with the primary key or throws a {@link com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException} if it could not be found.
	 *
	 * @param id the primary key of the tincan statement attachment
	 * @return the tincan statement attachment
	 * @throws com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException if a tincan statement attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementAttachment findByPrimaryKey(long id)
		throws NoSuchTincanStatementAttachmentException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tincan statement attachment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tincan statement attachment
	 * @return the tincan statement attachment, or <code>null</code> if a tincan statement attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementAttachment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TincanStatementAttachment tincanStatementAttachment = (TincanStatementAttachment)EntityCacheUtil.getResult(TincanStatementAttachmentModelImpl.ENTITY_CACHE_ENABLED,
				TincanStatementAttachmentImpl.class, primaryKey);

		if (tincanStatementAttachment == _nullTincanStatementAttachment) {
			return null;
		}

		if (tincanStatementAttachment == null) {
			Session session = null;

			try {
				session = openSession();

				tincanStatementAttachment = (TincanStatementAttachment)session.get(TincanStatementAttachmentImpl.class,
						primaryKey);

				if (tincanStatementAttachment != null) {
					cacheResult(tincanStatementAttachment);
				}
				else {
					EntityCacheUtil.putResult(TincanStatementAttachmentModelImpl.ENTITY_CACHE_ENABLED,
						TincanStatementAttachmentImpl.class, primaryKey,
						_nullTincanStatementAttachment);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TincanStatementAttachmentModelImpl.ENTITY_CACHE_ENABLED,
					TincanStatementAttachmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tincanStatementAttachment;
	}

	/**
	 * Returns the tincan statement attachment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tincan statement attachment
	 * @return the tincan statement attachment, or <code>null</code> if a tincan statement attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TincanStatementAttachment fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tincan statement attachments.
	 *
	 * @return the tincan statement attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanStatementAttachment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tincan statement attachments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan statement attachments
	 * @param end the upper bound of the range of tincan statement attachments (not inclusive)
	 * @return the range of tincan statement attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanStatementAttachment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tincan statement attachments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.labimo.portlet.tincan.model.impl.TincanStatementAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tincan statement attachments
	 * @param end the upper bound of the range of tincan statement attachments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tincan statement attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TincanStatementAttachment> findAll(int start, int end,
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

		List<TincanStatementAttachment> list = (List<TincanStatementAttachment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TINCANSTATEMENTATTACHMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TINCANSTATEMENTATTACHMENT;

				if (pagination) {
					sql = sql.concat(TincanStatementAttachmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TincanStatementAttachment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TincanStatementAttachment>(list);
				}
				else {
					list = (List<TincanStatementAttachment>)QueryUtil.list(q,
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
	 * Removes all the tincan statement attachments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TincanStatementAttachment tincanStatementAttachment : findAll()) {
			remove(tincanStatementAttachment);
		}
	}

	/**
	 * Returns the number of tincan statement attachments.
	 *
	 * @return the number of tincan statement attachments
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

				Query q = session.createQuery(_SQL_COUNT_TINCANSTATEMENTATTACHMENT);

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
	 * Initializes the tincan statement attachment persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.labimo.portlet.tincan.model.TincanStatementAttachment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TincanStatementAttachment>> listenersList = new ArrayList<ModelListener<TincanStatementAttachment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TincanStatementAttachment>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TincanStatementAttachmentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TINCANSTATEMENTATTACHMENT = "SELECT tincanStatementAttachment FROM TincanStatementAttachment tincanStatementAttachment";
	private static final String _SQL_COUNT_TINCANSTATEMENTATTACHMENT = "SELECT COUNT(tincanStatementAttachment) FROM TincanStatementAttachment tincanStatementAttachment";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tincanStatementAttachment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TincanStatementAttachment exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TincanStatementAttachmentPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static TincanStatementAttachment _nullTincanStatementAttachment = new TincanStatementAttachmentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TincanStatementAttachment> toCacheModel() {
				return _nullTincanStatementAttachmentCacheModel;
			}
		};

	private static CacheModel<TincanStatementAttachment> _nullTincanStatementAttachmentCacheModel =
		new CacheModel<TincanStatementAttachment>() {
			@Override
			public TincanStatementAttachment toEntityModel() {
				return _nullTincanStatementAttachment;
			}
		};
}
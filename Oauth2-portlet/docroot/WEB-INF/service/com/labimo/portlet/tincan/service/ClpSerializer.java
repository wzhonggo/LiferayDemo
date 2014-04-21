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

package com.labimo.portlet.tincan.service;

import com.labimo.portlet.tincan.model.LiferayTincanManifestActClp;
import com.labimo.portlet.tincan.model.LiferayUserClp;
import com.labimo.portlet.tincan.model.Oauth2ClientClp;
import com.labimo.portlet.tincan.model.Oauth2EndpointClp;
import com.labimo.portlet.tincan.model.Oauth2TokenClp;
import com.labimo.portlet.tincan.model.TincanActivityStateClp;
import com.labimo.portlet.tincan.model.TincanAgentClp;
import com.labimo.portlet.tincan.model.TincanAgentProfileClp;
import com.labimo.portlet.tincan.model.TincanAttachmentClp;
import com.labimo.portlet.tincan.model.TincanStatementAttachmentClp;
import com.labimo.portlet.tincan.model.TincanStatementClp;
import com.labimo.portlet.tincan.model.TincanStatementContextClp;
import com.labimo.portlet.tincan.model.TincanStatementResultClp;
import com.labimo.portlet.tincan.model.TincanSubStatementClp;
import com.labimo.portlet.tincan.model.TincanVerbClp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wzgong
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"Oauth2-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"Oauth2-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "Oauth2-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					LiferayTincanManifestActClp.class.getName())) {
			return translateInputLiferayTincanManifestAct(oldModel);
		}

		if (oldModelClassName.equals(LiferayUserClp.class.getName())) {
			return translateInputLiferayUser(oldModel);
		}

		if (oldModelClassName.equals(Oauth2ClientClp.class.getName())) {
			return translateInputOauth2Client(oldModel);
		}

		if (oldModelClassName.equals(Oauth2EndpointClp.class.getName())) {
			return translateInputOauth2Endpoint(oldModel);
		}

		if (oldModelClassName.equals(Oauth2TokenClp.class.getName())) {
			return translateInputOauth2Token(oldModel);
		}

		if (oldModelClassName.equals(TincanActivityStateClp.class.getName())) {
			return translateInputTincanActivityState(oldModel);
		}

		if (oldModelClassName.equals(TincanAgentClp.class.getName())) {
			return translateInputTincanAgent(oldModel);
		}

		if (oldModelClassName.equals(TincanAgentProfileClp.class.getName())) {
			return translateInputTincanAgentProfile(oldModel);
		}

		if (oldModelClassName.equals(TincanAttachmentClp.class.getName())) {
			return translateInputTincanAttachment(oldModel);
		}

		if (oldModelClassName.equals(TincanStatementClp.class.getName())) {
			return translateInputTincanStatement(oldModel);
		}

		if (oldModelClassName.equals(
					TincanStatementAttachmentClp.class.getName())) {
			return translateInputTincanStatementAttachment(oldModel);
		}

		if (oldModelClassName.equals(TincanStatementContextClp.class.getName())) {
			return translateInputTincanStatementContext(oldModel);
		}

		if (oldModelClassName.equals(TincanStatementResultClp.class.getName())) {
			return translateInputTincanStatementResult(oldModel);
		}

		if (oldModelClassName.equals(TincanSubStatementClp.class.getName())) {
			return translateInputTincanSubStatement(oldModel);
		}

		if (oldModelClassName.equals(TincanVerbClp.class.getName())) {
			return translateInputTincanVerb(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputLiferayTincanManifestAct(
		BaseModel<?> oldModel) {
		LiferayTincanManifestActClp oldClpModel = (LiferayTincanManifestActClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLiferayTincanManifestActRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLiferayUser(BaseModel<?> oldModel) {
		LiferayUserClp oldClpModel = (LiferayUserClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLiferayUserRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputOauth2Client(BaseModel<?> oldModel) {
		Oauth2ClientClp oldClpModel = (Oauth2ClientClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getOauth2ClientRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputOauth2Endpoint(BaseModel<?> oldModel) {
		Oauth2EndpointClp oldClpModel = (Oauth2EndpointClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getOauth2EndpointRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputOauth2Token(BaseModel<?> oldModel) {
		Oauth2TokenClp oldClpModel = (Oauth2TokenClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getOauth2TokenRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTincanActivityState(
		BaseModel<?> oldModel) {
		TincanActivityStateClp oldClpModel = (TincanActivityStateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTincanActivityStateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTincanAgent(BaseModel<?> oldModel) {
		TincanAgentClp oldClpModel = (TincanAgentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTincanAgentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTincanAgentProfile(BaseModel<?> oldModel) {
		TincanAgentProfileClp oldClpModel = (TincanAgentProfileClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTincanAgentProfileRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTincanAttachment(BaseModel<?> oldModel) {
		TincanAttachmentClp oldClpModel = (TincanAttachmentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTincanAttachmentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTincanStatement(BaseModel<?> oldModel) {
		TincanStatementClp oldClpModel = (TincanStatementClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTincanStatementRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTincanStatementAttachment(
		BaseModel<?> oldModel) {
		TincanStatementAttachmentClp oldClpModel = (TincanStatementAttachmentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTincanStatementAttachmentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTincanStatementContext(
		BaseModel<?> oldModel) {
		TincanStatementContextClp oldClpModel = (TincanStatementContextClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTincanStatementContextRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTincanStatementResult(
		BaseModel<?> oldModel) {
		TincanStatementResultClp oldClpModel = (TincanStatementResultClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTincanStatementResultRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTincanSubStatement(BaseModel<?> oldModel) {
		TincanSubStatementClp oldClpModel = (TincanSubStatementClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTincanSubStatementRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTincanVerb(BaseModel<?> oldModel) {
		TincanVerbClp oldClpModel = (TincanVerbClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTincanVerbRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.LiferayTincanManifestActImpl")) {
			return translateOutputLiferayTincanManifestAct(oldModel);
		}

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.LiferayUserImpl")) {
			return translateOutputLiferayUser(oldModel);
		}

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.Oauth2ClientImpl")) {
			return translateOutputOauth2Client(oldModel);
		}

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.Oauth2EndpointImpl")) {
			return translateOutputOauth2Endpoint(oldModel);
		}

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.Oauth2TokenImpl")) {
			return translateOutputOauth2Token(oldModel);
		}

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.TincanActivityStateImpl")) {
			return translateOutputTincanActivityState(oldModel);
		}

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.TincanAgentImpl")) {
			return translateOutputTincanAgent(oldModel);
		}

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.TincanAgentProfileImpl")) {
			return translateOutputTincanAgentProfile(oldModel);
		}

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.TincanAttachmentImpl")) {
			return translateOutputTincanAttachment(oldModel);
		}

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.TincanStatementImpl")) {
			return translateOutputTincanStatement(oldModel);
		}

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.TincanStatementAttachmentImpl")) {
			return translateOutputTincanStatementAttachment(oldModel);
		}

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.TincanStatementContextImpl")) {
			return translateOutputTincanStatementContext(oldModel);
		}

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.TincanStatementResultImpl")) {
			return translateOutputTincanStatementResult(oldModel);
		}

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.TincanSubStatementImpl")) {
			return translateOutputTincanSubStatement(oldModel);
		}

		if (oldModelClassName.equals(
					"com.labimo.portlet.tincan.model.impl.TincanVerbImpl")) {
			return translateOutputTincanVerb(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException")) {
			return new com.labimo.portlet.tincan.NoSuchLiferayTincanManifestActException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchLiferayUserException")) {
			return new com.labimo.portlet.tincan.NoSuchLiferayUserException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchOauth2ClientException")) {
			return new com.labimo.portlet.tincan.NoSuchOauth2ClientException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchOauth2EndpointException")) {
			return new com.labimo.portlet.tincan.NoSuchOauth2EndpointException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchOauth2TokenException")) {
			return new com.labimo.portlet.tincan.NoSuchOauth2TokenException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchTincanActivityStateException")) {
			return new com.labimo.portlet.tincan.NoSuchTincanActivityStateException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchTincanAgentException")) {
			return new com.labimo.portlet.tincan.NoSuchTincanAgentException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchTincanAgentProfileException")) {
			return new com.labimo.portlet.tincan.NoSuchTincanAgentProfileException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchTincanAttachmentException")) {
			return new com.labimo.portlet.tincan.NoSuchTincanAttachmentException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchTincanStatementException")) {
			return new com.labimo.portlet.tincan.NoSuchTincanStatementException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException")) {
			return new com.labimo.portlet.tincan.NoSuchTincanStatementAttachmentException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchTincanStatementContextException")) {
			return new com.labimo.portlet.tincan.NoSuchTincanStatementContextException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchTincanStatementResultException")) {
			return new com.labimo.portlet.tincan.NoSuchTincanStatementResultException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchTincanSubStatementException")) {
			return new com.labimo.portlet.tincan.NoSuchTincanSubStatementException();
		}

		if (className.equals(
					"com.labimo.portlet.tincan.NoSuchTincanVerbException")) {
			return new com.labimo.portlet.tincan.NoSuchTincanVerbException();
		}

		return throwable;
	}

	public static Object translateOutputLiferayTincanManifestAct(
		BaseModel<?> oldModel) {
		LiferayTincanManifestActClp newModel = new LiferayTincanManifestActClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLiferayTincanManifestActRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLiferayUser(BaseModel<?> oldModel) {
		LiferayUserClp newModel = new LiferayUserClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLiferayUserRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputOauth2Client(BaseModel<?> oldModel) {
		Oauth2ClientClp newModel = new Oauth2ClientClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setOauth2ClientRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputOauth2Endpoint(BaseModel<?> oldModel) {
		Oauth2EndpointClp newModel = new Oauth2EndpointClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setOauth2EndpointRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputOauth2Token(BaseModel<?> oldModel) {
		Oauth2TokenClp newModel = new Oauth2TokenClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setOauth2TokenRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTincanActivityState(
		BaseModel<?> oldModel) {
		TincanActivityStateClp newModel = new TincanActivityStateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTincanActivityStateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTincanAgent(BaseModel<?> oldModel) {
		TincanAgentClp newModel = new TincanAgentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTincanAgentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTincanAgentProfile(
		BaseModel<?> oldModel) {
		TincanAgentProfileClp newModel = new TincanAgentProfileClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTincanAgentProfileRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTincanAttachment(BaseModel<?> oldModel) {
		TincanAttachmentClp newModel = new TincanAttachmentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTincanAttachmentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTincanStatement(BaseModel<?> oldModel) {
		TincanStatementClp newModel = new TincanStatementClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTincanStatementRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTincanStatementAttachment(
		BaseModel<?> oldModel) {
		TincanStatementAttachmentClp newModel = new TincanStatementAttachmentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTincanStatementAttachmentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTincanStatementContext(
		BaseModel<?> oldModel) {
		TincanStatementContextClp newModel = new TincanStatementContextClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTincanStatementContextRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTincanStatementResult(
		BaseModel<?> oldModel) {
		TincanStatementResultClp newModel = new TincanStatementResultClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTincanStatementResultRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTincanSubStatement(
		BaseModel<?> oldModel) {
		TincanSubStatementClp newModel = new TincanSubStatementClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTincanSubStatementRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTincanVerb(BaseModel<?> oldModel) {
		TincanVerbClp newModel = new TincanVerbClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTincanVerbRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}
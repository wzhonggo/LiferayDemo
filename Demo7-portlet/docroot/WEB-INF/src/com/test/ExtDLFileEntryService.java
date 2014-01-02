package com.test;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLFileEntryService;
import com.liferay.portlet.documentlibrary.service.DLFileEntryServiceWrapper;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileEntryPersistence;

public class ExtDLFileEntryService extends DLFileEntryServiceWrapper {
//	@BeanReference(type = DLFileEntryPersistence.class)
//	protected DLFileEntryPersistence dlFileEntryPersistence;

	public ExtDLFileEntryService(DLFileEntryService dlFileEntryService) {
		super(dlFileEntryService);
		// TODO Auto-generated constructor stub
	}

	@Override
	public DLFileEntry getFileEntryByUuidAndGroupId(String uuid, long groupId)
			throws PortalException, SystemException {
//		System.out.println("=================ExtDLFileEntryService=========================");
//		DLFileEntry dlFileEntry = dlFileEntryPersistence.findByUUID_G(uuid, groupId);
//		return dlFileEntry;
		// TODO Auto-generated method stub
		return super.getFileEntryByUuidAndGroupId(uuid, groupId);
	}
	
	
}
package com.test;

import java.util.Map;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.URLCodec;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserLocalServiceWrapper;

public class MyUserLocalServiceImpl extends UserLocalServiceWrapper {

    public MyUserLocalServiceImpl(UserLocalService userLocalService) {
        super(userLocalService);
    }

	@Override
	public int authenticateByEmailAddress(long companyId, String emailAddress,
			String password, Map<String, String[]> headerMap,
			Map<String, String[]> parameterMap, Map<String, Object> resultsMap)
			throws PortalException, SystemException {
	
		String newEmailAddress = URLCodec.decodeURL(emailAddress, StringPool.UTF8, false);


		return super.authenticateByEmailAddress(companyId, newEmailAddress, password,
				headerMap, parameterMap, resultsMap);
	}


    
}
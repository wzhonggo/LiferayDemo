package com.labimo.portlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.labimo.licensor.HardwareBinder;
import com.labimo.licensor.LicenseUtils;
import com.labimo.licensor.Utils;
import com.labimo.model.License;
import com.labimo.model.LicenseModel;
import com.labimo.model.impl.LicenseImpl;
import com.labimo.service.LicenseLocalServiceUtil;
import com.labimo.service.persistence.LicensePK;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserGroup;
import com.liferay.portal.service.UserGroupLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.social.service.SocialActivityLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class LicenseManage extends MVCPortlet {
	private String password = "123456789";
	private String publicKey = "pubring.gpg";
	private String secretKey = "secring.gpg";
	

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws PortletException, IOException {
		// TODO Auto-generated method stub
		
		String action = (String) renderRequest.getAttribute("action");
		
		System.out.println("action" + action);
		
//		if(action == null){
//			action = ""
//		}
//		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest
				.getAttribute(com.liferay.portal.kernel.util.WebKeys.THEME_DISPLAY);
		try {
			List<UserGroup> userGroups = UserGroupLocalServiceUtil.getUserUserGroups(themeDisplay.getUserId());
			for(UserGroup group : userGroups){
				System.out.println(group.getName());
			}
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
//		if ("editLicense".equals(action)) {
//
//			include("/editLicense.jsp", renderRequest,renderResponse);
//		}{
			try {
				List<License> licenseList = LicenseLocalServiceUtil.getLicenses(0,
						20);

				System.out.println(licenseList.size());
				
		
//				LicenseTest test = new LicenseTest();
//				test.decode(LicenseManage.class.getClassLoader()
//					.getResourceAsStream("pubring.gpg"), LicenseManage.class.getClassLoader()
//					.getResourceAsStream("pubring.gpg"), null);
				renderRequest.setAttribute("licenseList", licenseList);
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			super.doView(renderRequest, renderResponse);

//		}
		
		
	}

	@ProcessAction(name = "deleteLicense")
	public void deleteLicense(ActionRequest actionRequest, ActionResponse response)
			throws Exception {
		System.out.println("--------------------");
		User currentUser = PortalUtil.getUser(actionRequest);
		Utils utils = new Utils();

		// License TrialLicense = new LicenseImpl();
		// lincense.setLicenseUuid(test.getUuid());
		// TrialLicense.setContent(getTrialLicenseContent());

	
		String licenseUuid = ParamUtil.getString(actionRequest,
				"licenseUuid");
		String hardwareUuid = ParamUtil.getString(actionRequest,
				"hardwareUuid");
		System.out.println("licenseUuid = " + licenseUuid);
		
		LicensePK licensePK = new LicensePK(licenseUuid, hardwareUuid);
		LicenseLocalServiceUtil.deleteLicense(licensePK);		
//		actionRequest.setAttribute("action", "default");
		
//		SocialActivityLocalServiceUtil.addActivity(currentUser.getUserId(),
//				gourpId, className, classPK, Demo4onstants.GET_VALUE,
//				extraDataJSONObject.toString(), 0);

	}
	
	
	@ProcessAction(name = "addLicense")
	public void addLicense(ActionRequest actionRequest, ActionResponse response)
			throws Exception {
		System.out.println("++++++++++++++++++++++++++++++");
		User currentUser = PortalUtil.getUser(actionRequest);
		Utils utils = new Utils();

		// License TrialLicense = new LicenseImpl();
		// lincense.setLicenseUuid(test.getUuid());
		// TrialLicense.setContent(getTrialLicenseContent());

		String hardwareUuid = ParamUtil.getString(actionRequest,
				"hardwareUuid");
		System.out.println("hardwareUuid = " + hardwareUuid);
		License ChargesLincense = new LicenseImpl();
		ChargesLincense.setLicenseUuid(LicenseUtils.getUuid());
		long userId = 10201;
		ChargesLincense.setUserId(userId);
		if (hardwareUuid == null || "".equals(hardwareUuid)) {
			ChargesLincense.setHardwareUuid(hardwareUuid);
		} else {
			ChargesLincense.setHardwareUuid(utils.getMachineIdString());
		}
		ChargesLincense.setHardwareUuid(hardwareUuid);
		
		String issueDate = "2014-02-01";
		String validDate = "2015-03-01";
		ChargesLincense.setContent(getChargesLicenseContent(hardwareUuid, issueDate, validDate));
		ChargesLincense.setCreateDate(new Date());
		ChargesLincense.setModifiedDate(new Date());

		LicenseLocalServiceUtil.addLicense(ChargesLincense);
//		actionRequest.setAttribute("action", "default");
		
		
//		SocialActivityLocalServiceUtil.addActivity(currentUser.getUserId(),
//				gourpId, className, classPK, Demo4onstants.GET_VALUE,
//				extraDataJSONObject.toString(), 0);

	}
	
	
	@ProcessAction(name = "editLicense")
	public void editLicense(ActionRequest actionRequest, ActionResponse response)
			throws Exception {
		System.out.println("-----------------------------------------------------------+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		User currentUser = PortalUtil.getUser(actionRequest);
		Utils utils = new Utils();

		// License TrialLicense = new LicenseImpl();
		// lincense.setLicenseUuid(test.getUuid());
		// TrialLicense.setContent(getTrialLicenseContent());

	
		String licenseUuid = ParamUtil.getString(actionRequest,
				"licenseUuid");
		String hardwareUuid = ParamUtil.getString(actionRequest,
				"hardwareUuid");
		System.out.println("licenseUuid = " + licenseUuid);
		System.out.println("hardwareUuid = " + hardwareUuid);
		
		LicensePK licensePK = new LicensePK(licenseUuid, hardwareUuid);		

		License license = LicenseLocalServiceUtil.getLicense(licensePK);
		System.out.println(license.getUserId());
		actionRequest.setAttribute("action", "editLicense");
		actionRequest.setAttribute("license", license);
		
		
		
//		SocialActivityLocalServiceUtil.addActivity(currentUser.getUserId(),
//				gourpId, className, classPK, Demo4onstants.GET_VALUE,
//				extraDataJSONObject.toString(), 0);

	}
	
	
	@ProcessAction(name = "updateLicense")
	public void updateLicense(ActionRequest actionRequest, ActionResponse response)
			throws Exception {
		System.out.println("--------------------");
		User currentUser = PortalUtil.getUser(actionRequest);
		Utils utils = new Utils();

		// License TrialLicense = new LicenseImpl();
		// lincense.setLicenseUuid(test.getUuid());
		// TrialLicense.setContent(getTrialLicenseContent());

		String userId = ParamUtil.getString(actionRequest,
				"userId");
	
	
		String licenseUuid = ParamUtil.getString(actionRequest,
				"licenseUuid");
		String hardwareUuid = ParamUtil.getString(actionRequest,
				"hardwareUuid");
		
		String issueDate = ParamUtil.getString(actionRequest,
				"issueDate");
		String validDate = ParamUtil.getString(actionRequest,
				"validDate");
		String createDate = ParamUtil.getString(actionRequest,
				"createDate");
		
		DynamicQuery dynamicQuery =  DynamicQueryFactoryUtil
				.forClass(License.class)
				.add(PropertyFactoryUtil.forName("userId").like(userId))
				.add(PropertyFactoryUtil.forName("licenseUuid").like(licenseUuid))
				.add(PropertyFactoryUtil.forName("hardwareUuid").like(hardwareUuid));
//				.add(PropertyFactoryUtil.forName("userId").like(userId))
		List<License> licenseList = LicenseLocalServiceUtil.dynamicQuery(dynamicQuery);	
		if(licenseList!=null && licenseList.size() ==1){
			License license = licenseList.get(0);
//			com.labimo.licensor.License licenseFile = LicenseUtils.decode(((LicenseModel) license).getContent());
//			LicenseUtils.getLicenseProperties(license.getContent());
			license.setContent(getChargesLicenseContent(license.getHardwareUuid(), issueDate, validDate));
		}
		
//		actionRequest.setAttribute("action", "default");
//		SocialActivityLocalServiceUtil.addActivity(currentUser.getUserId(),
//				gourpId, className, classPK, Demo4onstants.GET_VALUE,
//				extraDataJSONObject.toString(), 0);

	}
	

	public String getTrialLicenseContent() throws Exception {

		com.labimo.licensor.License license = new com.labimo.licensor.License();
		license.setLicense("edition=trial");
		license.loadKey(LicenseManage.class.getClassLoader()
				.getResourceAsStream("secring.gpg"),
				"wzhonggo (test) <wzhonggo@test.com>");

		// String licenseFileName = "license.txt";
		// String licenseFileName = "trialLicense.txt";
		String encoded = license.encodeLicense(password);
		// OutputStream os = new FileOutputStream(licenseFileName);
		// os.write(encoded.getBytes("utf-8"));
		// os.close();
		return encoded;
	}

	public String getChargesLicenseContent(String hardwareUuid,
			String issueDate, String validDate) throws Exception {

		com.labimo.licensor.License license = new com.labimo.licensor.License();
//		HardwareBinder hb = new HardwareBinder();
//		hb.setUseHwAddress();
		// System.out.print(hb.getMachineIdString());
//		Utils utils = new Utils();
		license.setLicense("uuid=" + hardwareUuid
				+ "\n issue-date=" +issueDate +" \n valid-date=" + validDate);
		license.loadKey(
				License.class.getClassLoader().getResourceAsStream(
						"secring.gpg"), "wzhonggo (test) <wzhonggo@test.com>");

		// String licenseFileName = "chargesLicense.txt";
		String encoded = license.encodeLicense(password);
		// OutputStream os = new FileOutputStream(licenseFileName);
		// os.write(encoded.getBytes("utf-8"));
		// os.close();

		System.out.println(encoded.length());
		return encoded;
	}


}

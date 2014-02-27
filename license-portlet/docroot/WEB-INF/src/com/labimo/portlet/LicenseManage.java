package com.labimo.portlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import com.labimo.licensor.HardwareBinder;
import com.labimo.licensor.LicenseUtils;
import com.labimo.licensor.Utils;
import com.labimo.model.Activation;
import com.labimo.model.License;
import com.labimo.model.impl.LicenseImpl;
import com.labimo.service.ActivationLocalServiceUtil;
import com.labimo.service.LicenseLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserGroup;
import com.liferay.portal.service.UserGroupLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.social.service.SocialActivityLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class LicenseManage extends MVCPortlet {
	private String password = "123456789";
	private String publicKey = "pubring.gpg";
	private String secretKey = "secring.gpg";
	private String manageGroup = "manage_license";
	private String pattern = "yyyy-MM-dd";
	private String liferay_pattern = "MM/dd/yyyy";
	private int queryMax = 20;
	private int hardwareUuidMaxCount = 5;

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws PortletException, IOException {

		String action = (String) renderRequest.getAttribute("action");
		System.out.println("action" + action);

		String screenName = (String) renderRequest.getAttribute("screenName");
		System.out.println("screenName" + screenName);

		Boolean flag = false;
		try {

			ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest
					.getAttribute(com.liferay.portal.kernel.util.WebKeys.THEME_DISPLAY);
			User currentUser = PortalUtil.getUser(renderRequest);
			if (currentUser != null) {
				List<UserGroup> userGroups = UserGroupLocalServiceUtil
						.getUserUserGroups(themeDisplay.getUserId());
				for (UserGroup group : userGroups) {
					System.out.println(group.getName());
					if (manageGroup.equals(group.getName())) {
						flag = true;
					}
				}

				List<License> licenseList = new ArrayList<License>();
				if (flag) {
					if (Validator.isBlank(screenName)) {
						licenseList = LicenseLocalServiceUtil.getLicenses(0,
								queryMax);
					} else {
						screenName = "%" + screenName + "%";
						DynamicQuery userQuery = DynamicQueryFactoryUtil
								.forClass(User.class).add(
										PropertyFactoryUtil.forName(
												"screenName").like(screenName));
						userQuery.setLimit(0, queryMax);
						List<User> userList = UserLocalServiceUtil
								.dynamicQuery(userQuery);
						List<Long> userIdList = new ArrayList<Long>();
						for (User user : userList) {
							userIdList.add(user.getUserId());
						}
						DynamicQuery query = DynamicQueryFactoryUtil.forClass(
								License.class).add(
								PropertyFactoryUtil.forName("userId").in(
										userIdList));

						licenseList = LicenseLocalServiceUtil
								.dynamicQuery(query);
					}

				} else {
					DynamicQuery query = DynamicQueryFactoryUtil.forClass(
							License.class).add(
							PropertyFactoryUtil.forName("userId").eq(
									currentUser.getUserId()));

					licenseList = LicenseLocalServiceUtil.dynamicQuery(query);

				}

				System.out.println(licenseList.size());
				renderRequest.setAttribute("licenseList", licenseList);
			}

			renderRequest.setAttribute("flag", flag);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("flag" + flag);
		if (flag) {
			super.doView(renderRequest, renderResponse);
		} else {
			include("/userView.jsp", renderRequest, renderResponse);
		}

	}

	@ProcessAction(name = "addLicensePage")
	public void addLicensePage(ActionRequest actionRequest,
			ActionResponse response) throws Exception {
		Calendar calendar = Calendar.getInstance();
		actionRequest.setAttribute("year", calendar.get(Calendar.YEAR));
		actionRequest.setAttribute("month", calendar.get(Calendar.MONTH));
		actionRequest.setAttribute("day", calendar.get(Calendar.DATE));
		actionRequest.setAttribute("action", "addLicensePage");

	}

	@ProcessAction(name = "addLicense")
	public void addLicense(ActionRequest actionRequest, ActionResponse response)
			throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(liferay_pattern);
		User currentUser = PortalUtil.getUser(actionRequest);
		Utils utils = new Utils();

		long userId = ParamUtil.getLong(actionRequest, "userId");
		// String hardwareUuid = ParamUtil.getString(actionRequest,
		// "hardwareUuid");
		Date issueDate = ParamUtil.getDate(actionRequest, "issueDate", sdf);
		Date validDate = ParamUtil.getDate(actionRequest, "validDate", sdf);
		
		// Integer issue_day = ParamUtil.getInteger(actionRequest, "issue_day");
		// Integer issue_month = ParamUtil.getInteger(actionRequest,
		// "issue_month");
		// Integer issue_year = ParamUtil.getInteger(actionRequest,
		// "issue_year");
		// Calendar issueCalendar = Calendar.getInstance();
		// issueCalendar.set(issue_year, issue_month, issue_day, 0, 0, 0);
		// issueDate =issueCalendar.getTime();
		//
		// Integer valid_day = ParamUtil.getInteger(actionRequest, "valid_day");
		// Integer valid_month = ParamUtil.getInteger(actionRequest,
		// "valid_month");
		// Integer valid_year = ParamUtil.getInteger(actionRequest,
		// "valid_year");
		// Calendar validCalendar = Calendar.getInstance();
		// validCalendar.set(valid_year, valid_month, valid_day, 0, 0, 0);
		// validDate = validCalendar.getTime();

		long currentTime = new Date().getTime();
		System.out.println("userId = " + userId);
		// System.out.println("hardwareUuid = " + hardwareUuid);
		System.out.println("issueDate = " + issueDate);
		System.out.println("validDate = " + validDate);
		User user = UserLocalServiceUtil.fetchUser(userId);

		if (Validator.isNotNull(user) && validDate.after(issueDate)
				&& validDate.getTime() > currentTime) {
			License ChargesLincense = new LicenseImpl();
			String licenseId = LicenseUtils.getCustomUuid(UUID.randomUUID());
			ChargesLincense.setLicenseUuid(licenseId);
			ChargesLincense.setIssueDate(issueDate);
			ChargesLincense.setValidDate(validDate);
			ChargesLincense.setUserId(userId);
			ChargesLincense.setValid(true);
			ChargesLincense.setCreateDate(new Date());
			ChargesLincense.setModifiedDate(new Date());

			LicenseLocalServiceUtil.addLicense(ChargesLincense);

			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest
					.getAttribute(WebKeys.THEME_DISPLAY);
			long gourpId = themeDisplay.getScopeGroupId();
			JSONObject extraDataJSONObject = JSONFactoryUtil.createJSONObject();
			extraDataJSONObject.put("title",
					currentUser.getScreenName()
							+ LicenseConstants.ADD_LICENSE_MSG
							+ ChargesLincense.getLicenseUuid());
			SocialActivityLocalServiceUtil.addActivity(currentUser.getUserId(),
					gourpId, LicenseConstants.LICENSE_CLASS_NAME,
					LicenseConstants.LICENSE_CLASS_NAME_ID,
					LicenseConstants.ADD_LICENSE,
					extraDataJSONObject.toString(), 0);

		}

	}

	@ProcessAction(name = "editLicense")
	public void editLicense(ActionRequest actionRequest, ActionResponse response)
			throws Exception {
		// User currentUser = PortalUtil.getUser(actionRequest);
		// Utils utils = new Utils();

		String licenseUuid = ParamUtil.getString(actionRequest, "licenseUuid");
		// String hardwareUuid = ParamUtil.getString(actionRequest,
		// "hardwareUuid");
		License license = LicenseLocalServiceUtil.getLicense(licenseUuid);

		actionRequest.setAttribute("action", "editLicense");
		actionRequest.setAttribute("license", license);

		//

	}

	@ProcessAction(name = "updateLicense")
	public void updateLicense(ActionRequest actionRequest,
			ActionResponse response) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(liferay_pattern);
		User currentUser = PortalUtil.getUser(actionRequest);
		Utils utils = new Utils();
		long userId = ParamUtil.getLong(actionRequest, "userId");

		String licenseUuid = ParamUtil.getString(actionRequest, "licenseUuid");
		licenseUuid = LicenseUtils.formatToString(licenseUuid);
		String hardwareUuid = ParamUtil
				.getString(actionRequest, "hardwareUuid");
		Boolean valid = ParamUtil.getBoolean(actionRequest, "valid");

		Date issueDate = ParamUtil.getDate(actionRequest, "issueDate", sdf);
		Date validDate = ParamUtil.getDate(actionRequest, "validDate", sdf);
		long currentTime = new Date().getTime();
		System.out.println("userId = " + userId);
		System.out.println("licenseUuid = " + licenseUuid);
		System.out.println("issueDate = " + issueDate);
		System.out.println("hardwareUuid = " + hardwareUuid);
		System.out.println("validDate = " + validDate);
		System.out.println("valid = " + valid + " valid="
				+ ParamUtil.getString(actionRequest, "valid"));
		License license = LicenseLocalServiceUtil.getLicense(licenseUuid);

		if (license != null && license.getUserId() == userId
				&& validDate.after(issueDate)
				&& validDate.getTime() > currentTime) {
			System.out.println("======");
			license.setModifiedDate(new Date());
			license.setIssueDate(issueDate);
			license.setValidDate(validDate);
			license.setValid(valid);
			LicenseLocalServiceUtil.updateLicense(license);

			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest
					.getAttribute(WebKeys.THEME_DISPLAY);
			long gourpId = themeDisplay.getScopeGroupId();
			JSONObject extraDataJSONObject = JSONFactoryUtil.createJSONObject();
			extraDataJSONObject.put(
					"title",
					currentUser.getScreenName()
							+ LicenseConstants.UPDATE_LICENSE_MSG
							+ license.getLicenseUuid());
			SocialActivityLocalServiceUtil.addActivity(currentUser.getUserId(),
					gourpId, LicenseConstants.LICENSE_CLASS_NAME,
					LicenseConstants.LICENSE_CLASS_NAME_ID,
					LicenseConstants.UPDATE_LICENSE,
					extraDataJSONObject.toString(), 0);
		}

	}

	@ProcessAction(name = "addHardwareUuidPage")
	public void addHardwareUuidPage(ActionRequest actionRequest,
			ActionResponse response) throws Exception {
		System.out.println("====================================");
		String licenseUuid = ParamUtil.getString(actionRequest, "licenseUuid");
		// String activationId = ParamUtil.getString(actionRequest,
		// "activationId");
		System.out.println("licenseUuid = " + licenseUuid);
		// System.out.println("activationId = " + activationId);

		// Activation activation =
		// ActivationLocalServiceUtil.getActivation(activationId);

		actionRequest.setAttribute("licenseUuid", licenseUuid);
		actionRequest.setAttribute("action", "addHardwareUuidPage");

	}

	@ProcessAction(name = "addHardwareUuid")
	public void addHardwareUuid(ActionRequest actionRequest,
			ActionResponse response) throws Exception {
		System.out.println("====================================");

		String licenseUuid = ParamUtil.getString(actionRequest, "licenseUuid");
		String hardwareUuid = ParamUtil
				.getString(actionRequest, "hardwareUuid");
	
		System.out.println("licenseUuid = " + licenseUuid);
		System.out.println("hardwareUuid = " + hardwareUuid);
		System.out.println("hardwareUuid  length= " + hardwareUuid.length());

		if (hardwareUuid != null) {
			hardwareUuid = LicenseUtils.formatToString(hardwareUuid);
		}

		if (licenseUuid != null) {
			licenseUuid = LicenseUtils.formatToString(licenseUuid);
		}

		if (LicenseUtils.checkUuid(hardwareUuid)) {
			DynamicQuery query = DynamicQueryFactoryUtil
					.forClass(Activation.class)
					.add(PropertyFactoryUtil.forName("licenseUuid").eq(
							licenseUuid))
					.add(PropertyFactoryUtil.forName("hardwareUuid").eq(
							hardwareUuid));
			List<Activation> activationList = ActivationLocalServiceUtil
					.dynamicQuery(query);

			DynamicQuery hardwareUuidQuery = DynamicQueryFactoryUtil.forClass(
					Activation.class).add(
					PropertyFactoryUtil.forName("hardwareUuid")
							.eq(hardwareUuid));
			List<Activation> hardwareUuidQueryList = ActivationLocalServiceUtil
					.dynamicQuery(hardwareUuidQuery);

			DynamicQuery licenseUuidQuery = DynamicQueryFactoryUtil.forClass(
					Activation.class).add(
					PropertyFactoryUtil.forName("licenseUuid").eq(licenseUuid));
			List<Activation> licenseUuidQueryList = ActivationLocalServiceUtil
					.dynamicQuery(hardwareUuidQuery);

			for (Activation activation : hardwareUuidQueryList) {
				if (!activation.getLicenseUuid().equals(licenseUuid)) {
					activation.setValid(false);
					ActivationLocalServiceUtil.updateActivation(activation);
				}
			}

			if (licenseUuidQueryList == null
					|| licenseUuidQueryList.size() == 0
					|| licenseUuidQueryList.size() < hardwareUuidMaxCount) {
				if (activationList == null || activationList.size() == 0) {
					hardwareUuid = hardwareUuid.toUpperCase();
					Activation activation = ActivationLocalServiceUtil
							.createActivation(LicenseUtils.getUuid());
					activation.setCreateTime(new Date());
					activation.setLicenseUuid(licenseUuid);
					activation.setHardwareUuid(hardwareUuid);
					activation.setValid(true);
					ActivationLocalServiceUtil.addActivation(activation);
				}
			}
		}

	}

	@ProcessAction(name = "searchLicense")
	public void searchLicense(ActionRequest actionRequest,
			ActionResponse response) {
		String screenName = ParamUtil.getString(actionRequest, "screenName");
		System.out.println("screenName = " + screenName);

		actionRequest.setAttribute("screenName", screenName);
	}

	@ProcessAction(name = "editActivation")
	public void editActivation(ActionRequest actionRequest,
			ActionResponse response) throws PortalException, SystemException {
		String licenseUuid = ParamUtil.getString(actionRequest, "licenseUuid");

		DynamicQuery query = DynamicQueryFactoryUtil
				.forClass(Activation.class)
				.add(PropertyFactoryUtil.forName("licenseUuid").eq(licenseUuid));
		List<Activation> activationList = ActivationLocalServiceUtil
				.dynamicQuery(query);

		actionRequest.setAttribute("action", "editActivation");
		actionRequest.setAttribute("licenseUuid", licenseUuid);
		actionRequest.setAttribute("activationList", activationList);
	}

	@ProcessAction(name = "updateActivation")
	public void updateActivation(ActionRequest actionRequest,
			ActionResponse response) throws PortalException, SystemException {
		String[] activationId_valids = ParamUtil.getParameterValues(
				actionRequest, "activationId_valid");
		// System.out.println("activationId_valid = " + activationId_valid);
		//
		// HttpServletRequest httpServletRequest
		// =PortalUtil.getHttpServletRequest(actionRequest);
		// String activationId_valid2 =
		// httpServletRequest.getParameter("activationId_valid");
		// String [] activationId_valids =
		// httpServletRequest.getParameterValues("activationId_valid");
		for (String activationId_valid : activationId_valids) {
			System.out.println("activationId_valid = " + activationId_valid);
			if (activationId_valid != null && activationId_valid.contains("_")) {
				String[] str = activationId_valid.split("_");
				if (str.length == 2) {
					System.out.println("activationId= " + str[0]);
					System.out.println("valid= " + str[1]);
					Activation activation = ActivationLocalServiceUtil
							.getActivation(str[0]);
					activation.setValid(Boolean.valueOf(str[1]));
					ActivationLocalServiceUtil.updateActivation(activation);
				}

			}
		}

		// DynamicQuery query =
		// DynamicQueryFactoryUtil.forClass(Activation.class).add(
		// PropertyFactoryUtil.forName("licenseUuid").eq(licenseUuid));
		// List<Activation> activationList =
		// ActivationLocalServiceUtil.dynamicQuery(query);
		//
		// actionRequest.setAttribute("action", "editActivation");
		// actionRequest.setAttribute("licenseUuid", licenseUuid);
		// actionRequest.setAttribute("activationList", activationList);
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
		// HardwareBinder hb = new HardwareBinder();
		// hb.setUseHwAddress();
		// System.out.print(hb.getMachineIdString());
		// Utils utils = new Utils();
		license.setLicense("uuid=" + hardwareUuid + "\n issue-date="
				+ issueDate + " \n valid-date=" + validDate);
		license.loadKey(LicenseManage.class.getClassLoader()
				.getResourceAsStream("secring.gpg"),
				"wzhonggo (test) <wzhonggo@test.com>");

		// String licenseFileName = "chargesLicense.txt";
		String encoded = license.encodeLicense(password);
		// OutputStream os = new FileOutputStream(licenseFileName);
		// os.write(encoded.getBytes("utf-8"));
		// os.close();

		System.out.println(encoded.length());
		return encoded;
	}

	public String getChargesLicenseContent(String hardwareUuid, Date issueDate,
			Date validDate) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return getChargesLicenseContent(hardwareUuid, sdf.format(issueDate),
				sdf.format(validDate));
	}

}

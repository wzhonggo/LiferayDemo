package com.labimo.portlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import com.labimo.licensor.LicenseUtils;
import com.labimo.model.Activation;
import com.labimo.model.License;
import com.labimo.service.LicenseLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class DownloadServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String hardwareUuid = request.getParameter("hardwareUuid");
		String licenseUuid = request.getParameter("licenseUuid");
		String fileName = "license.txt";
		License license = null;
		try {
			license = LicenseLocalServiceUtil
					.getLicense(licenseUuid);
			if (license != null && license.getValid()) {
				response.setHeader("Content-Type", "application/octet-stream");
				ServletOutputStream servletOutputStream = response
						.getOutputStream();
				response.setHeader("Content-Disposition",
						"attachment; filename=\"" + fileName + "\"");

				IOUtils.write(LicenseUtils.getChargesLicenseContent(
						hardwareUuid, license.getIssueDate(),
						license.getValidDate()), servletOutputStream);

				servletOutputStream.flush();
				servletOutputStream.close();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * String activationId = "1a508567-61f9-3e5a-8923-b27ca6d00028"; String
		 * fileName = "license.txt"; List<Activation> activationList =
		 * LicenseUtils
		 * .getActivationListByLicenseUuid("4091a61b-4b3d-46b9-890d-2a3e63f09d3c"
		 * ); if (activationList != null && activationList.size() > 0) { //
		 * License license = // LicenseLocalServiceUtil.getLicense(licenseUuid);
		 * License license = null; try { license = LicenseLocalServiceUtil
		 * .getLicense("4091a61b-4b3d-46b9-890d-2a3e63f09d3c"); } catch
		 * (PortalException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (SystemException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * System.out.println("getIssueDate = " + license.getIssueDate());
		 * System.out.println("getValidDate = " + license.getValidDate());
		 * System.out.println("getValid = " + license.getValid()); if
		 * (license.getValid()) { response.setHeader("Content-Type",
		 * "application/octet-stream"); ServletOutputStream servletOutputStream
		 * = response .getOutputStream();
		 * response.setHeader("Content-Disposition", "attachment; filename=\"" +
		 * fileName + "\"");
		 * 
		 * try { IOUtils.write(LicenseUtils.getChargesLicenseContent(
		 * activationId, license.getIssueDate(), license.getValidDate()),
		 * servletOutputStream); } catch (Exception e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } servletOutputStream.flush();
		 * servletOutputStream.close();
		 * 
		 * } }
		 */

	}

}
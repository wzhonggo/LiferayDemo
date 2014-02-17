<%
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
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@page import="com.labimo.model.License"%>
<%@page import="com.labimo.licensor.LicenseUtils"%>

<portlet:defineObjects />

<portlet:actionURL var="updateLicense" name="updateLicense">
</portlet:actionURL>



					<%
					License license = (License)request.getAttribute("license");
					com.labimo.licensor.License licenseFile = LicenseUtils.decode(license.getContent());
					String issueDate = licenseFile.getFeature("issue-date");
					String validDate = licenseFile.getFeature("valid-date");
					%>
   
<form action="<portlet:actionURL name="updateLicense"></portlet:actionURL>" method="post" name="<portlet:namespace />fm">   
   <table>
			<tr>
				<td>userId</td>
				<td><input type="text" name="userId" readonly="readonly"/> ${license.userId}</td>
			</tr>
			<tr>
				<td>licenseUuid</td>
				<td><input type="text" name="licenseUuid" readonly="readonly"//> ${license.licenseUuid}</td>
			</tr>
			<tr>
				<td>hardwareUuid</td>
					<td><input type="text" name="hardwareUuid" readonly="readonly"/> ${license.hardwareUuid}</td>
			</tr>
			<tr>
				<td>issueDate</td>
					<td><input type="text" name="issueDate" /> <%=issueDate %></td>
			</tr>
			<tr>
				<td>validDate</td>
							<td><input type="text" name="issueDate" /><%=validDate %></td>
			</tr>
			<tr>
				<td>createDate</td>
				<td><input type="text" name="licenseUuid" readonly="readonly"/> ${license.licenseUuid}</td>
			</tr>
				<tr>
				<td>modifiedDate</td>
				<td><input type="text" name="licenseUuid" readonly="readonly"/> ${license.licenseUuid}</td>
			</tr>
				<tr>
				<td> <input type="submit" value="Update" /></td>
			</tr>
			
 </table>  
</form>




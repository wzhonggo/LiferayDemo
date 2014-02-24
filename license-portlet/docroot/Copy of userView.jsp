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

<%@page import="com.labimo.licensor.License"%>
<%@page import="com.labimo.licensor.LicenseUtils"%>
<%@page import="com.labimo.model.Activation"%>
<%@page import="java.util.*"%>

<portlet:defineObjects />

<portlet:actionURL var="downloadLicense" name="downloadLicense">
</portlet:actionURL>

<c:if test="${fn:length(licenseList) == 0}">
		You do not have license, please buy a license!
</c:if>


<c:if test="${fn:length(licenseList) != 0}">

<table>
			<tr>
				<td>licenseUuid</td>
				<td>hardwareUuid</td>
			
				<td>issueDate</td>
				<td>validDate</td>
				<td>createDate</td>
				<td>modifiedDate</td>
				<td>download<td>
				<td><td>
			</tr>
			<c:forEach items="${licenseList}" var="license" varStatus="index">
			<c:set var="content" scope="request" value="${license.licenseUuid}" />
					<%String licenseUuid = (String)request.getAttribute("licenseUuid");
					List<Activation> activationList = LicenseUtils.getActivationListByLicenseUuid(licenseUuid);
					%>
					<c:set var="activationList" scope="request" value="<%=activationList %>" />
					
						<tr>
							<td>${license.licenseUuid}</td>
							<c:forEach items="${activationList}" var="activation" varStatus="index">
							<td>${activation.activationId}</td>	
							</c:forEach>		
							<td>${license.issueDate}</td>
							<td>${license.validDate}</td>
							<td>${license.createDate}</td>
							<td>${license.modifiedDate}</td>
							<td>
							<form action="<portlet:actionURL name="downloadLicense"></portlet:actionURL>" method="post" name="<portlet:namespace />downloadLicense">   
								   <table>
											<tr>
												<td>licenseUuid</td>
												<td><input type="text" name="<portlet:namespace/>licenseUuid" /> </td>
											</tr>
											
											<tr>
												<td>activationId</td>
													<td><input type="text" name="<portlet:namespace/>activationId"  /> </td>
											</tr>
												<tr>
												<td> <input type="submit" value="downloadLicense" /></td>
											</tr>
											
								 </table>  
							</form>
							<td>
						</tr>
					
				
			</c:forEach>
		</table>
</c:if>
	




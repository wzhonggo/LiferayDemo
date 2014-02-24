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
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 

<%@page import="com.labimo.licensor.License"%>
<%@page import="com.labimo.licensor.LicenseUtils"%>
<%@page import="com.labimo.model.Activation"%>
<%@page import="java.util.*"%>

<portlet:defineObjects />

<portlet:actionURL var="downloadLicense" name="downloadLicense">
</portlet:actionURL>

<portlet:actionURL var="addHardwareUuidPage" name="addHardwareUuidPage">
</portlet:actionURL>

<c:if test="${fn:length(licenseList) == 0}">
		You do not have license, please buy a license!
</c:if>


<c:if test="${fn:length(licenseList) != 0}">
<c:if test="${action == null}">
	<table>
			<tr>
				<td>licenseUuid</td>
					<td>valid</td>		
				<td>issueDate</td>
				<td>validDate</td>
				<td>createDate</td>
				<td>modifiedDate</td>
				<td>hardwareUuid</td>
				<td><td>
			</tr>
			<c:forEach items="${licenseList}" var="license" varStatus="index">
			<c:set var="licenseUuid" scope="request" value="${license.licenseUuid}" />
					<%String licenseUuid = (String)request.getAttribute("licenseUuid");
					
					String addHardwareUuidPageUrl = addHardwareUuidPage + "&" +renderResponse.getNamespace()+"licenseUuid="+  licenseUuid;
					List<Activation> activationList = LicenseUtils.getActivationListByLicenseUuid(licenseUuid);
					%>
					<c:set var="activationList" scope="request" value="<%=activationList %>" />
					
						<tr>
							<td><%=LicenseUtils.formatToUuid(licenseUuid) %></td>
								<td>${license.valid}</td>
							<td><fmt:formatDate value="${license.issueDate}" pattern="yyyy-MM-dd"/></td>
							<td><fmt:formatDate value="${license.validDate}" pattern="yyyy-MM-dd"/>${license.validDate}</td>
							<td><fmt:formatDate value="${license.createDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
							<td><fmt:formatDate value="${license.modifiedDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
							
							<c:if test="${fn:length(activationList) == 0 || activationList ==null}">
								<td></td>
								<td>
									<liferay-ui:icon-menu>
												<liferay-ui:icon
													image="add"
													message="addHardwareUuid"
													url="<%=addHardwareUuidPageUrl %>"
												/>	
																
											
									</liferay-ui:icon-menu>	
									
										<%-- <form action="<portlet:actionURL name="addHardwareUuidPage"></portlet:actionURL>" method="post" name="<portlet:namespace />addHardwareUuidPage">
											<input type="hidden" name="<portlet:namespace/>licenseUuid"  value="${license.licenseUuid}"/>
											 <input type="submit" value="addHardwareUuid" />
										</form>  --%>
										
									</td>	
							</c:if>
							
							<c:if test="${fn:length(activationList) > 0 && fn:length(activationList) <5}">
							<td>
								<c:forEach items="<%=activationList %>" var="activation" varStatus="index">
										<input type="text" name="<portlet:namespace/>hardwareUuid" readonly="readonly" value="${activation.hardwareUuid}"  />
									<c:if test="${activation.valid && license.valid}">
										<a href="/license-portlet/licenseDownload?hardwareUuid=${activation.hardwareUuid}&licenseUuid=${activation.licenseUuid}">download</a> 
									</c:if>
									<c:if test="${!activation.valid || !license.valid}">
										not activation 
									</c:if>
										
									<br>
								</c:forEach>
								</td>	
								<td>
									<liferay-ui:icon-menu>
											<liferay-ui:icon
												image="add"
												message="addHardwareUuid"
												url="<%=addHardwareUuidPageUrl %>"
											/>		
											
									
											
								</liferay-ui:icon-menu>	
										<%-- <form action="<portlet:actionURL name="addHardwareUuidPage"></portlet:actionURL>" method="post" name="<portlet:namespace />addHardwareUuidPage">
											<input type="hidden" name="<portlet:namespace/>licenseUuid"  value="${license.licenseUuid}"/>
											 <input type="submit" value="addHardwareUuid" />
										</form>  --%>
										
									</td>	
							</c:if>
							
								<c:if test="${ fn:length(activationList) >= 5}">
									<td>
									<c:forEach items="<%=activationList %>" var="activation" varStatus="index">
											<input type="text" name="<portlet:namespace/>hardwareUuid" readonly="readonly" value="${activation.hardwareUuid}"  />
										
											<c:if test="${activation.valid}">
											<a href="/license-portlet/licenseDownload?hardwareUuid=${activation.hardwareUuid}&licenseUuid=${activation.licenseUuid}">download</a>
											</c:if>
											<c:if test="${!activation.valid}">
												not activation 
											</c:if>
										 <br>
									</c:forEach>
									</td>
									<td></td>	
								</c:if>
							
						</tr>
			</c:forEach>
		</table>
		
		
</c:if>



<c:if test="${action eq  'addHardwareUuidPage'}">
<% 
String licenseUuid = (String)request.getAttribute("licenseUuid"); %>
		<form action="<portlet:actionURL name="addHardwareUuid"></portlet:actionURL>" method="post" name="<portlet:namespace />addHardwareUuid"> 
		<table>
				<tr>
					<td>licenseUuid</td>
					<td><input readonly="readonly" name="<portlet:namespace/>licenseUuid"  value="<%=LicenseUtils.formatToUuid(licenseUuid) %>" /></td>
					<td><td>
				</tr>
				<tr>
					<td>hardwareUuid</td>
					<td><input type="text" name="<portlet:namespace/>hardwareUuid"/></td>
					<td><td>
				</tr>
		
					<tr>
							<td> <input type="submit" value="Update" /></td>
							<td> <input type="button" value="Cancel" onClick="reloadPage()"/></td>
						</tr>
			</table>
	</form>
</c:if>


</c:if>


	




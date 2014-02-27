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

<portlet:actionURL  var="addHardwareUuid" name="addHardwareUuid"></portlet:actionURL>

<c:if test="${fn:length(licenseList) == 0}">
		You do not have license, please buy a license!
</c:if>


<c:if test="${fn:length(licenseList) != 0}">
<c:if test="${action == null}">

		<liferay-ui:search-container >
		<liferay-ui:search-container-results
			results="${licenseList}"
			total="${fn:length(licenseList)}"
		/>
	
		<liferay-ui:search-container-row
			className="com.labimo.model.License"
			keyProperty="licenseUuid"
			modelVar="license"
		>
		<c:set var="licenseUuid" scope="request" value="<%=license.getLicenseUuid() %>" />
	
			<liferay-ui:search-container-column-text
				name="licenseUuid"
				value="<%=LicenseUtils.formatToUuid(license.getLicenseUuid()) %>"
			/>
	
			<liferay-ui:search-container-column-text
				name="valid"
					property="valid"
			/>
						
			<%
						String licenseUuid = license.getLicenseUuid();
						List<Activation> activationList = LicenseUtils
								.getActivationListByLicenseUuid(licenseUuid);
		%>
			 <liferay-ui:search-container-column-text
					name="hardwareUuid"
				
				> 
				<%
						
						for (Activation activation : activationList) {
							String href = "/license-portlet/licenseDownload?hardwareUuid="
									+ activation.getHardwareUuid() + "&licenseUuid="
									+ activation.getLicenseUuid();
							String hardwareUuid = LicenseUtils.formatToUuid(activation
									.getHardwareUuid());
					%>
						<%=hardwareUuid %>
						
						<%
							if(activation.getValid() && license.getValid()){			
							
						%>
						
							<aui:a href="<%= href %>" label="download license"></aui:a>
					
									
						<% 			
							}else{
								
							
						%>
						 not activation
							<% 			
							}
						%>
						<br>
									
					<% 			
						}
					%>
				</liferay-ui:search-container-column-text>
				
			
			<fmt:formatDate value="${license.issueDate}" pattern="yyyy-MM-dd" var="issueDate"/>
			<fmt:formatDate value="${license.validDate}" pattern="yyyy-MM-dd" var="validDate"/>
			<fmt:formatDate value="${license.createDate}" pattern="yyyy-MM-dd HH:mm:ss" var="createDate"/>
			<fmt:formatDate value="${license.modifiedDate}" pattern="yyyy-MM-dd HH:mm:ss" var="modifiedDate"/>
			<liferay-ui:search-container-column-text
				name="issueDate"
				value="${issueDate}"
			/>
			<liferay-ui:search-container-column-text
				name="validDate"
				value="${validDate}"
			/>
			<liferay-ui:search-container-column-text
				name="createDate"
				value="${createDate}"
			/>
			<liferay-ui:search-container-column-date
				name="modifiedDate"
				property="modifiedDate"
			/> 
			
			
			
				<liferay-ui:search-container-column-text>
					<%
						if(activationList==null || activationList.size() < 5){
							String addHardwareUuidPageUrl = addHardwareUuidPage + "&" +renderResponse.getNamespace()+"licenseUuid="+  licenseUuid;
							
					%>
					<liferay-ui:icon-menu showWhenSingleIcon="true">
						<liferay-ui:icon image="add" message="addHardwareUuid"
							url="<%=addHardwareUuidPageUrl%>" />
					
					
					</liferay-ui:icon-menu>
					<%
						}else{
							
					%>	
					Up to bind 5  Hardware Uuid.
					<% 	
					}
						
					%>
				
				
					
				</liferay-ui:search-container-column-text>			
			 		
				
		 
				
		
			
		</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>
		
</c:if>



<c:if test="${action eq  'addHardwareUuidPage'}">
<% 
String licenseUuid = (String)request.getAttribute("licenseUuid"); %>
		<%-- <form action="<portlet:actionURL name="addHardwareUuid"></portlet:actionURL>" method="post" name="<portlet:namespace />addHardwareUuid"> 
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
	</form> --%>
	
	
	<aui:form action="<%= addHardwareUuid %>" method="post" name="<portlet:namespace />addHardwareUuid" >
	 <aui:input name="licenseUuid"  label="licenseUuid" value="<%=LicenseUtils.formatToUuid(licenseUuid)  %>" type="hidden"></aui:input>
	     <aui:input name="licenseUuid2"  label="licenseUuid" value="<%=LicenseUtils.formatToUuid(licenseUuid) %>" style="width:300px;"  disabled="true"></aui:input>
	 	<aui:input name="hardwareUuid"  label="hardwareUuid"  style="width:300px;"></aui:input>
	   <aui:button-row>
			<aui:button name="saveButton" type="submit" value="Update"  />
			<aui:button name="cancelButton" type="button" value="Cancel" onClick="reloadPage()" />
		</aui:button-row>

	</aui:form>
</c:if>


</c:if>

	




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
<%-- <%@page import="com.labimo.model.License"%> --%>
<%@page import="com.labimo.licensor.LicenseUtils"%>

<portlet:defineObjects />

<portlet:actionURL var="addLicense" name="addLicense">
</portlet:actionURL>

<portlet:actionURL var="deleteLicense" name="deleteLicense">
</portlet:actionURL>

<portlet:actionURL var="editLicense" name="editLicense">
</portlet:actionURL>


<a href="<%= addLicense %>">add license to db </a>


<%-- ${fn:length(licenseList)} --%>  
action  ${action}<br><br>
   
   
<c:if test="${action == null }">
	
	<table>
			<tr>
				<td>userId</td>
				<td>licenseUuid</td>
				<td>hardwareUuid</td>
				<td>createDate</td>
				<td>modifiedDate</td>
				<td>issueDate</td>
				<td>validDate</td>
				<td>action<td>
				<td>action<td>
			</tr>
			<c:forEach items="${licenseList}" var="license" varStatus="index">
			<c:set var="content" scope="request" value="${license.content}" />
				<tr class="blue">
					<td> ${license.userId}</td>
					<td>${license.licenseUuid}</td>
					<td>${license.hardwareUuid}</td>
					<td>${license.createDate}</td>
					<td>${license.modifiedDate}</td>
					
					<%
					String content = (String)request.getAttribute("content");
					License licenseFile = LicenseUtils.decode(content);
					String issueDate = licenseFile.getFeature("issue-date");
					String validDate = licenseFile.getFeature("valid-date");
					%>
					<td><%=issueDate %></td>
					<td><%=validDate %></td>
					<td>
						<form action="<portlet:actionURL name="deleteLicense"></portlet:actionURL>" method="post" name="<portlet:namespace />deleteLicense">
							 <input type=hidden name="<portlet:namespace/>licenseUuid" value="${license.licenseUuid}"></input> 
							 <input type=hidden name="<portlet:namespace/>hardwareUuid" value="${license.hardwareUuid}"></input> 
							
							 <input type="submit" value="Delete" />
						</form> 
					</td>
					<td>
					 <form action="<portlet:actionURL name="editLicense"></portlet:actionURL>" method="post" name="<portlet:namespace />editLicense">
							 <input type=hidden name="<portlet:namespace/>licenseUuid" value="${license.licenseUuid}"></input> 
							 <input type=hidden name="<portlet:namespace/>hardwareUuid" value="${license.hardwareUuid}"></input> 
							
							 <input type="submit" value="Edit" />
						</form>  
					</td>
				</tr>
			</c:forEach>
		</table>
  
</c:if>

<c:if test="${action eq  'editLicense'}">
			<%
					com.labimo.model.License license = (com.labimo.model.License)request.getAttribute("license");
					License licenseFile = LicenseUtils.decode(license.getContent());
					String issueDate = licenseFile.getFeature("issue-date");
					String validDate = licenseFile.getFeature("valid-date");
					%>
   
<form action="<portlet:actionURL name="updateLicense"></portlet:actionURL>" method="post" name="<portlet:namespace />fm">   
   <table>
			<tr>
				<td>userId</td>
				<td><input type="text" name="userId" readonly="readonly" value="${license.userId}"/> </td>
			</tr>
			<tr>
				<td>licenseUuid</td>
				<td><input type="text" name="licenseUuid" readonly="readonly" value="${license.licenseUuid}" /> </td>
			</tr>
			<tr>
				<td>hardwareUuid</td>
					<td><input type="text" name="hardwareUuid" readonly="readonly" value="${license.hardwareUuid}"  /> </td>
			</tr>
			<tr>
				<td>issueDate</td>
					<td><input type="text" name="issueDate"  value="<%=issueDate %>" /> </td>
			</tr>
			<tr>
				<td>validDate</td>
							<td><input type="text" name="issueDate" value="<%=validDate %>" /></td>
			</tr>
			<tr>
				<td>createDate</td>
				<td><input type="text" name="licenseUuid" readonly="readonly" value="${license.licenseUuid}" /> </td>
			</tr>
				<tr>
				<td>modifiedDate</td>
				<td><input type="text" name="licenseUuid" readonly="readonly" value="${license.licenseUuid}" /> </td>
			</tr>
				<tr>
				<td> <input type="submit" value="Update" /></td>
			</tr>
			
 </table>  
</form>
</c:if>

   




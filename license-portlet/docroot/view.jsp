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
  <%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>

<%@page import="com.labimo.licensor.License"%>
<%@page import="com.labimo.model.Activation"%>
<%@page import="com.labimo.licensor.LicenseUtils"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="java.util.*"%>



<portlet:defineObjects />

<portlet:actionURL var="addLicensePage" name="addLicensePage">
</portlet:actionURL>

<portlet:actionURL var="addLicense" name="addLicense">
</portlet:actionURL>



<portlet:actionURL var="editLicense" name="editLicense">
</portlet:actionURL>

<portlet:actionURL var="searchLicense" name="searchLicense">
</portlet:actionURL>


<portlet:actionURL var="editActivation" name="editActivation">
</portlet:actionURL>
<portlet:actionURL var="updateActivation" name="updateActivation">
</portlet:actionURL>


<%-- <liferay-ui:tabs names="abc, edf, hed,dfadf" /> --%>
 
   
<c:if test="${action == null }">
	<aui:form  action="<%=searchLicense %>" method="post" >
     	  	<aui:input type="text" placeholder="screenName" name="screenName" label=""/>
		 	<aui:button type="submit" value="Search" />
	</aui:form>
	 <a href="<%= addLicensePage %>">add license  </a>
	<table>
			<tr>
				<td>userId</td>
				<td>screenName</td>
				<td>licenseUuid</td>
				<td>hardwareUuid</td>	
				<td>valid</td>		
				<td>issueDate</td>
				<td>validDate</td>
				<td>createDate</td>
				<td>modifiedDate</td>
				<td><td>
			</tr>
			<c:forEach items="${licenseList}" var="license" varStatus="index">
			<c:set var="userId" scope="request" value="${license.userId}" />
			<c:set var="licenseUuid" scope="request" value="${license.licenseUuid}" />
				<%
					Long userId = (Long)request.getAttribute("userId");
					User user = UserLocalServiceUtil.getUser(userId);
					String screenName = user.getScreenName();
				
						String licenseUuid = (String)request.getAttribute("licenseUuid");
						List<Activation> activationList = LicenseUtils.getActivationListByLicenseUuid(licenseUuid);
						
					String editLicenseUrl= editLicense +  "&" +renderResponse.getNamespace()+"licenseUuid="+  licenseUuid;
					String editActivationUrl= editActivation +  "&" +renderResponse.getNamespace()+"licenseUuid="+  licenseUuid;
				
				%>
				<tr>
					<td> ${license.userId}</td>
					<td><%=screenName %></td>
					<td><%=LicenseUtils.formatToUuid(licenseUuid) %></td>
				
					<td>
					<%
						for(Activation activation : activationList){
					%>
							<%=LicenseUtils.formatToUuid(activation.getHardwareUuid()) %> <br/>
					<%		
							
						}
					%>
					</td>
					<td>${license.valid}</td>
					<td><fmt:formatDate value="${license.issueDate}" pattern="yyyy-MM-dd"/> </td>
					<td><fmt:formatDate value="${license.validDate}" pattern="yyyy-MM-dd"/></td>
					<td><fmt:formatDate value="${license.createDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
					<td><fmt:formatDate value="${license.modifiedDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				
					<td>
					<%--  <form action="<portlet:actionURL name="editLicense"></portlet:actionURL>" method="post" name="<portlet:namespace />editLicense">
							 <input type=hidden name="<portlet:namespace/>licenseUuid" value="${license.licenseUuid}"></input> 
							
							 <input type="submit" value="Edit" />
						</form>  --%> 
						
							<liferay-ui:icon-menu>
								<liferay-ui:icon
									image="edit"
									message="editLicense"
									url="<%=editLicenseUrl %>"
								/>
						
								<liferay-ui:icon
									image="edit"
									method="get"
									message="editActivation"
									url="<%= editActivationUrl %>"
									useDialog="<%= true %>"
								/>
						
							
						</liferay-ui:icon-menu>	
					</td>
				</tr>
			</c:forEach>
		</table>
  
</c:if>

<c:if test="${action eq  'editLicense'}">

<c:set var="userId" scope="request" value="${license.userId}" />
			<c:set var="licenseUuid" scope="request" value="${license.licenseUuid}" />
				<%
					Long userId = (Long)request.getAttribute("userId");
					User user = UserLocalServiceUtil.getUser(userId);
					String screenName = user.getScreenName();
				
						String licenseUuid = (String)request.getAttribute("licenseUuid");
						List<Activation> activationList = LicenseUtils.getActivationListByLicenseUuid(licenseUuid);
				%>
   
<form action="<portlet:actionURL name="updateLicense"></portlet:actionURL>" method="post" name="<portlet:namespace />updateLicense">   
   <table>
			<tr>
				<td>userId</td>
				<td><input type="text" name="<portlet:namespace/>userId" readonly="readonly" value="${license.userId}"/> </td>
			</tr>
			<tr>
				<td>screenName</td>
				<td><input type="text" name="<portlet:namespace/>userId" readonly="readonly" value="<%=screenName%>"/> </td>
			</tr>
			
			 <tr>
				<td>licenseUuid</td>
				<td><input type="text" name="<portlet:namespace/>licenseUuid" readonly="readonly" value="<%=LicenseUtils.formatToUuid(licenseUuid) %>" /> </td>
			</tr>
			<tr>
				<td>hardwareUuid</td>
					<%
						for(Activation activation : activationList){
					%>
						<td><input type="text" name="<portlet:namespace/>hardwareUuid" readonly="readonly" value="<%=LicenseUtils.formatToUuid(activation.getHardwareUuid()) %>"  /> </td>	
					<%		
							
						}
					%>
			</tr>
			<tr>
				<td>issueDate</td>
					<td><input type="text" name="<portlet:namespace/>issueDate"  value="<fmt:formatDate value="${license.issueDate}" pattern="yyyy-MM-dd"/>" /> </td>
			</tr>
			<tr>
				<td>validDate</td>
							<td><input type="text" name="<portlet:namespace/>validDate" value="<fmt:formatDate value="${license.validDate}" pattern="yyyy-MM-dd"/>" /></td>
			</tr>
				<tr>
				<td>valid</td>
				<%-- <td><input type="text" name="<portlet:namespace/>valid"  value="${license.valid}" /> </td> --%>
				<td>
					<aui:select label="" name="valid" >
						<aui:option selected="${license.valid}" value="1">True</aui:option>
						<aui:option selected="${!license.valid}" value="0">False</aui:option>
					</aui:select>
				</td>
			</tr>
			<tr>
				<td>createDate</td>
				<td><input type="text" name="<portlet:namespace/>createDate" readonly="readonly" value="<fmt:formatDate value="${license.createDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" /> </td>
			</tr>
				<tr>
				<td>modifiedDate</td>
				<td><input type="text" name="<portlet:namespace/>modifiedDate" readonly="readonly" value="<fmt:formatDate value="${license.modifiedDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" /> </td>
			</tr>
				<tr>
				<td> <input type="submit" value="Update" /></td>
				<td> <input type="button" value="Cancel" onClick="reloadPage()"/></td>
			</tr>
			
 </table>  
</form>
</c:if>



<c:if test="${action eq 'addLicensePage' }">
<%-- <form action="<portlet:actionURL name="addLicense"></portlet:actionURL>" method="post" name="<portlet:namespace />addLicensePage">   
   <table>
			<tr>
				<td>userId</td>
				<td><input type="text" name="<portlet:namespace/>userId" /> </td>
			</tr>
			
			<tr>
				<td>issueDate</td>
					<td><input type="text" name="<portlet:namespace/>issueDate"  /> </td>
			</tr>
			<tr>
				<td>validDate</td>
							<td><input type="text" name="<portlet:namespace/>validDate"/></td>
			</tr>
				<tr>
				<td> <input type="submit" value="Add" /></td>
				<td> <input type="button" value="Cancel" /></td>
			</tr>
			
 </table>  
</form> --%>

<aui:form action="<%= addLicense %>" method="post" name="<portlet:namespace />addLicensePage" >
   <aui:input name="userId"  label="userId" ></aui:input>
<%--    <aui:input name="issueDate"  label="issueDate" ></aui:input> --%>
<%--    <aui:input name="validDate"  label="validDate" ></aui:input> --%>
 <%--   <liferay-ui:input-date formName="validDate" monthValue="02" yearValue="2014" yearParam="yyyy"   yearRangeStart="2014"     yearRangeEnd="2015"></liferay-ui:input-date> --%>
  issueDate<br>
      <liferay-ui:input-date formName="issueDate"  yearValue="${year}" monthValue="${month}" dayValue="${day}" ></liferay-ui:input-date><br>
        validDate<br>
     <liferay-ui:input-date formName="validDate" yearValue="${year}" monthValue="${month}" dayValue="${day}" ></liferay-ui:input-date><br>
 	<%-- <liferay-ui:input-date yearRangeEnd="2009" yearRangeStart="1900" dayParam="birthday_day" monthParam="birthday_month" yearParam="birthday_year"/> --%>
   
   <aui:button-row>
		<aui:button name="saveButton" type="submit" value="Add"  />
		<aui:button name="cancelButton" type="button" value="Cancel" onClick="reloadPage()" />
	</aui:button-row>

</aui:form>
</c:if>


<c:if test="${action eq  'editActivation'}">

<form action="<%=updateActivation %>" method="post" name="<portlet:namespace/>updateActivation">   
<% 
String licenseUuid = (String)request.getAttribute("licenseUuid"); %>
	<input type="hidden" name="<portlet:namespace/>licenseUuid" readonly="readonly" value="${licenseUuid}" />
   <table>
		
			 <tr>
				<td>licenseUuid</td>
				<td><%=LicenseUtils.formatToUuid(licenseUuid) %></td>
			</tr>
			<tr>
				<td>hardwareUuid</td>
				<td>createDate</td>
					<td>valid</td>
			</tr>
			
			<c:forEach items="${activationList}" var="activation" varStatus="index">		
					<c:set var="hardwareUuid" scope="request" value="${activation.hardwareUuid}" />
				<tr>		
					<td><input type="text" name="<portlet:namespace/>hardwareUuid"  value="<%=LicenseUtils.formatToUuid((String)request.getAttribute("hardwareUuid")) %>"  />
					
					 </td>
					<td>${activation.createTime}</td>
					<td>
					<aui:select label="" name="activationId_valid">
						<aui:option id="${activation.activationId}" selected="${activation.valid}" value="${activation.activationId}_true">True</aui:option>
						<aui:option id="${activation.activationId}" selected="${!activation.valid}" value="${activation.activationId}_false">False</aui:option>
					</aui:select>
				</td>
				</tr>
			</c:forEach>
			
				<tr>
				<td> <input type="submit" value="Update" /></td>
				<td> <input type="button" value="Cancel" onClick="reloadPage()"/></td>
			</tr>
			
 </table>  
</form>
</c:if>
   




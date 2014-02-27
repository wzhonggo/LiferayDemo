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
	 <aui:a href="<%= addLicensePage %>" label="add license"  ></aui:a>
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
		
			<%
					
					User user = UserLocalServiceUtil.getUser(license.getUserId());
					String screenName = user.getScreenName();
				
						//String licenseUuid = (String)request.getAttribute("licenseUuid");
						List<Activation> activationList = LicenseUtils.getActivationListByLicenseUuid(license.getLicenseUuid());
						String hardwareUuids = "";
						for(Activation activation : activationList){
							hardwareUuids += LicenseUtils.formatToUuid(activation.getHardwareUuid()) + "<br/>";
						}
					String editLicenseUrl= editLicense +  "&" +renderResponse.getNamespace()+"licenseUuid="+  license.getLicenseUuid();
					String editActivationUrl= editActivation +  "&" +renderResponse.getNamespace()+"licenseUuid="+  license.getLicenseUuid();
				
				%>
				
			<liferay-ui:search-container-column-text
				name="userId"
				property="userId"
			/>
	
			<liferay-ui:search-container-column-text
				name="screenName"
				value="<%=screenName %>"
			/>
			
			
				<liferay-ui:search-container-column-text
				name="licenseUuid"
				value="<%=LicenseUtils.formatToUuid(license.getLicenseUuid())%>"
			/>
			
			
			<liferay-ui:search-container-column-text
				name="hardwareUuid"
				value="<%=hardwareUuids%>"
			/>
			
			<liferay-ui:search-container-column-text
				name="valid"
				property="valid"
			/>
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
			<%-- <liferay-ui:search-container-column-text
				name="modifiedDate"
				value="${modifiedDate}"
			/>  --%>
			
			<liferay-ui:search-container-column-date
				name="modifiedDate"
				property="modifiedDate"
			/> 
			
			
			<liferay-ui:search-container-column-text
				
			>
		

				<liferay-ui:icon-menu>
					<liferay-ui:icon image="edit" message="editLicense"
						url="<%=editLicenseUrl%>" />
				
					<liferay-ui:icon image="edit"  message="editActivation"
						url="<%=editActivationUrl%>"/>		
				</liferay-ui:icon-menu>
			
			</liferay-ui:search-container-column-text>
			
	<%-- 	 <liferay-ui:search-container-column-jsp
				
					path="/license_action.jsp"
				/> 
		<c:set var="licenseUuid" scope="request" value="<%=license.getLicenseUuid() %>" />	 --%>
		</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>
</c:if>

<c:if test="${action eq  'editLicense'}">

<c:set var="userId" scope="request" value="${license.userId}" />
			<c:set var="licenseUuid" scope="request" value="${license.licenseUuid}" />
				<c:set var="issueDate" scope="request" value="${license.issueDate}" />
					<c:set var="validDate" scope="request" value="${license.validDate}" />
				<%
					Long userId = (Long)request.getAttribute("userId");
					User user = UserLocalServiceUtil.getUser(userId);
					String screenName = user.getScreenName();
				
						String licenseUuid = (String)request.getAttribute("licenseUuid");
						List<Activation> activationList = LicenseUtils.getActivationListByLicenseUuid(licenseUuid);
						
						Date issueDate = (Date)request.getAttribute("issueDate");
						Calendar issueCalendar = Calendar.getInstance();
						issueCalendar.setTime(issueDate);
						
						Date validDate = (Date)request.getAttribute("validDate");
						Calendar validCalendar = Calendar.getInstance();
						validCalendar.setTime(validDate);
						
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
				<td><input type="text" name="<portlet:namespace/>licenseUuid" readonly="readonly" value="<%=LicenseUtils.formatToUuid(licenseUuid) %>" style="width:300px;"/> </td>
			</tr>
			<tr>
				<td>hardwareUuid</td>
					<%
						for(Activation activation : activationList){
					%>
						<td><input type="text" name="<portlet:namespace/>hardwareUuid" readonly="readonly" value="<%=LicenseUtils.formatToUuid(activation.getHardwareUuid()) %>"  style="width:300px;"/> </td>	
					<%		
							
						}
					%>
			</tr>
			
			<tr>
				<td>issueDate</td>
					<td><liferay-ui:input-date name="issueDate"  yearValue="<%=issueCalendar.get(Calendar.YEAR) %>" 
					monthValue="<%=issueCalendar.get(Calendar.MONTH) %>" dayValue="<%=issueCalendar.get(Calendar.DATE) %>" ></liferay-ui:input-date> </td>
			</tr>
			<tr>
				<td>validDate</td>
							<td><liferay-ui:input-date name="validDate" yearValue="<%=validCalendar.get(Calendar.YEAR) %>"
							 monthValue="<%=validCalendar.get(Calendar.MONTH) %>" dayValue="<%=validCalendar.get(Calendar.DATE) %>" ></liferay-ui:input-date></td>
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
				<td><aui:button type="submit" value="Update"  /></td>
				<td> <aui:button name="cancelButton" type="button" value="Cancel" onClick="reloadPage()"/> </td>
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
      <liferay-ui:input-date name="issueDate"  yearValue="${year}" monthValue="${month}" dayValue="${day}" dayParam="issue_day" monthParam="issue_month" yearParam="issue_year"></liferay-ui:input-date><br><br><br>
        validDate<br>
     <liferay-ui:input-date name="validDate" cssClass="yyyy-MM-dd" formName="yyyy-MM-dd" yearValue="${year}" monthValue="${month}" dayValue="${day}" dayParam="valid_day" monthParam="valid_month" yearParam="valid_year" ></liferay-ui:input-date><br>
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
	<%-- <input type="hidden" name="<portlet:namespace/>licenseUuid" readonly="readonly" value="${licenseUuid}" />
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
					<td><input type="text" style="width:300px;" readonly="readonly" name="<portlet:namespace/>hardwareUuid"  value="<%=LicenseUtils.formatToUuid((String)request.getAttribute("hardwareUuid")) %>"  />
					
					 </td>
					<td><fmt:formatDate value="${activation.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
					<td>
					<aui:select label="" name="activationId_valid">
						<aui:option id="${activation.activationId}" selected="${activation.valid}" value="${activation.activationId}_true">True</aui:option>
						<aui:option id="${activation.activationId}" selected="${!activation.valid}" value="${activation.activationId}_false">False</aui:option>
					</aui:select>
				</td>
				</tr>
			</c:forEach>
			
				<tr>
				<!-- <td> <input type="submit" value="Update" /></td>
				<td> <input type="button" value="Cancel" onClick="reloadPage()"/></td> -->
				<td>
					 <aui:button-row>
					 <aui:button type="submit" value="Update"  />
					<aui:button name="cancelButton" type="button" value="Cancel" onClick="reloadPage()"/> 
					</aui:button-row>
				</td>
			
			</tr>
			
 </table>   --%>
 
 <aui:input name="licenseUuid" label="licenseUuid" value="<%=LicenseUtils.formatToUuid(licenseUuid)%>"  disabled="true" style="width:300px;"></aui:input>
 <liferay-ui:search-container >
		<liferay-ui:search-container-results
			results="${activationList}"
			total="${fn:length(activationList)}"
		/>
	
		<liferay-ui:search-container-row
			className="com.labimo.model.Activation"
			keyProperty="activationId"
			modelVar="activation"
		>
			<liferay-ui:search-container-column-text
				name="hardwareUuid"
				value="<%=LicenseUtils.formatToUuid(activation.getHardwareUuid()) %>"
			/>
			
			<fmt:formatDate value="${activation.createTime}" pattern="yyyy-MM-dd HH:mm:ss" var="createDate"/>
		
			<liferay-ui:search-container-column-text
				name="createDate"
				value="${createDate}"
			/>
			
			
			<liferay-ui:search-container-column-text>			
				<aui:select label="" name="activationId_valid" >
						<aui:option selected="${activation.valid}" value="${activation.activationId}_true">True</aui:option>
						<aui:option selected="${!activation.valid}" value="${activation.activationId}_false">False</aui:option>
					</aui:select>
			</liferay-ui:search-container-column-text>
		</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>

	 			<aui:button-row>
					 <aui:button type="submit" value="Update"  />
					<aui:button name="cancelButton" type="button" value="Cancel" onClick="reloadPage()"/> 
					</aui:button-row>

</form>

<%-- <aui:layout>
		<aui:column columnWidth="35" first="true">
		123
		</aui:column>
		<aui:column columnWidth="35">
			123123
		</aui:column>
			<aui:column columnWidth="25" last="true">
			123123123
		</aui:column>
		
		
</aui:layout>

<aui:field-wrapper name="gender">
		<aui:input inlineLabel="right" name="gender" type="radio" value="1" label="male" />
		<aui:input checked="<%= true %>" inlineLabel="right" name="gender" type="radio" value="2" label="female"  />
	</aui:field-wrapper>	

<liferay-ui:search-container >
	<liferay-ui:search-container-results
		results="<%= UserLocalServiceUtil.getOrganizationUsers(33801)%>"
		total="<%= UserLocalServiceUtil.getOrganizationUsersCount(33801) %>"
	/>

	<liferay-ui:search-container-row
		className="com.liferay.portal.model.User"
		keyProperty="userId"
		modelVar="user"
	>
		<liferay-ui:search-container-column-text
			name="name"
			value="<%= user.getFullName() %>"
		/>

		<liferay-ui:search-container-column-text
			name="first-name"
			property="firstName"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container> --%>
	
</c:if>
   




<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<portlet:defineObjects />

<%@page import="com.liferay.portal.service.*"%>
<%@page import="com.liferay.portal.model.*"%>
<%@page import="java.util.*"%>
<%@page import="com.labimo.Utils"%>


<div id="organization">
	<div id="currentOrganization">
	${currentOrganization.name}
	</div>

	<div id="suborganizations">
		<table>
			<tr>

				<td>${fn:length(organizationList)} Suborganizations</td>
			</tr>
			<tr>
				<!-- <td><input type="checkbox"></td> -->
				<td>Name</td>
				<td>Type</td>
				<!-- <td></td> -->
			</tr>
			<c:forEach items="${organizationList}" var="organization"
				varStatus="index">
				<tr class="blue">
					<!-- <td><input type="checkbox"></td> -->
					<td><img src="<%= request.getContextPath()%>/image/organization_icon.png" style="margin: 0px 5px 0px 0px;">${organization.name}</td>
					<td>${organization.type}</td>
					<!-- <td>action</td> -->
				</tr>
			</c:forEach>
		</table>
	</div>


	<div id="users">
		<table>
			<tr>

				<td>${fn:length(userList)} Users</td>
			</tr>
			<tr>
				<!-- <td><input type="checkbox"></td> -->
				<td>First Name</td>
				<td>Last Name</td>
				<td>Screen Name</td>
				<td>Job Title</td>
				<td>Organization Roles</td>
				<td>User Groups</td>
				<!-- <td></td> -->
			</tr>
			<c:forEach items="${userList}" var="user" varStatus="index">
				<c:set var="userId" scope="request" value="${user.userId}" />
				<tr class="blue">
					<!-- <td><input type="checkbox"></td> -->
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
					<td>${user.screenName}</td>
					<td>${user.jobTitle}</td>
					<%
						long userId = (Long) request.getAttribute("userId");
							String orgRoleNames = Utils.getOrgRoleNames(userId);
					%>

					<td><%=orgRoleNames%></td>
					<%
						List<UserGroup> userGroupList = UserGroupLocalServiceUtil
									.getUserUserGroups(userId);
							String groupName = "";
							for (UserGroup userGroup : userGroupList) {
								groupName += userGroup.getName();
							}
					%>
					<td><%=groupName%></td>
				<!-- 	<td>action</td> -->
				</tr>
			</c:forEach>
		</table>
	</div>
</div>


<c:if test="${!empty currentOrganization}">  
	<div>
		<img src="<%= request.getContextPath()%>/image/assign.png"><a href="<portlet:actionURL name="assignUsers"></portlet:actionURL>">AssignUsers</a>
	</div> 
 </c:if>  	



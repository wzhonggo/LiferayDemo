<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />

<%@page import="com.liferay.portal.service.*"%>
<%@page import="com.liferay.portal.model.*"%>
<%@page import="java.util.*"%>
<%@page import="com.labimo.Utils"%>

<script type="text/javascript">

	function selectAll(){
		alert("---------------------");
	}
	 
	 
	 function setIds(){
		 var addUserIds = "";
		 var removeUserIds = "";
		 $('input[name="<portlet:namespace/>userIds"]').each(function(){
			 if($(this).is(':checked')){
				 addUserIds = addUserIds + $(this).val()+ ",";  
			 }else {
				 removeUserIds = removeUserIds + $(this).val()+ ",";  
			 }
		  });
		 
		$("#<portlet:namespace/>addUserIds").val(addUserIds);
		$("#<portlet:namespace/>removeUserIds").val(removeUserIds);
		//alert($("#<portlet:namespace/>addUserIds").val());
		//alert($("#<portlet:namespace/>removeUserIds").val());
		
	 }
</script>

<%
	long[] organizationUserIds = (long[]) request.getAttribute("organizationUserIds");
%>
<div id="assignUsers">
	

	<div>${currentOrganization.name}</div>
	<div>
		<form action="<portlet:actionURL name="search"></portlet:actionURL>"
			method="post">
			<input type="text" placeholder="screenName"
				name="<portlet:namespace/>screenName"></input>

			<aui:button type="submit" value="Search" />
		</form>

		<%-- 	<portlet:actionURL name="search2" var="search2" />
	<aui:form  action="<%=search2.toString() %>" method="post" >
     	  <aui:input type="text" placeholder="screenName" name="screenName" />
		 	<aui:button type="submit" value="Search" />
	</aui:form> --%>

	</div>
	<div id="users">
		<form
			action="<portlet:actionURL name="updateAssociation"></portlet:actionURL>"
			method="post" onsubmit="setIds()">
			<aui:input name="addUserIds" id="addUserIds" type="hidden" />
			<aui:input name="removeUserIds"  id="removeUserIds" type="hidden" />
			<aui:button type="submit" value="Update Associations" />


			<div>
				<table>
					<%
						String action = (String) request.getAttribute("action");
						if ("assignUsers".equals(action)) {
					%>
					<tr>
						<td><input name="selectAll" id="selectAll" class="selectAll"
							onclick="selectAll()" type="checkbox" checked="checked"></td>
						<td>First Name</td>
						<td>Last Name</td>
						<td>Screen Name</td>
					</tr>
					<c:forEach items="${userList}" var="user" varStatus="index">
						<tr class="blue">
							<td><input name="<portlet:namespace/>userIds"
								class="userCheckbox" type="checkbox" checked="checked"
								value="${user.userId}"></td>
							<td>${user.firstName}</td>
							<td>${user.lastName}</td>
							<td>${user.screenName}</td>
						</tr>
					</c:forEach>

					<%
						} else {
					%>
					<tr>
						<td><input name="selectAll" id="selectAll" class="selectAll"
							onclick="selectAll()" type="checkbox"></td>
						<td>First Name</td>
						<td>Last Name</td>
						<td>Screen Name</td>
					</tr>
					<c:forEach items="${userList}" var="user" varStatus="index">
						<c:set var="userId" scope="request" value="${user.userId}" />
						<tr class="blue">
							<td>
								<%
									long userId = (Long) request.getAttribute("userId");
											if (Utils.isExist(organizationUserIds, userId)) {
								%> <input name="<portlet:namespace/>userIds"
								class="userCheckbox" type="checkbox" checked="checked"
								value="${user.userId}"> 
								<% 	} else {
 								%> 
 								<input name="<portlet:namespace/>userIds"
								class="userCheckbox" type="checkbox" value="${user.userId}">
							</td>
							<%
								}
							%>
							<td>${user.firstName}</td>
							<td>${user.lastName}</td>
							<td>${user.screenName}</td>
						</tr>
					</c:forEach>
					<%
						}
					%>
				</table>
			</div>

		</form>

	</div>
</div>


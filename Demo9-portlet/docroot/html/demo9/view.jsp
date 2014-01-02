<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<%
	long userId = PortalUtil.getUserId(request);
%>
this is view page . <br>
${username}<br>

<portlet:renderURL var="edit">
	<portlet:param name="action" value="edit"/>
</portlet:renderURL>

<div><a href="${edit}">go to edit page</a></div>
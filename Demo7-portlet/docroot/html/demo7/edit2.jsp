<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<portlet:renderURL var="edit">
	<portlet:param name="action" value="view"/>
</portlet:renderURL>


this is edit page . <br>
${action}
<div><a href="${edit}">go to view page</a></div>
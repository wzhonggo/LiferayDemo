<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<%-- <%
	long userId = PortalUtil.getUserId(request);
%>
this is view page . <br>
${username}<br>

<portlet:renderURL var="edit">
	<portlet:param name="action" value="edit"/>
</portlet:renderURL>

<div><a href="${edit}">go to edit page</a></div>


<portlet:renderURL var="download">
	<portlet:param name="action" value="download"/>
	<portlet:param name="portletId" value="${portletId}"/>
</portlet:renderURL>

<div><a href="${download}">download file</a></div>

<br>

<portlet:actionURL  var="download2" name="download2">
<portlet:param name="action" value="download2"/>
</portlet:actionURL>

<div><a href="${download2}">download2</a></div>  --%>


<br/>
<portlet:resourceURL var="fileDownloadURL" id="fileDownload">
<portlet:param name="action" value="fileDownload"/>
    </portlet:resourceURL>
      
 
 <div>    <a href="${fileDownloadURL}" onClick="window.location ='${fileDownloadURL}';">File  Download</a></div> 

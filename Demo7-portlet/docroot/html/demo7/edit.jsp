<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.liferay.portal.kernel.util.TextFormatter" %>
<%@page import="com.liferay.portal.kernel.util.LocaleUtil" %>

<portlet:defineObjects />
	 <portlet:renderURL var="save">
		<portlet:param name="action" value="save"/>
	</portlet:renderURL>
	
<%-- 	<portlet:actionURL  var="save">
	<portlet:param name="action" value="save"/>
	</portlet:actionURL> --%>

<table border="1" style="border-collapse:collapse; margin-top: 50px; margin-left: 50px; margin-right: 50px;">
    <tr>
        <td width="20%" class="menuBgcolor">Title</td>
        <td width="10%" class="menuBgcolor">Size</td>      
        <td width="10%" class="menuBgcolor">Downloads</td>
          <td width="20%" class="menuBgcolor">CreateDate</td>
              <td width="20%" class="menuBgcolor">ModifiedDate</td>
        <td width="20%" class="menuBgcolor">Action</td>
    </tr>

    <c:forEach items="${results}" var="fileEntry" varStatus="index">
     
        <tr>
            <td>
                    ${fileEntry.title}
            </td>
            <td>
                  <c:set var="FileEntrySize" scope="request"><c:out value="${fileEntry.fileVersion.size}" /></c:set>
                <%=TextFormatter.formatStorageSize(Integer.valueOf((String)request.getAttribute("FileEntrySize")), LocaleUtil.getDefault())  %>
            </td>
            <td>
                ${fileEntry.readCount}
            </td>
            <td>
                ${fileEntry.createDate}
            </td>
            <td>
                ${fileEntry.fileVersion.modifiedDate}
            </td>
            <td>
                  <a href="${save}&fileEntryId=${fileEntry.fileEntryId}">Choose</a>
            </td>
    </c:forEach>
</table>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Organizations Manage</b> portlet in View mode.

<%@ include file="/html/organizationsmanage/init.jsp" %>
<%
String rowURL = "www.baidu.com";
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
%>
<%@ include file="/html/organizationsmanage/organization_columns.jspf" %>

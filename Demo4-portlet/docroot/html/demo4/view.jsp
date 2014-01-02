<%@page import="java.util.ArrayList"%>
<%@ page import="com.test.model.Foo" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>

<portlet:defineObjects />

This is the <b>Demo4</b> portlet in View mode.

<%-- <br>
<a href=" <portlet:actionURL name="setvalue"></portlet:actionURL>"> setvalue :</a>   <input type="text" name="<portlet:namespace/>userName"></input>
<a href=" <portlet:actionURL name="getValue"></portlet:actionURL>"> getValue : </a>   ${name}

<br>

<form action="<portlet:actionURL name="setvalue"></portlet:actionURL>" method="post" >
 <input type="text" name="userName"></input>

    <input type="submit" value="set" />
</form>

<br> --%>

<form action="<portlet:actionURL name="getValue"></portlet:actionURL>" method="post" name="<portlet:namespace />fm">
 <input type="text" name="<portlet:namespace/>name"></input> 

    <input type="submit" value="get" />
</form> 

value =  ${name}
<br>
<form action="<portlet:actionURL name="setvalue"></portlet:actionURL>" method="post" name="<portlet:namespace />fm">
 <input type="text" name="<portlet:namespace/>userName"></input>

    <input type="submit" value="set" />
</form>

<%-- <%
 ArrayList<String> activities = new ArrayList<String>();
activities.add("10201");
activities.add("12809");
activities.add("10109");
activities.add("13600");
activities.add("2");
activities.add("for test");
activities.add("0");
 %>
<liferay-ui:social-activities
  activities="activities"
  feedEnabled="true"
  feedTitle="for test"
  feedLink="/test/getValue"
  feedLinkMessage="for test"
/> --%>
<br><br>
<liferay-ui:ratings
className="<%= Foo.class.getName() %>"
classPK="${resourcePK}"
url='<%= ((ThemeDisplay)request.getAttribute(com.liferay.portal.kernel.util.WebKeys.THEME_DISPLAY)).getPathMain() + "/portal/rate_entry" %>'
/>
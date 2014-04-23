<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 

<portlet:defineObjects />
<liferay-theme:defineObjects/>

<portlet:actionURL var="addClientPage" name="addClientPage">
</portlet:actionURL>



<aui:form action="<%= addClientPage %>" method="post" name="<portlet:namespace />addClientPage" >

		
	<aui:button name="addClientButton" type="submit" value="Add Client" />

</aui:form>

<liferay-ui:search-container>
	<liferay-ui:search-container-results results="${clientList}"
		total="${fn:length(clientList)}" />

	<liferay-ui:search-container-row
		className="com.labimo.portlet.tincan.model.Oauth2Client"
		keyProperty="id" modelVar="client">

		<liferay-ui:search-container-column-text name="name" />

		<liferay-ui:search-container-column-text name="id" />

		<liferay-ui:search-container-column-text name="secret" />

		<liferay-ui:search-container-column-text name="redirectUrl" />
		<liferay-ui:search-container-column-text name="description" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />


</liferay-ui:search-container>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<portlet:defineObjects />
<portlet:actionURL var="addClient" name="addClient">
</portlet:actionURL>

<aui:form action="<%=addClient%>" method="post"
	name="<portlet:namespace />addClientPage">
	<aui:input name="name" label="Application Name:"></aui:input>
	<aui:input name="description" label="Application Description:"></aui:input>
	<aui:input name="url" label="Application Website:" style="width:300px;"></aui:input>
	<aui:input name="redirectUrl" label="Callback URL:"
		style="width:300px;"></aui:input>
	<aui:button-row>
		<aui:button name="createClient" type="submit" value="Create Client" />
		<aui:button name="cancelButton" type="button" value="Cancel"
			onClick="reloadPage()" />
	</aui:button-row>
</aui:form>


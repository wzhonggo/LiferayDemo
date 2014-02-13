<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<portlet:defineObjects />

Please select a organization

<br/>
<br/>

<portlet:actionURL var="savaUrl" name="savaOrginaztion">
</portlet:actionURL>

<liferay-ui:success key="success" message="Save successfully!" />
<liferay-ui:error key="error"     message="Save error!Please try again!" />
<aui:form action="<%= savaUrl %>" method="post" name="fm" >
   <aui:select name="organizationId" label="Select Folder">
   		  <c:forEach var="organization" items="${organizations}" varStatus="status">
                <aui:option value="${organization.organizationId}" label="${organization.name}"/>           
          </c:forEach>
   </aui:select>
   
<input type="submit" value="<liferay-ui:message key="save" />"/>
</aui:form>
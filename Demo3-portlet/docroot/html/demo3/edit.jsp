<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<portlet:defineObjects />

Please select Folder and Category

<br/>
<br/>

<portlet:actionURL var="savaUrl" name="savaFolderAndCategery">
    <portlet:param name="jspPage" value="/edit.jsp" />
</portlet:actionURL>

<liferay-ui:success key="success" message="Save successfully!" />
<liferay-ui:error key="error"      message="Please select Folder and Category" />
<aui:form action="<%= savaUrl %>" method="post" name="fm" >
   <aui:select name="folderId" label="Select Folder">
   		  <c:forEach var="dlFolder" items="${dlFolderList}" varStatus="status">
                <aui:option value="${dlFolder.folderId}" label="${dlFolder.name}"/>           
          </c:forEach>
   </aui:select>
   
   
    <aui:select name="assetCategoryId" label="Select Category">
   		  <c:forEach var="assetCategory" items="${assetCategoryList}" varStatus="status">
                <aui:option value="${assetCategory.categoryId}" label="${assetCategory.name}"/>           
          </c:forEach>
   </aui:select>
<input type="submit" value="<liferay-ui:message key="save" />"/>
<!--  aui:button type="submit" value="Save" /-->
</aui:form>
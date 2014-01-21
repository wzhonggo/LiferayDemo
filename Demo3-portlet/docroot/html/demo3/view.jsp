<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.liferay.portal.util.PortletKeys" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>


<portlet:defineObjects />

<%-- This is the <b>Demo3</b> portlet in View mode.


<a href=" 
<portlet:actionURL name="getCategory"> 
<portlet:param name="category" value="Java" /> 
<portlet:param name="category" value="Portlets" /> 
</portlet:actionURL>" 
> 
getCategory
</a> 
 --%>


<br>
<br>
<%String uploadProgressId = "dlFileEntryUploadProgress"; %>

<portlet:actionURL var="editCaseURL" name="uploadCase">
    <portlet:param name="jspPage" value="/edit.jsp" />
</portlet:actionURL>
<liferay-ui:success key="success" message="Course uploaded successfully!" /><liferay-ui:error key="error"
    message="Sorry, an error prevented the upload. Please try again." />


<aui:form  action="<%= editCaseURL %>" enctype="multipart/form-data" method="post" name="fm"  onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "saveFileEntry();" %>'>
	<aui:input name="uploadProgressId" type="hidden" value="<%= uploadProgressId %>" />
<aui:input type="file" name="fileName" size="75"/>
<input type="submit" value="<liferay-ui:message key="upload" />" />
<!--  aui:button type="submit" value="Save" /-->
</aui:form>

<liferay-ui:upload-progress
	id="<%= uploadProgressId %>"
	message="uploading"
	redirect="<%= editCaseURL %>"
/>

<%ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY); %>
<aui:script>
			Liferay.Data.layoutConfig = {
				container: '#main-content',

				<c:choose>
					<c:when test="<%= !themeDisplay.isFreeformLayout() %>">
						dropNodes: '.portlet-column',
						handles: ['.portlet-title', '.portlet-title-default'],
					</c:when>
					<c:otherwise>
						dropNodes: '.portlet-boundary',
						freeForm: true,
						freeformPlaceholderClass: 'lfr-freeform-layout-drag-indicator',
						handles: ['.portlet-header-bar', '.portlet-title-default', '.portlet-topper'],
					</c:otherwise>
				</c:choose>

				disabledDropContainerClass: 'portlet-dropzone-disabled',
				dragNodes: '.portlet-boundary',
				dropContainer: '.portlet-dropzone',
				emptyColumnClass: 'empty',
				invalid: '.portlet-static',
				nestedPortletId: '_<%= PortletKeys.NESTED_PORTLETS %>_INSTANCE',
				portletBoundary: '.portlet-boundary'
			};
		</aui:script>




<aui:script>
	


	function <portlet:namespace />saveFileEntry() {
		<%= HtmlUtil.escape(uploadProgressId) %>.startProgress();

		document.<portlet:namespace />fm.action = "<%= editCaseURL.toString() %>";
		

		submitForm(document.<portlet:namespace />fm);
	}

</aui:script>
<br />
<br />
<br />
<br />
<%-- <portlet:renderURL var="viewCaseURL">
   <portlet:param name="jspPage" value="/view2.jsp" />
</portlet:renderURL>

<aui:button onClick="<%=viewCaseURL%>" value="view Uploaded Case" /> --%>



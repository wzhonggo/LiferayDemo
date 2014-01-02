<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Demo6</b> portlet in View mode.

<a href=" <portlet:actionURL name="download">
 <portlet:param name="filename" value="test" /> 
</portlet:actionURL>"> download page</a> 
<br>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Demo1</b> portlet in View mode.

<br>
<form action="<portlet:actionURL name="setParam"></portlet:actionURL>" method="post" name="<portlet:namespace />fm">
 <input type="text" name="<portlet:namespace/>param"></input> 

    <input type="submit" value="setParam" />
</form> 
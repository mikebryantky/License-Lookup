<%@page isErrorPage="true" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<jsp:include page="/header.jsp"></jsp:include>

<div id="outerBorder" class="ui-corner-all">
    <h1>Page Not Found</h1>
    <br />
    Sorry, the page you requested could not be found. Please try <a href="index.html">again</a>.
</div>

<jsp:include page="/menu.jsp"></jsp:include>

<jsp:include page="/footer.jsp"></jsp:include>

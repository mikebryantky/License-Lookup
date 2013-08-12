<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<div id="recentSearchList" class="ui-corner-all">
    <h2>Recent Call Sign Searches</h2>
    <c:forEach var="row" items="${lookups}" >
        <div class="row">
            <span class="field" style="float: left; width: 40%;">
                <a href="lookupResults.html?callsign=${row.callsign}" title="Lookup ${row.callsign}">${row.callsign}</a>
            </span>
            <span class="field" style="float: right; width: 60%;">
                <fmt:formatDate value="${row.lookupDate}" type="both" timeStyle="short" />
            </span>
        </div>
    </c:forEach>
</div>


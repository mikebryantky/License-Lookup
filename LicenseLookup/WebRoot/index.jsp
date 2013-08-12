<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<jsp:include page="/header.jsp"></jsp:include>

<div id="outerBorder" class="ui-corner-all">
    <h1>KC4APP.net</h1>
    <div id="mainMenuDiv" style="float: left;" class="ui-corner-all">
        <h2>Main Menu</h2>
        <ul>
            <li>
                <a href="lookupCall.html" title="Lookup a call sign">Call Sign Lookup</a>
            </li>
            <li>
                <a href="dipoleCalculator.html" title="Dipole Calculator">Dipole Calculator</a>
            </li>
        </ul>
    </div>
    
    <div id="recentSearches" style="float: right;">
    </div>
</div>

<jsp:include page="/menu.jsp"></jsp:include>

<script type="text/javascript">
    $(function() {
        showLoadingMessage("recentSearches");
        $("#recentSearches").load("recentCallLookupList.html?numRows=8");
    });
</script>

<jsp:include page="/footer.jsp"></jsp:include>

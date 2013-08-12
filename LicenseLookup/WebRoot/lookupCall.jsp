<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<jsp:include page="/header.jsp">
    <jsp:param value="Call Sign Lookup" name="title" />
</jsp:include>

<div id="outerBorder" class="ui-corner-all">
    <h1>Call Sign Search</h1>
    <div id="lookupFormDiv" style="float: left;">
        <form name="lookupForm" id="lookupForm" action="lookupResults.html" method="get" class="ui-corner-all" style="padding-top: 5px;">
            <label for="callsign">Call Sign: </label>
            <input type="text" name="callsign" id="callsign" maxlength="10" />
            <br />
            <br />
            <span id="submitBtn" class="button">Search</span>
        </form>
        
        <div id="validationError" class="ui-widget" style="width: 315px; padding: 10px; display: none;">
            <div class="ui-state-error ui-corner-all" style="padding: 0 .7em;">
                <p>
                    <span class="ui-icon ui-icon-alert" style="float: left; margin-right: .3em;"></span>
                    You must first enter a call sign.
                </p>
            </div>
        </div>
    </div>
    
    <div id="recentSearches" style="float: right;">
    </div>
</div>

<jsp:include page="/menu.jsp"></jsp:include>

<script type="text/javascript">
    $(function() {
        $("#callsign").focus();
        
        $("#submitBtn")
            .button({
                icons: {
                    primary: "ui-icon-search"
                }
            })
            .click(function(event) {
                validateLookupForm();
            });
        
        showLoadingMessage("recentSearches");
        $("#recentSearches").load("recentCallLookupList.html?numRows=8");
    });
    
    
    function validateLookupForm() {
        if( $("#callsign").val() == '' ) {
            $("#validationError").fadeIn('slow');
            setTimeout(function() {
                $("#validationError").fadeOut('slow');
            }, 3000 );
        } else {
            $("#lookupForm").submit();
        }
    }
</script>

<jsp:include page="/footer.jsp"></jsp:include>
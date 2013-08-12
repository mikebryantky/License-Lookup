<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<jsp:include page="/header.jsp"></jsp:include>

<div id="outerBorder" class="ui-corner-all">
    <h1>Dipole Calculator</h1>
    
    <div id="dipoleCalcualtorFormDiv">
        <form name="dipoleCalcualtorForm" id="dipoleCalcualtorForm" action="#" method="get" class="ui-corner-all">
            <fieldset>
                <legend>Antenna Frequencies (MHz)</legend>
                
                <label for="minFreq" style="float:left;">Min Freq: </label>
                <input type="text" name="minFreq" id="minFreq" maxlength="10" class="frequencyInput" value="" />
                <br />
                <br />
                <label for="maxFreq" style="float:left;">Max Freq: </label>
                <input type="text" name="maxFreq" id="maxFreq" maxlength="10" class="frequencyInput" value="" />
                <br />
                <br />
                <span id="calcBtn" class="button">Calculate</span>
            </fieldset>
        </form>
        
        <div id="validationError" class="ui-widget" style="width: 315px; padding: 10px; display: none;">
            <div class="ui-state-error ui-corner-all" style="padding: 0 .7em;">
                <p>
                    <span class="ui-icon ui-icon-alert" style="float: left; margin-right: .3em;"></span>
                    You must enter valid frequency numbers (ex. 7.114) and the minimum frequency
                    must be less than the maximum frequency.
                </p>
            </div>
        </div>
    </div>
    
    <div id="dipoleCalcualtorResultsDiv" class="ui-corner-all" style="display: none;">
        <h2>Dipole Antenna Length</h2>
        <br />
        <label style="float: left;">Middle Freq:</label> <div id="middleFreq" class="result"></div>
        <br />
        <br />
        <br />
        <label style="float: left;">Total Length:</label> <div id="totalLengthFeet" class="result"></div>
        <br />
        <br />
        <br />
        <label style="float: left;">Length Per Leg:</label> <div id="totalLengthInches" class="result"></div>
        <br />
        <br />
        <div style="font-size: 70%; text-align: center; padding: 5px;">
            Remember to add a little extra on each end for attaching the antenna and tuning.  
        </div>
    </div>
</div>

<jsp:include page="/menu.jsp"></jsp:include>

<script type="text/javascript">
    $(function() {
        $(document).tooltip();
        
        $("#minFreq").focus();
    });
    
    
    $("#calcBtn")
        .button({
            icons: {
                primary: "ui-icon-calculator"
            }
        })
        .click(function(event) {
            validateCalcForm();
        });
    
    
    function validateCalcForm() {
        var minFeq = $("#minFreq").val();
        var maxFeq = $("#maxFreq").val();
        
        if( !$.isNumeric(minFeq) || !$.isNumeric(maxFeq) || (minFeq >=maxFeq) ) {
            $("#validationError").fadeIn('slow');
            setTimeout(function() {
                $("#validationError").fadeOut('slow');
            }, 5000 );
        } else {
            calculateDipole();
        }
    }
    
    function calculateDipole() {
        var minFreq = new Number($("#minFreq").val());
        var maxFreq = new Number($("#maxFreq").val());
        var middleFreq = (minFreq + maxFreq) / 2;
        middleFreq = middleFreq.toFixed(3);
        $("#middleFreq").html(middleFreq + " MHz");
        
        var totalLength = 468/middleFreq;
        var totalFt = Math.floor(totalLength);
        var totalInches = (totalLength - totalFt);
        totalInches = totalInches * 12;
        totalInches = totalInches.toFixed(1);
        
        $("#totalLengthFeet").html(totalFt + "' " + totalInches + '"');
        
        var perLegLength = totalLength/2;
        var perLegLengthFt = Math.floor(perLegLength);
        var perLegInches = (perLegLength - perLegLengthFt);
        perLegInches = perLegInches * 12;
        perLegInches = perLegInches.toFixed(1);
        $("#totalLengthInches").html(perLegLengthFt + "' " + perLegInches + '"');
        
        $("#dipoleCalcualtorResultsDiv").fadeIn('slow');
    }
</script>

<jsp:include page="/footer.jsp"></jsp:include>

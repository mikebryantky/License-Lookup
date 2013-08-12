<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<jsp:include page="/header.jsp"></jsp:include>

<script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?key=AIzaSyDMvaTz2ofmr6pNiAaRDdMig0Vol2JsPvM&sensor=false"></script>
<script type="text/javascript">
  function initialize() {
    var latlng = new google.maps.LatLng('${geoData.latitude}', '${geoData.longitude}');
    var mapOptions = {
      center: latlng,
      zoom: 15,
      mapTypeId: google.maps.MapTypeId.HYBRID
    };
    
    var map = new google.maps.Map(document.getElementById("mapCanvas"), mapOptions);
    
    var marker = new google.maps.Marker({
        position: latlng,
        map: map,
        title:"${callSign} QTH"
    });
  }
</script>
    

<div id="lookupResultsOuterBorder" class="ui-corner-all">
    <div id="licenseData">
        <div class="header callSign">${callSign}</div>
        
        <div class="field" style="margin-top: 20px;">
            <span class="fieldValue" style="font-weight: bold;">
                ${qrzData.callsign.fname} ${qrzData.callsign.name}
                <br />
                ${qrzData.callsign.addr1}
                <br />
                ${qrzData.callsign.addr2} ${qrzData.callsign.state} ${qrzData.callsign.zip}
                <c:if test="${qrzData.callsign.dxcc != 291}">
                    ${qrzData.callsign.country}
                </c:if>
            </span>
        </div>
        
        <div  style="margin-top: 30px;">
        </div>

        <div class="field">
            <span class="fieldLabel">
                License Class
            </span>
            <span class="fieldValue">
                ${qrzData.callsign.operClass}
            </span>
        </div> 
        
        <div class="field">
            <span class="fieldLabel">
                Previous Call
            </span>
            <span class="fieldValue">
                <c:if test="${qrzData.callsign.p_call == null}">
                  N/A
                </c:if>
                ${qrzData.callsign.p_call}
            </span>
        </div>
        
        <div class="field">
            <span class="fieldLabel">
                Expiration Date
            </span>
            <span class="fieldValue">
                ${qrzData.callsign.expDate}
            </span>
        </div> 
        
        <div class="field">
            <span class="fieldLabel">
                CQ Zone
            </span>
            <span class="fieldValue">
                ${qrzData.callsign.cqZone}
            </span>
        </div> 
        
        <div class="field">
            <span class="fieldLabel">
                ITU Zone
            </span>
            <span class="fieldValue">
                ${qrzData.callsign.ituZone}
            </span>
        </div>
        
        <c:if test="${qrzData.callsign.dxcc == 291}">
            <!-- 
              Only show the following if this is a US call sign.
            -->
            <div class="field">
                <span class="fieldLabel">
                    County
                </span>
                <span class="fieldValue">
                    ${qrzData.callsign.county}
                </span>
            </div>
            
            <c:if test="${fccLookupData.statusOK == true}">
                <!-- 
                  Only show the following if FCC data exists for this call sign.
                -->
                <div class="field">
                    <span class="fieldLabel">
                        FCC FRN
                    </span>
                    <span class="fieldValue">
                        ${fccLookupData.frn}
                    </span>
                </div> 
                
                <div class="field">
                    <span class="fieldLabel">
                        FCC License ID
                    </span>
                    <span class="fieldValue">
                        ${fccLookupData.licenseId}
                    </span>
                </div> 
                
                <div class="field" style="margin-top: 30px;">
                    <span class="fieldValue">
                        <a href="${fccLookupData.fccUrl}" target="_blank" title="See ${callSign} information on fcc.gov">More info on ${callSign}</a>
                    </span>
                </div>
            </c:if>
        </c:if>
        
        <c:if test="${qrzData.callsign.dxcc != 291}">
            <div class="field">
                <span class="fieldLabel">
                    Country
                </span>
                <span class="fieldValue">
                    ${qrzData.callsign.country}
                </span>
            </div> 
        </c:if>
    </div>
    
    <div id="mapCanvas">
    </div>
</div>

<jsp:include page="/menu.jsp"></jsp:include>

<script type="text/javascript">
    $(function() {
        initialize();
    });
</script>

<jsp:include page="/footer.jsp"></jsp:include>


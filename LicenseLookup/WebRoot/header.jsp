<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
    <title>
      <c:if test="${title != ''}">
        ${param.title}
      </c:if>
      <c:if test="${title == ''}">
        KC4APP
      </c:if>
    </title>
    <link href="css/base.css" rel="stylesheet">
    <link href="css/smoothness/jquery-ui-1.9.1.custom.min.css" rel="stylesheet">
    <script src="js/jquery-1.8.2.js"></script>
    <script src="js/jquery-ui-1.9.1.custom.min.js"></script>
    <script src="js/custom.js"></script>
    
    <script type="text/javascript">
        $(function() {
            $(document).tooltip();
            
            $("#outerBorder h1").addClass("ui-corner-all");
            $("#leftDiv h2").addClass("ui-corner-all");
        });
    </script>
    
    <script type="text/javascript">
      var _gaq = _gaq || [];
      _gaq.push(['_setAccount', 'UA-3067749-12']);
      _gaq.push(['_trackPageview']);
    
      (function() {
        var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
        ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
        var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
      })();
    
    </script>
</head>
<body>

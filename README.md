License-Lookup
==============

Amateur Radio call sign lookup tool. This code is used on the website http://www.KC4APP.net. Pulls data from 
FCC and QRZ.com web services; also gets mapping information from Google Mapping API. Displays 
call sign data and Google map of the operator's location.  Stores lookups in a MySQL database.


To run, edit the hibernate.cfg.xml file, adding appropriate database information (DB url, user, pass), and
edit the app.properties file to include the appropriate QRZ.com API login information (user, pass). 


Additionally, this project uses the following libraries:
 * Spring MVC
 * Hibernate
 * Jackson JSON  http://jackson.codehaus.org
 * Simple Java XML Serialization framework http://simple.sourceforge.net/
 

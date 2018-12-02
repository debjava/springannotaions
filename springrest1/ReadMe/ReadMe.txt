For Get Request
http://localhost:8080/springrest1/springrest1/emp/111

For POST Request
http://localhost:8080/springrest1/springrest1/emp/emp

send as Content-type as application/json

Content-type as application/xml
-------------------------------
-------------------------------
REST URL for get
----------------
http://localhost:8080/springrest1/emp/ID/Id1


REST URL for POST
-----------------
http://localhost:8080/springrest1/emp/create

Content-type : application/xml

XML Request
-----------
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<employee>
    <act>
        <actNo>11111</actNo>
        <name>DD Mishra</name>
    </act>
    <adrs>
        <countryName>India</countryName>
        <streetName>Bangalore</streetName>
    </adrs>
    <id>Id1</id>
    <name>Name-1</name>
</employee>

Expected Result
---------------
<?xml version="1.0" encoding="UTF-8" standalone="yes"?><Status><errCode></errCode><errMsg></errMsg><status>Success</status></Status>


REST URL for UPDATE
-------------------
http://localhost:8080/springrest1/emp/update

Content-type : application/xml

XML Request
-----------
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<employee>
    <act>
        <actNo>11111</actNo>
        <name>Deba Mishra</name>
    </act>
    <adrs>
        <countryName>India</countryName>
        <streetName>Bangalore</streetName>
    </adrs>
    <id>Id1</id>
    <name>Name-1</name>
</employee>

Expected Result
---------------
<?xml version="1.0" encoding="UTF-8" standalone="yes"?><Status><errCode></errCode><errMsg></errMsg><status>Success</status></Status>

REST URL for DELETE
-------------------
http://localhost:8080/springrest1/emp/delete

Content-type : application/xml

XML Request
-----------
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<employee>
    <act>
        <actNo>11111</actNo>
        <name>Deba Mishra</name>
    </act>
    <adrs>
        <countryName>India</countryName>
        <streetName>Bangalore</streetName>
    </adrs>
    <id>Id1</id>
    <name>Name-1</name>
</employee>

Expected Result
---------------
<?xml version="1.0" encoding="UTF-8" standalone="yes"?><Status><errCode></errCode><errMsg></errMsg><status>Success</status></Status>



Content-type as application/json
--------------------------------
--------------------------------
REST URL for get
----------------
http://localhost:8080/springrest1/emp/ID/Id1
Accept : application/json


REST URL for POST
-----------------
http://localhost:8080/springrest1/emp/create

Content-type : application/json

JSON Request
-----------
{
  "id" : "Id1",
  "name" : "Name-1",
  "adrs" : {
    "streetName" : "Bangalore",
    "countryName" : "India"
  },
  "act" : {
    "name" : "DD Mishra",
    "actNo" : "11111"
  }
}


Expected Result
---------------
<?xml version="1.0" encoding="UTF-8" standalone="yes"?><Status><errCode></errCode><errMsg></errMsg><status>Success</status></Status>


REST URL for UPDATE
-------------------
http://localhost:8080/springrest1/emp/update

Content-type : application/xml

XML Request
-----------
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<employee>
    <act>
        <actNo>11111</actNo>
        <name>Deba Mishra</name>
    </act>
    <adrs>
        <countryName>India</countryName>
        <streetName>Bangalore</streetName>
    </adrs>
    <id>Id1</id>
    <name>Name-1</name>
</employee>

Expected Result
---------------
<?xml version="1.0" encoding="UTF-8" standalone="yes"?><Status><errCode></errCode><errMsg></errMsg><status>Success</status></Status>

REST URL for DELETE
-------------------
http://localhost:8080/springrest1/emp/delete

Content-type : application/xml

XML Request
-----------
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<employee>
    <act>
        <actNo>11111</actNo>
        <name>Deba Mishra</name>
    </act>
    <adrs>
        <countryName>India</countryName>
        <streetName>Bangalore</streetName>
    </adrs>
    <id>Id1</id>
    <name>Name-1</name>
</employee>

Expected Result
---------------
<?xml version="1.0" encoding="UTF-8" standalone="yes"?><Status><errCode></errCode><errMsg></errMsg><status>Success</status></Status>


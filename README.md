# springboot-List-Map-yaml-demo
This spring boot project will show, how we can implement List or Map or both using yaml file.

1. Endpoint : http://localhost:8080/role
   
   When request comes to this endpoint with request parameter 'roletype', it looks for roletype in a map where map stored roletype as key with corresponding value.This map has    implemented in yaml file.
   
   So the url will look like : http://localhost:8080/role?roletype=admin
   where admin has passed as roletype
   
   this will return a value associated to the provided roletype
   
2. Endpoint : http://localhost:8080/department

   When request comes to this endpoint, it will fetch all the data in the form of list which has implemented in yaml file.
   
   So the url will look like : http://localhost:8080/department
   
   
Project Requirements

JDK 1.11 or higher Gradle 7.3.2 or higher spring boot 2.5 or higher
   

# springboot-List-Map-yaml-demo
This spring boot project will show, how we can implement List or Map or both using yaml file.

1. first endpoint : http://localhost:8080/role
   
   when we hit this endpoint by passing a parameter roletype with a value, it looks for this roletype in a map which is configured as key, this map we have implemented
   in yaml file.
   
   So the url will look like : http://localhost:8080/role?roletype=admin
   
   this will return a value associated to the provided roletype
   
2. second endpoint : http://localhost:8080/department

   when we hit this endpoint, this will fetch all the data in the form of list which has implemented in yaml file.
   
   So the url will look like : http://localhost:8080/department
   
   
Project Requirements

JDK 1.11 or higher Gradle 7.3.2 or higher spring boot 2.5 or higher
   

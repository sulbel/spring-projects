# spring-projects

## rest-service
A simple "Hello, world!" rest implementation.  Can provide a name to greet the user by passing in ?name=<name_to_greet>, e.g. http://localhost:8080/greeting?name=Sulbel

## consuming-rest
An application which consumes a REST service.  The REST service consumed is a random quote about Spring Boot, found at this location: https://quoters.apps.pcfone.io/api/random

## Payroll
A payroll service that manages the employees of a company.  Employee objects are stored in a H2 in-memory database, and accessed via JPA.  Accessed over the internet by wrapping with Spring MVC.
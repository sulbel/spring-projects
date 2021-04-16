package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/*
 In Spring's approach to building RESTful web services, HTTP requests are handled by a controller
 ..these components are identified by the @RestController annotation
*/
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /*
     The GetMapping annotation below ensures that HTTP GET requests to /greeting are mapped
     ..to the greeting() method
    */
    @GetMapping("/greeting")
    /*
    RequestParam annotation binds the value of the query string parameter name into the name parameter of the greeting()
    method.  If no name is provided in the request, then the default value of World is used instead.
    */
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        /*
        The method body creates and returns a new Greeting object with id and content attributes based on the next value
        from the counter and formats the given name using the greeting template
        */
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

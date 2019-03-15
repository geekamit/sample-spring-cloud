package com.webservice;
import com.webservice.test.HelloWorld;

import javax.jws.WebService;
//Service Implementation  
@WebService(endpointInterface = "com.webservice.test.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override  
    public String getHelloWorldAsString(String name) {  
        return "Hello World JAX-WS " + name;  
    }

}  
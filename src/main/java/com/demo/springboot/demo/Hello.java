package com.demo.springboot.demo;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping(value = "/hello")
    public String sayHello(){
        return "Hello Spring Boot";
    }

    @RequestMapping(value = "/bye/{name}")
    public String sayBye(@PathVariable(name="name") String name){
        return "Bye" + name;
    }
}

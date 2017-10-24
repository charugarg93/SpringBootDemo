package com.demo.springboot.demo;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Hello {

    @Value("${service1.host}")
    private String service1Host;

    @Value("${service1.port}")
    private String service1Port;

    private RestTemplate template = new RestTemplate();

    @RequestMapping("/{name}")
    public String getNameOutput(@PathVariable(name="name") String name){
        String output=null;
        output= template.getForObject("http://"+ service1Host +":"+service1Port +"/hello?name="+name,String.class);

        return output;
    }
}

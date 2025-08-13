package com.example.bt_some_webapp;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.fasterxml.jackson.core.JsonProcessingException;

import some.MyBean;
//import some.MyUtility1;
import some.MyUtility2;

@RestController
public class HelloController {
    
    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String index() {
        MyBean myBean = new MyBean("Adr", 40);
/*        
        try {
            return MyUtility1.test(myBean);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "KO";
        }
 */        
        return MyUtility2.test(myBean);
    }
}

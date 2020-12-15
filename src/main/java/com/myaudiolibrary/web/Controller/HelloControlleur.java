package com.myaudiolibrary.web.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/sayhello")
public class HelloControlleur {



        @RequestMapping(value = "",method = RequestMethod.GET, produces = "text/plain")
        public String hello(){
            return "hello world";
        }

        @RequestMapping(value = "/html",method = RequestMethod.GET, produces = "text/html")
        public String helloHtml(){
            return "<h1>hello world</h1>";
        }
}

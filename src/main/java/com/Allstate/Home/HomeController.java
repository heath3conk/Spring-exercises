package com.allstate.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public Hello home(){
        Hello h = new Hello("Hello Spring");
        return h;
    }
}

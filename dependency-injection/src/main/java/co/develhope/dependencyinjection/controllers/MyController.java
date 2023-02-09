package co.develhope.dependencyinjection.controllers;

import co.develhope.dependencyinjection.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller_name")
public class MyController {

    MyService myService;
    public MyController(MyService myService){
        this.myService=myService;
        System.out.println("MyController constructor has been called");
    }

    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome!";
    }

    @GetMapping("/getname")
        public String getName(){
        return myService.getName();
    }
}
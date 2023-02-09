package co.develhope.dependencyinjection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent{
    private String myComponentName;

    public MyComponent(){
        System.out.println("My component constructor has been called");
        this.myComponentName= "Nicola boniello";
    }

    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName() has been called");
        return myComponentName;
    }
}

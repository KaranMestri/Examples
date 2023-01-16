package com.navin.Telusko;

import org.springframework.context.ApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

// book rod johnson 
// in spring.io soft copy
public class App 
{
    public static void main( String[] args )
    {
//        Car car = new Car();
//        car.drive();
    	
//    	Bike obj = new Bike();
//    	obj.drive();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
//    	Vehicle obj = (Vehicle)context.getBean("bike");
//    	obj.drive();
    	
    	// (Tyre) this is a type casting 
    	
//    	Tyre t = (Tyre) context.getBean("tyre");
//    	System.out.println(t);
    	
    	Car obj = (Car) context.getBean("car");
    	obj.drive();
    }    
}

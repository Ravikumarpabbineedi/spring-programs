package com.ravi.springprograms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
       	Traveller traveller= context.getBean("t",Traveller.class);
       
        traveller.startJourney();
    }
}

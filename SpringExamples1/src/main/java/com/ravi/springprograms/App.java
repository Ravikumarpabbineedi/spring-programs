package com.ravi.springprograms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      @SuppressWarnings("resource")
      //starting IOC container using XML configuraton
//	  ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
      
    //starting IOC container using JavaBased configuraton
      ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
      
     Greetings greetings= context.getBean("g",GreetingsImpl.class);
     greetings.greet();
    }
}

package com.ravi.springprograms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       @SuppressWarnings("resource")
       ApplicationContext context=new AnnotationConfigApplicationContext(JavaConifg.class);
       Person person1=context.getBean("s",Person.class);
       person1.personInfo();
       
       Person person2=context.getBean("s1",Person.class);
       person2.personInfo();
    }
}

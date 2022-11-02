package com.capgemini.in.SpringInjectionUsingAutowire4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	Person pa = ac.getBean("person", Person.class);
    	pa.showPer();
    	Person ta = ac.getBean("person", Person.class);
    	ta.showTemp();
    }
}

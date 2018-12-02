package com.ddsoft.rnd.spring;

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
    	ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
//            SampleBean sample = context.getBean(SampleBean.class);
    	SampleBean sample = (SampleBean)context.getBean("sampleBean");
            sample.showFruits();
            sample.showPrefs();
            sample.showTimetable();
    }
}

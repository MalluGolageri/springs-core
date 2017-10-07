package com.mallu.springs;

import com.mallu.springs.beans.*;
import com.mallu.springs.events.CustomEventPublisher;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * Hello world!
 */
class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee emp = (Employee) context.getBean("employee");
        System.out.println(emp);


        System.out.println("xml based:");
        EmployeeVO employeeVO = (EmployeeVO) context.getBean("employeeVO");
        employeeVO.getDepartmentVO();

        System.out.println("==JavaConfig==");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        System.out.println(applicationContext.getBean("employeeConfig"));

        System.out.println(MyApplicationContextAware.getContext().getBean("employee"));


        //custom event publisher
        CustomEventPublisher publisher = (CustomEventPublisher) context.getBean("customEventPublisher");
        publisher.publishCustomEvent();


    }

    private void getEmployeeInfo() {
        //System.out.println(employee);
    }
}




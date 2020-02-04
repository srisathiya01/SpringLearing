package com.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String args[]) {
	
		AbstractApplicationContext appContext=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeBean emp1=(EmployeeBean) appContext.getBean("Employee");
		System.out.println(emp1.getName());
		appContext.registerShutdownHook();
	}
}

package com.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String args[]) {
	/*	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
		EmployeeBean emp=(EmployeeBean) factory.getBean("Employee");
		System.out.println(emp.getName());
		*/
		ApplicationContext appContext=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeBean emp1=(EmployeeBean) appContext.getBean("Employee");
		System.out.println(emp1.getName());
	}
}

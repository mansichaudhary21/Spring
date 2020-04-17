package com.capg.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		Class configurationClass = JavaConfig.class;
		context.register(configurationClass);
		context.refresh();
        //context.registerShutdownHook();
        Employee employee = context.getBean(Employee.class);
        employee.showDetails();
        
	}
	
	

}

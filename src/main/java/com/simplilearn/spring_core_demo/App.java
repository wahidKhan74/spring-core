package com.simplilearn.spring_core_demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Employee emp = new Employee();
//    	emp.setEmpId(101);
//    	emp.setEmpName("John Smith");
//    	emp.setEmpDept("Engineering");
//    	emp.setEmpSalary(2200.20);    	
//    	System.out.println(emp);
    	
    	// IOC : Inversion of Control
    	// Loose coupling and automated dependencies Injected
    	// 1. add spring core depencies
    	// 2. create a pojo / bean
    	// 3. configure Pojo / Bean in XML config 
    	// 4. Use Spring IOC container, 1. BeanFactory  or 2. Application Context
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
//    	Employee e1 = (Employee)context.getBean("emp1");
//    	
//    	Employee e2 = context.getBean("emp2",Employee.class);
//    	
//    	System.out.println(e1);
//    	System.out.println(e2);
    	
    	
    	//Bean Factory
    	Resource resource = new ClassPathResource("appContext.xml");
    	BeanFactory factory = new XmlBeanFactory(resource);
    	
    	Employee emp1 = (Employee) factory.getBean("emp1");
    	System.out.println(emp1);
    	
    	Employee emp2 = factory.getBean("emp2",Employee.class);
    	System.out.println(emp2);
    	
    
    }
}

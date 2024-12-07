package com.klef.JFSD_LAB;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ConstMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("ApplicationContext.xml");
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee.getId());
    }
}

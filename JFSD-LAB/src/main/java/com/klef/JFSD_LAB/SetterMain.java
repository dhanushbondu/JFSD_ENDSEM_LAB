package com.klef.JFSD_LAB;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SetterMain  {
	
	@Autowired
	private Instuctor ins;
	
	public static void main(String args[]) {
		
		Resource r = new ClassPathResource("ApplicationContextSetter.xml");
		BeanFactory b = new XmlBeanFactory(r);
		Object o = (Instuctor)b;
		
	}
}

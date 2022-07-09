package com.infotech.org;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.infotech.model.Message;

public class ClientTest {
public static void main(String[] args) {
		
		BeanFactory beanFactory = null;
		
		try {
			
			//Creating Instance of BeanFactory Spring Container
			Resource resource = new ClassPathResource("Beans.xml");
			beanFactory = new XmlBeanFactory(resource);
			
			//Asking Spring Container to return Spring bean with id "message"
			Object object = beanFactory.getBean("message");
			//Covert Spring bean into your business Object
			Message message = (Message)object;
			
			//Print Spring bean state
			System.out.println(message.getMessageId()+"\t"+message.getMessage());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

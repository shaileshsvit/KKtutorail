package com.infotech.org;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.UserInfo;


public class client19 {
	
	public static void main(String[] args) {
ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans21.xml");
		
		UserInfo userInfo = ctx.getBean("userInfo", UserInfo.class);
		
		Properties properties = userInfo.getUserInfo();
		
		Set<Entry<Object, Object>> entrySet = properties.entrySet();
		
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		((AbstractApplicationContext) ctx).close();
	}
	}
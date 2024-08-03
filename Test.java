package com.arcus;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String args[]) {
		Resource res=new ClassPathResource("ApplicationContext.xml");
		BeanFactory bf=new XmlBeanFactory(res); 		
		Student st=(Student) bf.getBean("stobj");
		st.display_info();
	}
}
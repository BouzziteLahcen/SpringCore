package Spring.Annotations;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creation Beans in this Line of Code
		ClassPathXmlApplicationContext sc= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//XmlBeanFactory sc = new XmlBeanFactory (new ClassPathResource("applicationContext.xm l")); 
		
		MasterInterface ms=sc.getBean("master", MasterInterface.class);
		
		ms.name();
		ms.getCompany();
		System.out.println(" Before End ");
		//sc.close();
		System.out.println(" After End ");
	} 

}

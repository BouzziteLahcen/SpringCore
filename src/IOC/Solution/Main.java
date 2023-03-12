package IOC.Solution;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // Load Spring Container 
		ClassPathXmlApplicationContext sc= new ClassPathXmlApplicationContext("applicationContext.xml");
	// given Beans Wanted
	Sport mySport = sc.getBean("mySport",Sport.class);
	// utilise MyBean 
	mySport.start();
	// Close my SC
	sc.close();
        
        		
	}

}

/*
 * Code Source est Statique 
 * Wanted Not Modify in Source code when Update My Application==> 
 * IOC ==> Charge My Paramet exist dans code source From Spring Container qui contient Beans
 */
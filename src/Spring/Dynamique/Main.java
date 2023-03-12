package Spring.Dynamique;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Load Spring Container 
		ClassPathXmlApplicationContext sc= new ClassPathXmlApplicationContext("applicationContext2.xml");
	// given Beans Wanted
	UserInterface user1 = sc.getBean("user",UserInterface.class);
	UserInterface user2 = sc.getBean("user",UserInterface.class);
	
	System.out.println(user1==user2);
	// utilise MyBean 
	user1.start();
	user1.getPerson();
	
	// Close my SC
	sc.close();
	}

}

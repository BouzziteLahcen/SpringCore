package Spring.JavaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Begin Main");
		// load Spring Container which Hold All My Beans
		AnnotationConfigApplicationContext sc= new AnnotationConfigApplicationContext(SpringContainer.class);
		System.out.println(" Load Spring container succes ");
		// given my Bean
		
	  UserInterface user = sc.getBean("user", UserInterface.class);
	  System.out.println(" given my Bean from Spring Container");
	  //SportInterface sp= sc.getBean("footBall", SportInterface.class);
	  
	  user.start();
	  user.getSport();
	  user.info();
	  System.out.println(" Using Bean");
	  sc.close();
	  System.out.println(" Colse Spring container ");
	  System.out.println(" This LifeCicle Of Bean");
	}

}

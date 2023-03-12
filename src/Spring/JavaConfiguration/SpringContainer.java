package Spring.JavaConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // this class it is Spring containe which Hold All my Beans
@ComponentScan("Spring.JavaConfiguration") // scan and Create Beans automaticaly
@PropertySource("classpath:data.properties") // load data.properties file in our Project 

public class SpringContainer {
	
	/*  
	 //Create Bean manually as xml without annotation
	
	
	@Value("${us.name}")
	private String name;
	@Value("${us.age}")
	private int age;

	@Bean 
	public UserInterface myUser() {
		return new User( name,age,sport());
	}
	
	@Bean 
	public SportInterface sport() {
		return new FootBall();
	}
	 */
}

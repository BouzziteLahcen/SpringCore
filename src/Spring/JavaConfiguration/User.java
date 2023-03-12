package Spring.JavaConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class User implements UserInterface{

	@Autowired
	@Value("${us.name}")
	private String name;
	@Autowired
	@Value("${us.age}")
	private int age;
	@Autowired
	@Qualifier("voleyBall")
	private SportInterface sp;
	
	
   
	

	public User() {
		System.out.println(" I am Constructor method Before init method == initailize Bean");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(" I am User");
	}

	@Override
	public void getSport() {
		// TODO Auto-generated method stub
		this.sp.mySport();
	}
public void info() {
	System.out.println(" My Name is : "+name+" my Age :    "+age);
}

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}

public SportInterface getSp() {
	return sp;
}

public void setSp(SportInterface sp) {
	this.sp = sp;
}

@PostConstruct
public void init() {
	System.out.println(" I am init method ");
}

@PreDestroy
public void destroy() {
	System.out.println(" I am destroy method ");
}
}

package Spring.Annotations;

import org.springframework.stereotype.Component;

@Component()
public class Student implements CompanyInterface{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("I am student");
	}

}

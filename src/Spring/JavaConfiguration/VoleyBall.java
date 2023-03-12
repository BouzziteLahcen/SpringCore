package Spring.JavaConfiguration;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class VoleyBall implements SportInterface{

	@Override
	public void mySport() {
		// TODO Auto-generated method stub
		System.out.println(" I am VoleyBall");
	}

}

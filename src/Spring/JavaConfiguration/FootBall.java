package Spring.JavaConfiguration;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@Primary
public class FootBall implements SportInterface{

	@Override
	public void mySport() {
		// TODO Auto-generated method stub
		System.out.println("I am footBall");
	}

}

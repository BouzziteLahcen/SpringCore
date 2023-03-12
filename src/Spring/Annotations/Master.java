package Spring.Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;


@Component


public class Master implements MasterInterface {

	
	
	private CompanyInterface ci;
	

public Master() {
	// TODO Auto-generated constructor stub
	System.out.println(" I am constructor");
}

  @Autowired
  
	public Master(@Qualifier("student") CompanyInterface ci) {
	super();
	this.ci = ci;
}


	public CompanyInterface getCi() {
		return ci;
	}

	
	public void setCi(CompanyInterface ci) {
		this.ci = ci;
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println(" I am Master ");
	}

	@Override
	public void getCompany() {
		// TODO Auto-generated method stub
		this.ci.start();
	}

	@PostConstruct
	private void init() {
		System.out.println(" I am init");
	}
	
	@PreDestroy
	private void end() {
		System.out.println(" I am End");
	} 
}

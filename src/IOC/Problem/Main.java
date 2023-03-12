package IOC.Problem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* Sport mySport = new FootBall();
        mySport.start();*/
        
        Sport mySport = new VoleyBall();
        mySport.start();
        		
	}

}

/*
 * Code Source est Statique 
 * Wanted Not Modify in Source code when Update My Application==> 
 * IOC ==> Charge My Paramet exist dans code source From Spring Container qui contient Beans
 */
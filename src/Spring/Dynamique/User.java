package Spring.Dynamique;

public class User implements UserInterface {

	private PersonInterface person;
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(" I am User");
	}
public User() {
	// TODO Auto-generated constructor stub
}



public void setPerson(PersonInterface person) {
	this.person = person;
}

public void getPerson() {
	this.person.began();
	System.out.println("Name :   ##"+this.name);
}

public void doInit() {
	System.out.println("Hi I am Created Successful");
}

public void doEnd() {
	System.out.println("Hi I am Die");
}
}

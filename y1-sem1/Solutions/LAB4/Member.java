public class Member // class declaration
{

	private String name; // field String
	private int age; // field Integer

	public Member(String n, int a)// constructor
	{
		this.name = n;
		this.age = a;
	}

	public String getName() {
		return name; // getter
	}

	public void setName(String newName) {
		this.name = newName; // setter
	}

	public int getAge() {
		return age; // getter
	}

	public void setAge(int newAge) {
		this.age = newAge; // setter
	}

	public void printInfo() // output
	{
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("*******************");
	}

}

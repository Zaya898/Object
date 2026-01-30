package CodeAbstract;

public abstract class Person  {
	public String name;
	public int age;
	String id;
	public int phoneNumber;
	abstract void printInfo();
    public Person(String name, int age, String id, int phoneNumber) {
	        this.name = name;
	        this.age = age;
	        this.id = id;
	        this.phoneNumber = phoneNumber;
    }

}

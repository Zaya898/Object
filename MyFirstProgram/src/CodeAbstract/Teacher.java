package CodeAbstract;

public class Teacher extends Person{
	public String code;
	public Teacher(String name, int age, String id, int phoneNumber, String code) {
        super(name, age, id, phoneNumber);
        this.code = code;
    }
	@Override
	void printInfo() {
		System.out.println("Teacher: "+ name + ", ID: " + id + ", Code: " + code);
	}

}

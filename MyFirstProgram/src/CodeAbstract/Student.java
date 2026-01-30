package CodeAbstract;

public class Student extends Person implements Task{
	public String code;
	private float gpa;
	   public Student(String name, int age, String id, int phoneNumber, String code, float gpa) {
	        super(name, age, id, phoneNumber);
	        this.code = code;
	        this.gpa = gpa;
	    }
	@Override
	void printInfo() {
		System.out.println("Student: "+ name + ", ID: "+ id + ", GPA: "+ gpa);
	}
	public float calculateGPA() {
		return gpa;
	}
	@Override
	public boolean takeAbsense(String reason) {
		System.out.println("Absence recorded for: "+ reason);
        return true;
	}
 
}

package Inheritance;

public class Student extends Person{
	public String code;
    private float gpa;

    public Student(String name, int age, String id, int phoneNumber, String code, float gpa) {
    	 super(name, age, id, phoneNumber);
	     this.code = code;
	     this.gpa = gpa;
	    }
    public float getGPA() {
    	return gpa;
    }
    public void setGPA() {
    }
	public String getInfo() {
	    return super.getInfo() + ", Code: " + code + ", GPA: " + gpa;
    }
}
package StudentRegistration;
public class Student {
	    String studentName;
	    String studentCode;
	    private int age;
	    public Student(String studentName, String studentCode, int age) {
	        this.studentName = studentName;
	        this.studentCode = studentCode;
	        this.age = age;
	    }

	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	    }
	    public void displayInfo() {
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Student Code: " + studentCode);
	        System.out.println("Age: " + age);
	   }
}






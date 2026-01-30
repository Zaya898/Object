package Inheritance;

public class Driver {
	 public static void main(String[] args) {
	        Student student = new Student("Zaya", 18, "P12345", 99887766, "B24101", 3.8f);
	        Student student1=new Student("Bat",18,"P23455",88568587,"B241910",3.7f);
	        Teacher teacher = new Teacher("Hulan", 35, "P67890", 88776655, "CS101");

	        System.out.println(student.getInfo());
	        System.out.println(student1.getInfo());
	        System.out.println(teacher.getInfo());
	    }
}

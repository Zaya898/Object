package BasicCodes;
import java.util.Scanner;

 public class Student1 {
	String name;
    String code;
    int age;
	public String studentName;
    static int totalStudents = 0;
    public Student1(String name, String code, int age) {
        this.name = name;
        this.code = code;
        this.age = age;
        totalStudents++; 
    }

    public void displayInfo() {
        System.out.println("Оyutnii ner: " + name);
        System.out.println("Оyutnii kod: " + code);
        System.out.println("Оyutnii nas: " + age);
    }
}

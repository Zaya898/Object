package StudentRegistration;
import java.util.Scanner;
import StudentRegistration.Student;
public class Driver {
	  public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	      System.out.print("Enter department name: ");
	      String deptName = scanner.nextLine();
	      System.out.print("Enter number of students: ");
	      int numStudents = scanner.nextInt();
	      scanner.nextLine(); 
	      Student[] students = new Student[numStudents];
	     
	      for (int i = 0; i < numStudents; i++) {
	          System.out.println("\nEnter details for student" + (i + 1));
	          System.out.print("Enter student name: ");
	          String studentName = scanner.nextLine();

	          System.out.print("Enter student code: ");
	          String studentCode = scanner.nextLine();

	          System.out.print("Enter age: ");
	          int age = scanner.nextInt();
	          scanner.nextLine(); 

	          students[i] = new Student(studentName, studentCode, age);
	        }

	        System.out.print("\nEnter number of programs: ");
	        int numPrograms = scanner.nextInt();
	        scanner.nextLine(); 
	        Program[] programs = new Program[numPrograms];
	        
	        for (int i = 0; i < numPrograms; i++) {
	            System.out.print("Enter name of Program" + (i + 1) + ": ");
	            String progName = scanner.nextLine();
	            programs[i] = new Program(progName);
	        }

	        Department department = new Department(deptName, students, programs);
	        department.displayInfo();
	        scanner.close();
	    }
 }




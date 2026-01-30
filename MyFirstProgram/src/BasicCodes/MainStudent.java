  package BasicCodes;
import java.util.Scanner;
public class MainStudent {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Heden oyutn burtgeh ve? ");
	        int n = scanner.nextInt();
	        scanner.nextLine(); 
	        Student1[] students = new Student1[n];
	        for (int i = 0; i < n; i++) {
	            System.out.println("Оyutan [" + (i + 1) + "]-iin medeelliig oruulna uu:");
	            System.out.print("Оyutnii ner: ");
	            String name = scanner.nextLine();
	            System.out.print("Оyutnii kod: ");
	            String code = scanner.nextLine();
	            System.out.print("Оyutnii nas: ");
	            int age = scanner.nextInt();
	            scanner.nextLine(); 

	            students[i] = new Student1(name, code, age);
	        }

	        System.out.println("\nNiit burtgesen oyutnii medeelel:");
	        for (Student1 student : students) {
	            student.displayInfo();
	            System.out.println(" ");
	        }

	        System.out.println("Niit oyutnii too:" + Student1.totalStudents);
	        scanner.close();
	    }


}

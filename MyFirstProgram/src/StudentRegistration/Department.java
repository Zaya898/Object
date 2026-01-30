package StudentRegistration;
public class Department {
	    String deptName;
	    Student[] students;
	    Program[] programs;
	    public Department(String deptName, Student[] students, Program[] programs) {
	        this.deptName = deptName;
	        this.students = students;
	        this.programs = programs;
	    }
	    public void displayInfo() {
	        System.out.println("\nDepartment name: " + deptName);
	        
	        System.out.println("\nStudents in department:");
	        for (int i = 0; i < students.length; i++) {
	            students[i].displayInfo();
	            System.out.println();
	        }
	        System.out.println("Programs in department:");
	        for (int i = 0; i < programs.length; i++) {
	            programs[i].displayInfo();
	            System.out.println();
	        }
	    }
	}


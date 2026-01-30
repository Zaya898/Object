package Collection;
import java.io.*;
public class Main3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File myFile=new File("Studentinfo3.txt");
		
		Student student1=new Student("Duluguun",20,"B123345");
		Student student2=new Student("Nomin",19,"B24000");
		Student student3=new Student("Selenge",18,"B241019");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(myFile))) {
            oos.writeObject(student1);
            oos.writeObject(student2);
            oos.writeObject(student3);
           
        } catch (IOException e) {
            System.out.println("Bichhih uyd aldaa garlaa: " + e.getMessage());
        }
		
		System.out.println("\nFailaas unshsan medeelel:");
	    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myFile))) {
	        while (true) {
	            try {
	                Student student = (Student) ois.readObject();
	                System.out.println(student);
	           } catch (EOFException eof) {
	               break;
	          }
	      }
	   } 
	    catch (IOException | ClassNotFoundException e) {
	      System.out.println("Unshih uyd aldaa garlaa: " + e.getMessage());
	   }
	}

}

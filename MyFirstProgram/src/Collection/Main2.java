package Collection;
import java.io.*;
public class Main2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File myfile=new File("StudentInfo2.txt");
		Student student1=new Student("Bold",18,"B1234");
		Student student2=new Student("Solongo",20,"B1100");
		Student student3=new Student("Zaya",21,"B2220");
		try {
            FileWriter fileWriter = new FileWriter(myfile);
            fileWriter.write(student1.toString());
            fileWriter.write(student2.toString());
            fileWriter.write(student3.toString());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Bichih uyd aldaa garlaa: " + e.getMessage());
        }
		System.out.println("Fail aas unshan medeelel:");
        try {
            FileReader fileReader= new FileReader(myfile);
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Unshih uyd aldaa garlaa: " + e.getMessage());
        }
	}

}

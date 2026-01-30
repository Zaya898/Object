package Collection;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
    	File myFile = new File("StudentInfo2.txt");
    	FileWriter fileWriter = new FileWriter(myFile);
        BufferedWriter writer = new BufferedWriter(fileWriter);
       
        Student s1 = new Student("Bat", 20, "B1234");
        Student s2 = new Student("Saraa", 21, "B5678");
        Student s3 = new Student("Huslen", 19, "B9012");

        writer.write(s1.toString()); writer.newLine();
        writer.write(s2.toString()); writer.newLine();
        writer.write(s3.toString()); writer.newLine();
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(myFile));
        String a;
        System.out.println("BufferedReader ashiglan unshsan ogogdol:");
        while ((a= reader.readLine()) != null) {
              System.out.println(a);
        }
        reader.close();
    }

 }



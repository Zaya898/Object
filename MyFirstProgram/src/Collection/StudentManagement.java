package Collection;
import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
       
        List<String> studentList = new ArrayList<>();
        studentList.add("Bat");
        studentList.add("Saraa");
        studentList.add("Dolgor");
        studentList.add("Bat"); 

        Set<String> uniqueStudents = new HashSet<>(studentList);

        System.out.println("Оyutnuudiin jygsaalt(davhar ner arilgah):");
        for (String student : uniqueStudents) {
            System.out.println("- " + student);
        }

        Map<String, Integer> studentScores = new HashMap<>();
        for (String student : uniqueStudents) {
            studentScores.put(student, new Random().nextInt(101));
        }

        System.out.println("\nОyutnii onoo:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " оноо");
        }
    }
}

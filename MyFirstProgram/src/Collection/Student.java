package Collection;

public class Student {
    String name;
    int age;
    String code;

    public Student(String name, int age, String code) {
        this.name = name;
        this.age = age;
        this.code = code;
    }
    
    public String toString() {
        return "Ner: " + name + ", Nas: " + age + ", ID: " + code +"\n";
    }
}

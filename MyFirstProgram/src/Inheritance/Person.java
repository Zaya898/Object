package Inheritance;

public class Person {
    public String name;
    public  int age;
    private String id;
    private int phoneNumber;

    public Person(String name, int age, String id, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getInfo() {
        return "Name: " + name + ", Age: " + age + ", ID: " + id + ", Phone: " + phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}

package Inheritance;

public class Teacher extends Person{
	  public String code;
      public Teacher(String name, int age, String id, int phoneNumber, String code) {
    	  super(name,age,id,phoneNumber);
	      this.code = code;
	    }
      
	  public String getInfo() {
	       return super.getInfo() + ", Code: " + code;
	    }
	}


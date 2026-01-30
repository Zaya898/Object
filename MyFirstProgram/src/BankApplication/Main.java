package BankApplication;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog("Banhar","er",3);
        Cat cat1=new Cat("zaya","em");
        //System.out.println(dog1.toString());
        //System.out.println(cat1);
        System.out.print(Animal.niitAmitan); 
        Animal[] myPet=new Animal[2];
        myPet[0]=dog1;
        myPet[1]=cat1;
        for(int i=0; i<2;i++) {
        	System.out.println(myPet[i]);
        }
	}

}

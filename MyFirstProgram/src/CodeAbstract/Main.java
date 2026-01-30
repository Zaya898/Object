package CodeAbstract;

public class Main {

	public static void main(String[] args) {

		    Customer customer1 = new Customer();
	        customer1.inputData("Zaya", 1);
	        customer1.addAccount(new Account(101, 500.0));
	        customer1.addAccount(new Account(102, 1500.0));

	        Customer customer2 = new Customer();
	        customer2.inputData("Bold", 2);
	        customer2.addAccount(new Account(201, 250.5));

	        Customer customer3 = new Customer();
	        customer3.inputData("Chimgee", 3);
	        customer3.addAccount(new Account(301, 1200.75));
	        customer3.addAccount(new Account(302, 800.0));
	        customer3.addAccount(new Account(303, 60.0));
	        
	        customer1.displayInfo();
	        customer2.displayInfo();
	        customer3.displayInfo();

	        System.out.println("Total accounts created: " + Customer.totalAccounts);
	    }

	}


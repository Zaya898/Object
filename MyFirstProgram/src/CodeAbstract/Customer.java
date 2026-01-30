package CodeAbstract;

import java.util.ArrayList;

public class Customer extends User {
	 private ArrayList<Account> myAccounts = new ArrayList<>();
	 public static int totalAccounts = 0;
	   @Override
	    public void inputData(String name, int id) {
	        setUserName(name);
	        setUserID(id);
	    }

	    @Override
	    public void inputData(String name) {
	        setUserName(name);
	    }

	    @Override
	    public void inputData(int id) {
	        setUserID(id);
	    }

	    public boolean addAccount(Account account) {
	        if (account != null) {
	            myAccounts.add(account);
	            totalAccounts++;
	            return true;
	        }
	        return false;
	    }

	    public ArrayList<Account> getMyAccounts() {
	        return myAccounts;
	    }

	    public void displayInfo() {
	        System.out.println("Customer Name: " + getUserName());
	        System.out.println("Customer ID: " + getUserID());
	        System.out.println("Accounts:");
	        for (Account acc : myAccounts) {
	            System.out.println("  Account ID: " + acc.AccountID + ", Balance: " + acc. Balance);
	        }
	        System.out.println();
	    }
	 
}

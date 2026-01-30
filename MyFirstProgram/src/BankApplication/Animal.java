package BankApplication;

public class Animal {
	public String name;
	public String huis;
	static int niitAmitan;
	public Animal(String name, String huis) {
		this .name=name;
		this.huis=huis;
		niitAmitan++;
	}
	public String toString() {
		return "Name"+name+",huis"+huis;
	}

}

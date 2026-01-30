package BasicCodes;

import java.util.Scanner;

public class Lab4d1 {
	
	public static void main(String[] args) {
		int a;
		System.out.println("a toog oruul:");//class zarlalt
		Scanner scanner = new Scanner(System.in);
		a=scanner.nextInt();
		int aa=a;
	    int b=0;
	    while (a!=0) {
            b=b*10+a%10;
            a=a/10;
        }
	    System.out.println(" b= "+b);   
        if (a==b) {
            System.out.println(a + "ni palindrom too mun baina.");
        } else {
            System.out.println(a +"ni palindrom too mun baina.");
        }
        scanner.close();
    }

  }


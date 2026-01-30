package BasicCodes;
import java.util.Scanner;

public class Lab4d2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print(" n: ");
	    int n = scanner.nextInt();
		int[] a = new int[n];
		
		System.out.print("elementuudiig oruul:");
		for(int i=0;i<n;i++) {
			System.out.print("a["+i+"]=");
			a[i]=scanner.nextInt();
		}
		int max=a[0];
		for (int i = 1; i < n; i++) {
	            if (a[i] > max) {
	                max = a[i]; 
	            }
	            
		}
		System.out.println("max=" + max);

	}

}

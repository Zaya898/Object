package BasicCodes;
import java.util.Scanner;
public class Lab3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("n toog oruul:");
		int n=scanner.nextInt();
        
		System.out.println("n-too hurtel anhnii too:");
		for(int i=2;i<=n;i++) {
			boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j==0) {
                    isPrime = false; 
                    break;
		}
	} 
            if(isPrime == true) {
            	System.out.print(i+" ");
            }
		}
       scanner.close();
	}
}

package BasicCodes;
import java.util.Scanner;
public class Lab3d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        System.out.print("n toog oruul:");
        int n=scanner.nextInt();
        
        int sum=0;
        int originalNumber=n;
        while(n!=0) {
        	int i=n % 10;
        	sum+=i;
        	n=n/10;
        }
        System.out.println(originalNumber+"tsipruudiin niilber"+sum);
        scanner.close();
	}

}

package BasicCodes;
import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("n toog oruul:");
		int n = scanner.nextInt();
		int sum=0;
		for(int i=0;i<=n;i+=2) {
			sum+=i;	
		}
        System.out.println("0-ees" +n +"hurtelh toonuudiin niilber" + sum);
	}

}

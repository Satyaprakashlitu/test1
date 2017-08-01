import java.util.Scanner;

public class primeNumber {
	static int i=1;
	public static void main(String[] args) {
		Scanner  scanner=new Scanner(System.in);
		System.out.println("enter a number");
		int j=scanner.nextInt();
		
		for(int k=2;k<=j;k++)
		{
			if(j%k==0)
			{
				i=0;
				
			}
			break;
		}
		if(i==1)
		{
			System.out.println( "number is prime");
		}
		else {
			System.out.println("number isn't prime");
		}
	}

}

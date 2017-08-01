import java.util.Scanner;

public class SumOfNnumbers {
	static int i;
	static int j;
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enteer nth number");
	int b=scanner.nextInt();
	
	for(i=0;i<=b;i++)
	{
		j=j+i;
	}
System.out.println(j);
}
}

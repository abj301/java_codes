import java.util.Scanner;
public class Pal {

	
	public static void main(String[] args) {
		System.out.println("enter a number to check whether it is palindrome or not");
		Scanner scan=new Scanner(System.in);
		int n,temp,a=0,x;
		n=scan.nextInt();
		temp=n;
		while(n>0)
		{
			x=n % 10;
			a=a * 10 + x;
			n=n / 10;
		}
		if(a == temp)
		{
			System.out.println("number is a palindrome");
		}
		else
		{
			System.out.println("number is not a palindrome");
		}
		
	}

}

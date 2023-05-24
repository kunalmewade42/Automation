package basic;

import java.util.Scanner;

public class PalindromeOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int m=n;
		int rev=0;
		int r;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==m)
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It's not palindrome");
		}

	}

}

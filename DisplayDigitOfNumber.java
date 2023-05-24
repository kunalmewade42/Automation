package basic;

import java.util.Scanner;

public class DisplayDigitOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		int r;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			System.out.println(r);
		}
		System.out.println("");
	}

}

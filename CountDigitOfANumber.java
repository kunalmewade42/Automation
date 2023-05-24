package basic;

import java.util.Scanner;

public class CountDigitOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
       System.out.println("Number of digit is " +count);
	}

}

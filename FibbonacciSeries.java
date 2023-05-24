package basic;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to print Fibbonacci Series");
		System.out.println("Enter the number of terms");
		int n=sc.nextInt();
		int a=0,b=1,c;
		System.out.println(a+ "," +b);
		for(int i=0;i<n-2;i++)
		{
			c=a+b;
			System.out.print(c +",");
			a=b;
			b=c;
		}

	}

}

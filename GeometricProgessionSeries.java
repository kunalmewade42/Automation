package basic;

import java.util.Scanner;

public class GeometricProgessionSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Program to print GP Series");
		System.out.println("Enter a,r,and n");
		int a=sc.nextInt();
		int r=sc.nextInt();
		int n=sc.nextInt();
		int term=a;
		for(int i=0;i<n;i++)
		{
			System.out.print(term + ",");
			 term=term*r;
			 //System.out.print(term);
		}

	}

}

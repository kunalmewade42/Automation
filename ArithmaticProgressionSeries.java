package basic;

import java.util.Scanner;

public class ArithmaticProgressionSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a , d, n");
		int a=sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();
		int term=a;
		for(int i=0;i<n;i++)
		{
			System.out.println(term +" ,");
			term=term+d;
		}
		

	}

}

package basic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a number");
      int n=sc.nextInt();
       int m=n;
       int sum=0;
       int r;
       while(n>0)
       {
    	   r=n%10;
    	   n=n/10;
    	   sum=sum+r*r*r;
       }
       if(sum==m)
       {
    	   System.out.println("It is armstrong number");
       }
       else
       {
    	System.out.println("It is not a armstrong number");   
       }
	}

}


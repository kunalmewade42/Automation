package arrays;

import java.util.Scanner;

public class SearchingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int A[]= {3,9,12,34,56,10,16,90};
		//int key;
		System.out.println("Enter the Key");
		int key=sc.nextInt();
		for(int i=0;i<A.length;i++)
		{
			if(key==A[i])
			{
				System.out.println("Element found :" +i);
				System.exit(0);
			}
		}
         System.out.println("Not Found");
	}

}

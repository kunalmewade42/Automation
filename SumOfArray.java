package arrays;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {3,9,12,34,56,10,16,90};
		int sum=0;
		for(int i=0;i<A.length;i++)
		{
			sum=sum+A[i];
		}
         System.out.println("Sum is " +sum);
	}

}

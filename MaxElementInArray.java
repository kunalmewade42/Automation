package arrays;

public class MaxElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {3,9,12,34,56,10,16,44};
		int max=A[0];
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max)
			{
				max=A[i];
			}
		}
		System.out.println(max);

	}

}

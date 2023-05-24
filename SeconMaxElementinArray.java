package arrays;

public class SeconMaxElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {3,9,12,34,56,10,16,44};
		int max1,max2;
		max1=max2=A[0];
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max1)
			{
				max2=max1;
				max1=A[i];
			}
			else if(A[i]>max2)
			{
				max2=A[i];
			}
		}
		System.out.println("Second max"+ max2);
	}

}

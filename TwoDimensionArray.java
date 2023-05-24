package arrays;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[][]= new int [3][4];
		int A1[][]= {{1,2,3,4},{2,4,6,8},{3,5,7,9}};
		A=new int[3][4];
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				System.out.println(A[i][j]);
			}
			System.out.println("\n");
		}
	}


	}



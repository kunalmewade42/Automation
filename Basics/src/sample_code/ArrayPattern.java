package sample_code;

public class ArrayPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nested loops and 2D array
		for(int i=0;i<=9;i++)
		{
			for(int j=0;j<=9;j++)
			{
				System.out.print(i+""+j+" ");
				
			}
			System.out.println();
		}
//2D Array
		int dd[][]=new int[8][8];
		for(int h=0;h<dd.length;h++)
		{
			for(int g=0;g<dd[0].length;g++)
			{
				System.out.print(h+""+g+" ");
			}
			System.out.println();
		}
	}

}

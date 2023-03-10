package sample_code;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("even number"+i);
			}
			else if(i%2!=0)
			{
				System.out.println("Odd number"+i);
			}
		}
         System.out.println("--------------------------------");
         int j=1;
         while(j<=n)
         {
        	 if(j%2==0)
        	 {
        		 System.out.println("even number"+j);
        	 }
        	 j++;
         }
         System.out.println("-----------------------------------------");
         int k=1;
         do
         {
        	 if(k%2==0)
        	 {
        		 System.out.println("even number="+k);
        	 }
        	 k++;
         }
         while(k<=n);
         
	}
}


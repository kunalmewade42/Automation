package sample_code;

public class WhileOperations {
     //question5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			if(i%7==0)
			{
				System.out.println("break the loop");
				break;
				
			}
			i++;
		}
		}
	}



package sample_code;

public class StringCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Selenium";
		String s1="Sel   enium ";
		s1.replaceAll("\\s","");
		System.out.println(s1);
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("Both are equals");
			
		}
		else
			System.out.println("both are not equals");

	}

}

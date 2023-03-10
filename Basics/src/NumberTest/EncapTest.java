package NumberTest;

public class EncapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number nb=new Number();
		nb.setNumber(10);
		int num=nb.getNumber();
		System.out.println(num);
		
		StudentDetails SD=new StudentDetails();
		
		SD.setName("Kunal");
		String Name=SD.getName();
		System.out.println(Name);
		SD.setRollNumber(100);
	    int rollnumber=	SD.getRollNumber();
		System.out.println(rollnumber);
		SD.setStudentID(10);
		int stid=SD.getStudentID();
		System.out.println(stid);
		System.out.println("Student details are="+Name+" "+rollnumber+" "+stid);


	
	}

}

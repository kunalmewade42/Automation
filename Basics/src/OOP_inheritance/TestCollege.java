package OOP_inheritance;

public class TestCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University un=new University();
		un.admission();
		un.courses();
		un.campus();
		
		University un1=new EngineeringCollege();
		un1.admission();
		un1.courses();
		//((EngineeringCollege) un1).placement();
		EngineeringCollege ec=new EngineeringCollege();
		ec.placement();
		
		University un2=new ManagementCollege();
		un2.admission();
		un2.fee();
		un2.courses();
		ManagementCollege.Fee();
		

	}

}

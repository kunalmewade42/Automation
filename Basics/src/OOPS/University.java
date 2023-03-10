package OOPS;


public class University {
    private String name;
    private String country;
    private String established_Date;
    private String coursesOffered;
    
  public String getName(){
	  return name;
  }
  public void setName(String name){
       this.name=name;
  }
	public String getCountry() {
		return country;
	}
	public void SetCountry(String country) {
		this.country=country;
	}
	public String getEstablishedDate() {
		return established_Date;
		}
	public void setEstablishedDate(String established_Date)
	{
		this.established_Date=established_Date;
	}
	public String getCoursesOffered(){
		return coursesOffered;
	}
	public void setCoursesOffered(String coursesOffered)
	{
		this.coursesOffered=coursesOffered;
	}
	public void display(String name,String country,String established_Date,String CousesOffered)
	{
		System.out.println("Display University Details"+name+country+established_Date+CousesOffered);
		
	}
	public static void main (String[]args)
	{
		University un=new University();
		System.out.println(un.country);
	}
}

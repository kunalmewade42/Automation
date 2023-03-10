package OOPS;

import java.util.ArrayList;

public class EmployeeInfo {
	String name;
	int age;
	ArrayList<String> deviceList;
	public EmployeeInfo(String name,int age,ArrayList<String>deviceList)
	{
		this.name=name;
		this.age=age;
		this.deviceList=deviceList;
	}
	public static void main(String ar[]) {
		ArrayList<String> empDeviceList=new ArrayList<String>();
		empDeviceList.add("Iphone 12");
		empDeviceList.add("Laptop");
		empDeviceList.add("Desktop");
		
		EmployeeInfo e1= new EmployeeInfo("TOM", 25, empDeviceList);
		System.out.println(e1.name + " "+e1.age);
		System.out.println(e1.deviceList);
		System.out.println(e1.deviceList.size());
		for(int i=0;i<e1.deviceList.size();i++)
		{
			System.out.println(e1.deviceList.get(i));
		}
		
	}

}

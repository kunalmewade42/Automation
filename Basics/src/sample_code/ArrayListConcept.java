package sample_code;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    ArrayList ar=new ArrayList();
    ar.add(10);
    ar.add(20);
    ar.add(30);
    System.out.println(ar.size());
    System.out.println(ar.get(2));
    
    ar.add("Kunal");
    ar.add(12.33);
    System.out.println(ar.size());
    System.out.println(ar.size()-1);
    for(int i=0;i<ar.size();i++)
    {
    	System.out.println(ar.get(i));
    }
	}

}

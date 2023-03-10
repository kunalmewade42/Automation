package sample_code;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[1]);
		System.out.println(i.length);
		for(int k=0;k<i.length;k++)
		{
			System.out.println(i[k]);
		}
	//for each loop
		for(int e:i)
		{
			System.out.println(e);
		}
		//double Array
		double d[]=new double[2];
		d[0]=12.33;
		d[1]=13.43;
		System.out.println(d[0]);
		System.out.println(d[0]+d[1]);
		
		//char Array
		char c[]=new char[3];
		c[0]='a';
		c[1]='$';
	  System.out.println(c[1]);
	
	//char Array
	//char c[]=new char[3];
	c[0]='a';
	c[1]='$';
  System.out.println(c[1]);
  
  //String Array
  String lang[]=new String[4];
  lang[0]="HINDI";
  lang[1]="English";
  lang[2]="Marathi";
  lang[3]="Punjabi";
  System.out.println(lang[1]);
  for(int p=0;p<lang.length;p++)
  {
	  System.out.println(lang[p]);
  }
  for(String e:lang)
  {
	  System.out.println(e);
  }
  Object ob[]=new Object[5];
  ob[0]="Kunal";
  ob[1]=20;
  ob[2]=34.55;
  ob[3]='m';
  ob[4]=true;
  System.out.println(ob[3]);
  for(int n=0;n<ob.length;n++)
  {
	  System.out.println(ob[n]);
  }
 
  for(Object e:ob)
  {
	  System.out.println(e);
  }
  //boolean Array
  boolean b[]=new boolean[2];
  b[0]=true;
  b[1]=false;
  System.out.println(b[1]);
  }
}


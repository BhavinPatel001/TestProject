package Package2;

import Package1.Student; // you can use the import package1.* to use the other classes created in package1

public class EMP {
	
	
public static void main(String[] args) {
	
	Student s1=new Student();
	
	System.out.println("Public Data : " + s1.h);
	System.out.println("Cannot access the Private & Protected Data");
	
}
		
}



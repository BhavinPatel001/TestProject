package Package1;

public class ClassA {

	static int i;
	static int j;
	static String s;
	int k; // non static
	String st; // non static string
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA.i=10;
		System.out.println(ClassA.i);
		ClassA.j=20;
		System.out.println(ClassA.j);
		ClassA.s="This is static variable.";
		System.out.println(ClassA.s);
		
		//non Static data member calling
		ClassA s1=new ClassA();
		s1.k=30;
		System.out.println(s1.k);
		
		s1.st="This is an non static variable.";
		System.out.println(s1.st);
	}

}

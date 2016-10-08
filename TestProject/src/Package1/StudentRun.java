package Package1;

public class StudentRun {

	public static void main(String[] args) {

		Student s=new Student ();
		System.out.println("StudentRun default : "  + s.d);
		System.out.println("StudentRun Protected : " + s.p);
		System.out.println("StudentRun Public : " + s.h);
		System.out.println("StudentRun cannot access Private" );
	}

}

package loops;

public class Student {
	int rollno;
	String name;
	static String college ="MIT";
	
	static void change() {
		college = "MITE";
	}
	
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void disaplay() {
		System.out.println(rollno+" "+name+" "+college);
	}
	
}

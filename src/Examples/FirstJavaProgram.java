package Examples;

public class FirstJavaProgram {
	public static void main(String[] args) {
		System.out.println("The user id is:");
		JavaObjects obj= new JavaObjects();
		obj.setUserId(100);
		System.out.println(obj.getUserId());
		String s1="hello";
		String s2="hello";
		if(s1.equals(s2)) {
			System.out.println("S1 equals S2");
		}
			else
			{
				System.out.println("S1 not equals S2");
			}
		if(s1==s2) {
			System.out.println("S1 equals S2");
		}
			else
			{
				System.out.println("S1 not equals S2");
			}
		}
	

}

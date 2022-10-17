package Examples;

import java.util.ArrayList;

public class learn_Array_List {
	public static void main(String[] args) {
		System.out.println("My First Java Program");
		learn_Array_List obj = new learn_Array_List();

        obj.LearnArrayList();
	}

public void LearnArrayList(){


    //ArrayList<String> obj = new ArrayList<String>();

    ArrayList<Integer> obj1 = new ArrayList<Integer>();


    obj1.add(10);
    obj1.add(20);
    obj1.add(30);
    obj1.add(40);
    obj1.add(50);
    obj1.add(60);
    obj1.add(70);
    obj1.add(80);
    

    // Ho to display ArrayList Data ????

    System.out.println(obj1);


    // To Add some data in an ArrayList

    obj1.add(3 ,100);
    obj1.add(7,500);

    System.out.println(obj1);


    // To Delete some data in an ArrayList

    obj1.remove(3);

    System.out.println(obj1);

}
}
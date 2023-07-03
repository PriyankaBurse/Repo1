package day1.basics;
import java.util.ArrayList;

public class ArrayListExample0 {
	
	public static void main(String[] args) {
		ArrayList L1 = new ArrayList();// Creating arraylist - default size is 10
				L1.add("Mango");// auto-upcasting from String to Object class object
				L1.add(1235);// first boxing for int to Integer class object---> upcasting to object class
				L1.add("Banana");// auto-upcasting from String object to Object class object
				L1.add(null);
				L1.add('C');// first boxing for char to Character class object---> upcasting to object class
				L1.add(15.26);// first boxing for double to Double class object---> upcasting to object class
				L1.add(true);// first boxing for boolean to Boolean class object---> upcasting to object class
				L1.add(new ArrayListExample0());// ArrayListExample0 class object will be upcasted to Object class object
				L1.add("Banana");//duplicate 
				// Printing the arraylist object
				System.out.println("size of list: " + L1.size());
				System.out.println("Elements of list: " +L1);//toString overrided in Collection
				System.out.println("Traversing list through for loop:");
				for (int i = 0; i < L1.size(); i++) {
					System.out.println(L1.get(i));
				}
				System.out.println("Traversing list through for-each loop:");
				// Traversing list through for-each loop
				for (Object fruit :L1) {
					System.out.println(fruit);
				}
				// accessing the element 
				System.out.println("Returning element: " + L1.get(1));// it will return the 2nd element, because index starts
																		// from 0
				// changing/update existing object
				L1.set(1, "Dates");
				System.out.println("size of list: " + L1.size());
				System.out.println("Elements of list: " +L1);
			}

	}


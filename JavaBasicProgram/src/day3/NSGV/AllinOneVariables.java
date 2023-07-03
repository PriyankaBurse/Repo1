package day3.NSGV;

public class AllinOneVariables {
	static int empId=10;//static global variable//Since defined outside the main method and
	//within the class body these are static and non stATIC VARIABLES
	double salary;//non-static global variable

	public static void main(String[] args) {
		System.out.println("Programs starts");
		//local variables
		int age=25; //Since declared inside the method body these are the local variables
		System.out.println("age: "+age);
		System.out.println("*****************Accessing static members*********************");
		System.out.println("initial Static GV empID: "+empId);
		AllinOneVariables.empId=101;
		System.out.println("updated Static GV empID: "+empId);
		System.out.println("*****************Accessing non-static members*********************");
//			AllinOneVariables r2;//no object creation
//			r2=new AllinOneVariables();// object created
		
		AllinOneVariables r1=new AllinOneVariables();
		System.out.println("initial NSGV salary: "+r1.salary);
		r1.salary=95000;
		System.out.println("updated NSGV salary: "+r1.salary);
		
		System.out.println("****************new instance of the class*************************");
		AllinOneVariables r2=new AllinOneVariables();
		System.out.println("initial NSGV salary: "+r2.salary);
		System.out.println("*******************************************************************");
		AllinOneVariables.empId=1001;
		System.out.println("updated Static GV empID: "+empId);
		System.out.println("Programs ends");
		
		
		
		
	}

}

	


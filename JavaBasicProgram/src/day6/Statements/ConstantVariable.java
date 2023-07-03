package day6.Statements;

public class ConstantVariable {

		public static void main(String[] args) {
			
			 int age=15;
			System.out.println("age: "+age);
			age=10;
			System.out.println("updated age1: "+age);
			age=1;
			System.out.println("updated age2: "+age);
			//final age=25;//wrong syntax, final keyword should be used at time of declaration only
			System.out.println("updated age3: "+age);
			age=105;//compile time error
			System.out.println("updated age4: "+age);
		}
	}
	/**
	when we don't want anyone to change our variable value dn that variable should be declared with final keyword
	if you try to change value of final variable dn it will give a compile time error
	*/


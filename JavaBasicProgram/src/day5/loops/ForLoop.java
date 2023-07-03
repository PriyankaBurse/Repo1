package day5.loops;

public class ForLoop {
	public static void main(String args[]) {
int num1=2,num2=6;
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1 + " ");
		}

		System.out.println("\n*****Print in CAP*********");

		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
			System.out.print(c1 + " ");
		}
		System.out.println("\n");
		System.out.println("Num1="+num1+"\tNum2=" +num2);
	}
}

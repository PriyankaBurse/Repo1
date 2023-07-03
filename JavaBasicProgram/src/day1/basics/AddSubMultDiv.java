package day1.basics;

public class AddSubMultDiv
{
	public static void main(String[] args)
	{
		int num1=15,num2=20,add,sub,mult,div;
		add=num1+num2;
		System.out.println("Addition of two numbers="+add);
		sub=num1-num2;
		System.out.println("Subtraction of two numbers="+sub);

		mult=num1*num2;
		System.out.println("Multiplication of two numbers="+mult);

		div=num1/num2;
		System.out.println("Division of two numbers="+div);

		int rem=num1%num2;
		System.out.println("Remainders after division of two numbers="+rem);
		System.out.println();
		
	}

}

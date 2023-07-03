package day1.basics;

public class PracticeP1 {
	
		public static void main(String[] args) {
			
				int counter = 0;
				for (int i = 1; i<=6; i++) {
					if ( 6%i == 0) {
						++counter;
					}
				}
				if (counter == 2) {
					System.out.println("Prime Number: " );
				}else {
					System.out.println("Given number is not a prime: ");
				}
			System.out.println("check give number is prime or not: "+checkPrimeNumber(5));
			checkPrimeNumberTillPassedNumber(7);
		}

		static boolean checkPrimeNumber(int num) {
			int counter = 0;
			if(num>1) {
				for (int i = 1; i <= num; i++) {
					if (num % i == 0) {
						++counter;
					}
				}
				if (counter == 2) {
					System.out.println("Prime Number: " + num);
					return true;
				} else {
					System.out.println("Number is not a prime: " + num);
					return false;
				}
			}else {
				System.out.println("Given number is either 0 or 1 or negative");
				return false;
			}
		}

		static void checkPrimeNumberTillPassedNumber(int num) {
			if (!(num == 0 || num == 1)) {
				for (int i = 2; i <= num; i++) {
					int counter = 0;
					for (int j = i; j >= 1; j--) {
						if (i % j == 0) {
							++counter;
						}
					}
					if (counter == 2) {
						System.out.println("Prime Number: " + i);
					}
				}
			}else {
				System.out.println("Either the given number is 0/1, so won't it consider for prime number");
			}
		}
	}

	/**
	 * set break point in the required location
	 * next line : F6 
	 * inside function or method: F5 
	 * value of variable: ctrl+shft+i
	 * continue : F8
	 */

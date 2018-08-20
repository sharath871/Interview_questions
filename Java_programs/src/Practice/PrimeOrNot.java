package Practice;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num = 71;
		boolean flag =false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.print(num+" num is prime ");
		}
		else {
			System.out.println(num+" is not prime");
		}

	}

}

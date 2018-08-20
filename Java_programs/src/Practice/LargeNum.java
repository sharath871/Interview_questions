package Practice;

import java.util.Scanner;

public class LargeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  n1 number");
		int n1=sc.nextInt();
		System.out.println("enter  n2 number");
		int n2=sc.nextInt();
		System.out.println("enter  n3 number");
		int n3=sc.nextInt();
		
		if(n1>=n2&&n1>=n3) {
			System.out.println(n1+"is large number");
		}else if(n2>=n1&&n2>=n3) {
			System.out.println(n2+" is large number");
		}else {
			System.out.println(n3+" is large number");
		}
		

	}

}

package Programs;

public class ReverseNums {

	public static void main(String[] args) {
		int num=1234, remainder,reverse = 0;	
		
		while(num!=0) {
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
       
		}
		System.out.println(reverse);
	}	

}

package Practice;

public class ArmstrongNum {

	public static void main(String[] args) {
		int num=131;
		int originalNum,reversedNum = 0,remainder;
		originalNum=num;
		while(num!=0) {
			remainder=num%10;
		 reversedNum=reversedNum*10+remainder;
		 num=num/10;
		 
		}
		if(originalNum==reversedNum) 
			System.out.println(originalNum +" is palindrom");
		
		else 
			System.out.println(originalNum+" is not palindrom");
		
		
	}
	
}

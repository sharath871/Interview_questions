package Practice;

public class ArmstongNum {

	public static void main(String[] args) {
		int num =371;
		int originalNum,remainder,result=0;
		
		originalNum=num;
		while(originalNum!=0) {
			remainder=originalNum%10;
			result+=Math.pow(remainder, 3);
			originalNum/=10;
		}
		
		if(result==num) 
			System.out.println(num +" is  armstrong number");
		
		else 
			System.out.println(num +" is not armstrong number");
		

	}

}
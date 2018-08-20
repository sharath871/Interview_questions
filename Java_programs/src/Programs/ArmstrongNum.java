package Programs;

public class ArmstrongNum {

	public static void main(String[] args) {
		int num =371;
		int originalNum,remainder,result = 0;
		
		originalNum =num;
		while(num!=0) {
			remainder=num%10;
			result+= Math.pow(remainder, 3);
			num=num/10;
		}
		if(result==originalNum) 
			System.out.println(originalNum+" is armstrong");
		
		else 
			System.out.println(originalNum+" is not  armstrong");
		

	}

}

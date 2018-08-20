package Programs;

public class RevrseString {

	public static void main(String[] args) {
	  String name="How are you";
	  char[] ch = name.toCharArray();
	  for(int i=0;i<=ch.length/2;i++) {
		  
		  char temp=ch[i];
		  ch[i]=ch[(ch.length-1)-i];
		  ch[(ch.length-1)-i]=temp;
	  }
	  System.out.print(ch);

	}

}

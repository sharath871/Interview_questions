package Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		String str = "sharath kumar";
		char[] charArray = str.toCharArray();

		for (int i = 0; i <= (charArray.length) / 2; i++) {		
			
			char temp=charArray[i];
			charArray[i]=charArray[(charArray.length-1)-i];			
		charArray[(charArray.length-1)-i]=temp;

		}

		System.out.println(charArray);
	}

}

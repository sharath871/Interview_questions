package Practice;
import java.util.Arrays;
public class RemoveDuplicates {

	public static void main(String[] args) {
		  int [] a={1,2,5,6,8,2,6,};
	        System.out.println(a.length);
	        System.out.print(Arrays.toString(a));
        
	    }
	    public static int a(int[] a){
	        int index=1;
	        for (int i =1;i<a.length;i++) {
	            if (a[i] != a[index-1])
	                a[index++] = a[i];
	            System.out.print(Arrays.toString(a));
	        }
	        return index;
	    }
	}
	



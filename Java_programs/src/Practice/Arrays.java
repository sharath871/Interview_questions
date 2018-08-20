package Practice;

public class Arrays {

	public static void main(String[] args) {
//		int [] array= {4,5,6,2,1,3,5,6,8,4,8,1};
//	for(int i=0;i<array.length;i++) {
//		for(int j=i+1;j<array.length;j++) {
//			
//			if(array[i]==array[j]){
//				System.out.print(array[i]);
//			}
//		}
//	}
		
		
//		String[] array= {"a","l","g","t","f","g","a","t"};
//		for(int i=0;i<array.length;i++) {
//			for(int j=i+1;j<array.length;j++) {
//				if(array[i].equals(array[j])&&(i!=j)) {
//					
//					System.out.print(array[j]);
//				}
//			}
//		}
		
//	     int [] array= {5,6,5,8,6,7,2};
//	     int sum=0;
//	    for( int a:array) 
//	    	  sum=sum+a;
//	     
//	     System.out.println(sum);
		
		
		
//		
//		int array[] = {6,2,4,5,6,8,4,9,7,4,1,2,3};
//		int sum=0;
//		for(int a:array)
//          
//		 sum=sum+a;
//		int avg=sum/array.length;
//		System.out.println(avg);
//		System.out.println(sum);
	
		
//		int [] array= {2,3,4,5,66,4,5,8,87,9,6,4};
//		int removeIndex=4;
//		for(int i=removeIndex;i<array.length-1;i++) {
//			array[i]=array[i+1];
//		System.out.println(java.util.Arrays.toString(array));
		
//	}
		
		
//		int [] array= {5,4,6,8,4,2,3,5,4,};
//		
//		System.out.print(java.util.Arrays.toString(array));
//		java.util.Arrays.sort(array);
//
//		System.out.print(java.util.Arrays.toString(array));
		
		int [] array= {5,1,2,3,6,4,7,8,9};
		
		int num=20;
		int index=4;
		
		for(int i=array.length-1;i>index;i--) {
			array[i]=array[i-1];
			
		}
		array[index]=num;
		System.out.print(java.util.Arrays.toString(array));

	}

}

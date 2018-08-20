package Programs;

public class DuplicateArrays {

	public static void main(String[] args) {
		int[] array = {2,5,6,4,7,7,8,9,5,4,7};
		
		
		for(int i=0;i<=array.length-1;i++) {
			int count=1;
			for(int j=i+1;j<=array.length-1;j++) {
				if(array[i]==array[j]) {
					
				
				count++;
				}
			}
			System.out.println(" duplicate elements are "+array[i]+" no.of elements are"+count);
		}

	}

}

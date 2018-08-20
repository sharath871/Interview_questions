package Practice;

public class SumOfMatrix {
	 public static void main(String[] args) {
	        int rows = 2,columns = 3;
	        int[][]firstatrix = {{1,2,3},{4,5,6}};
	        int[][]secondmatrix = {{7,8,9},{1,2,3}};
	        int[][] sum = new int[rows][columns];
	        for(int i=0;i<rows;i++){
	            for(int j=0;j<columns;j++){
	                sum[i][j]=firstatrix[i][j]+secondmatrix[i][j];

	            }
	        }
	        System.out.println("Sum of two matrices is: ");
	        for(int[] row : sum) {
	            for (int column : row) {
	                System.out.print(column + "    ");
	            }
	            System.out.println();
	           
	        }
	 }
}

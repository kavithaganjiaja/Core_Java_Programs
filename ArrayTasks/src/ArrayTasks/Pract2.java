package ArrayTasks;

public class Pract2 {

	public static void main(String[] args) {
		// multi-dimensional arrays
		int[][] arr= {{2,3,4},{7,6,8,9}};//2 rows; 1row- 2 3 4
										//			2row-7 6 8 9
		System.out.println(arr[1][3]);//print 2nd row 4th col element:o/p-9
		System.out.println("Row size: "+arr.length);	// row size
		System.out.println("Col size of 1st row is "+arr[0].length);
		System.out.println("Col size of 2nd row is "+arr[1].length);
		//display elements
		
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.println("arr["+row+"]["+col+"] = "+arr[row][col]);
			}
		}
		//for-each
		for(int[] row:arr) {
			for(int n:row) {
				System.out.println(n);
			}
		}

	}

}

package ArrayTasks;

public class ClassTask6 {

	public static void main(String[] args) {
		int[][] arr= {{2,3,4},{7,6,8},{2,4,3}};
		
for(int row=0;row<arr.length;row++) {
	for(int col=0;col<arr[row].length;col++)
	{
		System.out.print(arr[row][col]+" ");
	}
	System.out.println();
}
	}

}

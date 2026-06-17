package ArrayTasks;

public class OddPositionElements22 {

	public static void main(String[] args) {
		int[] arr= {11,22,33,44,55,66};
		
		System.out.println("Original Array: ");
		for(int j=0;j<arr.length;j++) {
		System.out.print(arr[j]+" ");
		}
		System.out.println("\nEven Position Elements:");
		for(int i=0;i<arr.length;i++) {
			
			if(i%2!=0) {
				
				System.out.print(arr[i]+" ");
			}
		}
	}

}

package ArrayTasks;



public class RemoveDuplicates10 {
	public static void sort(int[] ar)
	{
		int n=ar.length;
		for(int i=0;i<n-1;i++)
		{
			boolean isSwap=false;
			for(int j=0;j<n-i-1;j++) {
			if(ar[j]>ar[j+1])
			{
				int temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
				isSwap=true;
			}
			}
			if(!isSwap)
			{
			break;
			}
			
			
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr= {3,7,5,9,2,5,3,7};
			sort(arr);
			int j = 0; 
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] != arr[i + 1]) {
	                arr[j++] = arr[i];
	            }
	        }
	        arr[j++] = arr[arr.length - 1];
	        System.out.print("Array without duplicates: ");
	        for (int i = 0; i < j; i++) {
	            System.out.print(arr[i] + " ");
	        }
	       
		}
}
/*	public static void main(String[] args) {
		
	        int[] arr = {4, 2, 2, 1, 4, 3, 5};
	        
	        // 1. Sort the array first
	        Arrays.sort(arr); // Array becomes: [1, 2, 2, 3, 4, 4, 5]

	        // 2. Move unique elements to the front
	        int j = 0; 
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] != arr[i + 1]) {
	                arr[j++] = arr[i];
	            }
	        }
	        arr[j++] = arr[arr.length - 1]; // Add the last element

	        // 3. Print the unique portion of the array
	        System.out.print("Array without duplicates: ");
	        for (int i = 0; i < j; i++) {
	            System.out.print(arr[i] + " ");
	        }*/
	



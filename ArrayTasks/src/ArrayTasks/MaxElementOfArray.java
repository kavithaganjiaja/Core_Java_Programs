package ArrayTasks;

public class MaxElementOfArray {
	
	static public void max(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("max value:"+max);
	}

	public static void main(String[] args) {
		int ar[]= {10,20,30,40,60};
		max(ar);
		

	}

}

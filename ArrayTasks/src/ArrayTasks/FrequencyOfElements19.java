package ArrayTasks;

public class FrequencyOfElements19 {
	public static void main(String[] args) {
		int[] arr= {1,2,7,6,3,2,5,7};
		int n=arr.length;
		boolean[] visited=new boolean[arr.length];
		System.out.println("Frequency of elements:");
        for (int i = 0; i < n; i++) {
            // Skip this element if it has already been counted
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " : " + count);
            }
		
	}

}

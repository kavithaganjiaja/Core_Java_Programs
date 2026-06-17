package ArrayTasks;

public class InterviewTask2 {

	public static void main(String[] args) {
		int[] arr= {0,1,0,1,0,0};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] == 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				}
			}
			System.out.print(arr[i]+" ");
	}

	}
}
package ArrayTasks;

public class DuplicateValuesOfArray7 {
	static public void findDuplicates(int ar[]) {
		System.out.println("Duplicate elements:");
		for (int i = 0; i < ar.length; i++) {

			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.println(ar[j] + " ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 23, 66, 10, 23, 1, 5, 9, 66 };
		findDuplicates(arr);
	}

}

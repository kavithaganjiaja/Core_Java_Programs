package ArrayTasks;

public class DuplicateStringValuesOfArray8 {
	static public void findDuplicates(String ar[]) {
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
		String arr[] = { "java", ".Net", "Python","java","DevOps",".Net"};
		findDuplicates(arr);
	}

}

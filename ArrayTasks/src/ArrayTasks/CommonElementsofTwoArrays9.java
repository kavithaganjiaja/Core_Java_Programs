package ArrayTasks;

public class CommonElementsofTwoArrays9 {
	public static void commonElements(String ar1[],String ar2[]) {
		for(int i=0;i<ar1.length;i++) {
			for(int j=0;j<ar2.length;j++) {
				if(ar1[i].equals(ar2[j])) {
					System.out.println(ar1[i]+" ");
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		String arr1[]= {"apple","banana","guava","grapes","papaya"};
		String arr2[]= {"jackfruit","banana","guava","watermelon","kiwi"};
		commonElements(arr1,arr2);
		
	}

}

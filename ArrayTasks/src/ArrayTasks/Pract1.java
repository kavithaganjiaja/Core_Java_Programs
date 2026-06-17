package ArrayTasks;

public class Pract1 {

	public static void main(String[] args) {
		// display array elements using foreach
		int[] arr= {20,22,18,35,48,26,87,70,-20};
		for(int ar:arr) {
			System.out.print(ar+" ");
		}
			float avg,sum=0;
			int length=arr.length;
			for(int a1:arr) {
				sum+=a1;
				}
			avg=sum/length;
			System.out.println("\naverage:"+avg);
			//lowest number
			int lowestNum=arr[0];
			for(int ln:arr) {
				if(lowestNum>ln)
					lowestNum=ln;
			}
			System.out.println("lowest Number: "+lowestNum);
			//Skip negative numbers
			for(int nn:arr) {
				if(nn<0) {
					continue;
				}
				if(nn==0) {
					break;
				}
				System.out.print(nn+" ");
			}
			//Max and Min of array
			int max=arr[0],min=arr[0];
			for(int n:arr) {
				if(n>max) {
					max=n;
				}
				if(n<min) {
					min=n;
				}
			}
		System.out.println("\nmaximum number is "+max);
		System.out.println("minimum number is "+min);
	}

}

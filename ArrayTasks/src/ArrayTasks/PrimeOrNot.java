package ArrayTasks;

public class PrimeOrNot {
	static void primeNumber(int n)
	{
			boolean isPrime = true;
			for (int i = 2; i < n/2; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime)

				System.out.println(+n + " is a Prime number ");
			else
				System.out.println(+n + " is not a Prime number ");

		}
	

	public static void main(String[] args) {
		int ar[]= {8,2,3,5,6};
		for(int i=0;i<ar.length;i++)
		{
			primeNumber(ar[i]);
		}

	}

}

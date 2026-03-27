package fundamentals;

public class DepositeAmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long DepAmt=500000l;
		int tenture=60;
		float rateOfInterest=0.068f;
		double FinalInterstAmt=(DepAmt*rateOfInterest*tenture)/100;
		System.out.println("Total interest on Deposit is "+FinalInterstAmt);
		double MaturityAmt=DepAmt+FinalInterstAmt;
		System.out.println("Maturity Amount is "+MaturityAmt);
		
		
	}

}

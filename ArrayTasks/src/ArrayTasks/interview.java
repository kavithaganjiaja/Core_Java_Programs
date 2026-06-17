package ArrayTasks;

public class interview {

	public static void main(String[] args) {
		int n=5,count=0;
	       
	       for(int i=2;i<=n;i++){
	           if(n%i==0){
	               count++;
	           }
	       }
	       		if(count==2)
	       		{
	       			System.out.println("the given is prime");
	               }
	               else
	               {
	            	   System.out.println("the given number is not prime");
	               }
	       
	     	
	}

}

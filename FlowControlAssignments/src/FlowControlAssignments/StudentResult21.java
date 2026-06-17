package FlowControlAssignments;

import java.util.Scanner;

public class StudentResult21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String studentName=sc.nextLine();
		System.out.println("Enter obtained marks in Telugu");
		int teluguMarks=sc.nextInt();
		System.out.println("Enter obtained marks in English");
		int englishMarks=sc.nextInt();
		System.out.println("Enter obtained marks in Hindi");
		int hindiMarks=sc.nextInt();
		System.out.println("Enter obtained marks in Math");
		int mathMarks=sc.nextInt();
		System.out.println("Enter obtained marks in Science");
		int scienceMarks=sc.nextInt();
		System.out.println("Enter obtained marks in Social");
		int socialMarks=sc.nextInt();
		int totalMarks=teluguMarks+englishMarks+hindiMarks+scienceMarks+socialMarks;
		float percentage=totalMarks*100/600;
		System.out.println("Student Name:"+studentName+"\n");
		System.out.println("Marks secured in Telugu:"+teluguMarks);
		System.out.println("Marks secured in English:"+englishMarks);
		System.out.println("Marks secured in Hindi:"+hindiMarks);
		System.out.println("Marks secured in Math:"+mathMarks);
		System.out.println("Marks secured in Science:"+scienceMarks);
		System.out.println("Marks secured in Social:"+socialMarks);
		System.out.println("---------------------------------------");
		System.out.println("Total marks:\t"+totalMarks);
		System.out.println("---------------------------------------");
		System.out.println("Percentage:"+percentage+"%");
		if(percentage>=90)
		System.out.println("Grade: A");
		else if(percentage>=80)
		System.out.println("Grade: B");
		else if(percentage>=70)
			System.out.println("Grade: C");
		else if(percentage>=60)
			System.out.println("Grade: D");
		else if(percentage>=40)
			System.out.println("Grade: E");
		else if(percentage<40)
			System.out.println("Grade: Fail");
			
		sc.close();		
		

	}

}

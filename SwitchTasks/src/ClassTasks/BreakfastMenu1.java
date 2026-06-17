package ClassTasks;

import java.util.Scanner;

public class BreakfastMenu1 {

	public void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Breakfast Menu:");
		System.out.println("----------------");
		System.out.println("Idly");
		System.out.println("Dosa");
		System.out.println("Vada");
		System.out.println("Bonda");
		System.out.println("Poori");
		System.out.println("nothing");
		System.out.println("----------------");

		int price=0;
		System.out.println("What would you like to order?");
		String choice=sc.nextLine();
		switch(choice) {
		case "Idly":
			price=50;
			System.out.println("The Idly cost is: Rs."+price);
			break;
		case "Dosa":
			price=70;
			System.out.println("The Dosa cost is: Rs."+price);
			break;
		case "Vada":
			price=60;
			System.out.println("The Vada cost is: Rs."+price);
			break;
		case "Bonda":
			price=40;
			System.out.println("The Bonda cost is: Rs."+price);
			break;
		case "Poori":
			price=60;
			System.out.println("The Poori cost is: Rs."+price);
			break;
		case "nothing":
			System.exit(0);
			break;
		default:
			System.out.println("order please:");
		}
		sc.close();
	}

}

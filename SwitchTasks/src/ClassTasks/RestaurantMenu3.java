package ClassTasks;

import java.util.Scanner;

public class RestaurantMenu3 {
	int totalBillAmount;

	void displayBill() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("	******Here is the Bill******");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		MainCourse m = new MainCourse();
		System.out.println(m.mItems + "   -	" + m.mprice);
		Desserts de = new Desserts();
		System.out.println(de.dItems + "   -			" + de.dprice);
		Drinks ds = new Drinks();
		System.out.println(ds.drItems + "   -			" + ds.drprice);
		totalBillAmount = m.mprice + de.dprice + ds.drprice;
		System.out.println("===========================================");
		System.out.println("Total Amount:		" + totalBillAmount);
		System.out.println("===========================================");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("*****************************");
			System.out.println("Menu:");
			System.out.println("*****************************");
			System.out.println("1.Main Course");
			System.out.println("2.Desserts");
			System.out.println("3.Drinks");
			System.out.println("4.Bill");
			System.out.println("5.exit");
			System.out.println("*****************************");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				MainCourse mc = new MainCourse();
				mc.mainCourse();
				break;
			case 2:
				Desserts dst = new Desserts();
				dst.dessertItems();
				break;
			case 3:
				Drinks drk = new Drinks();
				drk.drinkItems();
				break;
			case 4:
				RestaurantMenu3 r = new RestaurantMenu3();
				r.displayBill();
				break;
			case 5:
				System.out.println("Thank you for visiting our restaurant!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice! choose between 1 to 5");

			}

		} while (choice != 5);
		sc.close();
	}

}

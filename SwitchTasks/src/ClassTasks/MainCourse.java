package ClassTasks;

import java.util.Scanner;

public class MainCourse {
	 String mItems;
	 int mprice;
	Scanner sc = new Scanner(System.in);
	int choice;

	 void mainItems(int ch) {
		if (ch == 1) {
			mItems = "Veg Biryani";
			mprice = 300;
			System.out.println("Veg.Biryani Added to your order");
		} else if (ch == 2) {
			mItems = "Chicken Biryani";
			mprice = 400;
			System.out.println("chicken Biryani Added to your order");
		}

	}

	public void mainCourse() {
		
		do {
			System.out.println("-------------------------------");
			System.out.println("Main Course:");
			System.out.println("-------------------------------");
			System.out.println("1.Veg Biryani			- Rs. 300/-");
			System.out.println("2.Chicken Biryani		- Rs. 400/-");
			System.out.println("3.Back to Menu");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				mainItems(1);
				break;
			case 2:
				mainItems(2);
				break;

			case 3:
				RestaurantMenu3.main(null);
				break;
			default:
				System.out.println("Invalid Choice! choose between 1 to 3");

			}

		} while (choice != 3);

	}

}

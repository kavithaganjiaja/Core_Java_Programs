package ClassTasks;

import java.util.Scanner;

public class Desserts {
	 String dItems;
	 int dprice;

	void mainItems(int ch) {
		if (ch == 1) {
			dItems = "Butterscotch";
			dprice = 100;
			System.out.println("Butterscotch Added to your order");
		} else if (ch == 2) {
			dItems = "Venilla";
			dprice = 300;
			System.out.println("Venilla Added to your order");
		}
	}

	public void dessertItems() {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("-----------------------------------");
			System.out.println("Desserts:");
			System.out.println("-----------------------------------");
			System.out.println("1.Butterscotch 			- Rs. 100/-");
			System.out.println("2.Vanilla			- Rs. 50/-");
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
sc.close();
	}

}

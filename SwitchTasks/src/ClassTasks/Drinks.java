package ClassTasks;

import java.util.Scanner;

public class Drinks {
	 String drItems;
	 int drprice;

	 void mainItems(int ch) {
		if (ch == 1) {
			drItems = "Sprite";
			drprice = 80;
			System.out.println("Sprite Added to your order");
		} else if (ch == 2) {
			drItems = "ThumbsUp";
			drprice = 100;
			System.out.println("ThumbsUp Added to your order");
		} else if (ch == 3) {
			drItems = "Tea";
			drprice = 20;
			System.out.println("Tea Added to your order");

		} else if (ch == 4) {
			drItems = "Coffee";
			drprice = 50;
			System.out.println("Coffee Added to your order");

		}
	}

	public void drinkItems() {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("---------------------------------");
			System.out.println("Drinks:");
			System.out.println("---------------------------------");
			System.out.println("SoftDrinks:");
			System.out.println("	1.Sprite		-	Rs. 80/-");
			System.out.println("	2.ThumbsUp	-	Rs. 100/-");
			System.out.println("HotDrinks:");
			System.out.println("	3.Tea		-	Rs. 20/-");
			System.out.println("	4.Coffee		-	Rs. 50/-");
			System.out.println("5.Back to Menu");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				mainItems(1);
				break;
			case 2:
				mainItems(2);
				break;
			case 3:
				mainItems(3);
				break;
			case 4:
				mainItems(4);
				break;

			case 5:
				RestaurantMenu3.main(null);
				break;
			default:
				System.out.println("Invalid Choice! choose between 1 to 5");

			}

		} while (choice != 3);
sc.close();
	}

}

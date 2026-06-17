package fundamentals;

public class Task12MovieTickets {
	static int totalTicketSold=0;
	static void booked(int count) {
		totalTicketSold=totalTicketSold+count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		booked(10);
		booked(2);
		booked(5);
		System.out.println("No.of tickets booked:"+totalTicketSold);
	}

}

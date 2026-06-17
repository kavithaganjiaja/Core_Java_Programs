package fundamentals;

public class Task9LibraryMember {
	int memberID = 111;
	String memberName = "kavitha";
	int booksBorrowed;

	void borrowBooks(int count) {
		booksBorrowed = count;
		System.out.println(memberID);
		System.out.println(memberName);

		System.out.println(booksBorrowed);
		System.out.println("-------------");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task9LibraryMember lm = new Task9LibraryMember();
		lm.borrowBooks(10);

	}

}

package fundamentals;

public class Task8BookInventory {
	String bookTitle;
	String author;
	static int bookCount;
	void printBookInfo(String title,String authr)
	{
		int bookSerialNumber=124536;
		bookTitle=title;
		author=authr;
		bookCount++;
		System.out.println("Book SNo:"+bookSerialNumber);
		System.out.println("Book Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("_________________");
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task8BookInventory bi=new Task8BookInventory();
		bi.printBookInfo("xyzxxzyy","abcfdrgj");
		
		bi.printBookInfo("yyyyyyyy","abbbbbbj");
		System.out.println("No.of Bookd:"+bookCount);
				
	
	}

}

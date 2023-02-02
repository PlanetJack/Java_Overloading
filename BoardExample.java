package Overloading;

public class BoardExample {

	public static void main(String[] args) {

		Board Board1 = new Board("crypto", "coin");
		System.out.println(Board1.title);
		System.out.println(Board1.content);
		System.out.println();
		
		
		Board Board2 = new Board("crypto", "coin", "Barry");
		System.out.println(Board2.title);
		System.out.println(Board2.content);
		System.out.println(Board2.writer);
		System.out.println();
		
		
		Board Board3 = new Board("crypto", "coin", "Barry", "2023-01-23");
		System.out.println(Board3.title);
		System.out.println(Board3.content);
		System.out.println(Board3.writer);
		System.out.println(Board3.date);
		System.out.println();
		
		
		Board Board4 = new Board("crypto", "coin", "Barry", "2023-01-23", 23000);
		System.out.println(Board3.title);
		System.out.println(Board3.content);
		System.out.println(Board3.writer);
		System.out.println(Board3.date);
		System.out.println(Board3.hitcount);
		System.out.println();
		
		
		
	}

}

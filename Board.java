package Overloading;

public class Board {

	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		/*This를 쓰는 방법
		 * this(title, content, "Login Id", "Current date", 23000);
		 */
	}
	Board(String title, String content, String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		/*This를 쓰는 방법
		 * this(title, content, writer, "Current date", 23000);
		 */
	}
	Board(String title, String content, String writer, String date){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		/*This를 쓰는 방법
		 * this(title, content, writer, date, 23000);
		 */
	}
	Board(String title, String content, String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		/*This를 쓰는 방법
		 * this.title = title;
		 * this.content = content;
		 * this.writer = writer;
		 * this.date = date;
		 * this.hitcount = hitcount;
		 */
	}
}

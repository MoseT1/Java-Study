package prob02;

public class Book {
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	private int bookNo;
	private String title;
	private String author;
	private boolean stateCode = false;
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void rent() {
		this.stateCode = true;
		System.out.println(this.title +"이 대여 됐습니다.");
		
	}
	public void print() {
		System.out.println("책 제목:" + title + ", 작가" + author + ", 대여 유무:" + (stateCode ? "대여중" : "재고있음"));
		
	}
	
	
}

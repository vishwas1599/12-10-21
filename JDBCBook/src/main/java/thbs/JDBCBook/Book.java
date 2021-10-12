package thbs.JDBCBook;

public class Book {
	private int bookId;
	private String book_name;
	private int book_price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return book_name;
	}
	public void setBookName(String bookName) {
		this.book_name = bookName;
	}
	public int getBookPrice() {
		return book_price;
	}
	public void setBookPrice(int bookPrice) {
		this.book_price = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + book_name + ", bookPrice=" + book_price + "]";
	}
	

}

package basicclass;

public class Book extends Object {
	int bookNum;
	String bookTitle;

	Book(int bookNum, String bookTitle) {
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
	}

	// 매서드 재정의
	@Override
	public String toString() {
		return bookNum + "," + bookTitle;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}

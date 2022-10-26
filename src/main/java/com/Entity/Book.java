package com.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="book")
public class Book{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="BOOK_ID")
	private Long bookId;
	
	@Column(name ="BOOK_NAME")
	private String bookName;
	
	@Column(name ="BOOK_DESCRIPTION")
	private String bookDescription;
	
	@Column(name ="BOOK_DEPARTMENT")
	private String bookDepartment;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public String getBookDepartment() {
		return bookDepartment;
	}

	public void setBookDepartment(String bookDepartment) {
		this.bookDepartment = bookDepartment;
	}

	public Book(Long bookId, String bookName, String bookDescription, String bookDepartment) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookDescription = bookDescription;
		this.bookDepartment = bookDepartment;
	}

	

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
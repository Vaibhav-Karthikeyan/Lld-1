package com.bookreader.beans;

public class Book {

	private int bookId;
	private String title;
	private String details;
	private int noOfPages = 0;
	
	public Book(int bookId, String title, String details, int noOfPages) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.details = details;
		this.noOfPages = noOfPages;
	}
	
	public Book() {}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
}

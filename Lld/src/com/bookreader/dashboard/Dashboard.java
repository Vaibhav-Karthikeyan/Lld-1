package com.bookreader.dashboard;

import com.bookreader.beans.Book;
import com.bookreader.beans.User;

public class Dashboard {

	private Book book;
	private User user;
	private int pageNumber = 0;
	
	public Dashboard() {
		
	}
	
	public Dashboard(Book book, User user) {
		super();
		this.book = book;
		this.user = user;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void displayUserInfo() {
		System.out.println("Active user is :"+user.getName());
	}
	
	
	public void displayBookInfo() {
		System.out.println("Current book read by the user is :"+book.getTitle());
		System.out.println(book.getDetails());
		System.out.println("Page Number :"+pageNumber);
	}
	
	
	public void nextPage() {
		if(pageNumber == book.getNoOfPages()) {
			//throw exception
		}else {
			pageNumber++;
		}
		System.out.println("forwarding to next page : "+pageNumber);
	}
	
	public void previousPage() {
		if(pageNumber == 1) {
			//throw exception
		}else {
			pageNumber--;
		}
		System.out.println("coming to previous page :"+pageNumber);
	}
	
}

package com.bookreader.system;

import com.bookreader.beans.Book;
import com.bookreader.beans.User;
import com.bookreader.dashboard.Dashboard;
import com.bookreader.utils.Library;
import com.bookreader.utils.UserManager;

public class OnlineReader {

	private Book book;
	private User user;
	private Dashboard dashboard;
	private Library library;
	private UserManager userManager;
	public OnlineReader() {
		userManager = new UserManager();
		library = new Library();
		dashboard = new Dashboard();
	}
	public Book getBook() {
		return book;
	}

	public Dashboard getDashboard() {
		return dashboard;
	}
	public void setDashboard(Dashboard dashboard) {
		this.dashboard = dashboard;
	}
	public void setBook(Book book) {
		this.book = book;
		dashboard.setBook(book);
		dashboard.displayBookInfo();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
		dashboard.setUser(user);
		dashboard.displayUserInfo();
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	
}

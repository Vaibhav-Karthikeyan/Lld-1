package com.bookreader.main;

import com.bookreader.beans.Book;
import com.bookreader.beans.User;
import com.bookreader.system.OnlineReader;

public class MainClass {

	public static void main(String[] args) {
		OnlineReader reader = new OnlineReader();
		
		User user1 = new User(1, "Vaibhav");
		User user2 = new User(2, "Shyam");
		
		Book javaBook = new Book(1001, "Java", "Details of Java Book", 400);
		Book dsaBook = new Book(1002, "DSA", "Details of DSA Book", 800);
		
		reader.getLibrary().addBook(javaBook);
		reader.getLibrary().addBook(dsaBook);
		
		reader.getUserManager().addUser(user1);
		reader.getUserManager().addUser(user2);
		
		reader.setBook(javaBook);
		reader.setUser(user1);
		
		reader.getDashboard().nextPage();
		reader.getDashboard().nextPage();
		reader.getDashboard().nextPage();
		reader.getDashboard().displayBookInfo();
	}

}

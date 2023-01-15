package com.bookreader.utils;

import java.util.HashMap;

import com.bookreader.beans.Book;

public class Library {

	private HashMap<Integer, Book> books;
	
	public Library() {
		books = new HashMap<>();
	}
	
	public boolean addBook(Book book) {
		if(books.containsKey(book.getBookId())) {
			//Exception
			return false;
		}
		books.put(book.getBookId(), book);
		return true;
	}
	
	public boolean addBook(int bookId, String title, String details, int noOfPages) {
		if(books.containsKey(bookId)) {
			//Exception
			return false;
		}
		Book book = new Book(bookId, title, details, noOfPages);
		books.put(bookId, book);
		return true;
	}
	
	public Book findBook(int bookId) {
		if(!books.containsKey(bookId)) {
			//Exception
			return null;
		}
		return books.get(bookId);
	}
	
	public boolean removeBook(int bookId) {
		if(!books.containsKey(bookId)) {
			//Exception
			return false;
		}
		books.remove(bookId);
		return true;
	}
	
}

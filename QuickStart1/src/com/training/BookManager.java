package com.training;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

	public List<Book> getAllBook(){
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book(2947,"An Era of Darkness"));
		
		return bookList;
	}
}

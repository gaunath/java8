package com.gaurab.java.functionalinterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.gaurab.java.dao.BookDAO;
import com.gaurab.java.dto.Book;

class NameSortComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o2.getName().compareTo(o1.getName());
	}

}

public class BookService {

	public List<Book> sortBookByname() {
		List<Book> booksort = new BookDAO().getBooks();
		Collections.sort(booksort, new NameSortComparator());
		return booksort;
	}
	
	public List<Book> sortBookBynameLamda() {
		List<Book> booksort = new BookDAO().getBooks();
		Collections.sort(booksort, (o1,o2)-> o1.getName().compareTo(o2.getName()));
		return booksort;
	}
	
	

	public static void main(String[] args) {

		System.out.println("sorted Traditional "+ new BookService().sortBookByname());
		
		System.out.println("sorted lamda expression "+ new BookService().sortBookBynameLamda());
	}

}

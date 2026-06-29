package com.mmcoe.dao;
import com.mmcoe.pojo.Book;
import com.mmcoe.service.BookNotFoundException;

import  java.util.List;

public interface BookDao {
		boolean save(Book b);
		
		Book find(int isbn) throws BookNotFoundException;
		
		List<Book> list();
		
		boolean delete(int isbn);
		
		List<Book> findByPrice(double min,double max);
}

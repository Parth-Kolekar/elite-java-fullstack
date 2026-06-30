package com.mmcoe.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import com.mmcoe.dao.BookDao;
import com.mmcoe.pojo.Book;

public class BookServiceImpl implements BookService {
	private BookDao dao;
	
	public BookServiceImpl(BookDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean save(Book b) {
		// TODO Auto-generated method stub
		return dao.save(b);
	}

	@Override
	public Book find(int isbn) throws BookNotFoundException {
		// TODO Auto-generated method stub
		Book b=dao.find(isbn);
		if(b==null)
			throw new BookNotFoundException("Book not found with ISBM: "+isbn);
		return b;
	}

	@Override
	public List<Book> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

	@Override
	public boolean delete(int isbn) throws BookNotFoundException {
		// TODO Auto-generated method stub
		boolean b=dao.delete(isbn);
		if(b==false)
			throw new BookNotFoundException("Book not found with ISBN: "+isbn);
		return true;
	}

	@Override
	public List<Book> findByPrice(double min, double max) {
		// TODO Auto-generated method stub
		return dao.findByPrice(min, max);
	}

	@Override
	public List<Book> ListOrderByTitle() {
		// TODO Auto-generated method stub
		Comparator<Book> name = (p1,p2) -> p1.getTitle().compareTo(p2.getTitle());
//		TreeSet<Book> tr = new TreeSet<Book>(name);
		List<Book> list = dao.list();
		list.sort(name);
		
//		tr.addAll(this);
		
		return list;
	}
}

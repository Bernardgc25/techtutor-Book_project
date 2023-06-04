package com.java.dao;
import com.java.pojo.Book;
import java.util.*;

public class BookDAO {
	private List<Book> bdao;
	private Scanner scobj;
	public BookDAO()
	{
		scobj=new Scanner(System.in);
		bdao=new ArrayList<Book>();
	}
	public void insertBook(Book b)
	{
		bdao.add(b);
		
		
	}
	public List<Book> getBookDetails()
	{
	
		return bdao;
	}
	public void updateBook(int bid) {
		for(Book b:bdao)
		{
			if(b.getBookid()==bid)
			{
				System.out.println("Enter new book quantity");
				b.setQuantity(scobj.nextInt());
			}
		}
	}

}

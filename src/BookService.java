package com.java.service;
import java.util.*;

import com.java.dao.BookDAO;
import com.java.pojo.*;

public class BookService {
	private Scanner sc;
	private BookDAO bdao;
	public BookService()
	{
		sc=new Scanner(System.in);
		bdao=new BookDAO();
		
		
	}
	public void insert()
	{
		System.out.println("Enter how many books you want to insert");
		int noofbooks=sc.nextInt();
		for(int x=1;x<=noofbooks;x++)
		{
			Book b=new Book();
			System.out.println("Enter book id");
			b.setBookid(sc.nextInt());
			System.out.println("Enter book name ");
			b.setBookname(sc.next());
			System.out.println("Enter book Price ");
			b.setPrice(sc.nextDouble());
			System.out.println("Enter quantity");
			b.setQuantity(sc.nextInt());
			bdao.insertBook(b);
			
		}
				
	}
	public void delete()
	{
		
	}
	public void update()
	{
		System.out.println("Enter book id which u want to update");
		bdao.updateBook(sc.nextInt());
		
	}
	public void viewDetails()
	{
		
	List<Book> blist=	bdao.getBookDetails();
	for(Book b1:blist)
	{
		System.out.println("Book name is "+b1.getBookname());
		System.out.println("Price is "+b1.getPrice());
		System.out.println("Quantity is "+b1.getQuantity());
	}
	}

}

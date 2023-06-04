package com.java.collection;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
	List<String> liststr=new ArrayList<String>();	
	liststr.add("Welcome");
	liststr.add("java");
	liststr.add("Demo");
	liststr.add("program");
	for(String s:liststr)
	{
		System.out.println("String is "+s);
		
	}
	liststr.remove(1);
	System.out.println("After removing element");
	for(String s1:liststr)
	{
		System.out.println("String is "+s1);
	}
	List<String> liststr2=new ArrayList<String>();
	liststr2.add("Spring");
	liststr2.add("Hibernate");
	liststr.addAll(liststr2);
	System.out.println("List after concatenation");
	for(String s1:liststr)
	{
		System.out.println("Collection after concetation "+s1);
	}
	
	}

}

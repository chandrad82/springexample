package com.mkyong.common;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		if(name !=null)
		System.out.println("Hello ! " + name);
	else
		System.out.println("Hello Dear!!!");
	}
}

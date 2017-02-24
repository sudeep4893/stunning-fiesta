package com.practice;

class Parent{
	public static void display(){
		System.out.println("Static method display");
	}
	
	public void print(){
		System.out.println("non static method print");
	}
}

class Child extends Parent{
	public static void display(){
		System.out.println("Static child method display");
	}
	
	public void print(){
		System.out.println("non static child method print");
	}
}

public class PracticeJava {

	public static void foo(){
		System.out.println("Test Static Method");
	}
		
	public static void main(String[] args) {
		PracticeJava.foo();
		
		Parent parent = new Child();
		parent.display();
		parent.print();
		
	}

}

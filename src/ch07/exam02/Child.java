package ch07.exam02;

public class Child extends Parent {
	//Field
	public int field2;
	//Constructor
	public Child(String firstName) {
		super("辫", firstName);
		System.out.println("Child 按眉 积己");
	}
	//Method
	public void method2() {
		System.out.println("method1() 角青");
	}
}

package ch07.exam03;

public class Parent {
	//Field
	public String lastName;
	public String firstName;
	//Constructor
	public Parent(String lastName, String firstname) {
		System.out.println("Parent ��ü ����");
		this.lastName = lastName;
		this.firstName = firstname;
				
	}
	//Method
	public void sound() {
		System.out.println("�����ض�~~~");
	}
}

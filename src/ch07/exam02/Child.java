package ch07.exam02;

public class Child extends Parent {
	//Field
	public int field2;
	//Constructor
	public Child(String firstName) {
		super("��", firstName);
		System.out.println("Child ��ü ����");
	}
	//Method
	public void method2() {
		System.out.println("method1() ����");
	}
}

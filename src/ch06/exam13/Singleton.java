package ch06.exam13;

public class Singleton { //Ŭ������ ������ �� �� ��
	/*
	 * static int method1() { return 1; }
	 * 
	 * static String method2() { return "�ڹ�"; } static int[] method3() { int[] arr =
	 * {10, 20, 30}; return arr; }
	 */
	//Field
	private static Singleton singleton = new Singleton();
	
	//Constructor
	private Singleton() {
		
	}
	
	//Method
	static Singleton getInstance() {
		return singleton;
	}
}

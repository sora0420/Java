package ch06.exam11;

public class User {
	// Field
	String id;
	String name;
	String password;
	static String nation = "�ѱ�"; //��ü�� ������ �ʾƵ� ����� �� �ִ� = static
	
	// Constructor //�����ڴ� ��ü�� �����ϱ� ���� �뵵�� �� ��ü�� �ν��Ͻ� ����� �ƴ�
	User(String name){
		this.name = name;
	}

	// Method
	static void info() { //��ü���� ����� �� �ִ� �޼ҵ�
		System.out.println("��� User�� �ѱ����Դϴ�.");
	}
	
	void login() {
		System.out.println(name + "���� �α����մϴ�.");
	}

	void logout() {
		System.out.println(name + "���� �α׾ƿ��մϴ�.");
	}
}

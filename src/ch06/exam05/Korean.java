package ch06.exam05;

public class Korean {
	//Field //������ ����ǰ��� ���, �ʵ�� ��ġ �������/ ���� �Ʒ��� ��� ����
	String nation = "�ѱ�";
	String name;
	String ssn;
	int age;
	
	Korean(){
		System.out.println("Korean() ����");
	}
	
	Korean(String name){
		this.name = name;
		System.out.println("Korean(String name) ����");
	}
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
		System.out.println("Korean(String name, String ssn) ����");
		
	}
	Korean(String name, String ssn, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		System.out.println("Korean(String name, String ssn) ����");
		
	}
}

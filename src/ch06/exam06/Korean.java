package ch06.exam06;

public class Korean {
	//Field //������ ����ǰ��� ���, �ʵ�� ��ġ �������/ ���� �Ʒ��� ��� ����
	String nation = "�ѱ�";
	String name;
	String ssn;
	int age;
	
	Korean(){
		this("�ƹ���", "00000-000000", 1); 
		//���� ������ �ִ� �����ڸ� ����
		//�� �ؿ� 4��° strig, string, int ����
	}
	
	Korean(String name){
		this(name, "00000-000000", 1);
	}
	Korean(String name, String ssn){
		this(name, ssn, 1);
		
	}
	Korean(String name, String ssn, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		
	}
	
}

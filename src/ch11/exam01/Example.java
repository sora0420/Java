package ch11.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("winter", "�ʰܿ�");
		Member m2 = new Member("winter", "�ʰܿ�");

		System.out.println(m1 == m2); //�ּ� ��
		System.out.println(m1.equals(m2)); //�ּҺ����� Member���� ����񱳷�

		
	}

}

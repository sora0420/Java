package ch06homework.exam19;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567", "���");
		
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		/* final �ʵ�� �� ���� �Ұ�
		 * p1.nation = "usa"; 
		 * p1.ssn = "654321-7654321"; 
		 * p1.name = "��������";
		 */	
	}

}

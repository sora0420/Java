package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int result1 = Singleton.method1(); String result2 = Singleton.method2();
		 * int[] result3 = Singleton.method3();
		 */
		
		//�����ڸ� �̿��ؼ� ��ü ���
		//Singleton result1 = new Singleton(); /x
		
		//>>Factory Method�̿��ؼ� ��ü ���
		//�޼ҵ�� ȣ���ؼ� return������ ��ü ���� ����
		//�ϳ��� �����ؼ� �����ؼ� �� �� singleton
		//�Ȱ��� ��ü�� return���ִ°� singleton
		Singleton result2 = Singleton.getInstance();		
		Singleton result3 = Singleton.getInstance();
		if(result2 == result3) {
			System.out.println("���� ��ü�� ����");
		}else {
			System.out.println("�ٸ� ��ü�� ����");
		}
	}

}

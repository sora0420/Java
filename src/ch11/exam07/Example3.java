package ch11.exam07;

public class Example3 {

	public static void main(String[] args) {
		/*1��
		 * Integer var1 = new Integer(500); 
		 * Integer var2 = new Integer(500);
		 */
		
		//2��
		/*
		 * Integer var1 = 500; 
		 * Integer var2 = 500;
		 */
		
		//3��
		Integer var1 = 10; //~128 ~ 127������ ������ AutoBoxing�� ��ü�� ������
		Integer var2 = 10; //���� ������ ����� �ٸ� ��ü ����
		
		System.out.println(var1 == var2); //1,2�� false ������ / ���� ������ ���� �ٸ� ��
		System.out.println(var1.equals(var2)); //true //warpper Ŭ������ �̰ž�
	}

}

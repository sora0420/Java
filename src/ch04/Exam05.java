package ch04;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ֻ����� ���� ������ �� ���(1,2,3,4,5,6)
		// int value = ?;
		double temp = Math.random();
		System.out.println(temp); // 0~1 ������ �Ǽ�
		System.out.println(temp * 6); // 0~6 ������ �Ǽ�
		System.out.println((int) (temp * 6)); // 0~5 ������ ����
		System.out.println((int) (temp * 6) + 1); // 1~6 ������ ����

		int value = (int) (temp * 6) + 1;
		if(value%2==0) {
			System.out.println("¦���� ���Ծ��.");
		}else {
			System.out.println("Ȧ���� ���Ծ��.");
				
		}
	}

}

package ch04;

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean stop = false;
		int count = 0;
		while (true) {
			count++;
			if (count % 2 == 0) {
				continue;
			}
			System.out.println(count);
			
			if (count > 10) {
				break;
			}
		}
		System.out.println("���α׷� ������ ���� ����");
	}

}

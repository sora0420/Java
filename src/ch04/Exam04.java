package ch04;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grad = 'A';

		switch (grad) {
		case 'A':
			System.out.println("Ŀ�Ǹ� �����մϴ�.");
			break;
		case 'B':
			System.out.println("���� 1���� �ݴϴ�.");
			break;
		case 'C':
			System.out.println("�λ縸 �մϴ�.");
			break;
		default:
			System.out.println("��ü��ü �մϴ�.");

		}
		// ---------------------------
		if (grad == 'A') {
			System.out.println("Ŀ�Ǹ� �����մϴ�.");
		} else if (grad == 'B') {
			System.out.println("���� 1���� �ݴϴ�.");
		} else if (grad == 'C') {
			System.out.println("�λ縸 �մϴ�.");
		} else {
			System.out.println("��ü��ü �մϴ�.");
		}
	}

}

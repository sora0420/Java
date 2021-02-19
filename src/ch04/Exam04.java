package ch04;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grad = 'A';

		switch (grad) {
		case 'A':
			System.out.println("커피를 대접합니다.");
			break;
		case 'B':
			System.out.println("사탕 1개만 줍니다.");
			break;
		case 'C':
			System.out.println("인사만 합니다.");
			break;
		default:
			System.out.println("본체만체 합니다.");

		}
		// ---------------------------
		if (grad == 'A') {
			System.out.println("커피를 대접합니다.");
		} else if (grad == 'B') {
			System.out.println("사탕 1개만 줍니다.");
		} else if (grad == 'C') {
			System.out.println("인사만 합니다.");
		} else {
			System.out.println("본체만체 합니다.");
		}
	}

}

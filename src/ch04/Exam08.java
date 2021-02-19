package ch04;

public class Exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 1;
		for (; i <= 100; i++) {
			int value = i;
			sum += value; // sum = sum +i;
		}
		System.out.println("1~" + i + " : " + sum);
	}

}

package ch04;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean stop = false;
		int count = 0;
		// -------------------------

		do {
			System.out.println("Hello");
			count++;
			if (count > 10) {
				stop = true;
			}
		} while (!stop);
		count = 0;
		System.out.println("\n");
		// -------------------------
		do {
			System.out.println("Hello");
			count++;
		} while (count <= 10);

	}

}

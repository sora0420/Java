package ch04;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean stop = false;
		int count = 0;
		// -------------------------

		while (!stop) {
			System.out.println("Hello");
			count++;
			if (count > 10) {
				stop = true;
			}
		}
		count = 0;
		System.out.println("\n");
		// -------------------------
		while (count <= 10) {
			System.out.println("Hello");
			count++;
		}

	}

}

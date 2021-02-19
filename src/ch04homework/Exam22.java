package ch04homework;

public class Exam22 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Q5
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.println("(" + x + "," + y + ")");
				} else
					continue;
			}
		}

	}
}
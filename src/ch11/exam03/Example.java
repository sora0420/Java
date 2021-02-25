package ch11.exam03;

public class Example {

	public static void method() {
		long sum = 0;
		for (int i = 0; i < 1000000; i++) {
			sum += i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		method();
		long end = System.currentTimeMillis();

		System.out.println("실행 시간 : " + (end - start) + "ms");
		
		long start1 = System.nanoTime();
		method();
		long end1 = System.nanoTime();

		System.out.println("실행 시간 : " + (end1 - start1) + "ns");

	}

}

package ch04;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주사위를 던져 나오는 수 얻기(1,2,3,4,5,6)
		// int value = ?;
		double temp = Math.random();
		System.out.println(temp); // 0~1 사이의 실수
		System.out.println(temp * 6); // 0~6 사이의 실수
		System.out.println((int) (temp * 6)); // 0~5 까지의 정수
		System.out.println((int) (temp * 6) + 1); // 1~6 까지의 정수

		int value = (int) (temp * 6) + 1;
		if(value%2==0) {
			System.out.println("짝수가 나왔어요.");
		}else {
			System.out.println("홀수가 나왔어요.");
				
		}
	}

}

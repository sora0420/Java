package ch04homework;

public class Exam20 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Q1 >> 조건문 : if문, switch문 / 반복문 : for문, while문, do-while문
		//Q2 >> 2번 / 실수는 x
		//Q3
		int sum = 0;
		for(int i =0; i<100;i+=3) {
			sum +=i;
		}
		System.out.println("3의 배수의 합 : "+sum);
	}
}
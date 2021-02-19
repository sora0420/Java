package ch04homework;

import java.util.Scanner;

public class Exam24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q7
		boolean run = true;
		int balance = 0;
		int deposit = 0, debit = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {			
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택>");
			int num1 = Integer.parseInt(scanner.nextLine());
			
			switch (num1) {
			case 1:
				System.out.print("예금액>");
				deposit = Integer.parseInt(scanner.nextLine());				
				break;
			case 2:
				System.out.print("출금액>");
				debit = Integer.parseInt(scanner.nextLine());				
				break;
			case 3:
				balance = (deposit - debit);
				System.out.print("잔고>" + balance);
				System.out.println();
				break;
			default:
				System.out.println();
				run = false;
				break;
			}
		}
		System.out.print("프로그램 종료");

	}
}
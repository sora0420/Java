package ch06homework.exam34;
//Q20
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택>");

			int selecNo = scanner.nextInt();
			if (selecNo == 1) {
				creatAccount();
			} else if (selecNo == 2) {
				accountList();
			} else if (selecNo == 3) {
				deposit();
			} else if (selecNo == 4) {
				withdraw();
			} else if (selecNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void creatAccount() {
		
	}

	private static void accountList() {

	}

	private static void deposit() {

	}

	private static void withdraw() {

	}
	
	/*
	private static Account findAccount(String ano) {
		
		return ano;
	}
	*/

}

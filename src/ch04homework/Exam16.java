package ch04homework;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");
		
	}
}
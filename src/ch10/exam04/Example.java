package ch10.exam04;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = new String[3];
		// TODO Auto-generated method stub
		while (true) {
			try {
				System.out.print("������ġ : ");
				int index = Integer.parseInt(scanner.nextLine());
				System.out.print("�����Ұ� : ");
				arr[index] = scanner.nextLine();

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("���ڸ� �����մϴ�.");
				System.out.println("���α׷��� �����մϴ�.");
			} catch (Exception e) {
				System.out.println("0~"+(arr.length-1)+"���� �����մϴ�.");
			} finally {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
	}

}

package Project01;

import java.util.Scanner;

public class source_code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] boardArray = new String[100][5];
		String[][] tempArray = new String[100][5];

		boolean flag = true;
		String title, content, writer;
		Scanner scanner = new Scanner(System.in);
		int num = 0, no = 0, view = 0, del = 0, count = 0;
		boolean confirm = false;

		while (flag) {
			title = null;
			content = null;
			writer = null;
			System.out.println();
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("1.��� | 2.����(Create) | 3.�б�(Read) | 4.����(Update) | 5.����(Delete) | 6.����");
			System.out.println("------------------------------------------------------------------------------");
			System.out.print(">���� : ");
			num = Integer.parseInt(scanner.nextLine());
			switch (num) {
			case 1:
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("\t��ȣ\t\t����\t\t����\t\t�۾���\t\t��ȸ��");
				System.out.println("------------------------------------------------------------------------------");
				if (boardArray[0][0] == null && boardArray[1][0] == null) {
					System.out.println("������ �����ϴ�.");
					break;
				}

				int back = no - 1;
				if (boardArray[back] != null) {
					for (int i = 0; i < no; i++) {
						tempArray[i] = boardArray[back];
						back--;
					}
				}

				int shownum = 0;
				for (int i = 0; i < no; i++) {
					if (boardArray[i] != null) {
						shownum = Integer.parseInt(tempArray[i][0]);
						System.out.println();
						System.out.print("\t" + (shownum + 1) + "\t\t" + tempArray[i][1] + "\t\t" + tempArray[i][2]
								+ "\t\t" + tempArray[i][3] + "\t\t" + tempArray[i][4] + "\t");
					} else {
						System.out.print("\t" + tempArray[i][0] + "\t\t" + tempArray[i][1] + "\t\t" + tempArray[i][2]
								+ "\t\t" + tempArray[i][3] + "\t\t" + tempArray[i][4] + "\t");
					}
				}
				break;
			case 2:
				if (confirm == true) {
					for (int j = 0; j < boardArray[del].length; j++) {
						boardArray[del][j] = String.valueOf(del);
						System.out.print("���� : ");
						boardArray[del][j + 1] = title = scanner.nextLine();
						System.out.print("���� : ");
						boardArray[del][j + 2] = content = scanner.nextLine();
						System.out.print("�۾��� : ");
						boardArray[del][j + 3] = writer = scanner.nextLine();
						boardArray[del][j + 4] = String.valueOf(view);
						confirm = false;
						count++;
						break;
					}
				} else {
					for (int j = 0; j < boardArray[no].length; j++) {
						boardArray[no][j] = String.valueOf(no);
						System.out.print("���� : ");
						boardArray[no][j + 1] = title = scanner.nextLine();
						System.out.print("���� : ");
						boardArray[no][j + 2] = content = scanner.nextLine();
						System.out.print("�۾��� : ");
						boardArray[no][j + 3] = writer = scanner.nextLine();
						boardArray[no][j + 4] = String.valueOf(view);
						no++;
						count++;
						break;
					}
				}
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("\t��ȣ\t\t����\t\t����\t\t�۾���\t\t��ȸ��");
				System.out.println("------------------------------------------------------------------------------");
				for (int i = 0; i < no; i++) {
					System.out.println();
					for (int j = 0; j < boardArray[no].length; j++) {
						if (boardArray[i][j] != null) {
							System.out.print("\t" + boardArray[i][j] + "\t");
						} else {
							break;
						}
					}
				}
				break;
			case 3:
				int input = 0;
				int temp = 0;
				System.out.print("��ȣ : ");
				input = Integer.parseInt(scanner.nextLine());

				for (int i = 0; i < boardArray.length; i++) {
					if (Integer.parseInt(boardArray[i][0]) == input) {
						System.out.println("���� : " + boardArray[i][1]);
						System.out.println("���� : " + boardArray[i][2]);
						System.out.println("�۾��� : " + boardArray[i][3]);
						temp = Integer.parseInt(boardArray[i][4]);
						temp++;
						boardArray[i][4] = String.valueOf(temp);
						System.out.println("��ȸ�� : " + boardArray[i][4]);
						break;
					}
				}
				break;
			case 4:
				input = 0;
				System.out.print("��ȣ : ");
				input = Integer.parseInt(scanner.nextLine());
				for (int i = 0; i < boardArray.length; i++) {
					if (Integer.parseInt(boardArray[i][0]) == input) {
						System.out.println("�������� : " + boardArray[i][1]);
						System.out.print("�������� : ");
						boardArray[i][1] = title = scanner.nextLine();
						System.out.println("�������� : " + boardArray[i][2]);
						System.out.print("�������� : ");
						boardArray[i][2] = content = scanner.nextLine();
						break;
					}
				}
				break;
			case 5:
				del = 0;
				System.out.print("��ȣ : ");
				del = Integer.parseInt(scanner.nextLine());
				for (int i = 0; i < boardArray.length; i++) {
					if (Integer.parseInt(boardArray[i][0]) == del) {
						for (int j = 0; j < boardArray[i].length; j++) {
							boardArray[i][j] = null;
						}
						confirm = true;
						count--;
						break;
					}
				}
				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}

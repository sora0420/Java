package Project01;

import java.util.Scanner;

public class source_code { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] boardArray = new String[100][5]; //2���� �迭 ����
		String[][] tempArray = new String[100][5]; //������ ���� �迭 ����

		boolean flag = true; //while�� ���Ḧ ���� ����
		String title, content, writer;
		Scanner scanner = new Scanner(System.in);
		int num = 0, no = 1, view = 0;

		while (flag) {
			title = null;
			content = null;
			writer = null;
			System.out.println();
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("1.��� | 2.����(Create) | 3.�б�(Read) | 4.����(Update) | 5.����(Delete) | 6.����");
			System.out.println("------------------------------------------------------------------------------");
			System.out.print(">���� : ");
			num = Integer.parseInt(scanner.nextLine()); //��ȣ�� �Է¹���
			switch (num) {
			case 1: //���
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("\t��ȣ\t\t����\t\t����\t\t�۾���\t\t��ȸ��");
				System.out.println("------------------------------------------------------------------------------");
				String[] tempa; //�� �迭�� �ϳ� ����
				System.arraycopy(boardArray, 0, tempArray, 0, boardArray.length); //����� �迭�� tempArray�� ����
				for (int i = 1; i < boardArray.length - 1; i++) { //���������� ���� ���� / 1���� 99����
					for (int j = i + 1; j < boardArray.length; j++) { //2���� 100����
						if (tempArray[j][0] != null && boardArray[i][0] != null) { 
							if (Integer.parseInt(tempArray[i][0]) < Integer.parseInt(tempArray[j][0])) { //j(����)�� i(����)���� ���ڰ� ū ���
								tempa = tempArray[j]; //ū ���� �տ��;� �ϹǷ� i���� j�� Ŭ ��� j���� i�� �̵� / �ϴ� �� �迭�� ū ���� �̵� 
								tempArray[j] = tempArray[i]; //���� ���� �ڷ� �Ѱܾ� �ϹǷ� i�� ���� j�� �̵�
								tempArray[i] = tempa; //ū ���� �����ߴ� tempa�� ���� i�� ���� //�̰� ��ü �迭�� ���ؼ� for���� ����
							} //�� ������ �տ��� ���� ū �� ������� ������
							//1 2 3
							//1�� 2�� �� 2�� �� ũ�Ƿ� 
							//2 1 3�� ��
							//2 3 �� >> 3�� ������ ����
							//3 1 2 
							// 1 2 �� >> 2�� ������ ���� 
							//3 2 1 // 3 2 1�� ��
						}
					}
				}
				for (int i = 1; i < no; i++) { //�������� ���ĵ� �迭�� ������� ���
					for (int j = 0; j < boardArray[no].length; j++) {
						if (boardArray[i][j] != null) { //null�� ���� �Ѿ
							System.out.print("\t" + tempArray[i][j] + "\t");
						}
					}
					if (boardArray[i][0] != null) //null�� �ƴѰ�� �����ٷ� �̵�
						System.out.println();
				}
				break;
			case 2: //�� �Է�
				for (int j = 0; j < boardArray[no].length; j++) {
					if (boardArray[no][0] == null) { //no�� �°� �Է� & null�� ���� ã�Ƽ� �װ��� ����
						boardArray[no][j] = String.valueOf(no);
						System.out.print("���� : ");
						boardArray[no][j + 1] = title = scanner.nextLine();
						System.out.print("���� : ");
						boardArray[no][j + 2] = content = scanner.nextLine();
						System.out.print("�۾��� : ");
						boardArray[no][j + 3] = writer = scanner.nextLine();
						boardArray[no][j + 4] = String.valueOf(view);
						no++; //��ȣ�� ���� no�� 1����
						break;
					}
				}
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("\t��ȣ\t\t����\t\t����\t\t�۾���\t\t��ȸ��");
				System.out.println("------------------------------------------------------------------------------");

				System.arraycopy(boardArray, 0, tempArray, 0, boardArray.length);
				for (int i = 1; i < boardArray.length - 1; i++) {
					for (int j = i + 1; j < boardArray.length; j++) {
						if (tempArray[j][0] != null && boardArray[i][0] != null) {
							if (Integer.parseInt(tempArray[i][0]) < Integer.parseInt(tempArray[j][0])) {
								tempa = tempArray[j];
								tempArray[j] = tempArray[i];
								tempArray[i] = tempa;
							}
						}
					}
				}
				for (int i = 1; i < no; i++) {
					for (int j = 0; j < boardArray[no].length; j++) {
						if (boardArray[i][j] != null) {
							System.out.print("\t" + tempArray[i][j] + "\t");
						}
					}
					if (boardArray[i][0] != null)
						System.out.println();
				}

				break;
			case 3: //�б�
				int input = 0;
				int temp = 0;
				System.out.print("��ȣ : "); 
				input = Integer.parseInt(scanner.nextLine()); //���� ��ȣ�� ����

				for (int i = 1; i < boardArray.length; i++) {
					if (Integer.parseInt(boardArray[i][0]) == input) { //���� ��ȣ�� �迭�� ��ȣ�� ���� ��� ����
						System.out.println("���� : " + boardArray[i][1]); 
						System.out.println("���� : " + boardArray[i][2]);
						System.out.println("�۾��� : " + boardArray[i][3]);
						temp = Integer.parseInt(boardArray[i][4]);
						temp++; //��ȸ���� ���� ���� / ��ȸ���� 1������Ų ��
						boardArray[i][4] = String.valueOf(temp); //��ȸ�� ����
						System.out.println("��ȸ�� : " + boardArray[i][4]);
						break;
					}
				}
				break;
			case 4: //����
				input = 0;
				System.out.print("��ȣ : ");
				input = Integer.parseInt(scanner.nextLine()); //������ ���ڸ� ����
				for (int i = 1; i < boardArray.length; i++) {
					if (Integer.parseInt(boardArray[i][0]) == input) { //�Է¹��� ���ڿ� ������ ���ڰ� ������ ����
						System.out.println("�������� : " + boardArray[i][1]);
						System.out.print("�������� : ");
						title = scanner.nextLine();
						System.out.println(title);
						if (!title.equals("")) { //������ ��� �������� �ʰ� ����
							boardArray[i][1] = title;
						}
						System.out.println("�������� : " + boardArray[i][2]);
						System.out.print("�������� : ");
						content = scanner.nextLine();
						if (!content.equals("")) { //������ ��� �������� �ʰ� ����
							boardArray[i][2] = content;
						}
						break;
					}
				}
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("\t��ȣ\t\t����\t\t����\t\t�۾���\t\t��ȸ��");
				System.out.println("------------------------------------------------------------------------------");

				for (int i = 1; i < no; i++) {
					for (int j = 0; j < boardArray[no].length; j++) {
						if (boardArray[i][j] != null) {
							System.out.print("\t" + tempArray[i][j] + "\t");
						}
					}
					if (boardArray[i][0] != null)
						System.out.println();
				}

				break;
			case 5: //����
				System.out.print("��ȣ : ");
				String del = scanner.nextLine(); //������ ���ڸ� ����
				for (int i = 1; i < boardArray.length; i++) {
					if (boardArray[i][0] != null) { //������ ���ڰ� null�� �ƴϰ�
						if (boardArray[i][0].equals(del)) { //�Է¹��� ���ڿ� ������ ��ȣ�� ������
							for (int j = 0; j < boardArray[i].length; j++) {
								boardArray[i][j] = null; //��ü�� null��
							}break;
						}						
					}
				}
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("\t��ȣ\t\t����\t\t����\t\t�۾���\t\t��ȸ��");
				System.out.println("------------------------------------------------------------------------------");

				System.arraycopy(boardArray, 0, tempArray, 0, boardArray.length);
				for (int i = 1; i < boardArray.length - 1; i++) {
					for (int j = i + 1; j < boardArray.length; j++) {
						if (tempArray[j][0] != null && boardArray[i][0] != null) {
							if (Integer.parseInt(tempArray[i][0]) < Integer.parseInt(tempArray[j][0])) {
								tempa = tempArray[j];
								tempArray[j] = tempArray[i];
								tempArray[i] = tempa;
							}
						}
					}
				}
				for (int i = 1; i < no; i++) {
					for (int j = 0; j < boardArray[no].length; j++) {
						if (boardArray[i][j] != null) {
							System.out.print("\t" + tempArray[i][j] + "\t");
						}
					}
					if (boardArray[i][0] != null)
						System.out.println();
				}
				break;
			case 6: //������ ��� while���� flag�� false�� �����ؼ� �����Ŵ
				flag = false;
				break; 
			default: //1~6�� �ƴ� ���ڸ� �� ��� 
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}

package ch15.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Example {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // <String> = String Ÿ�Ը� �����ϰڴ�
		List<Integer> list1 = new ArrayList<Integer>(); // <Integer> = IntegerŸ�Ը� �����ϰڴ�
		List<Board> list2 = new ArrayList<>(); // �տ� Ÿ�԰� ���� ��� �ڿ� ���� ����
		List<Board> list3 = new Vector<>(); // list�������̽��� vector�� ����ϰڴ�

		// ������ = ������� �Ȱ����� � ��ü�� ����ϴ��Ŀ� ���� ������ �޶���
		//ArrayList = �̱۽����̵��� ��츸 ���
		//Vector = ��Ƽ������ ȯ�濡�� ����� ��� / �ϳ��� �����尡 ������� �� �ٸ� �������� ����� ������Ŵ = ������ ȯ��
		//LinkedList = �� �յ��� ��ü�� ���� ������ ������ ���� / �߰��� �ϳ� ���� �� �յ� ��ü�� �ּҸ� �ٲٸ� �� 
		//�߰��� ��ü�� ���÷� �����ϰ� ������ ��� / �����Ͱ� ���� ���
		//���� p732
		
		// ��ü ����
		list2.add(new Board(1, "����1"));
		list2.add(new Board(2, "����2"));
		list2.add(new Board(3, "����3"));

		list1.add(3);
		list1.add(4);
		list1.add(5);

		list.add("ȫ�浿"); // add�� �ǵڿ� ����
		list.add("ȫ�漭"); // AutoBoxing�� �� / Wrapper class Integer
		list.add("ȫ�泲");
		System.out.println(list.size()); // ����� ���� 3

		// ��ü ���
		// �θ�Ÿ���� ������Ʈ�� ����ȯ �ʿ��ѵ� ���� String���� �����ϱ� ����ȯ �ʿ�x
		String name1 = list.get(0);
		String name2 = list.get(1);
		String name3 = list.get(2);
		int num = list1.get(0);
		Board board1 = list2.get(0);
		Board board2 = list2.get(1);
		Board board3 = list2.get(2);

		System.out.println(board1.getBno() + " : " + board1.getTitle());

		// �ݺ� ó��
		for (int i = 0; i < list.size(); i++) {
			Board board = list2.get(i);
			System.out.println(board.getBno() + " : " + board.getTitle());
		}

		for (Board board : list2) {
			System.out.println(board.getBno() + " : " + board.getTitle());

		}

		// ��ü ����
		list.remove(0); // �ϳ� ����� �ڿ��� index 0�� ��
		list.remove(0);
		System.out.println(list.size()); // ����� ���� 3

	}

}

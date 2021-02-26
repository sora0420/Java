package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List list = new ArrayList();
		//��ü ����
		list.add("ȫ�浿"); //add�� �ǵڿ� ����
		list.add(3); //AutoBoxing�� �� / Wrapper class Integer
		list.add(new Board()); 
		System.out.println(list.size()); //����� ���� 3
		
		//��ü ���
		String name = (String)list.get(0); //�θ�Ÿ���� ������Ʈ�� ����ȯ �ʿ�
		
		Integer value = (Integer)list.get(1); //int�� �߸��� ��ȯ / ������Ʈ�̴ϱ�
		int v = value; //AutoUnBoxing		
		//���� ������ �ϳ���
		int value1 = (Integer)list.get(1);
		
		Board board = (Board)list.get(2);
		
		//��ü ����
		list.remove(0); //�ϳ� ����� �ڿ��� index 0�� ��
		list.remove(0);
		System.out.println(list.size()); //����� ���� 3
		
		
	}

}

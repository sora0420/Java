package ch18.exam09;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class Example2 {
	// String�� charBuffer �������̽��� �����ϰ� ����
	// read(CharBuffer target) <<String�� �� �� ����
	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam09\\data.txt";
		try {
			Reader reader = new FileReader(filepath); // �ü���� �⺻ ���ڼ��� ����

			char[] data = new char[1024]; //�ѹ� �д� ũ��
			int readNum = -1;
			String str = "";
			while ((readNum = reader.read(data)) != -1) { //���� ������ ũ��� 5 
				str += new String(data, 0, readNum);

			}
			System.out.println(str);

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

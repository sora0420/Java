package ch18.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class Example2 {
	// String�� charBuffer �������̽��� �����ϰ� ����
	// read(CharBuffer target) <<String�� �� �� ����
	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam08\\data.txt";
		try {
			Writer writer = new FileWriter(filepath);
			writer.write(new char[] {'A', '��'}); //����Ǿ� �ִ� �Ű������� Ÿ���� �������ְ� �����ؾ���
			writer.write(new char[] {'B', '��', 'C', 'D'},0,2); //0���� �
			writer.write("������ ������ ȭâ�մϴ�.");
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

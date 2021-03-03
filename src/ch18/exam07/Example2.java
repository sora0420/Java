package ch18.exam07;

import java.io.FileReader;
import java.io.Reader;

public class Example2 {
	// String�� charBuffer �������̽��� �����ϰ� ����
	// read(CharBuffer target) <<String�� �� �� ����
	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam07\\data.txt";
		try {
			Reader reader = new FileReader(filepath); // �ü���� �⺻ ���ڼ��� ����
			/*
			 * FileInputStream fis = new FileInputStream(filepath); //�߻�Ŭ���� >> ������θ� �� �� ����,
			 * ����� Ư���� ��Ƽ� ����� Reader reader = new InputStreamReader(fis, "UTF-8");
			 */
			//���1
			/*
			 * while (true) { int charCode = reader.read(); if(charCode == -1) { break; }
			 * char charData = (char) charCode; System.out.println(charCode+" : "+charData);
			 * }
			 */
			
			//���2
			int charCode = -1;
			while((charCode = reader.read()) != -1) {
				char charData = (char) charCode; 
				System.out.println(charCode+" : "+charData);
				
			}
			
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

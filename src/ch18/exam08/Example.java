package ch18.exam08;

import java.io.FileReader;
import java.io.Reader;

public class Example {
	//String�� charBuffer �������̽��� �����ϰ� ����
	//read(CharBuffer target) <<String�� �� �� ����
	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam07\\data.txt";		
		try {
			Reader reader = new FileReader(filepath); //�ü���� �⺻ ���ڼ��� ����
			/*
			 * FileInputStream fis = new FileInputStream(filepath); //�߻�Ŭ���� >> ������θ� �� �� ����,
			 * ����� Ư���� ��Ƽ� ����� Reader reader = new InputStreamReader(fis, "UTF-8");
			 */
			
			int charCode = reader.read();
			char charData = (char)charCode;
			System.out.println(charData);
			
			charCode = reader.read();
			charData = (char) charCode;
			System.out.println(charData);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}

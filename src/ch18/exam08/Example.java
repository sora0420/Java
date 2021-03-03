package ch18.exam08;

import java.io.FileReader;
import java.io.Reader;

public class Example {
	//String은 charBuffer 인터페이스를 구현하고 있음
	//read(CharBuffer target) <<String이 올 수 있음
	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam07\\data.txt";		
		try {
			Reader reader = new FileReader(filepath); //운영체제의 기본 문자셋을 읽음
			/*
			 * FileInputStream fis = new FileInputStream(filepath); //추상클래스 >> 상속으로만 쓸 수 있음,
			 * 공통된 특성만 모아서 만든것 Reader reader = new InputStreamReader(fis, "UTF-8");
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

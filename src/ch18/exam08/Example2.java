package ch18.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class Example2 {
	// String은 charBuffer 인터페이스를 구현하고 있음
	// read(CharBuffer target) <<String이 올 수 있음
	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam08\\data.txt";
		try {
			Writer writer = new FileWriter(filepath);
			writer.write(new char[] {'A', '한'}); //선언되어 있는 매개변수의 타입을 선언해주고 생성해야함
			writer.write(new char[] {'B', '글', 'C', 'D'},0,2); //0부터 몇개
			writer.write("오늘은 날씨가 화창합니다.");
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package ch18.exam09;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class Example2 {
	// String은 charBuffer 인터페이스를 구현하고 있음
	// read(CharBuffer target) <<String이 올 수 있음
	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam09\\data.txt";
		try {
			Reader reader = new FileReader(filepath); // 운영체제의 기본 문자셋을 읽음

			char[] data = new char[1024]; //한번 읽는 크기
			int readNum = -1;
			String str = "";
			while ((readNum = reader.read(data)) != -1) { //실제 데이터 크기는 5 
				str += new String(data, 0, readNum);

			}
			System.out.println(str);

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

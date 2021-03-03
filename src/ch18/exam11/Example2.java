package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

public class Example2 {

	public static void main(String[] args) {

		// System.in.read(); //in이 참조하는 번지로 가서 read()를 실행
		try {
			InputStream is = System.in; // in의 번지를 is에 저장 //in은 InputStream 타입
			byte[] data = new byte[100];
			while (true) {
				int readNum = is.read(data); // is.read() = 1byte를 읽음 = System.in.read()/ 리턴은 int 타입
				//read()로 한글을 못읽음 / 한글은 모음 + 자음이라 / 한 키만 읽을 수 있음
				String str = new String(data, 0, readNum-2); //100byte전체가 아닌 들어가 있는 수만 읽음 // -2 = 엔터 10,13번 빼려고
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

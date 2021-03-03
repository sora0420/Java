package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {

		// System.in.read(); //in이 참조하는 번지로 가서 read()를 실행
		try {
			InputStream is = System.in; // in의 번지를 is에 저장
			while (true) {
				int keyCode = is.read(); // is.read() = 1byte를 읽음 = System.in.read()/ 리턴은 int 타입
				//read()로 한글을 못읽음 / 한글은 모음 + 자음이라 / 한 키만 읽을 수 있음
				System.out.println(keyCode);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

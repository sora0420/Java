package ch18.exam12;

import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {

		// System.out.write(); //첫줄이나 2~3줄이나 같은 주소
		try {
			OutputStream os = System.err;// 기본적으로 콘솔에출력 // out은 OutputStream 타입
			//err이 빨간색 지원
			os.write(65);
			os.write(new byte[] {66, 67, 68});
			os.write(new byte[] {66, 67, 68}, 0, 2); //0 index부터 2개			
			os.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package ch18.exam16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws Exception {
		// 보조 스트림 사용 시= 코드가 간결해진다 / 성능이 좋아진다(읽기 혹은 쓰기 향상) / 단독 사용 불가
		// 주 스트림을 보조스트림에 연결

		// 방법1
		/*
		 * InputStream is = System.in; // byte로 넘어옴
		 * 
		 * byte[] data = new byte[100]; * int readNum = is.read(data); String str = new
		 * String(data, 0, readNum - 2); //문자로 변환해서 System.out.println(str);
		 * 
		 * readNum = is.read(data); str = new String(data, 0, readNum - 2); //문자로 변환해서
		 * System.out.println(str);
		 */

		// 방법2
		InputStream is = System.in; //InputStream에서 바이트로 넘어옴 
		InputStreamReader isr = new InputStreamReader(is); //이걸 문자로 바꿔주는 보조 스트림
		BufferedReader br = new BufferedReader(isr); //이걸 한줄 입력받은걸 출력할수 있게 해줌 / 보통 둘이같이씀

		String str = br.readLine();
		System.out.println(str);

		str = br.readLine();
		System.out.println(str);
	}

}

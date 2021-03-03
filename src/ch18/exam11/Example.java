package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {

		// System.in.read(); //in�� �����ϴ� ������ ���� read()�� ����
		try {
			InputStream is = System.in; // in�� ������ is�� ����
			while (true) {
				int keyCode = is.read(); // is.read() = 1byte�� ���� = System.in.read()/ ������ int Ÿ��
				//read()�� �ѱ��� ������ / �ѱ��� ���� + �����̶� / �� Ű�� ���� �� ����
				System.out.println(keyCode);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package ch18.exam16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws Exception {
		// ���� ��Ʈ�� ��� ��= �ڵ尡 ���������� / ������ ��������(�б� Ȥ�� ���� ���) / �ܵ� ��� �Ұ�
		// �� ��Ʈ���� ������Ʈ���� ����

		// ���1
		/*
		 * InputStream is = System.in; // byte�� �Ѿ��
		 * 
		 * byte[] data = new byte[100]; * int readNum = is.read(data); String str = new
		 * String(data, 0, readNum - 2); //���ڷ� ��ȯ�ؼ� System.out.println(str);
		 * 
		 * readNum = is.read(data); str = new String(data, 0, readNum - 2); //���ڷ� ��ȯ�ؼ�
		 * System.out.println(str);
		 */

		// ���2
		InputStream is = System.in; //InputStream���� ����Ʈ�� �Ѿ�� 
		InputStreamReader isr = new InputStreamReader(is); //�̰� ���ڷ� �ٲ��ִ� ���� ��Ʈ��
		BufferedReader br = new BufferedReader(isr); //�̰� ���� �Է¹����� ����Ҽ� �ְ� ���� / ���� ���̰��̾�

		String str = br.readLine();
		System.out.println(str);

		str = br.readLine();
		System.out.println(str);
	}

}

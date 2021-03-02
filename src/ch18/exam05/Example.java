package ch18.exam05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam05\\data.txt";
		try {
			OutputStream os = new FileOutputStream(filepath);
			byte[] arr = { 65, 66, 67 };
			os.write(arr);
			os.write(arr, 0, arr.length); //������ ����� �ϴµ� 0��ġ���� �����
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

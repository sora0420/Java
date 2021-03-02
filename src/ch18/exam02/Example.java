package ch18.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam02\\data.txt";

		try {
			InputStream is = new FileInputStream(filepath);
			// ¹æ¹ý2
			byte[] data = new byte[3];
			int readNum = is.read(data);
			System.out.println(readNum + " : " + Arrays.toString(data));

			readNum = is.read(data);
			System.out.println(readNum + " : " + Arrays.toString(data));

			readNum = is.read(data);
			System.out.println(readNum + " : " + Arrays.toString(data));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

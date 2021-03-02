package ch18.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam02\\data.txt";

		try {
			InputStream is = new FileInputStream(filepath);
			// 规过1
			byte[] data = new byte[1024];
			/*
			 * while (true) { int readNum = is.read(data); if (readNum == -1) { break; }
			 * System.out.println(readNum + " : " + Arrays.toString(data)); }
			 */
			
			//规过2
			int readNum = -1;
			while((readNum = is.read(data)) != -1) {
				System.out.println(readNum + " : " + Arrays.toString(data)); 
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

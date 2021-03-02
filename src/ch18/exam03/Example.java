package ch18.exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam02\\data.txt";

		try {
			InputStream is = new FileInputStream(filepath);
			// 방법1
			byte[] data = new byte[8];
			/*
			 * while (true) { int readNum = is.read(data); if (readNum == -1) { break; }
			 * System.out.println(readNum + " : " + Arrays.toString(data)); }
			 */
			
			//방법2
			int readNum = -1;
			while((readNum = is.read(data, 2, 3)) != -1) { //저장위치가 2번째부터 최대 3개 저장
				System.out.println(readNum + " : " + Arrays.toString(data)); 
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

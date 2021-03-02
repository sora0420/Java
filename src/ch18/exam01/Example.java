package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam01\\data.txt";
		try {
			InputStream is = new FileInputStream(filepath);
			while (true) {
				int byte1 = is.read();
				int byte2 = is.read();
				int byte3 = is.read();
				int byte4 = is.read();

				System.out.println((char) byte1); // πÆ¿⁄ø≠∑Œ πŸ≤„¡‡æﬂ«‘
				System.out.println((char) byte2);
				System.out.println(byte3);
				System.out.println(byte4);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

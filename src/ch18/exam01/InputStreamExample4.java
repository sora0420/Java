package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample4 {

	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam01\\photo1.jpg"; // 58kb

		try {
			InputStream is = new FileInputStream(filepath);
			// 방법2
			int data = -1;
			while ((data = is.read()) != -1) { //is.read() = 1byte /5만8천번
				System.out.print(data);
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

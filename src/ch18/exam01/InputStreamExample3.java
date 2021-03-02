package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample3 {

	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam01\\data.txt";
		try {
			InputStream is = new FileInputStream(filepath);
			//방법1
			while (true) {
				int data = is.read();
				if(data == -1) {
					break;
				}
				System.out.println(data); // 문자열로 바꿔줘야함
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

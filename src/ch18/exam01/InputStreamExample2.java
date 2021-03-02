package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample2 {

	public static void main(String[] args) {
		String filepath = "D:\\MyProjects\\Java\\src\\ch18\\exam01\\data.txt";
		try {
			InputStream is = new FileInputStream(filepath);
			//���2
			int data = -1;
			while ((data = is.read()) != -1) {
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

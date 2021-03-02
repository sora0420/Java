package ch18.exam06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		String filepath1 = "D:\\MyProjects\\Java\\src\\ch18\\exam06\\photo2.jpg";
		String filepath2 = "D:\\MyProjects\\Java\\src\\ch18\\exam06\\photo3.jpg"; //1을복사해서 2를 만들예정
		
		try {
			InputStream is = new FileInputStream(filepath1);
			OutputStream os = new FileOutputStream(filepath2);
			
			byte[] data = new byte[1024];
			int readNum = -1;
			while((readNum = is.read(data)) != -1) {
				os.write(data, 0, readNum); //1024가 안될경우 남기때문에 / 읽는것 만큼만				
			}
			os.flush();
			is.close();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
				
	}

}

package ch18.exam16;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Example2 {

	public static void main(String[] args) throws Exception {
		//String filePath = "D:\\MyProjects\\Java\\src\\ch18\\exam16\\data.txt";
		/*
		OutputStream os = new FileOutputStream(filePath);
		//방법1
		String data = "오늘은 수요일이다.";
		byte[] bytes = data.getBytes("UTF-8"); //getBytes() = 이거에 대한 바이트 배열을 얻을 수 있읏ㅁ
		//utf-8 = 한글 한 자가 3바이트로
		os.write(bytes);
		os.flush();
		
		data = "오늘은 따뜻해요.";
		bytes = data.getBytes("UTF-8"); //getBytes() = 이거에 대한 바이트 배열을 얻을 수 있읏ㅁ
		//utf-8 = 한글 한 자가 3바이트로
		os.write(bytes);
		os.flush();
		
		os.close();
		*/
		
		//방법2
		String filePath = "D:\\MyProjects\\Java\\src\\ch18\\exam16\\data.txt";
		OutputStream os = new FileOutputStream(filePath);
		Writer writer = new OutputStreamWriter(os, "UTF-8"); //바이트 배열로 변경 / 문자셋에 맞게 끔
		String data = "오늘은 수요일이다.";
		writer.write(data);
		writer.flush();
		
		data = "오늘은 따뜻해요.";
		writer.write(data);
		writer.flush();
		
		writer.close();
	}

}

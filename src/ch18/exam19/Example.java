package ch18.exam19;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Example {

	public static void main(String[] args) throws Exception{
		String filePath = "D:\\MyProjects\\Java\\src\\ch18\\exam19\\data.txt";		
		OutputStream os = new FileOutputStream(filePath);
		
		
		String data1 = "�ȳ��ϼ���.";
		String data2 = "���� ���Ŀ�.";
		/*
		//���1
		os.write(data1.getBytes());
		os.write("\n".getBytes());
		os.write(data2.getBytes());
		os.flush();
		
		os.close();
		*/
		
		//���2
		//PrintStream out = new PrintStream(os); �Ѵ� ����
		PrintWriter out = new PrintWriter(os);
		out.println(data1);
		out.println(data2);
		out.println(3); //���ڷ� �����
		out.println(10.5);
		
		out.flush();
		out.close();
		
	}

}

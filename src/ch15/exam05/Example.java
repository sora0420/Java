package ch15.exam05;

import java.io.FileReader;
import java.util.Properties;

public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		String path = Example.class.getResource("database.properties").getPath(); //�޸𸮿� �ε��� �ּ� = Example.class
		//�� ����� getResource / �� String���� �޾ƾ��ϴ� getPath
		prop.load(new FileReader(path));
		
		String driver = prop.getProperty("driver");
		System.out.println(driver);
		
		String nation = prop.getProperty("nation");
		System.out.println(nation);
		
	}

}

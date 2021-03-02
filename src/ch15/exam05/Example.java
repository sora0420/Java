package ch15.exam05;

import java.io.FileReader;
import java.util.Properties;

public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		String path = Example.class.getResource("database.properties").getPath(); //메모리에 로딩된 주소 = Example.class
		//의 상대경로 getResource / 를 String으로 받아야하니 getPath
		prop.load(new FileReader(path));
		
		String driver = prop.getProperty("driver");
		System.out.println(driver);
		
		String nation = prop.getProperty("nation");
		System.out.println(nation);
		
	}

}

package ch06.exam15.pack2;
import java.util.Date;

import ch06.exam15.pack1.Board;
import ch06.exam15.pack1.Product; //ctrl + shift + O

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b1 = new Board();
		b1.title = "제목1";
		
		Product p1 = new Product();
		p1.name = "세탁기";
		
		Date now = new Date();
		
		ch06.exam15.pack3.Board b2 = new ch06.exam15.pack3.Board(); 
		//클래스이름은 패키지이름 포함임 // 패키지도 클래스의 일부분임
		
	}

}

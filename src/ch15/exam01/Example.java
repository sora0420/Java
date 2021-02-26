package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List list = new ArrayList();
		//객체 저장
		list.add("홍길동"); //add는 맨뒤에 저장
		list.add(3); //AutoBoxing이 됨 / Wrapper class Integer
		list.add(new Board()); 
		System.out.println(list.size()); //저장된 갯수 3
		
		//객체 얻기
		String name = (String)list.get(0); //부모타입이 오브젝트라서 형변환 필요
		
		Integer value = (Integer)list.get(1); //int는 잘못된 변환 / 오브젝트이니까
		int v = value; //AutoUnBoxing		
		//위에 두줄을 하나로
		int value1 = (Integer)list.get(1);
		
		Board board = (Board)list.get(2);
		
		//객체 제거
		list.remove(0); //하나 지우면 뒤에게 index 0이 됨
		list.remove(0);
		System.out.println(list.size()); //저장된 갯수 3
		
		
	}

}

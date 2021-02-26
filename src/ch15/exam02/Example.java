package ch15.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Example {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // <String> = String 타입만 저장하겠다
		List<Integer> list1 = new ArrayList<Integer>(); // <Integer> = Integer타입만 저장하겠다
		List<Board> list2 = new ArrayList<>(); // 앞에 타입과 같을 경우 뒤에 생략 가능
		List<Board> list3 = new Vector<>(); // list인터페이스로 vector를 사용하겠다

		// 다형성 = 사용방법은 똑같은데 어떤 객체를 사용하느냐에 따라 성능이 달라짐
		//ArrayList = 싱글스레이드일 경우만 사용
		//Vector = 멀티스레드 환경에서 사용할 경우 / 하나의 스레드가 사용중일 때 다른 스레드의 사용을 중지시킴 = 안전한 환경
		//LinkedList = 내 앞뒤의 객체에 대한 번지를 가지고 있음 / 중간에 하나 삭제 시 앞뒤 객체의 주소만 바꾸면 됨 
		//중간의 객체를 수시로 제거하고 변경할 경우 / 데이터가 많을 경우
		//교재 p732
		
		// 객체 저장
		list2.add(new Board(1, "제목1"));
		list2.add(new Board(2, "제목2"));
		list2.add(new Board(3, "제목3"));

		list1.add(3);
		list1.add(4);
		list1.add(5);

		list.add("홍길동"); // add는 맨뒤에 저장
		list.add("홍길서"); // AutoBoxing이 됨 / Wrapper class Integer
		list.add("홍길남");
		System.out.println(list.size()); // 저장된 갯수 3

		// 객체 얻기
		// 부모타입이 오브젝트라서 형변환 필요한데 위에 String으로 받으니까 형변환 필요x
		String name1 = list.get(0);
		String name2 = list.get(1);
		String name3 = list.get(2);
		int num = list1.get(0);
		Board board1 = list2.get(0);
		Board board2 = list2.get(1);
		Board board3 = list2.get(2);

		System.out.println(board1.getBno() + " : " + board1.getTitle());

		// 반복 처리
		for (int i = 0; i < list.size(); i++) {
			Board board = list2.get(i);
			System.out.println(board.getBno() + " : " + board.getTitle());
		}

		for (Board board : list2) {
			System.out.println(board.getBno() + " : " + board.getTitle());

		}

		// 객체 제거
		list.remove(0); // 하나 지우면 뒤에게 index 0이 됨
		list.remove(0);
		System.out.println(list.size()); // 저장된 갯수 3

	}

}

package ch15.exam04;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<User, Board> map = new HashMap();
		map.put(new User("winter", "�ܿ��"), new Board(1, "�ܿ��"));
		map.put(new User("winter", "�ܿ��"), new Board(2, "����"));
		System.out.println(map.size());
		
		Board board = map.get(new User("winter", null));
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
	}

}

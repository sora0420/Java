package ch11.exam08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {

	public static void main(String[] args) {
		// java.util.Date = 날짜 정보를 전달할 경우
		// java.util.Calendar = 구체적인 날짜의 정보를 얻을 때
		Board board = new Board();
		board.setBno(1);
		board.setTitle("제목1");
		board.setContent("내용1");
		board.setWriter("글쓴이1");
		board.setWriteDate(new Date());
		
		service(board);
	}
	public static void service(Board board) {
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
		System.out.println(board.getWriter());
		System.out.println(board.getWriter());
		//System.out.println(board.getWriteDate());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String strDate = sdf.format(board.getWriteDate());
		System.out.println(strDate);
		
	}

}

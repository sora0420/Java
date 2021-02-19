package ch06.exam08;

public class BoardService {
	// Field
	String[][] boards;
	int count;
	/*
	 * { {"1", "제목1", "내용1", "글쓴이1", "3"} ... }
	 */

	// Constructor
	BoardService(int rows, int colmns) {
		boards = new String[rows][colmns];
	}

	// Method
	int getNewBno() {
		return ++count;
	}

	void create(String title, String content, String writer, int hitcount) {
		int bno = getNewBno();
		String[] board = { "" + bno, title, content, writer, String.valueOf(hitcount) };

		for (int i = 0; i < board.length; i++) {
			if (boards[i][0] == null) {
				boards[i] = board;
				break;
			}
		}
	}

	void showList() {
		for (int i = 0; i < boards.length; i++) {
			for (int j = 0; j < boards[i].length; j++) {
				System.out.print(boards[i][j] + " ");
			}
			System.out.println();
		}

	}

	String[] read(int bno) {
		String[] result = null;
		String strBno = "" +bno;
		for (int i = 0; i < 100; i++) {
			if(boards[i][0] != null) {
				if(boards[i][0].equals(strBno)) {
					result = boards[i];
					break;
				}
			}
		}return result;
	}

}

package Project01;

import java.util.Scanner;

public class source_code { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] boardArray = new String[100][5]; //2차원 배열 선언
		String[][] tempArray = new String[100][5]; //정렬을 위한 배열 선언

		boolean flag = true; //while문 종료를 위한 변수
		String title, content, writer;
		Scanner scanner = new Scanner(System.in);
		int num = 0, no = 1, view = 0;

		while (flag) {
			title = null;
			content = null;
			writer = null;
			System.out.println();
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("1.목록 | 2.생성(Create) | 3.읽기(Read) | 4.수정(Update) | 5.삭제(Delete) | 6.종료");
			System.out.println("------------------------------------------------------------------------------");
			System.out.print(">선택 : ");
			num = Integer.parseInt(scanner.nextLine()); //번호를 입력받음
			switch (num) {
			case 1: //출력
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("\t번호\t\t제목\t\t내용\t\t글쓴이\t\t조회수");
				System.out.println("------------------------------------------------------------------------------");
				String[] tempa; //빈 배열을 하나 선언
				System.arraycopy(boardArray, 0, tempArray, 0, boardArray.length); //저장된 배열을 tempArray에 저장
				for (int i = 1; i < boardArray.length - 1; i++) { //내림차순을 위한 정렬 / 1부터 99까지
					for (int j = i + 1; j < boardArray.length; j++) { //2부터 100까지
						if (tempArray[j][0] != null && boardArray[i][0] != null) { 
							if (Integer.parseInt(tempArray[i][0]) < Integer.parseInt(tempArray[j][0])) { //j(뒤쪽)가 i(앞쪽)보다 숫자가 큰 경우
								tempa = tempArray[j]; //큰 수가 앞에와야 하므로 i보다 j가 클 경우 j값을 i로 이동 / 일단 빈 배열에 큰 수를 이동 
								tempArray[j] = tempArray[i]; //작은 수를 뒤로 넘겨야 하므로 i의 값을 j로 이동
								tempArray[i] = tempa; //큰 값을 저장했던 tempa의 수를 i에 저장 //이걸 전체 배열을 비교해서 for문을 돌림
							} //다 끝나면 앞에는 가장 큰 수 순서대로 정리됨
							//1 2 3
							//1과 2를 비교 2가 더 크므로 
							//2 1 3이 됨
							//2 3 비교 >> 3이 앞으로 나옴
							//3 1 2 
							// 1 2 비교 >> 2가 앞으로 나옴 
							//3 2 1 // 3 2 1이 됨
						}
					}
				}
				for (int i = 1; i < no; i++) { //내림차순 정렬된 배열을 순서대로 출력
					for (int j = 0; j < boardArray[no].length; j++) {
						if (boardArray[i][j] != null) { //null인 경우는 넘어감
							System.out.print("\t" + tempArray[i][j] + "\t");
						}
					}
					if (boardArray[i][0] != null) //null이 아닌경우 다음줄로 이동
						System.out.println();
				}
				break;
			case 2: //값 입력
				for (int j = 0; j < boardArray[no].length; j++) {
					if (boardArray[no][0] == null) { //no에 맞게 입력 & null인 곳을 찾아서 그곳에 저장
						boardArray[no][j] = String.valueOf(no);
						System.out.print("제목 : ");
						boardArray[no][j + 1] = title = scanner.nextLine();
						System.out.print("내용 : ");
						boardArray[no][j + 2] = content = scanner.nextLine();
						System.out.print("글쓴이 : ");
						boardArray[no][j + 3] = writer = scanner.nextLine();
						boardArray[no][j + 4] = String.valueOf(view);
						no++; //번호를 위해 no를 1증가
						break;
					}
				}
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("\t번호\t\t제목\t\t내용\t\t글쓴이\t\t조회수");
				System.out.println("------------------------------------------------------------------------------");

				System.arraycopy(boardArray, 0, tempArray, 0, boardArray.length);
				for (int i = 1; i < boardArray.length - 1; i++) {
					for (int j = i + 1; j < boardArray.length; j++) {
						if (tempArray[j][0] != null && boardArray[i][0] != null) {
							if (Integer.parseInt(tempArray[i][0]) < Integer.parseInt(tempArray[j][0])) {
								tempa = tempArray[j];
								tempArray[j] = tempArray[i];
								tempArray[i] = tempa;
							}
						}
					}
				}
				for (int i = 1; i < no; i++) {
					for (int j = 0; j < boardArray[no].length; j++) {
						if (boardArray[i][j] != null) {
							System.out.print("\t" + tempArray[i][j] + "\t");
						}
					}
					if (boardArray[i][0] != null)
						System.out.println();
				}

				break;
			case 3: //읽기
				int input = 0;
				int temp = 0;
				System.out.print("번호 : "); 
				input = Integer.parseInt(scanner.nextLine()); //읽을 번호를 받음

				for (int i = 1; i < boardArray.length; i++) {
					if (Integer.parseInt(boardArray[i][0]) == input) { //읽을 번호와 배열의 번호가 같은 경우 수정
						System.out.println("제목 : " + boardArray[i][1]); 
						System.out.println("내용 : " + boardArray[i][2]);
						System.out.println("글쓴이 : " + boardArray[i][3]);
						temp = Integer.parseInt(boardArray[i][4]);
						temp++; //조회수를 위한 변수 / 조회수를 1증가시킨 후
						boardArray[i][4] = String.valueOf(temp); //조회수 변경
						System.out.println("조회수 : " + boardArray[i][4]);
						break;
					}
				}
				break;
			case 4: //수정
				input = 0;
				System.out.print("번호 : ");
				input = Integer.parseInt(scanner.nextLine()); //수정할 숫자를 받음
				for (int i = 1; i < boardArray.length; i++) {
					if (Integer.parseInt(boardArray[i][0]) == input) { //입력받은 숫자와 수정할 숫자가 같으면 수정
						System.out.println("기존제목 : " + boardArray[i][1]);
						System.out.print("수정제목 : ");
						title = scanner.nextLine();
						System.out.println(title);
						if (!title.equals("")) { //공백일 경우 수정하지 않고 끝냄
							boardArray[i][1] = title;
						}
						System.out.println("기존내용 : " + boardArray[i][2]);
						System.out.print("수정내용 : ");
						content = scanner.nextLine();
						if (!content.equals("")) { //공백일 경우 수정하지 않고 끝냄
							boardArray[i][2] = content;
						}
						break;
					}
				}
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("\t번호\t\t제목\t\t내용\t\t글쓴이\t\t조회수");
				System.out.println("------------------------------------------------------------------------------");

				for (int i = 1; i < no; i++) {
					for (int j = 0; j < boardArray[no].length; j++) {
						if (boardArray[i][j] != null) {
							System.out.print("\t" + tempArray[i][j] + "\t");
						}
					}
					if (boardArray[i][0] != null)
						System.out.println();
				}

				break;
			case 5: //삭제
				System.out.print("번호 : ");
				String del = scanner.nextLine(); //삭제할 숫자를 받음
				for (int i = 1; i < boardArray.length; i++) {
					if (boardArray[i][0] != null) { //삭제할 숫자가 null이 아니고
						if (boardArray[i][0].equals(del)) { //입력받은 숫자와 삭제할 번호가 같으면
							for (int j = 0; j < boardArray[i].length; j++) {
								boardArray[i][j] = null; //전체를 null값
							}break;
						}						
					}
				}
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("\t번호\t\t제목\t\t내용\t\t글쓴이\t\t조회수");
				System.out.println("------------------------------------------------------------------------------");

				System.arraycopy(boardArray, 0, tempArray, 0, boardArray.length);
				for (int i = 1; i < boardArray.length - 1; i++) {
					for (int j = i + 1; j < boardArray.length; j++) {
						if (tempArray[j][0] != null && boardArray[i][0] != null) {
							if (Integer.parseInt(tempArray[i][0]) < Integer.parseInt(tempArray[j][0])) {
								tempa = tempArray[j];
								tempArray[j] = tempArray[i];
								tempArray[i] = tempa;
							}
						}
					}
				}
				for (int i = 1; i < no; i++) {
					for (int j = 0; j < boardArray[no].length; j++) {
						if (boardArray[i][j] != null) {
							System.out.print("\t" + tempArray[i][j] + "\t");
						}
					}
					if (boardArray[i][0] != null)
						System.out.println();
				}
				break;
			case 6: //종료일 경우 while문의 flag를 false로 변경해서 종료시킴
				flag = false;
				break; 
			default: //1~6이 아닌 숫자를 쓸 경우 
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}

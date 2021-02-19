package ch06.exam07;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardService bs = new BoardService();
		int bno = bs.getNewBno();
		System.out.println(bno);

		bno = bs.getNewBno();
		System.out.println(bno);

		bs.save("제목1", "내용1");
		bs.save("제목2", "내용2");

		int[] arr = { 1, 2, 3 };
		int sum = bs.getSum(arr);
		System.out.println(sum);

		sum = bs.getSum(new int[] { 1, 2, 3, });
		System.out.println(sum);
		
		//[]과 ...의 차이 호출할때 차이있음
		//[]는 개수가 많을땐 배열로 
		// ...은 개수가 딱히 정해지지않음
		sum = bs.getSum2(1,2,3);

	}

}

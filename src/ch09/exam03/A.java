package ch09.exam03;

public class A { //final붙여도 되고 안붙여도 되고 / 기본적으로 final속성을 갖는다
	public void method(int x) {
		int y = 2; //final붙여도 되고 안붙여도 되고

		//x = 10;
		//y = 20; 로컬 클래스에서 매개변수의 값을 변경할 수 없음
		class B {
			public void method() {
				int result = x + y;
			}
		}
	}
}

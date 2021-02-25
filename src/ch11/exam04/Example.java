package ch11.exam04;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class var1 = A.class; //A가 로딩된 메소드 영역의 번지 / 타입은 Class 타입
		A a = new A();
		Class var2 = a.getClass(); //
		System.out.println(var1);
		
		
	}

}

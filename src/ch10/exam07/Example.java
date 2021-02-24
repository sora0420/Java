package ch10.exam07;

public class Example {

	public static void main(String[] args) {
		
		try{
			method();
		}catch(Exception e) {
			//예외 메시지별로 예외처리를 할 때 사용
			String message = e.getMessage();
			System.out.println(message);
			//디버깅 할 때 사용할 수 있는 예외 정보
			System.out.println(e.toString()); //예외의 문자열 얻기
			e.printStackTrace(); //예외를 자세하게 볼 수 있음
		}
	}

	public static void method() throws NoAccountException {
		throw new NoAccountException("0001 : 입금 계좌가 없음");
	}

}
     
package ch06.exam12;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//올바른 사용 방법
		System.out.println(Calculator.pi);
		Calculator.plus(10, 20);
		
		//잘못된 사용 방법
		Calculator myCalc = new Calculator();		
		System.out.println(myCalc.pi); //x 노란색 경고표시
		
		myCalc.plus(10, 20); //x
		
	}

}

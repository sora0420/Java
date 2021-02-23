package ch06homework.exam13;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRectangle(10);		
		double result2 = myCalc.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 = "+result1);
		System.out.println("직사각형 넓이 = "+result2);
		
		
	}

}

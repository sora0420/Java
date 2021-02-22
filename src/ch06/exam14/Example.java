package ch06.exam14;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final 있어서 변경 불가 Korean.NATION = "미국";
		System.out.println(Korean.NATION);
		
		Korean k1 = new Korean("123456-1234567");
		//k1.ssn = "1234"; (x)
		
		//Math.PI >> static final 
		//열거타입 >> 대문자
		 
		System.out.println(Math.PI);
		double area = 10*10*Math.PI;
	}

}

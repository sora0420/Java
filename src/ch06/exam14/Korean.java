package ch06.exam14;

public class Korean {
	//Field //final static일 경우 대문자
	final static String NATION = "한국";
	final String ssn; //생성 시 외부에서 값을 받아서 값 변경 불가하게 만듦
	
	//Constructor
	Korean(String ssn){ //한번의 값을 생성할 때 받음
		this.ssn = ssn;
	}
	
	//Method
}

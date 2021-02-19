package ch06.exam05;

public class Korean {
	//Field //변수는 선언되고나서 사용, 필드는 위치 상관없음/ 위든 아래든 사용 가능
	String nation = "한국";
	String name;
	String ssn;
	int age;
	
	Korean(){
		System.out.println("Korean() 실행");
	}
	
	Korean(String name){
		this.name = name;
		System.out.println("Korean(String name) 실행");
	}
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
		System.out.println("Korean(String name, String ssn) 실행");
		
	}
	Korean(String name, String ssn, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		System.out.println("Korean(String name, String ssn) 실행");
		
	}
}

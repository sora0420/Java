package ch06.exam06;

public class Korean {
	//Field //변수는 선언되고나서 사용, 필드는 위치 상관없음/ 위든 아래든 사용 가능
	String nation = "한국";
	String name;
	String ssn;
	int age;
	
	Korean(){
		this("아무개", "00000-000000", 1); 
		//내가 가지고 있는 생성자를 실행
		//즉 밑에 4번째 strig, string, int 실행
	}
	
	Korean(String name){
		this(name, "00000-000000", 1);
	}
	Korean(String name, String ssn){
		this(name, ssn, 1);
		
	}
	Korean(String name, String ssn, int age){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		
	}
	
}

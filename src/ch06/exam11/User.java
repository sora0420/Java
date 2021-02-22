package ch06.exam11;

public class User {
	// Field
	String id;
	String name;
	String password;
	static String nation = "한국"; //객체를 만들지 않아도 사용할 수 있는 = static
	
	// Constructor //생성자는 객체를 생성하기 위한 용도일 뿐 객체의 인스턴스 멤버가 아님
	User(String name){
		this.name = name;
	}

	// Method
	static void info() { //객체없이 사용할 수 있는 메소드
		System.out.println("모든 User는 한국인입니다.");
	}
	
	void login() {
		System.out.println(name + "님이 로그인합니다.");
	}

	void logout() {
		System.out.println(name + "님이 로그아웃합니다.");
	}
}

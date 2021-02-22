package ch06.exam11;
import ch06.exam11.User;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User("홍길동");
		
		//인스턴스 멤버(필드, 메소드)는 반드시 
		//객체 참조변수를 통해서 접근한다.
		System.out.println(user.name);
		user.login();
		user.logout();
		
		//정적 멤버(필드, 메소드)는 객체가 없이도 사용 가능
		//클래스 이름으로 접근
		System.out.println(User.nation);
		User.info();
	}

}

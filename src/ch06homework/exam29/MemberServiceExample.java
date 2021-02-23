package ch06homework.exam29;
//Q15
public class MemberServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService memberservice = new MemberService("hong", "12345");
		boolean result = memberservice.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberservice.logout("hong");
			
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}

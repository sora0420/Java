package ch06homework.exam29;

public class MemberService {
	String id;
	String password;
	MemberService(String id, String password){
		this.id = id;
		this.password = password;
	}
	public boolean login(String id, String password) {
		if(id.equals("hong")&&password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}

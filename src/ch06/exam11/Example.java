package ch06.exam11;
import ch06.exam11.User;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User("ȫ�浿");
		
		//�ν��Ͻ� ���(�ʵ�, �޼ҵ�)�� �ݵ�� 
		//��ü ���������� ���ؼ� �����Ѵ�.
		System.out.println(user.name);
		user.login();
		user.logout();
		
		//���� ���(�ʵ�, �޼ҵ�)�� ��ü�� ���̵� ��� ����
		//Ŭ���� �̸����� ����
		System.out.println(User.nation);
		User.info();
	}

}

package ch09.exam03;

public class A { //final�ٿ��� �ǰ� �Ⱥٿ��� �ǰ� / �⺻������ final�Ӽ��� ���´�
	public void method(int x) {
		int y = 2; //final�ٿ��� �ǰ� �Ⱥٿ��� �ǰ�

		//x = 10;
		//y = 20; ���� Ŭ�������� �Ű������� ���� ������ �� ����
		class B {
			public void method() {
				int result = x + y;
			}
		}
	}
}

package ch08.exam03;

public class Car implements Shipable, Flyable {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("�̷��մϴ�.");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("�����մϴ�.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("�����մϴ�.");
	}

	@Override
	public void sailing() {
		// TODO Auto-generated method stub
		System.out.println("�����մϴ�.");
	}

	@Override
	public void anchor() {
		// TODO Auto-generated method stub
		System.out.println("�����մϴ�.");
	}

}

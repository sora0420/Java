package ch12.exam01;

public class NetworkTask implements Runnable{

	@Override
	public void run() {	//thread�� ���� �����ϴ� �κ�
		while(true) {
			System.out.println("��Ʈ��ũ ����� �մϴ�.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}

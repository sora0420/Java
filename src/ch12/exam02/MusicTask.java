package ch12.exam02;

public class MusicTask extends Thread{
	//�����带 ��ӹ��� >>�����尡 ��
	@Override
	public void run() {		
		while(true) {
			System.out.println("������ ���� �մϴ�.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}

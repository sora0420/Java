package ch12.exam01;

public class MusicTask implements Runnable{
	//���ʺ�� 
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

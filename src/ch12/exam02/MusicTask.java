package ch12.exam02;

public class MusicTask extends Thread{
	//스레드를 상속받음 >>스레드가 됨
	@Override
	public void run() {		
		while(true) {
			System.out.println("뮤직을 연주 합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}

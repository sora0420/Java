package ch12.exam01;

public class MusicTask implements Runnable{
	//러너블로 
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

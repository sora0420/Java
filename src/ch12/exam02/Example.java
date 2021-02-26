package ch12.exam02;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 스레드 시작");
		// 네트워크 작어을 하는 스레드 생성과 실행
		Thread thread1 = new NetworkTask();
		thread1.start();
		// 뮤직 작업을 하는 스레드 생성과 실행
		Thread thread2 = new MusicTask();
		thread2.start();
		//runnable로 사용가능한 객체가 thread
		Thread thread3 = new Thread() {
		//익명 자식
			@Override
			public void run() {
				while (true) {
					System.out.println("채팅 작업을 합니다.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

					}
				}
			}		
		};
		thread3.start();
	}
}

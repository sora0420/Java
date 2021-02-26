package ch12.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 스레드 시작");
		// 네트워크 작어을 하는 스레드 생성과 실행
		Thread thread1 = new Thread(new NetworkTask()); // runnable로 사용가능한 객체 = 다형성
		thread1.start();
		// 뮤직 작업을 하는 스레드 생성과 실행
		Thread thread2 = new Thread(new MusicTask());
		thread2.start();
		//runnable로 사용가능한 객체가 thread
		
		//채팅 작업을 하는 스레드 생성과 실행
		// 채팅 작업을 하는 스레드 생성과 실행
		// 러너블이라는 인터페이스를 구현한 클래스를 선언 / 이걸로 객체를 만든다 = 익명객체/
		// 클래스의 이름은 없지만 이걸 구현해서 객체를 만들겠다
		// 익명구현 클래스
		Thread thread3 = new Thread(new Runnable() {

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
		});

	}
}

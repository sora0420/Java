package ch12.exam02;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ������ ����");
		// ��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		Thread thread1 = new NetworkTask();
		thread1.start();
		// ���� �۾��� �ϴ� ������ ������ ����
		Thread thread2 = new MusicTask();
		thread2.start();
		//runnable�� ��밡���� ��ü�� thread
		Thread thread3 = new Thread() {
		//�͸� �ڽ�
			@Override
			public void run() {
				while (true) {
					System.out.println("ä�� �۾��� �մϴ�.");
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

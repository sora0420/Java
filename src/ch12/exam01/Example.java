package ch12.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ������ ����");
		// ��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		Thread thread1 = new Thread(new NetworkTask()); // runnable�� ��밡���� ��ü = ������
		thread1.start();
		// ���� �۾��� �ϴ� ������ ������ ����
		Thread thread2 = new Thread(new MusicTask());
		thread2.start();
		//runnable�� ��밡���� ��ü�� thread
		
		//ä�� �۾��� �ϴ� ������ ������ ����
		// ä�� �۾��� �ϴ� ������ ������ ����
		// ���ʺ��̶�� �������̽��� ������ Ŭ������ ���� / �̰ɷ� ��ü�� ����� = �͸�ü/
		// Ŭ������ �̸��� ������ �̰� �����ؼ� ��ü�� ����ڴ�
		// �͸��� Ŭ����
		Thread thread3 = new Thread(new Runnable() {

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
		});

	}
}

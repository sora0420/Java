package ch08.exam01;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("Audio 볼륨을 "+volume+"로 조정합니다.");
	}
	
}

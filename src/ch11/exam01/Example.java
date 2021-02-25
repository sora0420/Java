package ch11.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("winter", "늦겨울");
		Member m2 = new Member("winter", "늦겨울");

		System.out.println(m1 == m2); //주소 비교
		System.out.println(m1.equals(m2)); //주소비교지만 Member에서 동등비교로

		
	}

}

package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int result1 = Singleton.method1(); String result2 = Singleton.method2();
		 * int[] result3 = Singleton.method3();
		 */
		
		//생성자를 이용해서 객체 얻기
		//Singleton result1 = new Singleton(); /x
		
		//>>Factory Method이용해서 객체 얻기
		//메소드로 호출해서 return값으로 객체 생성 가능
		//하나만 생성해서 공유해서 쓸 때 singleton
		//똑같은 객체를 return해주는게 singleton
		Singleton result2 = Singleton.getInstance();		
		Singleton result3 = Singleton.getInstance();
		if(result2 == result3) {
			System.out.println("같은 객체를 참조");
		}else {
			System.out.println("다른 객체를 참조");
		}
	}

}

package ch11.exam02;

import java.util.Date;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object var1 = new Object();
		System.out.println(var1.toString());

		Date var2 = new Date();
		System.out.println(var2.toString());

		String var3 = "abc";
		System.out.println(var3.toString());

		Member var4 = new Member("winter", "늦겨울");
		System.out.println(var4.toString());
		System.out.println(var4);

		String result = var4 + "=> spring : 봄돌이";//객체에 +를 하면 toString이 호출되어 리턴값과 결합함
		System.out.println(result);	

	}

}

package ch11.exam07;

public class Example2 {

	public static void main(String[] args) {

		int var1 = Integer.parseInt("3");
		double var3 = Double.parseDouble("3.5");
		
		Integer var4 = new Integer(3);
		Integer var5 = new Integer("3"); //문자열로 넣어도 숫자로 됨
		Integer var6 = 3; //요새는 이렇게 씀 / 위에는 안씀
		System.out.println(var4);
		System.out.println(var5);
		
		

	}

}

package ch02;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int 타입 이하의 피연산자의 연산은 결과가 int
		byte var1 = 10;
		byte var2 = 20;
		int var3 = var1 + var2; // byte가 아닌 int가 나옴
		// byte var4 =(byte)(var1+var2);

		// int타입보다 큰 타입이 연산이 되면 큰 타입으로 결과가 나온다.
		int var4 = 10;
		int var5 = 20;
		int var6 = var4 + var5;

		int var7 = 10;
		double var8 = 1.5;
		double var9 = var7 + var8;
	}

}

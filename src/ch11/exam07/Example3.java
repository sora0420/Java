package ch11.exam07;

public class Example3 {

	public static void main(String[] args) {
		/*1번
		 * Integer var1 = new Integer(500); 
		 * Integer var2 = new Integer(500);
		 */
		
		//2번
		/*
		 * Integer var1 = 500; 
		 * Integer var2 = 500;
		 */
		
		//3번
		Integer var1 = 10; //~128 ~ 127까지의 범위는 AutoBoxing된 객체를 공유함
		Integer var2 = 10; //위의 범위를 벗어나면 다른 객체 생성
		
		System.out.println(var1 == var2); //1,2번 false 번지비교 / 값의 범위에 따라서 다른 값
		System.out.println(var1.equals(var2)); //true //warpper 클래스는 이거씀
	}

}

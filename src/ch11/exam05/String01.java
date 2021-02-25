package ch11.exam05;

import java.util.Arrays;

public class String01 {

	public static void main(String[] args) throws Exception {//jvm이 main을 실행하는데 예외처리 따로 안함/ 예외처리를 안한것과 같음
		//a.java a.class    실행
		//    javac    java
		// TODO Auto-generated method stub
		byte[] arr1 = { 65, 66, 67 };
		String str1 = new String(arr1);
		System.out.println(str1);

		String str2 = "ABC";
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2));// Arrays.toString = 항목 조사후 하나의 문자열로 돌려줌

		String str3 = "가나다";
		byte[] arr31 = str3.getBytes("EUC-KR");
		byte[] arr32 = str3.getBytes("UTF-8");
		System.out.println(Arrays.toString(arr31));
		System.out.println(Arrays.toString(arr32));
		
		String str4 = new String(arr31, "EUC-KR");
		String str5 = new String(arr32, "UTF-8");
		System.out.println(str4);
		System.out.println(str5);
		
	}

}

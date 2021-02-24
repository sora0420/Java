package ch10.exam01;

import java.io.FileInputStream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = null;
		//NullPointerException >>실행예외 (실행할 때 발생할 수 있음 / 컴파일러가 체크하지 않음)
		arr[0] = 10; 
		
	
		//FileNotFoundException >> 컴파일 체크 예외
		//FileInputStream fi = new FileInputStream("C:\temp\file.txt"); 
	}

}

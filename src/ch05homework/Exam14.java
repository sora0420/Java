package ch05homework;

public class Exam14 {

	public static void main(String[] args) {
		//Q1 4
		//Q2 3
		//Q3 2
		//Q4 2
		//Q5 3
		//Q6 3 / 5
		//Q7
		int max =0;
		int[] array = {1,5,3,8,2};
		for(int i=0;i<array.length;i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max : "+max);
		
		
	}
}
package ch04homework;

public class Exam21 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Q4
		int num1 = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1;
		
		while(true) {
			System.out.println("("+num1+","+num2+")");
			if(num1+num2 ==5) {
				break;
			}else {
				num1 = (int)(Math.random()*6)+1;
				num2 = (int)(Math.random()*6)+1;
			}
		}
		
	}
}
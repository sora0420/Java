package ch06.exam12;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ùٸ� ��� ���
		System.out.println(Calculator.pi);
		Calculator.plus(10, 20);
		
		//�߸��� ��� ���
		Calculator myCalc = new Calculator();		
		System.out.println(myCalc.pi); //x ����� ���ǥ��
		
		myCalc.plus(10, 20); //x
		
	}

}

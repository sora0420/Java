package ch02;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ڿ� -> ����(����, �Ǽ�)
		//���ڿ��� String Ÿ�� ������ ����
		String var1 = "10";
		System.out.println("var1 : "+var1);
		
		//���ڿ��� ���ڸ� +�����ϸ� ���ڿ� ����
		String var2= var1+5;
		System.out.println("var2 : "+var2);
		
		//���ڿ��� ������ �����ؼ� ����
		int var3 = Integer.parseInt(var1)+5;
		System.out.println("var3 : "+var3);
		
		//���ڿ��� �Ǽ��� �����ؼ� ����
		String var4 = "10.5";
		double var5 = Double.parseDouble(var4)+2.3;
		System.out.println("var5 : "+var5);
		
		//���� -> ���ڿ��� ��ȯ
		int var6 = 3;
		//���1
		String var7 = "" + var6;
		//���2
		String var8 = String.valueOf(var6);
		System.out.println("var8 : "+var8+"0");
		
	}

}

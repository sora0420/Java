package ch11.exam05;

import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "123456-1234567";
		char sex = ssn.charAt(7);
		if (sex == '1' || sex == '3') {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		
		//���ڿ� ���� : ���1
		String first = ssn.substring(0,6);
		System.out.println(first);
		String second = ssn.substring(7);
		System.out.println(second);
		
		//���ڿ� ���� : ���2
		String[] parts = ssn.split("-");
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		
		//���ڿ� �и��ϱ� : ���3 //��ü �� ����ϰ� ���� ������ / ������ �˾ƾ���
		StringTokenizer st = new StringTokenizer(ssn, "-");
		first = st.nextToken();
		second = st.nextToken();
		System.out.println("StringTokenizer : " + first);
		System.out.println(second);
		while(st.hasMoreElements()) { //�����ð� �ִ��� Ȯ�� // ������ false�� ��
			String token = st.nextToken();
		}
		
		//���ڿ� ���� ���� : ���1
		String content = "�̰��� �ڹ� å�Դϴ�.";
		boolean result = content.contains("�ڹ�");
		System.out.println(result);
		
		//���ڿ� ���� ���� : ���2
		int index = content.indexOf("�ڹ�");
		System.out.println(index);	
		
		if(index == -1) {
			System.out.println("�ڹ� ���� å�� �ƴϱ���.");
		}else {
			System.out.println("�ڹ� ���� å�̱���.");
		}
		index = content.indexOf("ȫ�浿");
		System.out.println(index);
		
		//���ڿ��� ����
		int length = content.length();
		System.out.println(length);
		
		//��ġ�ϱ�
		String content2 = content.replace("�ڹ�", "Java");
		//���ڿ��� �Һ��̰�, �ٲ� ���ڿ��� �����ϴ� ����
		System.out.println(content2);
	}

}

package ch06.exam07;

public class BoardService {
	//Field
	int count ;
	
	//Constructor
	
	//Method
	int getNewBno() {
		return ++count;
	}
	void save(String title, String content) {
		int bno = getNewBno();
		System.out.println(bno+"�� �����մϴ�.");		
		System.out.println(title+"�� �����մϴ�.");
		System.out.println(content+"�� �����մϴ�.");		
	}
	
	int getSum(int[] values) {
		int result =0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
	
	//[]�� ...�� ���� ȣ���Ҷ� ��������
	//�������� �Ű�����
	int getSum2(int ... values) {
		int result =0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
	
}

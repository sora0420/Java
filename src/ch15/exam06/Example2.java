package ch15.exam06;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<>();
		map.put("s1", "�ڱ��");
		map.put("s3", "ȫ�浿");
		map.put("s4", "���ڹ�");
		map.put("s2", "������");
		map.put("s5", "�����̳�");
		
		Set<String> keys = map.keySet(); //Ű����
		for(String key : keys) {
			System.out.println(key +" : "+map.get(key));
		}
		
		System.out.println();
		keys = map.descendingKeySet(); //�������� Ű����
		for(String key : keys) {
			System.out.println(key +" : "+map.get(key));
		}
		
		System.out.println();
		Map<String, String> smap = map.subMap("s3", true, "s5", true); //from s3 to s5���� �Ѵ� ����
		keys = smap.keySet();
		for(String key : keys) {
			System.out.println(key +" : "+map.get(key));
		}
		

	}

}

package ch11.exam05;

import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "123456-1234567";
		char sex = ssn.charAt(7);
		if (sex == '1' || sex == '3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		//문자열 추출 : 방법1
		String first = ssn.substring(0,6);
		System.out.println(first);
		String second = ssn.substring(7);
		System.out.println(second);
		
		//문자열 추출 : 방법2
		String[] parts = ssn.split("-");
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		
		//문자열 분리하기 : 방법3 //전체 다 출력하고 나면 오류남 / 갯수를 알아야함
		StringTokenizer st = new StringTokenizer(ssn, "-");
		first = st.nextToken();
		second = st.nextToken();
		System.out.println("StringTokenizer : " + first);
		System.out.println(second);
		while(st.hasMoreElements()) { //가져올게 있는지 확인 // 없으면 false가 됨
			String token = st.nextToken();
		}
		
		//문자열 포함 여부 : 방법1
		String content = "이것은 자바 책입니다.";
		boolean result = content.contains("자바");
		System.out.println(result);
		
		//문자열 포함 여부 : 방법2
		int index = content.indexOf("자바");
		System.out.println(index);	
		
		if(index == -1) {
			System.out.println("자바 관련 책이 아니군요.");
		}else {
			System.out.println("자바 관련 책이군요.");
		}
		index = content.indexOf("홍길동");
		System.out.println(index);
		
		//문자열의 길이
		int length = content.length();
		System.out.println(length);
		
		//대치하기
		String content2 = content.replace("자바", "Java");
		//문자열은 불변이고, 바뀐 문자열을 리턴하는 것임
		System.out.println(content2);
	}

}

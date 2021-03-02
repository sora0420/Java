package ch15.exam06;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<>();
		set.add("홍길동");
		set.add("감자바");
		set.add("방돌이");		
		set.add("박길순");
		
		for(String item : set) {
			System.out.println(item); //오름차순 정렬
		}
		
		NavigableSet<String> nset = set.descendingSet();
		for(String item : nset) {
			System.out.println(item); //내름차순 정렬
		}
		
		System.out.println();
		NavigableSet<String> sset = set.subSet("가", false, "방돌이", false); //subset 가부터 가포함x 방돌이까지 방돌이 포함x
		for(String item : sset) {
			System.out.println(item); 
		}
	}

}

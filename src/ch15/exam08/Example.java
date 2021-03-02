package ch15.exam08;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		TreeSet<Product> set = new TreeSet<>(new Comparator<Product>() { //제네릭 있어서 추가
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price < o2.price) {
					return -1;
				}else if(o1.price == o2.price) {
					return 0;
				}else {
					return 1;
				}
			} //비교기능이 없어서 comparator를 제공함
		}); //익명구현객체 / 클래스라면 이걸 상속해서 자식을 이렇게 만들어거 자식을 객체로 만듦
		//Comparator는 인터페이스 / 안에있는거 재정의
		
		set.add(new Product("TV", 10000));
		set.add(new Product("Audio", 5000));
		set.add(new Product("Car", 12000));
		
		for(Product p : set) {
			System.out.println(p.name+", "+p.price);
		}
		System.out.println();
		
		TreeMap<Product, String> map = new TreeMap<>(new Comparator<Product>() { //제네릭 있어서 추가 / key로 값 비교
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price < o2.price) {
					return -1;
				}else if(o1.price == o2.price) {
					return 0;
				}else {
					return 1;
				}
			} //비교기능이 없어서 comparator를 제공함
		});
		
		map.put(new Product("TV", 10000), "LG");
		map.put(new Product("Audio", 5000), "Samsung");
		map.put(new Product("Car", 12000), "Hyundai");
		
		Set<Product> pset = map.keySet();
		for(Product p : pset) {
			System.out.println(p.name+", "+p.price+", "+map.get(p));
		}
	}

}

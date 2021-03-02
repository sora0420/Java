package ch15.exam07;

public class Person implements Comparable { //example보면 비교할수 없으니 비교할 수 있게 // 없으면 비교할게 없어서 에러남
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Person temp = (Person) o;
		if(age < temp.age) {
			return -1;
		}else if(age == temp.age) {
			return 0; //같다면 0 리턴
		}else {
			return 1;
		}
	}
}

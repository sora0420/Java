package ch15.exam09;

import java.util.Stack;

public class Example {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("홍길서");
		stack.push("홍길남");
		
		for(String name : stack) { //stack이니까 LIFO // pop써야함
			System.out.println(name);
		}
		System.out.println(); 
		while(!stack.empty()) { //LIFO
			System.out.println(stack.pop());
		}
	}

}

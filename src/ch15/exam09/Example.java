package ch15.exam09;

import java.util.Stack;

public class Example {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("ȫ�浿");
		stack.push("ȫ�漭");
		stack.push("ȫ�泲");
		
		for(String name : stack) { //stack�̴ϱ� LIFO // pop�����
			System.out.println(name);
		}
		System.out.println(); 
		while(!stack.empty()) { //LIFO
			System.out.println(stack.pop());
		}
	}

}

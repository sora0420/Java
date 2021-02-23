package ch06homework.exam25.pack2;

import ch06homework.exam25.pack1.A;
import ch06homework.exam25.pack1.B;

public class C {
	public C() {
	A a = new A();
	a.field1 = 1;
	//a.field2 = 1; /default 접근불가
	//a.field3 = 1; / private 접근불가
	
	a.method1();
	//a.method2(); /default 접근불가
	//a.method3(); / private 접근불가
	}
}

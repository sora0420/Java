package ch06homework.exam25.pack2;

import ch06homework.exam25.pack1.A;
import ch06homework.exam25.pack1.B;

public class C {
	public C() {
	A a = new A();
	a.field1 = 1;
	//a.field2 = 1; /default ���ٺҰ�
	//a.field3 = 1; / private ���ٺҰ�
	
	a.method1();
	//a.method2(); /default ���ٺҰ�
	//a.method3(); / private ���ٺҰ�
	}
}

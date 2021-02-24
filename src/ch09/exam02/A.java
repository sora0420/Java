package ch09.exam02;

public class A {
	public class B{
		public int field;
		public B() {}
		public void method() {}
	}
	
	public static class C{
		public int field;
		public C() {}
		public void method() {}
	}
	
	public void method() {
		class D{ //메소드 안의 클래스는 안에서만 사용가능
			public int field;
			public D() {}
			public void method() {}
		}
		
		D d = new D();
		d.field=1;
		d.method();
	}
}

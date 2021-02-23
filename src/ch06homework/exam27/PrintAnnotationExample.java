package ch06homework.exam27;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Method[] declaredMethods = Service.class.getdeclaredMethods();
		for(Method method : declaedMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			}
			System.out.println("["+method.getName()+"]");
			for(int i=0; i<PrintAnnotation.number(); i++) {
				System.out.println(PrintAnnotation.value());
			}
			System.out.println();
			
			try {
				method.invoke(new Service());
			}catch(Exception e) {
				System.out.println();
			}
		}*/
	}

}

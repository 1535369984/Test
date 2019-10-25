package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SayHello {
	// 普通的方法
	public void SayHiDefault(String name) {
		System.out.println("Hi, " + name);
	}

	// 使用注解并传入参数的方法
	@SayHi(paramValue = "wang")
	public void SayHiAnnotation(String name) {
		System.out.println("Hi, " + name);
	}

	// 使用注解并使用默认参数的方法
	@SayHi
	public void SayHiAnnotationDefault(String name) {
		System.out.println("Hi, " + name);
	}

	
}

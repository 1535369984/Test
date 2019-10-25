package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



public class DynamicSubject implements InvocationHandler {

	private Object object;
	
	public DynamicSubject(Object object) {
		super();
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Method:" + method + ",args:" + args);
		method.invoke(object, args);
		return null;
	}
	public static void main(String[] args) {
		RealSubject r = new RealSubject();
		InvocationHandler handler = new DynamicSubject(r);
		Class<?> classType = handler.getClass();
		MySubject my = (MySubject)Proxy.newProxyInstance(classType.getClassLoader(),
				r.getClass().getInterfaces(), 
				handler);
		my.request();
				
	}
}

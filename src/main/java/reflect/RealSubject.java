package reflect;

public class RealSubject implements MySubject{

	@Override
	public void request() {
		System.err.println("我是真的");
		
	}

}

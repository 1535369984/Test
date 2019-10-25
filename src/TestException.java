
public class TestException  extends Throwable{

	@Override
	public StackTraceElement[] getStackTrace() {
		System.err.println("design own Exception");
		return super.getStackTrace();
	}
	
}

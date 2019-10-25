import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class Singleton implements Serializable{
	private static Singleton single = null;

	public static final Singleton getInstance() {
		if (single == null) {
			single = new Singleton();
		}
		return Singleton.single;
	}
	public static void main(String[] args) throws Exception, SecurityException {
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		System.err.println(s.hashCode() + ":" + s1.hashCode());
//		Class<?> a = Singleton.class;
//		Constructor<?> b= a.getDeclaredConstructor(null);
//		b.setAccessible(true);
//		Singleton c = (Singleton)b.newInstance(null);
//		Singleton d = (Singleton)b.newInstance(null);
//		Singleton c = Singleton.getInstance();
//		Singleton d = Singleton.getInstance();
//		System.err.println(c==d);
		
//		// 序列化和反序列化(单例模式)
//		Singleton s1 = Singleton.getInstance();
//		File file = new File("F:/singleton.txt");
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(file));
//		o.writeObject(s1);
//		o.flush();
//		o.close();
//		System.err.println(s1.hashCode());
//		
//		ObjectInputStream i = new ObjectInputStream(new FileInputStream(file));
//		Singleton s2 = (Singleton)i.readObject();
//		i.close();
//		System.err.println(s2.hashCode());
		
	}
}

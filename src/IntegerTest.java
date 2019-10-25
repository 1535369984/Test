import java.lang.reflect.Field;

/**
 * @Description :
 * Created by WL on 2018/12/10
 */
public class IntegerTest {
    public static void main(String[] args) throws Exception {
//        Integer a = 10;
//        change(a);
//        System.err.println(a);
        int a = 1;
        int b = a + a;
        System.err.println(b);
        System.err.println(Integer.valueOf(b));
    }

    private static void change(Integer a) throws NoSuchFieldException, IllegalAccessException {
      Field field = a.getClass().getDeclaredField("value");
      field.setAccessible(true);
      field.setInt(a, 20);
    }
}

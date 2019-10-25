/**
 * @Description :
 * Created by WL on 2019/4/15
 */
public class JavaPTest {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        System.err.println(i);
        i = ++i;
        System.err.println(i);
        int z = ++i * i++ + i++;
        System.err.println(i);
        System.err.println(z);
        i = 2;
        int y = i++ + ++i * i++;
        System.err.println(i);
        System.err.println(y);

        i = 2;
        int x = i++ + ++i + i++ + ++i * i++;
        System.err.println(i);
        System.err.println(x);
    }
}

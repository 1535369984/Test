import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @Description :
 * Created by WL on 2018/7/31
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("CSDN_SEU_Cavin");
        Class c = a.getClass();
        try{
            Method method = c.getMethod("add",Object.class);
            method.invoke(a,100);
            System.out.println(a);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

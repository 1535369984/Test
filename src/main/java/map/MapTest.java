package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Description :
 * Created by WL on 2018/1/19
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        User a = new User("a");
        User b = new User("b");
        map.put(a, 1);
        map.put(b, 1);
//        map.put(a, 2);
        Set<Map.Entry<Object, Object>> s = map.entrySet();
        Iterator<Map.Entry<Object, Object>> i = s.iterator();
        while (i.hasNext()) {
            Map.Entry<Object, Object> me = i.next();
            System.err.println(me.getKey() + ":" + me.getValue() + "====");
        }
    }
}

class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

//    @Override
//    public int hashCode() {
//        return 97;
//    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            return this.name.equals(((User) obj).name);
        }
       return false;
    }
}
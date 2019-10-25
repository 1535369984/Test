package enumLearn;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.Arrays;

/**
 * @Description :
 * Created by WL on 2018/9/12
 */
public enum ColorEnum {
    RED, BLACK, GREEN, ONE
}

class Ta {
    public static void main(String[] args) {
        System.err.println(ColorEnum.ONE.name().equals("ONE"));
        Arrays.asList(ColorEnum.values()).stream().forEach(e -> System.err.println(e.name().equals(e.toString())));
    }
}
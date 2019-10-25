package annotationTest;

import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.AnnotationUtils;

/**
 * @Description :
 * Created by WL on 2019/10/25
 */
@MyAnnotation(value = "value", alias = "value")
public class AliasForTest {
    public static void main(String[] args) {
//        MyAnnotation ann = AliasForTest.class.getAnnotation(MyAnnotation.class);
        MyAnnotation ann = AnnotationUtils.findAnnotation(AliasForTest.class, MyAnnotation.class);
        System.out.println(ann.value());
        System.out.println(ann.alias());
        System.out.println(ann.excludeName());
    }
}

package annotationTest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description :
 * Created by WL on 2019/10/25
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Demo
public @interface MyAnnotation {
    @AliasFor("alias")
    String value() default "";

    @AliasFor("value")
    String alias() default "";

    @AliasFor(annotation = Demo.class, value = "excludeName")
    String[] excludeName() default {};
}

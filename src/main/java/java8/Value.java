package java8;

/**
 * @Description :
 * Created by WL on 2018/8/2
 */
public class Value<T> {
    public static <T> T defaultValue() {
        return null;
    }

    public T getOrDefault(T value, T defaultValue) {
        return (value != null) ? value : defaultValue;
    }

    public static void main(String[] args) {
        Value<String> value = new Value<>();
        value.getOrDefault("test", Value.defaultValue());
    }
}

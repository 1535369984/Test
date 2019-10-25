package java8.MethodQuote;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Description :
 * Created by WL on 2018/7/30
 */
public final class Car {
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString() + ":" + another.hashCode());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }

    public static void main(String[] args) {
        Car car1 = Car.create(() -> new Car());
        Car car2 = Car.create(Car::new);

        System.err.println(car2.toString());
        List<Car> cars = Arrays.asList(car1);
        // 这是一样的
        cars.parallelStream().forEach(Car::collide);
        cars.parallelStream().forEach(e -> Car.collide(e));
        // 这是一样的
        cars.forEach(Car::repair);
        cars.forEach(e -> e.repair());
        // 这是一样的
        cars.forEach(car2::follow);
        cars.forEach(e -> e.follow(car2));
    }
}

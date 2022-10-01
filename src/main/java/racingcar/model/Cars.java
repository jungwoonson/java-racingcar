package racingcar.model;

import racingcar.model.nickname.Nickname;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars of(List<String> names) {
        return new Cars(initCars(names));
    }

    private static List<Car> initCars(List<String> names) {
        return names.stream()
                .map(name -> new Car(new Nickname(name)))
                .collect(Collectors.toList());
    }

    public List<Car> move() {
        cars.forEach(car -> car.move(new CarCondition()));
        return List.copyOf(cars);
    }

    public List<Car> getWinners() {
        return List.copyOf(Car.getWinner(cars));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}

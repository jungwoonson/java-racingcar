package racingcar.domain;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(final List<Car> cars) {
        this.cars = cars;
    }

    public static Cars of(final List<String> names) {
        return new Cars(names.stream()
                .map(Car::new)
                .collect(Collectors.toList()));
    }

    public List<Car> move(Condition condition) {
        cars.forEach(car -> car.move(condition));
        return List.copyOf(cars);
    }

    public Winners findWinners() {
        Car maxPositionCar = cars.stream()
                .max(Car::compareTo)
                .orElseThrow(() -> new IllegalStateException("경기에 출전한 자동차가 없습니다."));
        List<Car> maxPositionCars = cars.stream()
                .filter(car -> car.isSamePosition(maxPositionCar))
                .collect(Collectors.toList());
        return new Winners(maxPositionCars);
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

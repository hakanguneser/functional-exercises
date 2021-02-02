package lectures;


import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import beans.Person;
import beans.PersonDTO;
import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.junit.Test;

public class Lecture5 {

    @Test
    public void understandingFilter() throws Exception {
        final String vw = "Volkswagen";
        MockData.getCars().stream()
                .filter(car -> car.getMake().equals(vw))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    @Test
    public void ourFirstMapping() throws Exception {
        // transform from one data type to another
        MockData.getPeople().stream()
                .map(PersonDTO::map)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    @Test
    public void averageCarPrice() throws Exception {
        // calculate average of car prices
        ImmutableList<Car> cars = MockData.getCars();
        Double d = cars.stream()
                .mapToDouble(Car::getPrice)
                .average().getAsDouble();
        System.out.println(d);
    }

    @Test
    public void test() throws Exception {

    }
}




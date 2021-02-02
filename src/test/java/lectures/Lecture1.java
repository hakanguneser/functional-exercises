package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Person;

import com.google.common.collect.ImmutableList;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;


public class Lecture1 {

    @Test
    public void imperativeApproach() throws IOException {
        List<Person> people = MockData.getPeople();
        int count = 1;
        for (Person personality : people) {
            if (personality.getAge() <= 18) {
                System.out.println(personality.toString());
                count++;
            }
            if (count == 11) {
                break;
            }
        }
    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        MockData.getPeople().stream()
                .filter(person -> person.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

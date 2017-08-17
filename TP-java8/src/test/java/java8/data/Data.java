package java8.data;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Data {

    public static List<Person> buildPersonList(int nb) {
        return IntStream.rangeClosed(1,nb)
                .mapToObj(i -> new Person("first_" + i, "last_" + i, i, i % 9 == 0 ? "test": "password"+i))
                .collect(Collectors.toList());
    }
}

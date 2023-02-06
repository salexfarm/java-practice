package test.java.java8;
import org.junit.Test;

import java.util.stream.Stream;

public class StreamUtils {

    @Test
    public void mapStream() {
        String animal = Stream.of("cat")
                .map(d -> "dog")
                .map(r -> "rabbit")
                .map(p -> "pig")
                .reduce("", String::concat);

        System.out.println("I constantClass " + animal);
    }
}

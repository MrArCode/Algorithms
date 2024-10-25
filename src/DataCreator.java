import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DataCreator {

    public static List<Integer> createArrayOfIntegers(int size){
        Random rand = new Random();
        return IntStream.range(0, size)
                .mapToObj(_ -> rand.nextInt(100000))
                .collect(Collectors.toList());
    }
}

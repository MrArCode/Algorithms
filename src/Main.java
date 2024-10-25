import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = DataCreator.createArrayOfIntegers(10);
        System.out.println(arr);

        InsertionSort.sort(arr);
        System.out.println(arr);



    }
}

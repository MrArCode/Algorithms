import java.util.List;

public class InsertionSort {
    public static List<Integer> sort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int notSortedValue = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > notSortedValue) {
                list.set(j + 1, list.get(j));
                j--;
            }

            list.set(j + 1, notSortedValue);
        }
        return list;
    }
}

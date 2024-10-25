import java.util.List;

public class Binsearch {

    public static int search(List<Integer> list, int value) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid).equals(value)) {
                return mid;
            } else if (list.get(mid) < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

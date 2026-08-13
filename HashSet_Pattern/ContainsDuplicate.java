package HashSet_Pattern;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (!set.add(num)) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1};

        System.out.println(containsDuplicate(arr));

    }
}

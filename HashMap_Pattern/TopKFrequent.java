import java.util.*;

public class TopKFrequent {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency Count
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {

            int maxKey = -1;
            int maxFreq = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

                if (entry.getValue() > maxFreq) {

                    maxFreq = entry.getValue();
                    maxKey = entry.getKey();

                }
            }

            result[i] = maxKey;

            map.remove(maxKey);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
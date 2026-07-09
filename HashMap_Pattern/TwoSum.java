import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        int arr[] = {10, 4, 5, 2, 6};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int com = target - arr[i];

            if (map.containsKey(com)) {
                System.out.println("[" + map.get(com) + ", " + i + "]");
                break;
            }

            map.put(arr[i], i);
        }
    }
}
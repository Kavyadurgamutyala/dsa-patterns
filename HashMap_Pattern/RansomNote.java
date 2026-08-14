import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {

        String ransomNote = "aa";
        String magazine = "aab";

        HashMap<Character, Integer> map = new HashMap<>();

        // Build frequency map for magazine
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Check ransom note characters
        for (char c : ransomNote.toCharArray()) {

            if (!map.containsKey(c) || map.get(c) == 0) {
                System.out.println("Not Ransom Note");
                return;
            }

            map.put(c, map.get(c) - 1);
        }

        System.out.println("Ransom Note");
    }
}
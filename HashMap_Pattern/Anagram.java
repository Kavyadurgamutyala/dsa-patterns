import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if (map1.equals(map2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
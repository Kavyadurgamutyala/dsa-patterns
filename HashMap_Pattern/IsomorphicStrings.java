import java.util.HashMap;
public class IsomorphicStrings {
public static boolean isIsomorphic(String s, String t) {
HashMap<Character, Character> map = new HashMap<>();
for (int i = 0; i < s.length(); i++) {
char ch1 = s.charAt(i);
char ch2 = t.charAt(i);
if (map.containsKey(ch1)) {
if (map.get(ch1) != ch2) {
return false;
}
} else {
if (map.containsValue(ch2)) {
return false;
}
map.put(ch1, ch2);
}
}
return true;
}
public static void main(String[] args) {
String s = "egg";
String t = "add";
System.out.println(isIsomorphic(s, t));
}
}
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class TwoStrings {
    public static void main(String[] args) {
        System.out.println(twoStrings("hello", "world"));
    }
    static String twoStrings(String s1, String s2) {
        Set<Character> chars = new HashSet<>();

        for(int i=0; i < s1.length(); i++){
            chars.add(s1.charAt(i));
        }

        for(int i=0; i < s2.length(); i++){
            if(chars.contains(s2.charAt(i))){
                return "YES";
            }
        }
        return "NO";
    }
}

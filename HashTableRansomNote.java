import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class HashTableRansomNote {
    public static void main(String[] args) {
        String s1 = "give me one grand today night";
        String s2 = "give one grand today";
        checkMagazine(s1.split(" "), s2.split(" "));
    }
    static void checkMagazine(String[] magazine, String[] note) {
        List<String> magazineWords = Arrays.stream(magazine).collect(Collectors.toList());
        boolean notRemovedWord = Arrays.stream(note).anyMatch(word->!magazineWords.remove(word));
        System.out.println(notRemovedWord ? "No" : "Yes");
    }
}

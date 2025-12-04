package CollectionFrameWork.Set.HashSet.Questions;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;

public class UniqueCharString {
    public static void main(String[] args) {
        String Word = "Programming";

        char[] words = Word.toCharArray();
        HashSet<Character> str  = new HashSet<>();
        for (int i = 0; i < Word.length() ; i++) {
            str.add(Word.charAt(i));
        }
        System.out.println(str);

    }
}

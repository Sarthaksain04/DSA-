package CollectionFrameWork.Set.HashSet.Questions;

import java.util.HashSet;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String word = "mammal";
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> Dupli = new HashSet<>();

        for(Character x : word.toCharArray()){
            if (!set.add(x)){
                Dupli.add(x);

            }
        }
        System.out.println(Dupli);
    }
}

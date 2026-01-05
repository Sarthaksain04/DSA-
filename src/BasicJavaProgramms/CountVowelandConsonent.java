package BasicJavaProgramms;

public class CountVowelandConsonent {
    public static void main(String[] args) {
        String str = "Automation";
        int vowels = 0 ;
        int Consonents = 0 ;
        for (char c : str.toCharArray()) {
            if("aeiouAEIOU".indexOf(c) !=-1){
                vowels++;
            } else if (Character.isLetter(c)) {
                Consonents++;

            }

        }
        System.out.println(vowels);
        System.out.println(Consonents);
    }
 }

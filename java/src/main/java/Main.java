import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(countVowels("Celebration"));

        System.out.println(countVowels("Palm"));

        System.out.println(countVowels("Prediction"));
    }

    public static int countVowels(String word) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;
        for(char c : word.toCharArray()) {
            c = Character.toLowerCase(c);
            if(vowels.contains(c)) {
                count++;
            }
        }
        return count;
    }
}

import java.util.*;

public class SeparateConstantsAndVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  word: ");
        String word = input.nextLine().toLowerCase();
        Set<Character> constants = new HashSet<>();
        Set<Character> vowels = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.add(ch);
            } else if (Character.isLetter(ch)) {
                constants.add(ch);
            }
        }
        System.out.println("Constants in the given word are : " + constants);
        System.out.println("Vowels in the given word are : " + vowels);
    }
}

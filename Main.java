package HMWRK3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiFunction;

public class Main {
    private static final String words =
            "Lie upon the lie " +
                    "upon the lie " +
                    "upon the lie " +
                    "upon the lie " +
                    "And it all comes down to this " +
                    "That a pig is a pig is a pig is a pig";

    private static TreeSet<String> getWords(String[] arr) {
        return new TreeSet<>(Arrays.asList(arr));
    }

    private static HashMap<String, Integer> getWordsCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.merge(s, 1, Integer::sum);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getWords(words.toLowerCase().split(" ")));
        System.out.println(getWordsCount(words.toLowerCase().split(" ")));

        Phonebook phonebook = new Phonebook();
        phonebook.add("Zaicev", "Zaicev-phone-1");
        phonebook.add("Ivanov", "Ivanov-phone-1");
        phonebook.add("Ivanov", "89996669999");
        phonebook.add("Ivanov", "Ivanov3");
        phonebook.add("Ivanov", "Ivanov4");
        phonebook.add("Zaicev", "Zaicev-phone-2");
        phonebook.add("Zaicev", "Zaicev-phone-3");
        phonebook.add("Zaicev", "Zaicev-phone-4");
        phonebook.add("Zaicev", "Zaicev-phone-5");
        phonebook.add("XXXX", "XXX-XX-XX");


        System.out.println("phone Zaicev: " + phonebook.get("Ivanov"));
        System.out.println("phone Ivanov: " + phonebook.get("Petrov"));
        System.out.println("phone XXX: " + phonebook.get("XXXX"));
    }
}

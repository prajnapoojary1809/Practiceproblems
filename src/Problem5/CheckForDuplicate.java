package Problem5;

import java.util.HashMap;

public class CheckForDuplicate {
    public static void main(String[] args) {
        String string = "Momrrning";
        checkDuplicates(string);
    }
    public static void checkDuplicates(String string){

        HashMap<Character, Integer> charcount = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.toLowerCase().charAt(i);
//            System.out.println(c);

            if (charcount.containsKey(c)) {
                charcount.put(c, charcount.get(c) + 1);
            } else charcount.put(c, 1);

        }
        for (HashMap.Entry<Character, Integer> entry : charcount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Character: " + entry.getKey() + " - Count: " + entry.getValue());
            }
        }
    }
}
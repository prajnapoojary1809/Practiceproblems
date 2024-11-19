package Problem2;

public class Anagram {
    public static void main(String[] args) {
        String string = "compiler";
        String string1 = "picomrel";
        System.out.println("String and String1 are anagrams:" + checkForAnagram(string, string1));
    }

    public static boolean checkForAnagram(String string, String string1) {
        if (string.length() != string1.length()) {
            return false;
        }
        for (int i = 0; i <= string.length(); i++) {
            char c = string.charAt(i);
            int index = string1.indexOf(c);

            if (index == -1) {
                System.out.println("string and String1 are not anagrams" + string + string1);
//                string1 = string1.replaceFirst(String.valueOf(string1.charAt(index)), "");

            }else
                return true;
            }
            return string1.isEmpty();
        }
    }

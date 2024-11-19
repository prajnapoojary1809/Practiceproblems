package Problem2;

import java.util.Arrays;

public class AnagramUsingArraySort {
    public static void main(String[] args) {
        String string="Compiler";
        String string1="picomrel";
        System.out.println("string and String1 are anagrams:"+isAnagram(string,string1));
    }
    public static boolean isAnagram(String string,String string1){
        String sortString=checkByArraySort(string);
        String sortString1=checkByArraySort(string1);

        return sortString.equalsIgnoreCase(sortString1);
    }
    public static String checkByArraySort(String string){
        char[] stringarray=string.toLowerCase().toCharArray();
        Arrays.sort(stringarray);

        return String.valueOf(stringarray);
    }

}

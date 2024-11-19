package Problem3;

public class CheckforUniqueCharacter {
    public static void main(String[] args) {
//        String string = "yellow";
        System.out.println("Yellow has all unique characters: "+checkForUniqueString("yellow"));
    }

    public static boolean checkForUniqueString(String string) {
        for (int i = 0; i < string.length(); i++) {
            char c =string.charAt(i);
            if(string.indexOf(c)!=string.lastIndexOf(c))
                return false;
        }
        return true;
        }
    }

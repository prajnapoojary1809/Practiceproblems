package Problem4;

public class CheckForRotation {
    public static void main(String[] args) {
        String string1;
        String string2;
        System.out.println("String1 is rotational of string2: "+checkRotation("Wonderful","rfulWonde"));
    }
    public static boolean checkRotation(String string1,String string2){
        if(string1.length()!=string2.length()) {
            return false;
        }
        String string3=string1+string2;
        return string3.contains(string2);
    }
}

package Problem1;

public class ReverseUsingRecursive {

    public static String reverseRecursive(String string){
        if(string.length()==1){
            return string;
        }else{
            System.out.println(string.charAt(string.length()-1));
            System.out.println(string.substring(0,string.length()-1));
            return string.charAt(string.length()-1)+reverseRecursive(string.substring(0,string.length()-1));
        }
    }

    public static void main(String[] args) {
        System.out.println("Reversed string : " +reverseRecursive("Complier"));
    }
}

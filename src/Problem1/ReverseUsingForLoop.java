package Problem1;

public class ReverseUsingForLoop {
    public static void main(String[] args) {
        String string="Compiler";
        String reverse=" ";
        for(int i=string.length()-1;i>=0;i--){
            reverse=reverse + string.charAt(i);
        }
        System.out.println("Reversed String- "+ reverse);
    }
}

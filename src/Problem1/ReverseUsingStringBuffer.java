package Problem1;

public class ReverseUsingStringBuffer {
    public static void main(String[] args) {
        String string="Compiler";
        StringBuffer stringBuffer = new StringBuffer(string);
        System.out.println("Reversed String:"+stringBuffer.reverse());
    }
}
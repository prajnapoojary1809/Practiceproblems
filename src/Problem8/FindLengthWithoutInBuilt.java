package Problem8;

public class FindLengthWithoutInBuilt {
    public static void main(String[] args) {
        String string = "Find Length Of String";
        int length=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)!=' '){
            length++;
        }}
        System.out.println("Lenght of string is:"+length);
    }
}
package Problem7;

public class SubString {
    public static void main(String[] args) {
//        String string = "fsSD";
//        System.out.println("Substring : " +subString(string));
//    }
//
//    public static String subString(String string) {
//        for (int i = 0; i < string.length(); i++) {
//            for (int j = i + 1; j<= string.length(); j++){
//                string.substring(i,j);
//            }
//        } return null;
        String string="fsSD";
        for(int i=0;i<string.length();i++){
            for(int j=i+1;j<=string.length();j++){
                System.out.println(string.substring(i,j));
            }
        }
    }
}
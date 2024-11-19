package Problem6;

public class FindNonRepeat {
    public static void main(String[] args) {
        String string = "moremor";
        System.out.println("Non repeated Character:" + findRepeat(string));
    }

    public static Character findRepeat(String string) {
        char charArray[] = string.toCharArray();
        for(int i=0;i<string.length();i++) {
                System.out.println("lastIndex:" +string.lastIndexOf(charArray[i]));
                System.out.println("index :" +string.indexOf(charArray[i]));
            if(string.lastIndexOf(charArray[i])==string.indexOf(charArray[i])){
                return charArray[i];
            }
        }return null;

    }

}

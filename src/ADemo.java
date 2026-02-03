public class ADemo {

    private static int skipSpaces(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        return i;
    }



    public static void main(String[] args) {

        String str = " 4 2";
        int space =  skipSpaces(str);
        System.out.println(space);

    }
}

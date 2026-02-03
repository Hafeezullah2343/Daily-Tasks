public class PalindromNumber {

    public static boolean isPalindrome(int x) {

        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int half = 0;
        while (x > half) {
            int digit = x % 10;
            half = half * 10 + digit;
            x /= 10;
        }
        return x == half ||  x == half / 10;
    }

    public static void main(String[] args) {
        int num = 1221;
        System.out.println(isPalindrome(num));
    }
}

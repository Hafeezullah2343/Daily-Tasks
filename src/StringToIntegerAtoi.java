public class StringToIntegerAtoi {

    public static int myAtoi(String str) {
        int index = getSpace(str);
        int sign = getSign(str, index);

        if (index < str.length() && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
            index++;
        }

        int number = getNumber(str, index, sign);
        return number;
    }

    public static int getSpace(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        return i;
    }

    public static int getSign(String str, int index) {
        if (index < str.length()) {
            if (str.charAt(index) == '-') return -1;
            else if (str.charAt(index) == '+') return 1;
        }
        return 1;
    }

    public static int getNumber(String str, int index, int sign) {
        int result = 0;
        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            int digit = str.charAt(index) - '0';

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        String str = " -218";
        System.out.println(myAtoi(str)); // Output: -218
    }
}

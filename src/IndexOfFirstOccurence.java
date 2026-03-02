class IndexOfFirstOccurence {
    public static int strStr(String haystack, String needle) {

        if (needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {

            int count = 0;  // reset every time

            while (count < m &&
                    haystack.charAt(i + count) == needle.charAt(count)) {
                count++;
            }

            if (count == m) {
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        String str = "sadLevelSad";
        String sub = "sad";
        System.out.println(strStr(str,sub));
    }
}

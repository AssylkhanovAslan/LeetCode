public class strStr {
    public static int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }


        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            boolean found = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                }
            }
            if (found) {
                return  i;
            }
        }

        return -1;
    }
}

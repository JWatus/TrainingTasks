package com.company.other_tasks;

/**
 * Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
 * reverse the string in a way that special characters are not affected.
 * <p>
 * Examples:
 * <p>
 * Input:   str = "a,b$c"
 * Output:  str = "c,b$a"
 * Note that $ and , are not moved anywhere.
 * Only subsequence "abc" is reversed
 * <p>
 * Input:   str = "Ab,c,de!$"
 * Output:  str = "ed,c,bA!$"
 */

public class ArrayReverseWithoutSpecial {

    private static void reverse(char str[]) {
        // Initialize left and right pointers
        int r = str.length - 1;
        int l = 0;

        // Traverse string from both ends until
        // 'l' and 'r'
        while (l < r) {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if (!Character.isAlphabetic(str[r]))
                r--;

                // Both str[l] and str[r] are not spacial
            else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        char[] charArray = str.toCharArray();

        System.out.println("Input string: " + str);
        reverse(charArray);
        String revStr = new String(charArray);

        System.out.println("Output string: " + revStr);
    }
}

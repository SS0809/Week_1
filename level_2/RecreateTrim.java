/*
Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
*/
public class RecreateTrim {

    // Compare two strings using the charAt() method and return a boolean result
    public static boolean toCompareTrims(String substring, String trimmed) {
        return substring.equals(trimmed);
    }

    // Create a substring from a string using the charAt() method
    public static String createSubstring(String s, int start_index, int end_index) {
        int substring_size = end_index - start_index + 1;
        char[] ch = new char[substring_size];
        for (int i = start_index, j = 0; i <= end_index; i++, j++) { // Fixed off-by-one error
            ch[j] = s.charAt(i);
        }
        return new String(ch);
    }

    // Determine the starting and ending points with no spaces
    public static int[] trimIndexes(String s) {
        int[] arr = new int[2];
        int start_index = 0, end_index = s.length() - 1;

        // Find the first non-space character from the start
        while (start_index < s.length() && s.charAt(start_index) == ' ') {
            start_index++;
        }

        // Find the first non-space character from the end
        while (end_index >= 0 && s.charAt(end_index) == ' ') {
            end_index--;
        }

        // Handle cases where the entire string is spaces
        if (start_index > end_index) {
            arr[0] = -1; // Indicates no valid characters
            arr[1] = -1;
        } else {
            arr[0] = start_index;
            arr[1] = end_index;
        }
        return arr;
    }

    public static void main(String[] args) {
        String s = new String("   saurabh   ");
        int[] ans = trimIndexes(s);

        if (ans[0] == -1 && ans[1] == -1) {
            System.out.println("The string contains only spaces.");
        } else if (toCompareTrims(createSubstring(s, ans[0], ans[1]), s.trim())) {
            System.out.println("Trim working as intended");
        } else {
            System.out.println("Trim not working as intended");
        }
    }
}

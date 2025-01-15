import java.util.Scanner;

public class VowelAndConsonant {

    // Converts the input string to lowercase
    static String convertingToLowerCase(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            ans.append(ch);
        }
        return ans.toString();
    }

    // Checks if a character is a vowel, consonant, or not a letter
    static String checkVowelConsonant(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a letter";
        }
    }

    // Stores characters and their classification in a 2D array
    static String[][] storingVowelConsonant(String text) {
        int size = text.length();
        String[][] str = new String[size][2];

        for (int i = 0; i < size; i++) {
            char ch = text.charAt(i);
            str[i][0] = String.valueOf(ch); // converting char to string
            str[i][1] = checkVowelConsonant(ch); // storing vowel and consonant
        }

        return str;
    }

    // Displays the 2D array
    static void displayString(String[][] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i][0] + "\t" + str[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        // Convert string to lowercase
        str = convertingToLowerCase(str);

        // Process the string and display results
        String[][] str2 = storingVowelConsonant(str);
        displayString(str2);
    }
}

